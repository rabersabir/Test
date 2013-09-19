package example.nl.demo.service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 18-9-13
 * Time: 11:05
 * To change this template use File | Settings | File Templates.
 */
public class CustomerRequest {
    private Integer customerId;
    private String name;


    public CustomerRequest(Integer customerId) {


    this.customerId=customerId;

    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}