package com.twilio;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usman on 24.12.2016.
 */

@RestController
public class CustomerController {

    // hard code values
    CustomerList list = new CustomerList();



    @RequestMapping("/api/{id}")
    @RestController
    public class WidgetController {

        @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
        public Customer index(@PathVariable int id) {
            return list.getCustomer(id);
        }
    }


}
