package com.pifss.customerrestservice.ressources;

import java.math.BigInteger;
import java.util.Date;

public class Customer {

    private BigInteger customerIdentity;
    private String customerName;
    private String socSecurityNumber;
    private String holderType;
    private String holderDescription;
    private String comOutLstStpEmpRsn;
    private String sex;
    private String birthday;
    private String deathDate;
    private String englishName;
    private String paciNumber;
    private String region;
    private BigInteger allotmentNumber;
    private BigInteger avenueNumber;
    private String street;
    private BigInteger houseNumber;
    private BigInteger floorNumber;
    private BigInteger apartmentNumber;
    private String email;
    private BigInteger phoneNumber;
    private BigInteger mobileNumber;
    private Date civilCardExpirationDate;

    public Customer(BigInteger customerIdentity, String customerName, String socSecurityNumber, String holderType, String holderDescription, String comOutLstStpEmpRsn, String sex, String birthday, String deathDate, String englishName, String paciNumber, String region, BigInteger allotmentNumber, BigInteger avenueNumber, String street, BigInteger houseNumber, BigInteger floorNumber, BigInteger apartmentNumber, String email, BigInteger phoneNumber, BigInteger mobileNumber, Date civilCardExpirationDate) {
        this.customerIdentity = customerIdentity;
        this.customerName = customerName;
        this.socSecurityNumber = socSecurityNumber;
        this.holderType = holderType;
        this.holderDescription = holderDescription;
        this.comOutLstStpEmpRsn = comOutLstStpEmpRsn;
        this.sex = sex;
        this.birthday = birthday;
        this.deathDate = deathDate;
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

    public Customer() {
    }

    public BigInteger getCustomerIdentity() {
        return customerIdentity;
    }

    public void setCustomerIdentity(BigInteger customerIdentity) {
        this.customerIdentity = customerIdentity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSocSecurityNumber() {
        return socSecurityNumber;
    }

    public void setSocSecurityNumber(String socSecurityNumber) {
        this.socSecurityNumber = socSecurityNumber;
    }

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType;
    }

    public String getHolderDescription() {
        return holderDescription;
    }

    public void setHolderDescription(String holderDescription) {
        this.holderDescription = holderDescription;
    }

    public String getComOutLstStpEmpRsn() {
        return comOutLstStpEmpRsn;
    }

    public void setComOutLstStpEmpRsn(String comOutLstStpEmpRsn) {
        this.comOutLstStpEmpRsn = comOutLstStpEmpRsn;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getPaciNumber() {
        return paciNumber;
    }

    public void setPaciNumber(String paciNumber) {
        this.paciNumber = paciNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigInteger getAllotmentNumber() {
        return allotmentNumber;
    }

    public void setAllotmentNumber(BigInteger allotmentNumber) {
        this.allotmentNumber = allotmentNumber;
    }

    public BigInteger getAvenueNumber() {
        return avenueNumber;
    }

    public void setAvenueNumber(BigInteger avenueNumber) {
        this.avenueNumber = avenueNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public BigInteger getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(BigInteger houseNumber) {
        this.houseNumber = houseNumber;
    }

    public BigInteger getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(BigInteger floorNumber) {
        this.floorNumber = floorNumber;
    }

    public BigInteger getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(BigInteger apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigInteger getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(BigInteger mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Date getCivilCardExpirationDate() {
        return civilCardExpirationDate;
    }

    public void setCivilCardExpirationDate(Date civilCardExpirationDate) {
        this.civilCardExpirationDate = civilCardExpirationDate;
    }
}