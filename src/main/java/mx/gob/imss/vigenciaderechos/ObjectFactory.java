
package mx.gob.imss.vigenciaderechos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.imss.vigenciaderechos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetInfoResponse_QNAME = new QName("http://vigenciaderechos.imss.gob.mx/", "getInfoResponse");
    private final static QName _GetInfo_QNAME = new QName("http://vigenciaderechos.imss.gob.mx/", "getInfo");
    private final static QName _ReturnNombre_QNAME = new QName("", "Nombre");
    private final static QName _ReturnVigenteHasta_QNAME = new QName("", "VigenteHasta");
    private final static QName _ReturnAgregadoMedico_QNAME = new QName("", "AgregadoMedico");
    private final static QName _ReturnColonia_QNAME = new QName("", "Colonia");
    private final static QName _ReturnCpid_QNAME = new QName("", "Cpid");
    private final static QName _ReturnConsultorio_QNAME = new QName("", "Consultorio");
    private final static QName _ReturnSexo_QNAME = new QName("", "Sexo");
    private final static QName _ReturnConDerechoSm_QNAME = new QName("", "ConDerechoSm");
    private final static QName _ReturnFechaNacimiento_QNAME = new QName("", "FechaNacimiento");
    private final static QName _ReturnAgregadoAfiliacion_QNAME = new QName("", "AgregadoAfiliacion");
    private final static QName _ReturnTelefono_QNAME = new QName("", "Telefono");
    private final static QName _ReturnTipoPension_QNAME = new QName("", "TipoPension");
    private final static QName _ReturnConDerechoInc_QNAME = new QName("", "ConDerechoInc");
    private final static QName _ReturnDireccion_QNAME = new QName("", "Direccion");
    private final static QName _ReturnClavePresupuestal_QNAME = new QName("", "ClavePresupuestal");
    private final static QName _ReturnDhDeleg_QNAME = new QName("", "DhDeleg");
    private final static QName _ReturnDhUMF_QNAME = new QName("", "DhUMF");
    private final static QName _ReturnTurno_QNAME = new QName("", "Turno");
    private final static QName _ReturnDhIpServer_QNAME = new QName("", "DhIpServer");
    private final static QName _ReturnNss_QNAME = new QName("", "Nss");
    private final static QName _ReturnCurp_QNAME = new QName("", "Curp");
    private final static QName _ReturnIdPersona_QNAME = new QName("", "IdPersona");
    private final static QName _ReturnRegistroPatronal_QNAME = new QName("", "RegistroPatronal");
    private final static QName _ReturnMaterno_QNAME = new QName("", "Materno");
    private final static QName _ReturnIdee_QNAME = new QName("", "Idee");
    private final static QName _ReturnPaterno_QNAME = new QName("", "Paterno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.imss.vigenciaderechos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoResponse }
     * 
     */
    public GetInfoResponse createGetInfoResponse() {
        return new GetInfoResponse();
    }

    /**
     * Create an instance of {@link GetInfo }
     * 
     */
    public GetInfo createGetInfo() {
        return new GetInfo();
    }

    /**
     * Create an instance of {@link RespuestaWS }
     * 
     */
    public RespuestaWS createRespuestaWS() {
        return new RespuestaWS();
    }

    /**
     * Create an instance of {@link Return }
     * 
     */
    public Return createReturn() {
        return new Return();
    }

    /**
     * Create an instance of {@link InfoAseguradoVO }
     * 
     */
    public InfoAseguradoVO createInfoAseguradoVO() {
        return new InfoAseguradoVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vigenciaderechos.imss.gob.mx/", name = "getInfoResponse")
    public JAXBElement<GetInfoResponse> createGetInfoResponse(GetInfoResponse value) {
        return new JAXBElement<GetInfoResponse>(_GetInfoResponse_QNAME, GetInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vigenciaderechos.imss.gob.mx/", name = "getInfo")
    public JAXBElement<GetInfo> createGetInfo(GetInfo value) {
        return new JAXBElement<GetInfo>(_GetInfo_QNAME, GetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Nombre", scope = Return.class)
    public JAXBElement<String> createReturnNombre(String value) {
        return new JAXBElement<String>(_ReturnNombre_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VigenteHasta", scope = Return.class)
    public JAXBElement<String> createReturnVigenteHasta(String value) {
        return new JAXBElement<String>(_ReturnVigenteHasta_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AgregadoMedico", scope = Return.class)
    public JAXBElement<String> createReturnAgregadoMedico(String value) {
        return new JAXBElement<String>(_ReturnAgregadoMedico_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Colonia", scope = Return.class)
    public JAXBElement<String> createReturnColonia(String value) {
        return new JAXBElement<String>(_ReturnColonia_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cpid", scope = Return.class)
    public JAXBElement<String> createReturnCpid(String value) {
        return new JAXBElement<String>(_ReturnCpid_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Consultorio", scope = Return.class)
    public JAXBElement<String> createReturnConsultorio(String value) {
        return new JAXBElement<String>(_ReturnConsultorio_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sexo", scope = Return.class)
    public JAXBElement<String> createReturnSexo(String value) {
        return new JAXBElement<String>(_ReturnSexo_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConDerechoSm", scope = Return.class)
    public JAXBElement<String> createReturnConDerechoSm(String value) {
        return new JAXBElement<String>(_ReturnConDerechoSm_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FechaNacimiento", scope = Return.class)
    public JAXBElement<String> createReturnFechaNacimiento(String value) {
        return new JAXBElement<String>(_ReturnFechaNacimiento_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AgregadoAfiliacion", scope = Return.class)
    public JAXBElement<String> createReturnAgregadoAfiliacion(String value) {
        return new JAXBElement<String>(_ReturnAgregadoAfiliacion_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Telefono", scope = Return.class)
    public JAXBElement<String> createReturnTelefono(String value) {
        return new JAXBElement<String>(_ReturnTelefono_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TipoPension", scope = Return.class)
    public JAXBElement<String> createReturnTipoPension(String value) {
        return new JAXBElement<String>(_ReturnTipoPension_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConDerechoInc", scope = Return.class)
    public JAXBElement<String> createReturnConDerechoInc(String value) {
        return new JAXBElement<String>(_ReturnConDerechoInc_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Direccion", scope = Return.class)
    public JAXBElement<String> createReturnDireccion(String value) {
        return new JAXBElement<String>(_ReturnDireccion_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ClavePresupuestal", scope = Return.class)
    public JAXBElement<String> createReturnClavePresupuestal(String value) {
        return new JAXBElement<String>(_ReturnClavePresupuestal_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DhDeleg", scope = Return.class)
    public JAXBElement<String> createReturnDhDeleg(String value) {
        return new JAXBElement<String>(_ReturnDhDeleg_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DhUMF", scope = Return.class)
    public JAXBElement<String> createReturnDhUMF(String value) {
        return new JAXBElement<String>(_ReturnDhUMF_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Turno", scope = Return.class)
    public JAXBElement<String> createReturnTurno(String value) {
        return new JAXBElement<String>(_ReturnTurno_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DhIpServer", scope = Return.class)
    public JAXBElement<String> createReturnDhIpServer(String value) {
        return new JAXBElement<String>(_ReturnDhIpServer_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Nss", scope = Return.class)
    public JAXBElement<String> createReturnNss(String value) {
        return new JAXBElement<String>(_ReturnNss_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Curp", scope = Return.class)
    public JAXBElement<String> createReturnCurp(String value) {
        return new JAXBElement<String>(_ReturnCurp_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IdPersona", scope = Return.class)
    public JAXBElement<Integer> createReturnIdPersona(Integer value) {
        return new JAXBElement<Integer>(_ReturnIdPersona_QNAME, Integer.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RegistroPatronal", scope = Return.class)
    public JAXBElement<String> createReturnRegistroPatronal(String value) {
        return new JAXBElement<String>(_ReturnRegistroPatronal_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Materno", scope = Return.class)
    public JAXBElement<String> createReturnMaterno(String value) {
        return new JAXBElement<String>(_ReturnMaterno_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Idee", scope = Return.class)
    public JAXBElement<String> createReturnIdee(String value) {
        return new JAXBElement<String>(_ReturnIdee_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Paterno", scope = Return.class)
    public JAXBElement<String> createReturnPaterno(String value) {
        return new JAXBElement<String>(_ReturnPaterno_QNAME, String.class, Return.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Nombre", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVONombre(String value) {
        return new JAXBElement<String>(_ReturnNombre_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VigenteHasta", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOVigenteHasta(String value) {
        return new JAXBElement<String>(_ReturnVigenteHasta_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AgregadoMedico", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOAgregadoMedico(String value) {
        return new JAXBElement<String>(_ReturnAgregadoMedico_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Colonia", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOColonia(String value) {
        return new JAXBElement<String>(_ReturnColonia_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cpid", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOCpid(String value) {
        return new JAXBElement<String>(_ReturnCpid_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Consultorio", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOConsultorio(String value) {
        return new JAXBElement<String>(_ReturnConsultorio_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sexo", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOSexo(String value) {
        return new JAXBElement<String>(_ReturnSexo_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConDerechoSm", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOConDerechoSm(String value) {
        return new JAXBElement<String>(_ReturnConDerechoSm_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FechaNacimiento", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOFechaNacimiento(String value) {
        return new JAXBElement<String>(_ReturnFechaNacimiento_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AgregadoAfiliacion", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOAgregadoAfiliacion(String value) {
        return new JAXBElement<String>(_ReturnAgregadoAfiliacion_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Telefono", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOTelefono(String value) {
        return new JAXBElement<String>(_ReturnTelefono_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TipoPension", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOTipoPension(String value) {
        return new JAXBElement<String>(_ReturnTipoPension_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConDerechoInc", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOConDerechoInc(String value) {
        return new JAXBElement<String>(_ReturnConDerechoInc_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Direccion", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVODireccion(String value) {
        return new JAXBElement<String>(_ReturnDireccion_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ClavePresupuestal", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOClavePresupuestal(String value) {
        return new JAXBElement<String>(_ReturnClavePresupuestal_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DhDeleg", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVODhDeleg(String value) {
        return new JAXBElement<String>(_ReturnDhDeleg_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DhUMF", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVODhUMF(String value) {
        return new JAXBElement<String>(_ReturnDhUMF_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Turno", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOTurno(String value) {
        return new JAXBElement<String>(_ReturnTurno_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DhIpServer", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVODhIpServer(String value) {
        return new JAXBElement<String>(_ReturnDhIpServer_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Nss", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVONss(String value) {
        return new JAXBElement<String>(_ReturnNss_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Curp", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOCurp(String value) {
        return new JAXBElement<String>(_ReturnCurp_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IdPersona", scope = InfoAseguradoVO.class)
    public JAXBElement<Integer> createInfoAseguradoVOIdPersona(Integer value) {
        return new JAXBElement<Integer>(_ReturnIdPersona_QNAME, Integer.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RegistroPatronal", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVORegistroPatronal(String value) {
        return new JAXBElement<String>(_ReturnRegistroPatronal_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Materno", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOMaterno(String value) {
        return new JAXBElement<String>(_ReturnMaterno_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Idee", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOIdee(String value) {
        return new JAXBElement<String>(_ReturnIdee_QNAME, String.class, InfoAseguradoVO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Paterno", scope = InfoAseguradoVO.class)
    public JAXBElement<String> createInfoAseguradoVOPaterno(String value) {
        return new JAXBElement<String>(_ReturnPaterno_QNAME, String.class, InfoAseguradoVO.class, value);
    }

}
