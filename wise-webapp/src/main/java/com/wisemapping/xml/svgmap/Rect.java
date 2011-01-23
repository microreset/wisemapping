/*
*    Copyright [2011] [wisemapping]
*
*   Licensed under the Apache License, Version 2.0 (the "License") plus the
*   "powered by wisemapping" text requirement on every single page;
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the license at
*
*       http://www.wisemapping.org/license
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.14 at 05:27:07 PM ART 
//


package com.wisemapping.xml.svgmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="fill" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fill-opacity" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="rx" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ry" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="stroke" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stroke-opacity" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="stroke-width" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visibility" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "rect")
public class Rect {

    @XmlAttribute(required = true)
    protected String fill;
    @XmlAttribute(name = "fill-opacity")
    protected Float fillOpacity;
    @XmlAttribute(required = true)
    protected float height;
    @XmlAttribute
    protected Float rx;
    @XmlAttribute
    protected Float ry;
    @XmlAttribute(required = true)
    protected String stroke;
    @XmlAttribute(name = "stroke-opacity")
    protected Float strokeOpacity;
    @XmlAttribute(name = "stroke-width", required = true)
    protected String strokeWidth;
    @XmlAttribute
    protected String style;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String width;
    @XmlAttribute(required = true)
    protected float x;
    @XmlAttribute(required = true)
    protected float y;

    /**
     * Gets the value of the fill property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Gets the value of the fillOpacity property.
     *
     * @return possible object is
     *         {@link Float }
     */
    public Float getFillOpacity() {
        return fillOpacity;
    }

    /**
     * Sets the value of the fillOpacity property.
     *
     * @param value allowed object is
     *              {@link Float }
     */
    public void setFillOpacity(Float value) {
        this.fillOpacity = value;
    }

    /**
     * Gets the value of the height property.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Gets the value of the rx property.
     *
     * @return possible object is
     *         {@link Float }
     */
    public Float getRx() {
        return rx;
    }

    /**
     * Sets the value of the rx property.
     *
     * @param value allowed object is
     *              {@link Float }
     */
    public void setRx(Float value) {
        this.rx = value;
    }

    /**
     * Gets the value of the ry property.
     *
     * @return possible object is
     *         {@link Float }
     */
    public Float getRy() {
        return ry;
    }

    /**
     * Sets the value of the ry property.
     *
     * @param value allowed object is
     *              {@link Float }
     */
    public void setRy(Float value) {
        this.ry = value;
    }

    /**
     * Gets the value of the stroke property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStroke() {
        return stroke;
    }

    /**
     * Sets the value of the stroke property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStroke(String value) {
        this.stroke = value;
    }

    /**
     * Gets the value of the strokeOpacity property.
     *
     * @return possible object is
     *         {@link Float }
     */
    public Float getStrokeOpacity() {
        return strokeOpacity;
    }

    /**
     * Sets the value of the strokeOpacity property.
     *
     * @param value allowed object is
     *              {@link Float }
     */
    public void setStrokeOpacity(Float value) {
        this.strokeOpacity = value;
    }

    /**
     * Gets the value of the strokeWidth property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * Sets the value of the strokeWidth property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStrokeWidth(String value) {
        this.strokeWidth = value;
    }

    /**
     * Gets the value of the style property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the visibility property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the width property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the x property.
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     */
    public void setY(float value) {
        this.y = value;
    }

}
