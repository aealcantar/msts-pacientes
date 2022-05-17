package mx.gob.imss.service.impl;

import lombok.extern.slf4j.Slf4j;
import mx.gob.imss.components.WsCliente;
import mx.gob.imss.constantes.BusquedaConstantes;
import mx.gob.imss.model.BeneficiarioNss;
import mx.gob.imss.model.BusquedaNss;
import mx.gob.imss.service.BusquedaService;
import mx.gob.imss.vigenciaderechos.InfoAseguradoVO;
import mx.gob.imss.vigenciaderechos.Return;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Slf4j
@Service
public class BusquedaServiceImpl implements BusquedaService {

    @Autowired
    private WsCliente wsCliente;

    @Autowired
    private MessageSource messageSource;

    @Override
    public BusquedaNss buscaNSS(String nss) {

        Return ret = wsCliente.consultaNss(nss);

        List<BeneficiarioNss> beneficiarios = new ArrayList<>();

        if (ret.getMensajeError().equalsIgnoreCase(BusquedaConstantes.VALIDA_MENSAJE_ERROR)) {

            BeneficiarioNss beneficiarioNss = new BeneficiarioNss();
            beneficiarioNss.setNss(ret.getNss().getValue());
            beneficiarioNss.setPaciente(upperCaseFirst(ret.getNombre().getValue().toLowerCase() + " " + ret.getPaterno().getValue().toLowerCase() + " " + ret.getMaterno().getValue().toLowerCase()));
            beneficiarioNss.setParentesco(BusquedaConstantes.TITULAR);
            beneficiarioNss.setAgregadoMedico(ret.getAgregadoMedico().getValue());
            beneficiarioNss.setUnidadMedica(ret.getDhUMF().getValue());
            beneficiarioNss.setCurp(ret.getCurp().getValue());
            beneficiarioNss.setFechaNacimiento(dateImssFormat(ret.getFechaNacimiento().getValue()));
            beneficiarioNss.setTurno(ret.getTurno().getValue());
            beneficiarioNss.setConsultorio(ret.getConsultorio().getValue());
            beneficiarioNss.setEdad(calculaEdad(ret.getFechaNacimiento().getValue()));
            beneficiarioNss.setSexo(ret.getSexo().getValue());

            beneficiarios.add(beneficiarioNss);

            for (InfoAseguradoVO infoAseguradoVO : ret.getBeneficiarios()) {

                beneficiarioNss = new BeneficiarioNss();
                beneficiarioNss.setNss(infoAseguradoVO.getNss().getValue());
                beneficiarioNss.setPaciente(upperCaseFirst(infoAseguradoVO.getNombre().getValue().toLowerCase() + " " + infoAseguradoVO.getPaterno().getValue().toLowerCase() + " " + infoAseguradoVO.getMaterno().getValue().toLowerCase()));
                beneficiarioNss.setParentesco(BusquedaConstantes.BENEFICIARIO);
                beneficiarioNss.setAgregadoMedico(infoAseguradoVO.getAgregadoMedico().getValue());
                beneficiarioNss.setUnidadMedica(infoAseguradoVO.getDhUMF().getValue());
                beneficiarioNss.setCurp(infoAseguradoVO.getCurp().getValue());
                beneficiarioNss.setFechaNacimiento(dateImssFormat(infoAseguradoVO.getFechaNacimiento().getValue()));
                beneficiarioNss.setTurno(infoAseguradoVO.getTurno().getValue());
                beneficiarioNss.setConsultorio(infoAseguradoVO.getConsultorio().getValue());
                beneficiarioNss.setEdad(calculaEdad(infoAseguradoVO.getFechaNacimiento().getValue()));
                beneficiarioNss.setSexo(infoAseguradoVO.getSexo().getValue());

                beneficiarios.add(beneficiarioNss);

            }
        } else {

            log.error(messageSource.getMessage("NO_ENCONTRADO", new Object[]{nss}, Locale.getDefault()));

        }

        return new BusquedaNss(beneficiarios, beneficiarios.size());

    }

    @Override
    public String buscaNSScompleta(String nss) {

        Return ret = wsCliente.consultaNss(nss);

        return jaxbObjectToJSON(ret);

    }

    private String dateImssFormat(String date) {
        try {

            String[] fechaPartes = date.split("/");

            return fechaPartes[2] + "/" + fechaPartes[1] + "/" + fechaPartes[0];

        } catch (Exception e) {

            e.printStackTrace();

            return date;

        }

    }

    private String upperCaseFirst(String val) {
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }

    private int calculaEdad(String fechaNacimiento) {

        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(BusquedaConstantes.YYYY_DD_MM);

            LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);

            Period edad = Period.between(fechaNac, LocalDate.now());

            return edad.getYears();

        } catch (Exception e) {

            log.error(messageSource.getMessage("PARSE_ERROR", new Object[]{fechaNacimiento}, Locale.getDefault()));

            log.error(e.toString());

        }
        return 0;
    }

    private String jaxbObjectToJSON(Return ret) {
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Return.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            jaxbMarshaller.marshal(ret, sw);

            JSONObject json = XML.toJSONObject(sw.toString());

            return json.toString(4);

        } catch (JAXBException e) {

            e.printStackTrace();

            return e.toString();

        }

    }

}
