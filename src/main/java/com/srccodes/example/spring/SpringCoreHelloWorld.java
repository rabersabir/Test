/**
 * 
 */
package com.srccodes.example.spring;

import example.nl.demo.service.CustomerService;
import example.nl.demo.service.MessageService;

import javax.annotation.Resource;

/**
 * @author Abhijit Ghosh
 * @version 1.0
 * 
 */
public class SpringCoreHelloWorld {
    /**
     *
     */
    private String message = null;
    /**
     *  customerService
     */
    private CustomerService customerService;
    /**
     *
     */
    private MessageService messageService;


	public String getMessage(Session session) {

       Customer customer= customerService.getCustomerById(session.getCustomerId());
       message =messageService.getCustomMessage(customer);

     return message;
	}


    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
