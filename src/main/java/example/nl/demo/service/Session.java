package example.nl.demo.service;

/**
 * Created with IntelliJ IDEA.
 * User: zuzana
 * Date: 07-09-13
 * Time: 14:35
 * To change this template use File | Settings | File Templates.
 */
public class Session {

                        private  Integer customerId;
    public Integer getCustomerId(){

        return customerId;
    }

    public  Session (Integer customerId){
        this.customerId=customerId;
    }
}
