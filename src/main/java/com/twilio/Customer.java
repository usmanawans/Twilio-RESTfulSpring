package com.twilio;


/**
 * Created by Usman on 24.12.2016.
 */
public class Customer {

    private String name;
    private int personalid;

    public Customer( String name, int personalid ){
        this.name = name;
        this.personalid = personalid;
    }

    public String getName(){
        return name;
    }

    public int getPersonalid(){
        return personalid;
    }
}
