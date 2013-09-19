package com.srccodes.example.tdd;

import example.nl.demo.service.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    private HelloCustomerController helloWorld;

    @Before
    public  void setUp(){
        mockCustomerService= Mockito.mock(CustomerService.class);
        mockMessageService= Mockito.mock(MessageService.class);
        helloWorld=new HelloCustomerController();
        helloWorld.setCustomerService(mockCustomerService);
        helloWorld.setMessageService(mockMessageService);

    }

    @Test
    public void  getMessageVariant1(){
        String messageExpected;
        Customer customer=new Customer();
        when(mockCustomerService.getCustomer(any(CustomerRequest.class))).thenReturn(customer)             ;
        when(mockMessageService.getCustomMessage(customer)).thenReturn("hello");             ;
        String messageActual =helloWorld.getMessage(new Session(1234))      ;
        assertEquals("hello", messageActual) ;
    }


    @Ignore
    @Test
    public void  getMessageVariant2(){
        String messageExpected;
        ArgumentCaptor<CustomerRequest> customerRequest = ArgumentCaptor.forClass(CustomerRequest.class);

        Customer customer=new Customer();
        when(mockCustomerService.getCustomer(customerRequest.capture())).thenReturn(customer)             ;
        when(mockMessageService.getCustomMessage(customer)).thenReturn("hello");             ;
        String messageActual =helloWorld.getMessage(new Session(1234))      ;
        verify(mockMessageService).getCustomMessage(customer);
        CustomerRequest capturedCustomer = customerRequest.getValue();

        assertEquals(1234, capturedCustomer.getCustomerId().intValue());
        assertEquals("hello", messageActual) ;
    }


    @Test
    public void  getBirthDate(){
        String messageExpected;
        ArgumentCaptor<CustomerRequest> customerRequest = ArgumentCaptor.forClass(CustomerRequest.class);

        Customer customer=new Customer();
        customer.setBirthdate(new Date());
        when(mockCustomerService.getCustomer(customerRequest.capture())).thenReturn(customer)             ;
        String birthDate =helloWorld.getBirthdate(new Session(1234))      ;

        CustomerRequest capturedCustomer = customerRequest.getValue();

        assertEquals(1234, capturedCustomer.getCustomerId().intValue());

        String formatedDate=convertToString(customer.getBirthdate()) ;
        assertEquals(formatedDate, birthDate) ;
    }


    public String convertToString(Date date) {

        SimpleDateFormat ft =
                new SimpleDateFormat("yyyy.MM.dd");

        return ft.format(date);

    }
}
