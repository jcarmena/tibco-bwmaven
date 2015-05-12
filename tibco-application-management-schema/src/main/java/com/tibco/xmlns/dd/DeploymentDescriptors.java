//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.23 at 10:11:20 AM CET 
//


package com.tibco.xmlns.dd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tibco.xmlns.authentication.RequiresAuthentication;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isApplicationArchive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.tibco.com/xmlns/dd}DeploymentDescriptor" maxOccurs="unbounded" minOccurs="0"/>
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
    "name",
    "description",
    "version",
    "owner",
    "creationDate",
    "isApplicationArchive",
    "deploymentDescriptor"
})
@XmlRootElement(name = "DeploymentDescriptors")
public class DeploymentDescriptors {

    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected String version;
    protected String owner;
    protected String creationDate;
    protected String isApplicationArchive;
    @XmlElementRef(name = "DeploymentDescriptor", namespace = "http://www.tibco.com/xmlns/dd", type = JAXBElement.class)
    protected List<JAXBElement<? extends DeploymentDescriptorType>> deploymentDescriptor;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the isApplicationArchive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsApplicationArchive() {
        return isApplicationArchive;
    }

    /**
     * Sets the value of the isApplicationArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsApplicationArchive(String value) {
        this.isApplicationArchive = value;
    }

    /**
     * Gets the value of the deploymentDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deploymentDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeploymentDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DeploymentDescriptorFactory }{@code >}
     * {@link JAXBElement }{@code <}{@link Modules }{@code >}
     * {@link JAXBElement }{@code <}{@link DeploymentDescriptorType }{@code >}
     * {@link JAXBElement }{@code <}{@link StartAsOneOf }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomTSMPlugInConfiguration }{@code >}
     * {@link JAXBElement }{@code <}{@link DiffExcludeFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassLoaderExtension }{@code >}
     * {@link JAXBElement }{@code <}{@link RequiresAuthentication }{@code >}
     * {@link JAXBElement }{@code <}{@link NameValuePairs }{@code >}
     * {@link JAXBElement }{@code <}{@link SupportsFaultTolerance }{@code >}
     * {@link JAXBElement }{@code <}{@link RequiredComponents }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DeploymentDescriptorType>> getDeploymentDescriptor() {
        if (deploymentDescriptor == null) {
            deploymentDescriptor = new ArrayList<JAXBElement<? extends DeploymentDescriptorType>>();
        }
        return this.deploymentDescriptor;
    }

}