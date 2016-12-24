package com.twilio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    CustomerList list = new CustomerList();

	@Test
	public void contextLoads() {
        //checkCustomer();
        assertTrue( list.getCustomer(12061985).getPersonalid() == 12061985 );
        System.out.println( list.getCustomer(12061985).getPersonalid() );
	}
}
