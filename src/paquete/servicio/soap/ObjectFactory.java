
package paquete.servicio.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the paquete.servicio.soap package. 
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

    private final static QName _Modificar_QNAME = new QName("http://soap.servicio.paquete/", "modificar");
    private final static QName _EliminarResponse_QNAME = new QName("http://soap.servicio.paquete/", "eliminarResponse");
    private final static QName _ExtraerMaxResponse_QNAME = new QName("http://soap.servicio.paquete/", "extraerMaxResponse");
    private final static QName _Contar_QNAME = new QName("http://soap.servicio.paquete/", "contar");
    private final static QName _ExtraerMin_QNAME = new QName("http://soap.servicio.paquete/", "extraerMin");
    private final static QName _ExtraerAllResponse_QNAME = new QName("http://soap.servicio.paquete/", "extraerAllResponse");
    private final static QName _Eliminar_QNAME = new QName("http://soap.servicio.paquete/", "eliminar");
    private final static QName _Sumar_QNAME = new QName("http://soap.servicio.paquete/", "sumar");
    private final static QName _SumarResponse_QNAME = new QName("http://soap.servicio.paquete/", "sumarResponse");
    private final static QName _ModificarResponse_QNAME = new QName("http://soap.servicio.paquete/", "modificarResponse");
    private final static QName _ContarResponse_QNAME = new QName("http://soap.servicio.paquete/", "contarResponse");
    private final static QName _ExtraerPorIdResponse_QNAME = new QName("http://soap.servicio.paquete/", "extraerPorIdResponse");
    private final static QName _GetStatus_QNAME = new QName("http://soap.servicio.paquete/", "getStatus");
    private final static QName _ExtraerMax_QNAME = new QName("http://soap.servicio.paquete/", "extraerMax");
    private final static QName _Insertar_QNAME = new QName("http://soap.servicio.paquete/", "insertar");
    private final static QName _InsertarResponse_QNAME = new QName("http://soap.servicio.paquete/", "insertarResponse");
    private final static QName _GetStatusResponse_QNAME = new QName("http://soap.servicio.paquete/", "getStatusResponse");
    private final static QName _ExtraerMinResponse_QNAME = new QName("http://soap.servicio.paquete/", "extraerMinResponse");
    private final static QName _Persona_QNAME = new QName("http://soap.servicio.paquete/", "persona");
    private final static QName _ExtraerAll_QNAME = new QName("http://soap.servicio.paquete/", "extraerAll");
    private final static QName _ExtraerPorId_QNAME = new QName("http://soap.servicio.paquete/", "extraerPorId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: paquete.servicio.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link ExtraerMax }
     * 
     */
    public ExtraerMax createExtraerMax() {
        return new ExtraerMax();
    }

    /**
     * Create an instance of {@link Insertar }
     * 
     */
    public Insertar createInsertar() {
        return new Insertar();
    }

    /**
     * Create an instance of {@link InsertarResponse }
     * 
     */
    public InsertarResponse createInsertarResponse() {
        return new InsertarResponse();
    }

    /**
     * Create an instance of {@link ExtraerAll }
     * 
     */
    public ExtraerAll createExtraerAll() {
        return new ExtraerAll();
    }

    /**
     * Create an instance of {@link ExtraerMinResponse }
     * 
     */
    public ExtraerMinResponse createExtraerMinResponse() {
        return new ExtraerMinResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link ExtraerPorId }
     * 
     */
    public ExtraerPorId createExtraerPorId() {
        return new ExtraerPorId();
    }

    /**
     * Create an instance of {@link ModificarResponse }
     * 
     */
    public ModificarResponse createModificarResponse() {
        return new ModificarResponse();
    }

    /**
     * Create an instance of {@link ExtraerPorIdResponse }
     * 
     */
    public ExtraerPorIdResponse createExtraerPorIdResponse() {
        return new ExtraerPorIdResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link ContarResponse }
     * 
     */
    public ContarResponse createContarResponse() {
        return new ContarResponse();
    }

    /**
     * Create an instance of {@link ExtraerMin }
     * 
     */
    public ExtraerMin createExtraerMin() {
        return new ExtraerMin();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link ExtraerAllResponse }
     * 
     */
    public ExtraerAllResponse createExtraerAllResponse() {
        return new ExtraerAllResponse();
    }

    /**
     * Create an instance of {@link SumarResponse }
     * 
     */
    public SumarResponse createSumarResponse() {
        return new SumarResponse();
    }

    /**
     * Create an instance of {@link Sumar }
     * 
     */
    public Sumar createSumar() {
        return new Sumar();
    }

    /**
     * Create an instance of {@link Modificar }
     * 
     */
    public Modificar createModificar() {
        return new Modificar();
    }

    /**
     * Create an instance of {@link Contar }
     * 
     */
    public Contar createContar() {
        return new Contar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link ExtraerMaxResponse }
     * 
     */
    public ExtraerMaxResponse createExtraerMaxResponse() {
        return new ExtraerMaxResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modificar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "modificar")
    public JAXBElement<Modificar> createModificar(Modificar value) {
        return new JAXBElement<Modificar>(_Modificar_QNAME, Modificar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "eliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerMaxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "extraerMaxResponse")
    public JAXBElement<ExtraerMaxResponse> createExtraerMaxResponse(ExtraerMaxResponse value) {
        return new JAXBElement<ExtraerMaxResponse>(_ExtraerMaxResponse_QNAME, ExtraerMaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "contar")
    public JAXBElement<Contar> createContar(Contar value) {
        return new JAXBElement<Contar>(_Contar_QNAME, Contar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerMin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "extraerMin")
    public JAXBElement<ExtraerMin> createExtraerMin(ExtraerMin value) {
        return new JAXBElement<ExtraerMin>(_ExtraerMin_QNAME, ExtraerMin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "extraerAllResponse")
    public JAXBElement<ExtraerAllResponse> createExtraerAllResponse(ExtraerAllResponse value) {
        return new JAXBElement<ExtraerAllResponse>(_ExtraerAllResponse_QNAME, ExtraerAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "sumar")
    public JAXBElement<Sumar> createSumar(Sumar value) {
        return new JAXBElement<Sumar>(_Sumar_QNAME, Sumar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "sumarResponse")
    public JAXBElement<SumarResponse> createSumarResponse(SumarResponse value) {
        return new JAXBElement<SumarResponse>(_SumarResponse_QNAME, SumarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "modificarResponse")
    public JAXBElement<ModificarResponse> createModificarResponse(ModificarResponse value) {
        return new JAXBElement<ModificarResponse>(_ModificarResponse_QNAME, ModificarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "contarResponse")
    public JAXBElement<ContarResponse> createContarResponse(ContarResponse value) {
        return new JAXBElement<ContarResponse>(_ContarResponse_QNAME, ContarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "extraerPorIdResponse")
    public JAXBElement<ExtraerPorIdResponse> createExtraerPorIdResponse(ExtraerPorIdResponse value) {
        return new JAXBElement<ExtraerPorIdResponse>(_ExtraerPorIdResponse_QNAME, ExtraerPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerMax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "extraerMax")
    public JAXBElement<ExtraerMax> createExtraerMax(ExtraerMax value) {
        return new JAXBElement<ExtraerMax>(_ExtraerMax_QNAME, ExtraerMax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insertar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "insertar")
    public JAXBElement<Insertar> createInsertar(Insertar value) {
        return new JAXBElement<Insertar>(_Insertar_QNAME, Insertar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "insertarResponse")
    public JAXBElement<InsertarResponse> createInsertarResponse(InsertarResponse value) {
        return new JAXBElement<InsertarResponse>(_InsertarResponse_QNAME, InsertarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerMinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "extraerMinResponse")
    public JAXBElement<ExtraerMinResponse> createExtraerMinResponse(ExtraerMinResponse value) {
        return new JAXBElement<ExtraerMinResponse>(_ExtraerMinResponse_QNAME, ExtraerMinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "extraerAll")
    public JAXBElement<ExtraerAll> createExtraerAll(ExtraerAll value) {
        return new JAXBElement<ExtraerAll>(_ExtraerAll_QNAME, ExtraerAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraerPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.servicio.paquete/", name = "extraerPorId")
    public JAXBElement<ExtraerPorId> createExtraerPorId(ExtraerPorId value) {
        return new JAXBElement<ExtraerPorId>(_ExtraerPorId_QNAME, ExtraerPorId.class, null, value);
    }

}
