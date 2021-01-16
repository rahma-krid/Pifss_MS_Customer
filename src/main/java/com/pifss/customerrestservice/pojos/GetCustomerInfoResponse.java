
package com.pifss.customerrestservice.pojos;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageHeader" type="{http://UpdateIndividualData}messageHeaderObj"/>
 *         &lt;element name="customerIdentity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="socSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="holderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="holderDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComOutLstStpEmpRsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="englishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paciNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allotmentNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="avenueNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="floorNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="civilCardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="messageStatus" type="{http://UpdateIndividualData}messageStatusObj"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageHeader",
    "customerIdentity",
    "customerName",
    "socSecurityNumber",
    "holderType",
    "holderDescription",
    "comOutLstStpEmpRsn",
    "sex",
    "birthday",
    "deathDate",
    "englishName",
    "paciNumber",
    "region",
    "allotmentNumber",
    "avenueNumber",
    "street",
    "houseNumber",
    "floorNumber",
    "apartmentNumber",
    "email",
    "phoneNumber",
    "mobileNumber",
    "civilCardExpirationDate",
    "messageStatus"
})
@XmlRootElement(name = "getCustomerInfoResponse")
public class GetCustomerInfoResponse {

    @XmlElement(required = true)
    protected MessageHeaderObj messageHeader;
    @XmlElement(required = true, nillable = true)
    protected BigInteger customerIdentity;
    @XmlElement(required = true, nillable = true)
    protected String customerName;
    @XmlElement(required = true, nillable = true)
    protected String socSecurityNumber;
    @XmlElement(required = true, nillable = true)
    protected String holderType;
    @XmlElement(required = true, nillable = true)
    protected String holderDescription;
    @XmlElement(name = "ComOutLstStpEmpRsn", required = true, nillable = true)
    protected String comOutLstStpEmpRsn;
    @XmlElement(required = true, nillable = true)
    protected String sex;
    @XmlElement(required = true, nillable = true)
    protected String birthday;
    @XmlElement(required = true, nillable = true)
    protected String deathDate;
    @XmlElement(required = true, nillable = true)
    protected String englishName;
    @XmlElement(required = true, nillable = true)
    protected String paciNumber;
    @XmlElement(required = true, nillable = true)
    protected String region;
    @XmlElement(required = true, nillable = true)
    protected BigInteger allotmentNumber;
    @XmlElement(required = true, nillable = true)
    protected BigInteger avenueNumber;
    @XmlElement(required = true, nillable = true)
    protected String street;
    @XmlElement(required = true, nillable = true)
    protected BigInteger houseNumber;
    @XmlElement(required = true, nillable = true)
    protected BigInteger floorNumber;
    @XmlElement(required = true, nillable = true)
    protected BigInteger apartmentNumber;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected BigInteger phoneNumber;
    @XmlElement(required = true, nillable = true)
    protected BigInteger mobileNumber;
    @XmlElementRef(name = "civilCardExpirationDate", namespace = "http://UpdateIndividualData", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> civilCardExpirationDate;
    @XmlElement(required = true, nillable = true)
    protected MessageStatusObj messageStatus;

    /**
     * Obtient la valeur de la propriété messageHeader.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderObj }
     *     
     */
    public MessageHeaderObj getMessageHeader() {
        return messageHeader;
    }

    /**
     * Définit la valeur de la propriété messageHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderObj }
     *     
     */
    public void setMessageHeader(MessageHeaderObj value) {
        this.messageHeader = value;
    }

    /**
     * Obtient la valeur de la propriété customerIdentity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerIdentity() {
        return customerIdentity;
    }

    /**
     * Définit la valeur de la propriété customerIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerIdentity(BigInteger value) {
        this.customerIdentity = value;
    }

    /**
     * Obtient la valeur de la propriété customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Définit la valeur de la propriété customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtient la valeur de la propriété socSecurityNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocSecurityNumber() {
        return socSecurityNumber;
    }

    /**
     * Définit la valeur de la propriété socSecurityNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocSecurityNumber(String value) {
        this.socSecurityNumber = value;
    }

    /**
     * Obtient la valeur de la propriété holderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderType() {
        return holderType;
    }

    /**
     * Définit la valeur de la propriété holderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderType(String value) {
        this.holderType = value;
    }

    /**
     * Obtient la valeur de la propriété holderDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderDescription() {
        return holderDescription;
    }

    /**
     * Définit la valeur de la propriété holderDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderDescription(String value) {
        this.holderDescription = value;
    }

    /**
     * Obtient la valeur de la propriété comOutLstStpEmpRsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComOutLstStpEmpRsn() {
        return comOutLstStpEmpRsn;
    }

    /**
     * Définit la valeur de la propriété comOutLstStpEmpRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComOutLstStpEmpRsn(String value) {
        this.comOutLstStpEmpRsn = value;
    }

    /**
     * Obtient la valeur de la propriété sex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Définit la valeur de la propriété sex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Obtient la valeur de la propriété birthday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Définit la valeur de la propriété birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Obtient la valeur de la propriété deathDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * Définit la valeur de la propriété deathDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDate(String value) {
        this.deathDate = value;
    }

    /**
     * Obtient la valeur de la propriété englishName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * Définit la valeur de la propriété englishName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishName(String value) {
        this.englishName = value;
    }

    /**
     * Obtient la valeur de la propriété paciNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaciNumber() {
        return paciNumber;
    }

    /**
     * Définit la valeur de la propriété paciNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaciNumber(String value) {
        this.paciNumber = value;
    }

    /**
     * Obtient la valeur de la propriété region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Définit la valeur de la propriété region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtient la valeur de la propriété allotmentNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAllotmentNumber() {
        return allotmentNumber;
    }

    /**
     * Définit la valeur de la propriété allotmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAllotmentNumber(BigInteger value) {
        this.allotmentNumber = value;
    }

    /**
     * Obtient la valeur de la propriété avenueNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvenueNumber() {
        return avenueNumber;
    }

    /**
     * Définit la valeur de la propriété avenueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvenueNumber(BigInteger value) {
        this.avenueNumber = value;
    }

    /**
     * Obtient la valeur de la propriété street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Définit la valeur de la propriété street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Obtient la valeur de la propriété houseNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHouseNumber() {
        return houseNumber;
    }

    /**
     * Définit la valeur de la propriété houseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHouseNumber(BigInteger value) {
        this.houseNumber = value;
    }

    /**
     * Obtient la valeur de la propriété floorNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFloorNumber() {
        return floorNumber;
    }

    /**
     * Définit la valeur de la propriété floorNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFloorNumber(BigInteger value) {
        this.floorNumber = value;
    }

    /**
     * Obtient la valeur de la propriété apartmentNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Définit la valeur de la propriété apartmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApartmentNumber(BigInteger value) {
        this.apartmentNumber = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Définit la valeur de la propriété phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhoneNumber(BigInteger value) {
        this.phoneNumber = value;
    }

    /**
     * Obtient la valeur de la propriété mobileNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Définit la valeur de la propriété mobileNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMobileNumber(BigInteger value) {
        this.mobileNumber = value;
    }

    /**
     * Obtient la valeur de la propriété civilCardExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCivilCardExpirationDate() {
        return civilCardExpirationDate;
    }

    /**
     * Définit la valeur de la propriété civilCardExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCivilCardExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.civilCardExpirationDate = value;
    }

    /**
     * Obtient la valeur de la propriété messageStatus.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusObj }
     *     
     */
    public MessageStatusObj getMessageStatus() {
        return messageStatus;
    }

    /**
     * Définit la valeur de la propriété messageStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusObj }
     *     
     */
    public void setMessageStatus(MessageStatusObj value) {
        this.messageStatus = value;
    }

}
