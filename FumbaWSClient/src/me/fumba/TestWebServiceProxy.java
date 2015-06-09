package me.fumba;

public class TestWebServiceProxy implements me.fumba.TestWebService {
  private String _endpoint = null;
  private me.fumba.TestWebService testWebService = null;
  
  public TestWebServiceProxy() {
    _initTestWebServiceProxy();
  }
  
  public TestWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestWebServiceProxy();
  }
  
  private void _initTestWebServiceProxy() {
    try {
      testWebService = (new me.fumba.TestWebServiceServiceLocator()).getTestWebService();
      if (testWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testWebService != null)
      ((javax.xml.rpc.Stub)testWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public me.fumba.TestWebService getTestWebService() {
    if (testWebService == null)
      _initTestWebServiceProxy();
    return testWebService;
  }
  
  public java.lang.String retrieveCurrentDate(java.lang.String username) throws java.rmi.RemoteException{
    if (testWebService == null)
      _initTestWebServiceProxy();
    return testWebService.retrieveCurrentDate(username);
  }
  
  
}