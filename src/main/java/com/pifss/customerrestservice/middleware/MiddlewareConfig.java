package com.pifss.customerrestservice.middleware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;

@Configuration
public class MiddlewareConfig {

    @Bean
    public WebServiceTemplate webServiceTemplate() throws SOAPException {

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);

        MessageFactory messageFactory =MessageFactory.newInstance("SOAP 1.1 Protocol");
        SaajSoapMessageFactory saajSoapMessageFactory=new SaajSoapMessageFactory();
        saajSoapMessageFactory.setMessageFactory(messageFactory);

        webServiceTemplate.setMessageFactory(saajSoapMessageFactory);

        return webServiceTemplate;
    }

}


