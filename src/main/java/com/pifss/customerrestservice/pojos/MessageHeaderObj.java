
package com.pifss.customerrestservice.pojos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour messageHeaderObj complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="messageHeaderObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="27"/>
 *         &lt;element name="RequestChannel" maxOccurs="3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="MOB"/>
 *               &lt;enumeration value="WEB"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestTime" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="17"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageHeaderObj", propOrder = {
    "requestId",
    "requestChannel",
    "requestTime"
})
public class MessageHeaderObj {

    @XmlElement(name = "RequestId", required = true)
    protected List<String> requestId;
    @XmlElement(name = "RequestChannel", required = true)
    protected List<String> requestChannel;
    @XmlElement(name = "RequestTime", required = true)
    protected List<String> requestTime;

    /**
     * Gets the value of the requestId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestId() {
        if (requestId == null) {
            requestId = new ArrayList<String>();
        }
        return this.requestId;
    }

    /**
     * Gets the value of the requestChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestChannel() {
        if (requestChannel == null) {
            requestChannel = new ArrayList<String>();
        }
        return this.requestChannel;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestTime() {
        if (requestTime == null) {
            requestTime = new ArrayList<String>();
        }
        return this.requestTime;
    }

}
