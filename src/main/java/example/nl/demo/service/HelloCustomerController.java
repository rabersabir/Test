/**
 *
 */
package example.nl.demo.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Abhijit Ghosh
 * @version 1.0
 */
public class HelloCustomerController {

    /**
     * customerService
     */
    private CustomerService customerService;
    /**
     *
     */
    private MessageService messageService;


    public String getMessage(Session session) {

        CustomerRequest customerRequest = new CustomerRequest(session.getCustomerId());
        customerRequest.setName("jan");
        Customer customer = customerService.getCustomer(customerRequest);
        String message = "hello";

        //messageService.getCustomMessage(customer);
        return message;
    }

    public String getBirthdate(Session session) {


        CustomerRequest customerRequest = new CustomerRequest(session.getCustomerId());
        customerRequest.setName("jan");

        Customer customer = customerService.getCustomer(customerRequest);
        String birthDate = convertToString(customer.getBirthdate());
        return birthDate;
    }


    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }



    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }


    public String convertToString(Date date) {

        SimpleDateFormat ft =
                new SimpleDateFormat("yyyy.MM.dd");

        return ft.format(date);

    }
}
