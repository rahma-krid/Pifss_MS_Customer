package com.pifss.customerrestservice.middleware;

import com.pifss.customerrestservice.pojos.GetCustomerInfoResponse;
import com.pifss.customerrestservice.pojos.UpdateCustomerProfileRequest;
import com.pifss.customerrestservice.pojos.UpdateCustomerProfileResponse;
import com.pifss.customerrestservice.ressources.GetCustomerInfoRequestRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMiddleware {

    private final PifssWSTemplateImp iPifssWserviceTemplateImp;

    @Autowired
    public CustomerMiddleware(PifssWSTemplateImp iPifssWserviceTemplateImp) {
        this.iPifssWserviceTemplateImp = iPifssWserviceTemplateImp;
    }


    public GetCustomerInfoResponse getCustomeInfo(String IdCustomer) {

        System.out.println("creation de request middleware "+IdCustomer);

        return iPifssWserviceTemplateImp.SendAndReceive(GetCustomerInfoRequestRes.getCustomerInfoRequest(IdCustomer)
                ,"http://localhost:8099/ws", new GetCustomerInfoResponse());

    }


    public UpdateCustomerProfileResponse updatecustomer(UpdateCustomerProfileRequest request) {

        return (UpdateCustomerProfileResponse) iPifssWserviceTemplateImp.SendAndReceive(request, "http://localhost:8099/ws",
                new UpdateCustomerProfileResponse());

    }




}