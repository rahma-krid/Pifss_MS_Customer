
package com.pifss.customerrestservice.pojos;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="clerkId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="englishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paciNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allotmentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="avenueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="floorNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="civilCardExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    "clerkId",
    "deptId",
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
    "civilCardExpirationDate"
})
@XmlRootElement(name = "updateCustomerProfileRequest")
public class UpdateCustomerProfileRequest {

    @XmlElement(required = true)
    protected MessageHeaderObj messageHeader;
    @XmlElement(required = true, nillable = true)
    protected BigInteger customerIdentity;
    @XmlElement(required = true, nillable = true)
    protected String clerkId;
    @XmlElement(required = true, nillable = true)
    protected String deptId;
    @XmlElement(required = true, nillable = true)
    protected String englishName;
    @XmlElement(required = true, nillable = true)
    protected String paciNumber;
    @XmlElement(required = true, nillable = true)
    protected String region;
    @XmlElement(required = true, nillable = true)
    protected String allotmentNumber;
    @XmlElement(required = true, nillable = true)
    protected String avenueNumber;
    @XmlElement(required = true, nillable = true)
    protected String street;
    @XmlElement(required = true, nillable = true)
    protected String houseNumber;
    @XmlElement(required = true, nillable = true)
    protected String floorNumber;
    @XmlElement(required = true, nillable = true)
    protected String apartmentNumber;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected String phoneNumber;
    @XmlElement(required = true, nillable = true)
    protected String mobileNumber;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar civilCardExpirationDate;

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
     * Obtient la valeur de la propriété clerkId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClerkId() {
        return clerkId;
    }

    /**
     * Définit la valeur de la propriété clerkId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClerkId(String value) {
        this.clerkId = value;
    }

    /**
     * Obtient la valeur de la propriété deptId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * Définit la valeur de la propriété deptId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptId(String value) {
        this.deptId = value;
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
     *     {@link String }
     *     
     */
    public String getAllotmentNumber() {
        return allotmentNumber;
    }

    /**
     * Définit la valeur de la propriété allotmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllotmentNumber(String value) {
        this.allotmentNumber = value;
    }

    /**
     * Obtient la valeur de la propriété avenueNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvenueNumber() {
        return avenueNumber;
    }

    /**
     * Définit la valeur de la propriété avenueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvenueNumber(String value) {
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
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Définit la valeur de la propriété houseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Obtient la valeur de la propriété floorNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /**
     * Définit la valeur de la propriété floorNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNumber(String value) {
        this.floorNumber = value;
    }

    /**
     * Obtient la valeur de la propriété apartmentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Définit la valeur de la propriété apartmentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNumber(String value) {
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
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Définit la valeur de la propriété phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obtient la valeur de la propriété mobileNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Définit la valeur de la propriété mobileNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Obtient la valeur de la propriété civilCardExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCivilCardExpirationDate() {
        return civilCardExpirationDate;
    }

    /**
     * Définit la valeur de la propriété civilCardExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCivilCardExpirationDate(XMLGregorianCalendar value) {
        this.civilCardExpirationDate = value;
    }

}
