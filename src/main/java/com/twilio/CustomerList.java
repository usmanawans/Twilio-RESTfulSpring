package com.twilio;

import java.util.ArrayList;

/**
 * Created by Usman on 24.12.2016.
 */
public class CustomerList {

    Customer customer1 = new Customer("Ola",12061985);
    Customer customer2 = new Customer("Kari",11011980);

    ArrayList<Customer> customers = new ArrayList<Customer>();

    public CustomerList(){
        customers.add(customer1);
        customers.add(customer2);
    }

    public Customer getCustomer( int personalId ) {
        return customers.get(personalId);
    }
}
