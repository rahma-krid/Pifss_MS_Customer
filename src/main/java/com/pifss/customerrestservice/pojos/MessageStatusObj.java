
package com.pifss.customerrestservice.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour messageStatusObj complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="messageStatusObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnStatus" type="{http://UpdateIndividualData}returnStatusObj"/>
 *         &lt;element name="returnStatusProvider" type="{http://UpdateIndividualData}returnStatusProviderObj"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageStatusObj", propOrder = {
    "returnStatus",
    "returnStatusProvider"
})
public class MessageStatusObj {

    @XmlElement(required = true, nillable = true)
    protected ReturnStatusObj returnStatus;
    @XmlElement(required = true, nillable = true)
    protected ReturnStatusProviderObj returnStatusProvider;

    /**
     * Obtient la valeur de la propriété returnStatus.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatusObj }
     *     
     */
    public ReturnStatusObj getReturnStatus() {
        return returnStatus;
    }

    /**
     * Définit la valeur de la propriété returnStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatusObj }
     *     
     */
    public void setReturnStatus(ReturnStatusObj value) {
        this.returnStatus = value;
    }

    /**
     * Obtient la valeur de la propriété returnStatusProvider.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatusProviderObj }
     *     
     */
    public ReturnStatusProviderObj getReturnStatusProvider() {
        return returnStatusProvider;
    }

    /**
     * Définit la valeur de la propriété returnStatusProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatusProviderObj }
     *     
     */
    public void setReturnStatusProvider(ReturnStatusProviderObj value) {
        this.returnStatusProvider = value;
    }

}
