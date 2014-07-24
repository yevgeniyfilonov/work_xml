
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ttcType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ttcType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="range" type="{http://www.example.com/Guns}rangeType"/>
 *         &lt;element name="sightingrange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cage" type="{http://www.example.com/Guns}cageType"/>
 *         &lt;element name="optics" type="{http://www.example.com/Guns}opticsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ttcType", namespace = "http://www.example.com/Guns", propOrder = {
    "range",
    "sightingrange",
    "cage",
    "optics"
})
public class TtcType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RangeType range;
    protected int sightingrange;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CageType cage;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OpticsType optics;

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link RangeType }
     *     
     */
    public RangeType getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeType }
     *     
     */
    public void setRange(RangeType value) {
        this.range = value;
    }

    /**
     * Gets the value of the sightingrange property.
     * 
     */
    public int getSightingrange() {
        return sightingrange;
    }

    /**
     * Sets the value of the sightingrange property.
     * 
     */
    public void setSightingrange(int value) {
        this.sightingrange = value;
    }

    /**
     * Gets the value of the cage property.
     * 
     * @return
     *     possible object is
     *     {@link CageType }
     *     
     */
    public CageType getCage() {
        return cage;
    }

    /**
     * Sets the value of the cage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CageType }
     *     
     */
    public void setCage(CageType value) {
        this.cage = value;
    }

    /**
     * Gets the value of the optics property.
     * 
     * @return
     *     possible object is
     *     {@link OpticsType }
     *     
     */
    public OpticsType getOptics() {
        return optics;
    }

    /**
     * Sets the value of the optics property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticsType }
     *     
     */
    public void setOptics(OpticsType value) {
        this.optics = value;
    }

}
