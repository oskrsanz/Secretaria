
package com.atmira.formacion.wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.atmira.formacion.wsclient package. 
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

    private final static QName _AddAlumnoResponse_QNAME = new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "AddAlumnoResponse");
    private final static QName _AddProfesor_QNAME = new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "AddProfesor");
    private final static QName _CalcularPromedioProfesor_QNAME = new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "calcularPromedioProfesor");
    private final static QName _AddProfesorResponse_QNAME = new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "AddProfesorResponse");
    private final static QName _CalcularPromedioProfesorResponse_QNAME = new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "calcularPromedioProfesorResponse");
    private final static QName _AddAlumno_QNAME = new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "AddAlumno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.atmira.formacion.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularPromedioProfesor }
     * 
     */
    public CalcularPromedioProfesor createCalcularPromedioProfesor() {
        return new CalcularPromedioProfesor();
    }

    /**
     * Create an instance of {@link AddAlumnoResponse }
     * 
     */
    public AddAlumnoResponse createAddAlumnoResponse() {
        return new AddAlumnoResponse();
    }

    /**
     * Create an instance of {@link AddProfesor }
     * 
     */
    public AddProfesor createAddProfesor() {
        return new AddProfesor();
    }

    /**
     * Create an instance of {@link AddProfesorResponse }
     * 
     */
    public AddProfesorResponse createAddProfesorResponse() {
        return new AddProfesorResponse();
    }

    /**
     * Create an instance of {@link AddAlumno }
     * 
     */
    public AddAlumno createAddAlumno() {
        return new AddAlumno();
    }

    /**
     * Create an instance of {@link CalcularPromedioProfesorResponse }
     * 
     */
    public CalcularPromedioProfesorResponse createCalcularPromedioProfesorResponse() {
        return new CalcularPromedioProfesorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.secretariaIT.formacion.atmira.com/", name = "AddAlumnoResponse")
    public JAXBElement<AddAlumnoResponse> createAddAlumnoResponse(AddAlumnoResponse value) {
        return new JAXBElement<AddAlumnoResponse>(_AddAlumnoResponse_QNAME, AddAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProfesor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.secretariaIT.formacion.atmira.com/", name = "AddProfesor")
    public JAXBElement<AddProfesor> createAddProfesor(AddProfesor value) {
        return new JAXBElement<AddProfesor>(_AddProfesor_QNAME, AddProfesor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularPromedioProfesor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.secretariaIT.formacion.atmira.com/", name = "calcularPromedioProfesor")
    public JAXBElement<CalcularPromedioProfesor> createCalcularPromedioProfesor(CalcularPromedioProfesor value) {
        return new JAXBElement<CalcularPromedioProfesor>(_CalcularPromedioProfesor_QNAME, CalcularPromedioProfesor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProfesorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.secretariaIT.formacion.atmira.com/", name = "AddProfesorResponse")
    public JAXBElement<AddProfesorResponse> createAddProfesorResponse(AddProfesorResponse value) {
        return new JAXBElement<AddProfesorResponse>(_AddProfesorResponse_QNAME, AddProfesorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularPromedioProfesorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.secretariaIT.formacion.atmira.com/", name = "calcularPromedioProfesorResponse")
    public JAXBElement<CalcularPromedioProfesorResponse> createCalcularPromedioProfesorResponse(CalcularPromedioProfesorResponse value) {
        return new JAXBElement<CalcularPromedioProfesorResponse>(_CalcularPromedioProfesorResponse_QNAME, CalcularPromedioProfesorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.secretariaIT.formacion.atmira.com/", name = "AddAlumno")
    public JAXBElement<AddAlumno> createAddAlumno(AddAlumno value) {
        return new JAXBElement<AddAlumno>(_AddAlumno_QNAME, AddAlumno.class, null, value);
    }

}
