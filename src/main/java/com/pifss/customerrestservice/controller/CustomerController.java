package com.pifss.customerrestservice.controller;

import com.pifss.customerrestservice.pojos.UpdateCustomerProfileResponse;
import com.pifss.customerrestservice.ressources.Customer;
import com.pifss.customerrestservice.ressources.UpdateCustomerRequest;
import com.pifss.customerrestservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins="*")
public class CustomerController {

    @Autowired
    CustomerService customerservice;

    @GetMapping(value = "/{id}")
    public Customer getCustomerInfo(@PathVariable("id") String idcustomer) {
        System.out.println("debut controleur" + idcustomer);
        Customer Response = customerservice.GetcustomerinfoService(idcustomer);
        System.out.println("creation de response" + idcustomer);

        return Response;
    }


    @PostMapping(value="/update")
    public Boolean updateCustomer(@RequestBody UpdateCustomerRequest customer ){
        UpdateCustomerProfileResponse res= customerservice.updatecustomerservice(customerservice.updatecustomerrequest(customer));
        Boolean response=res.isResult();
        return response;
    }

}