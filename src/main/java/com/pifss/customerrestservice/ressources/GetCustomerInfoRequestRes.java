package com.pifss.customerrestservice.ressources;

import com.pifss.customerrestservice.pojos.GetCustomerInfoRequest;
import com.pifss.customerrestservice.pojos.MessageHeaderObj;

public class GetCustomerInfoRequestRes {

    public static GetCustomerInfoRequest getCustomerInfoRequest(String idcustomer) {

        GetCustomerInfoRequest customerRequest = new GetCustomerInfoRequest();
        customerRequest.setCustomerIdentityNumber(idcustomer);

        customerRequest.setMessageHeader(createMessageHeader("777", "6565", "200"));
        System.out.println("creation de request"+customerRequest.getClass()+customerRequest.getCustomerIdentityNumber());

        return customerRequest;
    }

    public static MessageHeaderObj createMessageHeader(String idreq, String channel, String time) {

        MessageHeaderObj msg = new MessageHeaderObj();
        msg.getRequestChannel().add(channel);
        msg.getRequestId().add(idreq);
        msg.getRequestTime().add(time);
        return msg;

    }
}
