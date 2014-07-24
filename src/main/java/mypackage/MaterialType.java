
package mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="materialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Metal"/>
 *     &lt;enumeration value="No metal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "materialType", namespace = "http://www.example.com/Guns")
@XmlEnum
public enum MaterialType {

    @XmlEnumValue("Metal")
    METAL("Metal"),
    @XmlEnumValue("No metal")
    NO_METAL("No metal");
    private final String value;

    MaterialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaterialType fromValue(String v) {
        for (MaterialType c: MaterialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
