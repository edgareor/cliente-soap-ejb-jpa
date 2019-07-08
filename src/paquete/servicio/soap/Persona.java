
package paquete.servicio.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para persona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="persona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPersona" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombrePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rutPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "idPersona",
    "nombrePersona",
    "apellidoPersona",
    "rutPersona"
})
public class Persona {

    protected int idPersona;
    protected String nombrePersona;
    protected String apellidoPersona;
    protected String rutPersona;

    /**
     * Obtiene el valor de la propiedad idPersona.
     * 
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * Define el valor de la propiedad idPersona.
     * 
     */
    public void setIdPersona(int value) {
        this.idPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Define el valor de la propiedad nombrePersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePersona(String value) {
        this.nombrePersona = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPersona() {
        return apellidoPersona;
    }

    /**
     * Define el valor de la propiedad apellidoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPersona(String value) {
        this.apellidoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad rutPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutPersona() {
        return rutPersona;
    }

    /**
     * Define el valor de la propiedad rutPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutPersona(String value) {
        this.rutPersona = value;
    }

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", apellidoPersona="
				+ apellidoPersona + ", rutPersona=" + rutPersona + "]";
	}

}
