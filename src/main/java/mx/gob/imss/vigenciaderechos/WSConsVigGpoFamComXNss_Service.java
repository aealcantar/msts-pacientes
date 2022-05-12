
package mx.gob.imss.vigenciaderechos;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSConsVigGpoFamComXNss", targetNamespace = "http://vigenciaderechos.imss.gob.mx/", wsdlLocation = "http://vigenciaderechos.imss.gob.mx/WSConsVigGpoFamComXNssService/WSConsVigGpoFamComXNss?wsdl")
public class WSConsVigGpoFamComXNss_Service
    extends Service
{

    private final static URL WSCONSVIGGPOFAMCOMXNSS_WSDL_LOCATION;
    private final static WebServiceException WSCONSVIGGPOFAMCOMXNSS_EXCEPTION;
    private final static QName WSCONSVIGGPOFAMCOMXNSS_QNAME = new QName("http://vigenciaderechos.imss.gob.mx/", "WSConsVigGpoFamComXNss");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://vigenciaderechos.imss.gob.mx/WSConsVigGpoFamComXNssService/WSConsVigGpoFamComXNss?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCONSVIGGPOFAMCOMXNSS_WSDL_LOCATION = url;
        WSCONSVIGGPOFAMCOMXNSS_EXCEPTION = e;
    }

    public WSConsVigGpoFamComXNss_Service() {
        super(__getWsdlLocation(), WSCONSVIGGPOFAMCOMXNSS_QNAME);
    }

    public WSConsVigGpoFamComXNss_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCONSVIGGPOFAMCOMXNSS_QNAME, features);
    }

    public WSConsVigGpoFamComXNss_Service(URL wsdlLocation) {
        super(wsdlLocation, WSCONSVIGGPOFAMCOMXNSS_QNAME);
    }

    public WSConsVigGpoFamComXNss_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCONSVIGGPOFAMCOMXNSS_QNAME, features);
    }

    public WSConsVigGpoFamComXNss_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSConsVigGpoFamComXNss_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSConsVigGpoFamComXNss
     */
    @WebEndpoint(name = "WSConsVigGpoFamComXNssPort")
    public WSConsVigGpoFamComXNss getWSConsVigGpoFamComXNssPort() {
        return super.getPort(new QName("http://vigenciaderechos.imss.gob.mx/", "WSConsVigGpoFamComXNssPort"), WSConsVigGpoFamComXNss.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSConsVigGpoFamComXNss
     */
    @WebEndpoint(name = "WSConsVigGpoFamComXNssPort")
    public WSConsVigGpoFamComXNss getWSConsVigGpoFamComXNssPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://vigenciaderechos.imss.gob.mx/", "WSConsVigGpoFamComXNssPort"), WSConsVigGpoFamComXNss.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCONSVIGGPOFAMCOMXNSS_EXCEPTION!= null) {
            throw WSCONSVIGGPOFAMCOMXNSS_EXCEPTION;
        }
        return WSCONSVIGGPOFAMCOMXNSS_WSDL_LOCATION;
    }

}
