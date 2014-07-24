
package mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for handyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="handyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="one hand"/>
 *     &lt;enumeration value="two hand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "handyType", namespace = "http://www.example.com/Guns")
@XmlEnum
public enum HandyType {

    @XmlEnumValue("one hand")
    ONE_HAND("one hand"),
    @XmlEnumValue("two hand")
    TWO_HAND("two hand");
    private final String value;

    HandyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HandyType fromValue(String v) {
        for (HandyType c: HandyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
