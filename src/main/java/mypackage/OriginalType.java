
package mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for originalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="originalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Russia"/>
 *     &lt;enumeration value="China"/>
 *     &lt;enumeration value="USA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "originalType", namespace = "http://www.example.com/Guns")
@XmlEnum
public enum OriginalType {

    @XmlEnumValue("Russia")
    RUSSIA("Russia"),
    @XmlEnumValue("China")
    CHINA("China"),
    USA("USA");
    private final String value;

    OriginalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OriginalType fromValue(String v) {
        for (OriginalType c: OriginalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
