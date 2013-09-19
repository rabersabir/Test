package example.nl.demo.service;

import java.util.Date;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: zuzana
 * Date: 07-09-13
 * Time: 13:57
 * To change this template use File | Settings | File Templates.
 */
public class Customer {

    private String name;
    private Locale locale;

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Date birthdate;



}


