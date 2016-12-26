package ru.kuramov.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by valerii on 23.12.16.
 */

@WebService(name = "HelloWS",
            targetNamespace = "http://ru.kuramov.wildfly.jaxws.service/")
public interface HelloWS {
    @WebMethod
    String sayHelloWorldFrom(String from);
}
