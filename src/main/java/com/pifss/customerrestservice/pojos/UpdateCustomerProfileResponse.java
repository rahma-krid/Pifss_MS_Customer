
package com.pifss.customerrestservice.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "result",
    "messageStatus"
})
@XmlRootElement(name = "updateCustomerProfileResponse")
public class UpdateCustomerProfileResponse {

    @XmlElement(required = true)
    protected MessageHeaderObj messageHeader;
    @XmlElement(name = "Result", required = true, type = Boolean.class, nillable = true)
    protected Boolean result;
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
     * Obtient la valeur de la propriété result.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResult() {
        return result;
    }

    /**
     * Définit la valeur de la propriété result.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResult(Boolean value) {
        this.result = value;
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
