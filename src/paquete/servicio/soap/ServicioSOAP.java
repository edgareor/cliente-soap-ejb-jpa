
package paquete.servicio.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioSOAP", targetNamespace = "http://soap.servicio.paquete/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioSOAP {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.GetStatus")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.GetStatusResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/getStatusRequest", output = "http://soap.servicio.paquete/ServicioSOAP/getStatusResponse")
    public String getStatus();

    /**
     * 
     * @return
     *     returns java.util.List<paquete.servicio.soap.Persona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "extraerAll", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ExtraerAll")
    @ResponseWrapper(localName = "extraerAllResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ExtraerAllResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/extraerAllRequest", output = "http://soap.servicio.paquete/ServicioSOAP/extraerAllResponse")
    public List<Persona> extraerAll();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumar", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.Sumar")
    @ResponseWrapper(localName = "sumarResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.SumarResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/sumarRequest", output = "http://soap.servicio.paquete/ServicioSOAP/sumarResponse")
    public String sumar(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertar", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.Insertar")
    @ResponseWrapper(localName = "insertarResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.InsertarResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/insertarRequest", output = "http://soap.servicio.paquete/ServicioSOAP/insertarResponse")
    public String insertar(
        @WebParam(name = "arg0", targetNamespace = "")
        Persona arg0);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "extraerMin", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ExtraerMin")
    @ResponseWrapper(localName = "extraerMinResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ExtraerMinResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/extraerMinRequest", output = "http://soap.servicio.paquete/ServicioSOAP/extraerMinResponse")
    public int extraerMin();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminar", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.Eliminar")
    @ResponseWrapper(localName = "eliminarResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.EliminarResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/eliminarRequest", output = "http://soap.servicio.paquete/ServicioSOAP/eliminarResponse")
    public String eliminar(
        @WebParam(name = "arg0", targetNamespace = "")
        Persona arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns paquete.servicio.soap.Persona
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "extraerPorId", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ExtraerPorId")
    @ResponseWrapper(localName = "extraerPorIdResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ExtraerPorIdResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/extraerPorIdRequest", output = "http://soap.servicio.paquete/ServicioSOAP/extraerPorIdResponse")
    public Persona extraerPorId(
        @WebParam(name = "arg0", targetNamespace = "")
        Persona arg0);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "extraerMax", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ExtraerMax")
    @ResponseWrapper(localName = "extraerMaxResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ExtraerMaxResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/extraerMaxRequest", output = "http://soap.servicio.paquete/ServicioSOAP/extraerMaxResponse")
    public int extraerMax();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificar", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.Modificar")
    @ResponseWrapper(localName = "modificarResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ModificarResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/modificarRequest", output = "http://soap.servicio.paquete/ServicioSOAP/modificarResponse")
    public String modificar(
        @WebParam(name = "arg0", targetNamespace = "")
        Persona arg0);

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "contar", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.Contar")
    @ResponseWrapper(localName = "contarResponse", targetNamespace = "http://soap.servicio.paquete/", className = "paquete.servicio.soap.ContarResponse")
    @Action(input = "http://soap.servicio.paquete/ServicioSOAP/contarRequest", output = "http://soap.servicio.paquete/ServicioSOAP/contarResponse")
    public long contar();

}
