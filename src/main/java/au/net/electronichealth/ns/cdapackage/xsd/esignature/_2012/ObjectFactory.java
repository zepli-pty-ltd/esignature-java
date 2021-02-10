//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.28 at 12:13:11 PM EST 
//


package au.net.electronichealth.ns.cdapackage.xsd.esignature._2012;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.cdapackage.xsd.esignature._2012 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ESignature_QNAME = new QName("http://ns.electronichealth.net.au/cdaPackage/xsd/eSignature/2012", "eSignature");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.cdapackage.xsd.esignature._2012
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ESignatureType }
     * 
     */
    public ESignatureType createESignatureType() {
        return new ESignatureType();
    }

    /**
     * Create an instance of {@link ApproverType }
     * 
     */
    public ApproverType createApproverType() {
        return new ApproverType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/cdaPackage/xsd/eSignature/2012", name = "eSignature")
    public JAXBElement<ESignatureType> createESignature(ESignatureType value) {
        return new JAXBElement<ESignatureType>(_ESignature_QNAME, ESignatureType.class, null, value);
    }

}
