package ru.kuramov.webservice.client;/**
 * Created by valerii on 23.12.16.
 */
public class HelloWordClient {
  public static void main(String[] argv) {
      ru.kuramov.webservice.HelloWS service = new HelloWordService().getPort(ru.kuramov.webservice.HelloWS.class);
      //invoke business method
      service.sayHelloWorldFrom("Valera!!!");
  }
}
