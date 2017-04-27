
package com.atmira.formacion.wsclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SecretariaServiceImplService", targetNamespace = "http://service.ws.secretariaIT.formacion.atmira.com/", wsdlLocation = "file:/C:/Users/oscar.fernandez/git/Secretaria/SecretariaClientWS/src/main/resources/Profesor.wsdl")
public class SecretariaServiceImplService
    extends Service
{

    private final static URL SECRETARIASERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SECRETARIASERVICEIMPLSERVICE_EXCEPTION;
    private final static QName SECRETARIASERVICEIMPLSERVICE_QNAME = new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "SecretariaServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/oscar.fernandez/git/Secretaria/SecretariaClientWS/src/main/resources/Profesor.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SECRETARIASERVICEIMPLSERVICE_WSDL_LOCATION = url;
        SECRETARIASERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public SecretariaServiceImplService() {
        super(__getWsdlLocation(), SECRETARIASERVICEIMPLSERVICE_QNAME);
    }

    public SecretariaServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SECRETARIASERVICEIMPLSERVICE_QNAME, features);
    }

    public SecretariaServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SECRETARIASERVICEIMPLSERVICE_QNAME);
    }

    public SecretariaServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SECRETARIASERVICEIMPLSERVICE_QNAME, features);
    }

    public SecretariaServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SecretariaServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SecretariaServiceImpl
     */
    @WebEndpoint(name = "SecretariaServiceImplPort")
    public SecretariaServiceImpl getSecretariaServiceImplPort() {
        return super.getPort(new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "SecretariaServiceImplPort"), SecretariaServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SecretariaServiceImpl
     */
    @WebEndpoint(name = "SecretariaServiceImplPort")
    public SecretariaServiceImpl getSecretariaServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ws.secretariaIT.formacion.atmira.com/", "SecretariaServiceImplPort"), SecretariaServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SECRETARIASERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw SECRETARIASERVICEIMPLSERVICE_EXCEPTION;
        }
        return SECRETARIASERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}