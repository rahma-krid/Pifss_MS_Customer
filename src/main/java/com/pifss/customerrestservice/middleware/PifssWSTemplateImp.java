package com.pifss.customerrestservice.middleware;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;

@Service
public class PifssWSTemplateImp implements IPifssWSTemplate {

    @Override
    public <T, R> R SendAndReceive(T t, @Value("${customer.ws-uri}") String uri, R r) {


        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setClassesToBeBound(t.getClass(),r.getClass());
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        MessageFactory messageFactory = null;
        try {
            messageFactory = MessageFactory.newInstance("SOAP 1.1 Protocol");
        } catch (SOAPException e) {
            e.printStackTrace();
        }

        SaajSoapMessageFactory saajSoapMessageFactory=new SaajSoapMessageFactory();
        saajSoapMessageFactory.setMessageFactory(messageFactory);
        webServiceTemplate.setMessageFactory(saajSoapMessageFactory);

        System.out.println("webservicetemplate send and receive");

        return (R) webServiceTemplate.marshalSendAndReceive(uri, t);


    }
}



