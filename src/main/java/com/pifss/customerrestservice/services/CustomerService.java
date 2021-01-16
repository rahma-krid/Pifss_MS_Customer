package com.pifss.customerrestservice.services;

import com.pifss.customerrestservice.mappers.CustomerMapper;
import com.pifss.customerrestservice.middleware.CustomerMiddleware;
import com.pifss.customerrestservice.pojos.UpdateCustomerProfileRequest;
import com.pifss.customerrestservice.pojos.UpdateCustomerProfileResponse;
import com.pifss.customerrestservice.ressources.Customer;
import com.pifss.customerrestservice.ressources.UpdateCustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired
    CustomerMapper customermapper;

    @Autowired
    CustomerMiddleware customermiddleware;

    public Customer GetcustomerinfoService(String idcustomer) {

        return customermapper.mapToCustomerResponse(customermiddleware.getCustomeInfo(idcustomer));
    }



    public static UpdateCustomerProfileRequest updatecustomerrequest(UpdateCustomerRequest request)
    {

        UpdateCustomerProfileRequest DemandRequest = new UpdateCustomerProfileRequest();
        DemandRequest.setCustomerIdentity(request.getCustomerIdentity());
        DemandRequest.setEnglishName(request.getEnglishName());
        DemandRequest.setPaciNumber(request.getPaciNumber());
        DemandRequest.setRegion(request.getRegion());
        DemandRequest.setAllotmentNumber(request.getAllotmentNumber());
        DemandRequest.setAvenueNumber(request.getAvenueNumber());
        DemandRequest.setStreet(request.getStreet());
        DemandRequest.setHouseNumber(request.getHouseNumber());
        DemandRequest.setFloorNumber(request.getFloorNumber());
        DemandRequest.setApartmentNumber(request.getApartmentNumber());
        DemandRequest.setEmail(request.getEmail());
        DemandRequest.setPhoneNumber(request.getPhoneNumber());
        DemandRequest.setMobileNumber(request.getMobileNumber());
        DemandRequest.setCivilCardExpirationDate(request.getCivilCardExpirationDate());


        return DemandRequest;
    }



    public UpdateCustomerProfileResponse updatecustomerservice(UpdateCustomerProfileRequest req) {

        return customermiddleware.updatecustomer(req);
    }



}
