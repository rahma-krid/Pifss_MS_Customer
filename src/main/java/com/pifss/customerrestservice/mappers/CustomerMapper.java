package com.pifss.customerrestservice.mappers;

import com.pifss.customerrestservice.pojos.GetCustomerInfoResponse;
import com.pifss.customerrestservice.ressources.Customer;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CustomerMapper {

    //mappage for serviceweb customersalaryInformation
    public Customer mapToCustomerResponse(GetCustomerInfoResponse customerResponse) {
        return new Customer(
                customerResponse.getCustomerIdentity(),
                customerResponse.getCustomerName(),
                customerResponse.getSocSecurityNumber(),
                customerResponse.getHolderType(),
                customerResponse.getHolderDescription(),
                customerResponse.getComOutLstStpEmpRsn(),
                customerResponse.getSex(),
                customerResponse.getBirthday(),
                customerResponse.getDeathDate(),
                customerResponse.getEnglishName(),
                customerResponse.getPaciNumber(),
                customerResponse.getRegion(),
                customerResponse.getAllotmentNumber(),
                customerResponse.getAvenueNumber(),
                customerResponse.getStreet(),
                customerResponse.getHouseNumber(),
                customerResponse.getFloorNumber(),
                customerResponse.getApartmentNumber(),
                customerResponse.getEmail(),
                customerResponse.getPhoneNumber(),
                customerResponse.getMobileNumber(),
                new Date()


        );
    }


}