
package com.pifss.customerrestservice.pojos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour returnStatusObj complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="returnStatusObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="6"/>
 *         &lt;element name="returnCodeDescAr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="128"/>
 *         &lt;element name="returnCodeDescEn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="128"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnStatusObj", propOrder = {
    "returnCode",
    "returnCodeDescAr",
    "returnCodeDescEn"
})
public class ReturnStatusObj {

    @XmlElement(required = true)
    protected List<String> returnCode;
    @XmlElement(required = true)
    protected List<String> returnCodeDescAr;
    @XmlElement(required = true)
    protected List<String> returnCodeDescEn;

    /**
     * Gets the value of the returnCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReturnCode() {
        if (returnCode == null) {
            returnCode = new ArrayList<String>();
        }
        return this.returnCode;
    }

    /**
     * Gets the value of the returnCodeDescAr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnCodeDescAr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnCodeDescAr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReturnCodeDescAr() {
        if (returnCodeDescAr == null) {
            returnCodeDescAr = new ArrayList<String>();
        }
        return this.returnCodeDescAr;
    }

    /**
     * Gets the value of the returnCodeDescEn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnCodeDescEn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnCodeDescEn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReturnCodeDescEn() {
        if (returnCodeDescEn == null) {
            returnCodeDescEn = new ArrayList<String>();
        }
        return this.returnCodeDescEn;
    }

}
