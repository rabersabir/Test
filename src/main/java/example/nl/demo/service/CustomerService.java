package example.nl.demo.service;

import com.srccodes.example.spring.Customer;

/**
 * Created with IntelliJ IDEA.
 * User: zuzana
 * Date: 07-09-13
 * Time: 14:30
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerService {


    Customer getCustomerById(Integer id);

}
