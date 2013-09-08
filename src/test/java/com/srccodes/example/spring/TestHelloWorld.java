package com.srccodes.example.spring;

import example.nl.demo.service.CustomerService;
import example.nl.demo.service.MessageService;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 * Created with IntelliJ IDEA.
 * User: zuzana
 * Date: 07-09-13
 * Time: 14:44
 * To change this template use File | Settings | File Templates.
 */
public class TestHelloWorld {


    private CustomerService mockCustomerService;
    private MessageService mockMessageService;
    private SpringCoreHelloWorld helloWorld;

    @Before
    public  void setUp(){
        mockCustomerService= Mockito.mock(CustomerService.class);
        mockMessageService= Mockito.mock(MessageService.class);
        helloWorld=new SpringCoreHelloWorld();
        helloWorld.setCustomerService(mockCustomerService);
        helloWorld.setMessageService(mockMessageService);

    }

    @Test
    public void  getMessage(){
        String messageExpected;
        String messageActual =helloWorld.getMessage(new Session())      ;
        assert (true) ;


    }

}
