
package mx.gob.imss.vigenciaderechos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para return complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="return">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vigenciaderechos.imss.gob.mx/}respuestaWS">
 *       &lt;sequence>
 *         &lt;element name="AgregadoAfiliacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgregadoMedico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Beneficiarios" type="{http://vigenciaderechos.imss.gob.mx/}InfoAseguradoVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClavePresupuestal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConDerechoInc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConDerechoSm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Consultorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cpid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Curp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DhDeleg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DhIpServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DhUMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Materno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistroPatronal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoPension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VigenteHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdPersona" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "return", propOrder = {
        "agregadoAfiliacion",
        "agregadoMedico",
        "beneficiarios",
        "clavePresupuestal",
        "colonia",
        "conDerechoInc",
        "conDerechoSm",
        "consultorio",
        "cpid",
        "curp",
        "dhDeleg",
        "dhIpServer",
        "dhUMF",
        "direccion",
        "fechaNacimiento",
        "idee",
        "materno",
        "nombre",
        "nss",
        "paterno",
        "registroPatronal",
        "sexo",
        "telefono",
        "tipoPension",
        "turno",
        "vigenteHasta",
        "idPersona"
})
@XmlRootElement(name = "data")
public class Return extends RespuestaWS implements Serializable {

    @XmlElementRef(name = "AgregadoAfiliacion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agregadoAfiliacion;
    @XmlElementRef(name = "AgregadoMedico", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agregadoMedico;
    @XmlElement(name = "Beneficiarios", nillable = true)
    protected List<InfoAseguradoVO> beneficiarios;
    @XmlElementRef(name = "ClavePresupuestal", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clavePresupuestal;
    @XmlElementRef(name = "Colonia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> colonia;
    @XmlElementRef(name = "ConDerechoInc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> conDerechoInc;
    @XmlElementRef(name = "ConDerechoSm", type = JAXBElement.class, required = false)
    protected JAXBElement<String> conDerechoSm;
    @XmlElementRef(name = "Consultorio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consultorio;
    @XmlElementRef(name = "Cpid", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpid;
    @XmlElementRef(name = "Curp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curp;
    @XmlElementRef(name = "DhDeleg", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dhDeleg;
    @XmlElementRef(name = "DhIpServer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dhIpServer;
    @XmlElementRef(name = "DhUMF", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dhUMF;
    @XmlElementRef(name = "Direccion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccion;
    @XmlElementRef(name = "FechaNacimiento", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaNacimiento;
    @XmlElementRef(name = "Idee", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idee;
    @XmlElementRef(name = "Materno", type = JAXBElement.class, required = false)
    protected JAXBElement<String> materno;
    @XmlElementRef(name = "Nombre", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "Nss", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nss;
    @XmlElementRef(name = "Paterno", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paterno;
    @XmlElementRef(name = "RegistroPatronal", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registroPatronal;
    @XmlElementRef(name = "Sexo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sexo;
    @XmlElementRef(name = "Telefono", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono;
    @XmlElementRef(name = "TipoPension", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPension;
    @XmlElementRef(name = "Turno", type = JAXBElement.class, required = false)
    protected JAXBElement<String> turno;
    @XmlElementRef(name = "VigenteHasta", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vigenteHasta;
    @XmlElementRef(name = "IdPersona", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idPersona;

    /**
     * Obtiene el valor de la propiedad agregadoAfiliacion.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAgregadoAfiliacion() {
        return agregadoAfiliacion;
    }

    /**
     * Define el valor de la propiedad agregadoAfiliacion.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAgregadoAfiliacion(JAXBElement<String> value) {
        this.agregadoAfiliacion = value;
    }

    /**
     * Obtiene el valor de la propiedad agregadoMedico.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getAgregadoMedico() {
        return agregadoMedico;
    }

    /**
     * Define el valor de la propiedad agregadoMedico.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setAgregadoMedico(JAXBElement<String> value) {
        this.agregadoMedico = value;
    }

    /**
     * Gets the value of the beneficiarios property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiarios property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiarios().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoAseguradoVO }
     */
    public List<InfoAseguradoVO> getBeneficiarios() {
        if (beneficiarios == null) {
            beneficiarios = new ArrayList<InfoAseguradoVO>();
        }
        return this.beneficiarios;
    }

    /**
     * Obtiene el valor de la propiedad clavePresupuestal.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getClavePresupuestal() {
        return clavePresupuestal;
    }

    /**
     * Define el valor de la propiedad clavePresupuestal.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setClavePresupuestal(JAXBElement<String> value) {
        this.clavePresupuestal = value;
    }

    /**
     * Obtiene el valor de la propiedad colonia.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getColonia() {
        return colonia;
    }

    /**
     * Define el valor de la propiedad colonia.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setColonia(JAXBElement<String> value) {
        this.colonia = value;
    }

    /**
     * Obtiene el valor de la propiedad conDerechoInc.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getConDerechoInc() {
        return conDerechoInc;
    }

    /**
     * Define el valor de la propiedad conDerechoInc.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setConDerechoInc(JAXBElement<String> value) {
        this.conDerechoInc = value;
    }

    /**
     * Obtiene el valor de la propiedad conDerechoSm.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getConDerechoSm() {
        return conDerechoSm;
    }

    /**
     * Define el valor de la propiedad conDerechoSm.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setConDerechoSm(JAXBElement<String> value) {
        this.conDerechoSm = value;
    }

    /**
     * Obtiene el valor de la propiedad consultorio.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getConsultorio() {
        return consultorio;
    }

    /**
     * Define el valor de la propiedad consultorio.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setConsultorio(JAXBElement<String> value) {
        this.consultorio = value;
    }

    /**
     * Obtiene el valor de la propiedad cpid.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCpid() {
        return cpid;
    }

    /**
     * Define el valor de la propiedad cpid.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCpid(JAXBElement<String> value) {
        this.cpid = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setCurp(JAXBElement<String> value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad dhDeleg.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDhDeleg() {
        return dhDeleg;
    }

    /**
     * Define el valor de la propiedad dhDeleg.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDhDeleg(JAXBElement<String> value) {
        this.dhDeleg = value;
    }

    /**
     * Obtiene el valor de la propiedad dhIpServer.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDhIpServer() {
        return dhIpServer;
    }

    /**
     * Define el valor de la propiedad dhIpServer.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDhIpServer(JAXBElement<String> value) {
        this.dhIpServer = value;
    }

    /**
     * Obtiene el valor de la propiedad dhUMF.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDhUMF() {
        return dhUMF;
    }

    /**
     * Define el valor de la propiedad dhUMF.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDhUMF(JAXBElement<String> value) {
        this.dhUMF = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setDireccion(JAXBElement<String> value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setFechaNacimiento(JAXBElement<String> value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idee.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getIdee() {
        return idee;
    }

    /**
     * Define el valor de la propiedad idee.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setIdee(JAXBElement<String> value) {
        this.idee = value;
    }

    /**
     * Obtiene el valor de la propiedad materno.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getMaterno() {
        return materno;
    }

    /**
     * Define el valor de la propiedad materno.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setMaterno(JAXBElement<String> value) {
        this.materno = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nss.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getNss() {
        return nss;
    }

    /**
     * Define el valor de la propiedad nss.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setNss(JAXBElement<String> value) {
        this.nss = value;
    }

    /**
     * Obtiene el valor de la propiedad paterno.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getPaterno() {
        return paterno;
    }

    /**
     * Define el valor de la propiedad paterno.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setPaterno(JAXBElement<String> value) {
        this.paterno = value;
    }

    /**
     * Obtiene el valor de la propiedad registroPatronal.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getRegistroPatronal() {
        return registroPatronal;
    }

    /**
     * Define el valor de la propiedad registroPatronal.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setRegistroPatronal(JAXBElement<String> value) {
        this.registroPatronal = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setSexo(JAXBElement<String> value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setTelefono(JAXBElement<String> value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPension.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getTipoPension() {
        return tipoPension;
    }

    /**
     * Define el valor de la propiedad tipoPension.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setTipoPension(JAXBElement<String> value) {
        this.tipoPension = value;
    }

    /**
     * Obtiene el valor de la propiedad turno.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getTurno() {
        return turno;
    }

    /**
     * Define el valor de la propiedad turno.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setTurno(JAXBElement<String> value) {
        this.turno = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenteHasta.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<String> getVigenteHasta() {
        return vigenteHasta;
    }

    /**
     * Define el valor de la propiedad vigenteHasta.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setVigenteHasta(JAXBElement<String> value) {
        this.vigenteHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersona.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    public JAXBElement<Integer> getIdPersona() {
        return idPersona;
    }

    /**
     * Define el valor de la propiedad idPersona.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    public void setIdPersona(JAXBElement<Integer> value) {
        this.idPersona = value;
    }

}
