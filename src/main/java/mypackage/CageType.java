
package mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="have"/>
 *     &lt;enumeration value="have not"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cageType", namespace = "http://www.example.com/Guns")
@XmlEnum
public enum CageType {

    @XmlEnumValue("have")
    HAVE("have"),
    @XmlEnumValue("have not")
    HAVE_NOT("have not");
    private final String value;

    CageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CageType fromValue(String v) {
        for (CageType c: CageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
