
package mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rangeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="low[0-500]"/>
 *     &lt;enumeration value="Middle[500-1000]"/>
 *     &lt;enumeration value="High[1000-]"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rangeType", namespace = "http://www.example.com/Guns")
@XmlEnum
public enum RangeType {

    @XmlEnumValue("low[0-500]")
    LOW_0_500("low[0-500]"),
    @XmlEnumValue("Middle[500-1000]")
    MIDDLE_500_1000("Middle[500-1000]"),
    @XmlEnumValue("High[1000-]")
    HIGH_1000("High[1000-]");
    private final String value;

    RangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RangeType fromValue(String v) {
        for (RangeType c: RangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
