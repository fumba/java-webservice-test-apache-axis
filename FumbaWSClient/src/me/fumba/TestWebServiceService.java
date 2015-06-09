/**
 * TestWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package me.fumba;

public interface TestWebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getTestWebServiceAddress();

    public me.fumba.TestWebService getTestWebService() throws javax.xml.rpc.ServiceException;

    public me.fumba.TestWebService getTestWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
