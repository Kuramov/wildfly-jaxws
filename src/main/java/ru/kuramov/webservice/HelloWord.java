package ru.kuramov.webservice;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by valerii on 23.12.16.
 */
@WebService(portName = "HelloWordPort",
            serviceName = "HelloWordService",
            targetNamespace = "http://ru.kuramov.wildfly.jaxws.service/",
            endpointInterface = "ru.kuramov.webservice.HelloWS")
public class HelloWord implements HelloWS {
  //@Override
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
//  public static void main(String[] argv) {
//    Object implementor = new HelloWord ();
//    String address = "http://localhost:9000/HelloWord";
//    Endpoint.publish(address, implementor);
//  }
}
