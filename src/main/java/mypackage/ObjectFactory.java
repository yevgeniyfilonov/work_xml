
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _Guns_QNAME = new QName("http://www.example.com/Guns", "guns");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GnListType }
     * 
     */
    public GnListType createGnListType() {
        return new GnListType();
    }

    /**
     * Create an instance of {@link GunType }
     * 
     */
    public GunType createGunType() {
        return new GunType();
    }

    /**
     * Create an instance of {@link TtcType }
     * 
     */
    public TtcType createTtcType() {
        return new TtcType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/Guns", name = "guns")
    public JAXBElement<GnListType> createGuns(GnListType value) {
        return new JAXBElement<GnListType>(_Guns_QNAME, GnListType.class, null, value);
    }

}
