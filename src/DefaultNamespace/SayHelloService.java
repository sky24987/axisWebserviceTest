/**
 * SayHelloService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface SayHelloService extends javax.xml.rpc.Service {
    public java.lang.String getSayHelloAddress();

    public DefaultNamespace.SayHello getSayHello() throws javax.xml.rpc.ServiceException;

    public DefaultNamespace.SayHello getSayHello(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
