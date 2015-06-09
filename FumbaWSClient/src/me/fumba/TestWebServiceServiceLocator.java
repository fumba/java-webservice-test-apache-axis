/**
 * TestWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package me.fumba;

public class TestWebServiceServiceLocator extends org.apache.axis.client.Service implements me.fumba.TestWebServiceService {

    public TestWebServiceServiceLocator() {
    }


    public TestWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TestWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestWebService
    private java.lang.String TestWebService_address = "http://localhost:8080/FumbaWS/services/TestWebService";

    public java.lang.String getTestWebServiceAddress() {
        return TestWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TestWebServiceWSDDServiceName = "TestWebService";

    public java.lang.String getTestWebServiceWSDDServiceName() {
        return TestWebServiceWSDDServiceName;
    }

    public void setTestWebServiceWSDDServiceName(java.lang.String name) {
        TestWebServiceWSDDServiceName = name;
    }

    public me.fumba.TestWebService getTestWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestWebService(endpoint);
    }

    public me.fumba.TestWebService getTestWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            me.fumba.TestWebServiceSoapBindingStub _stub = new me.fumba.TestWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTestWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestWebServiceEndpointAddress(java.lang.String address) {
        TestWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (me.fumba.TestWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                me.fumba.TestWebServiceSoapBindingStub _stub = new me.fumba.TestWebServiceSoapBindingStub(new java.net.URL(TestWebService_address), this);
                _stub.setPortName(getTestWebServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TestWebService".equals(inputPortName)) {
            return getTestWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fumba.me", "TestWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fumba.me", "TestWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TestWebService".equals(portName)) {
            setTestWebServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
