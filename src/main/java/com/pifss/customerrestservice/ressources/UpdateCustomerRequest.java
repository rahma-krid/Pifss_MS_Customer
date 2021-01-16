package com.pifss.customerrestservice.ressources;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

public class UpdateCustomerRequest {


    private BigInteger customerIdentity;
    private String englishName;
    private String paciNumber;
    private String region;
    private String allotmentNumber;
    private String avenueNumber;
    private String street;
    private String houseNumber;
    private String floorNumber;
    private String apartmentNumber;
    private String email;
    private String phoneNumber;
    private String mobileNumber;
    private XMLGregorianCalendar civilCardExpirationDate;


    public BigInteger getCustomerIdentity() {
        return customerIdentity;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPaciNumber() {
        return paciNumber;
    }

    public String getRegion() {
        return region;
    }

    public String getAllotmentNumber() {
        return allotmentNumber;
    }

    public String getAvenueNumber() {
        return avenueNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public XMLGregorianCalendar getCivilCardExpirationDate() {
        return civilCardExpirationDate;
    }

    public UpdateCustomerRequest(BigInteger customerIdentity, String englishName, String paciNumber, String region, String allotmentNumber, String avenueNumber, String street, String houseNumber, String floorNumber, String apartmentNumber, String email, String phoneNumber, String mobileNumber, XMLGregorianCalendar civilCardExpirationDate) {
        this.customerIdentity = customerIdentity;
        this.englishName = englishName;
        this.paciNumber = paciNumber;
        this.region = region;
        this.allotmentNumber = allotmentNumber;
        this.avenueNumber = avenueNumber;
        this.street = street;
        this.houseNumber = houseNumber;
        this.floorNumber = floorNumber;
        this.apartmentNumber = apartmentNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.civilCardExpirationDate = civilCardExpirationDate;
    }


}
