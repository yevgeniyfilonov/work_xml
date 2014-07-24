
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gunType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gunType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handy" type="{http://www.example.com/Guns}handyType"/>
 *         &lt;element name="original" type="{http://www.example.com/Guns}originalType"/>
 *         &lt;element name="ttc" type="{http://www.example.com/Guns}ttcType"/>
 *         &lt;element name="material" type="{http://www.example.com/Guns}materialType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gunType", namespace = "http://www.example.com/Guns", propOrder = {
    "model",
    "handy",
    "original",
    "ttc",
    "material"
})
public class GunType {
    @Override
    public String toString() {
        return "GunType{" +
                "model='" + model + '\'' +
                ", handy=" + handy +
                ", original=" + original +
                ", ttc=" + ttc +
                ", material=" + material +
                ", id=" + id +
                '}';
    }

    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HandyType handy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OriginalType original;
    @XmlElement(required = true)
    protected TtcType ttc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MaterialType material;
    @XmlAttribute(name = "id", required = true)
    protected int id;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the handy property.
     * 
     * @return
     *     possible object is
     *     {@link HandyType }
     *     
     */
    public HandyType getHandy() {
        return handy;
    }

    /**
     * Sets the value of the handy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandyType }
     *     
     */
    public void setHandy(HandyType value) {
        this.handy = value;
    }

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalType }
     *     
     */
    public OriginalType getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalType }
     *     
     */
    public void setOriginal(OriginalType value) {
        this.original = value;
    }

    /**
     * Gets the value of the ttc property.
     * 
     * @return
     *     possible object is
     *     {@link TtcType }
     *     
     */
    public TtcType getTtc() {
        return ttc;
    }

    /**
     * Sets the value of the ttc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TtcType }
     *     
     */
    public void setTtc(TtcType value) {
        this.ttc = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialType }
     *     
     */
    public MaterialType getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialType }
     *     
     */
    public void setMaterial(MaterialType value) {
        this.material = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
