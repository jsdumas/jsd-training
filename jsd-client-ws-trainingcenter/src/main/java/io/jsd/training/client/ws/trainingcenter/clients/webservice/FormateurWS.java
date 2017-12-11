
package io.jsd.training.client.ws.trainingcenter.clients.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FormateurWS", targetNamespace = "http://webservice.centreformation.treeptik.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FormateurWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns io.jsd.training.tp.spring.clients.webservice.Formateur
     * @throws ServiceException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveFromWebService", targetNamespace = "http://webservice.centreformation.treeptik.fr/", className = "io.jsd.training.tp.spring.clients.webservice.SaveFromWebService")
    @ResponseWrapper(localName = "saveFromWebServiceResponse", targetNamespace = "http://webservice.centreformation.treeptik.fr/", className = "io.jsd.training.tp.spring.clients.webservice.SaveFromWebServiceResponse")
    public Formateur saveFromWebService(
        @WebParam(name = "arg0", targetNamespace = "")
        Formateur arg0)
        throws ServiceException_Exception
    ;

}
