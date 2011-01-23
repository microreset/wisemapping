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
// Generated on: 2007.04.14 at 05:18:25 PM ART 
//


package com.wisemapping.xml.vmlmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://mindmap.com/xml/vmlmap}element">
 *       &lt;sequence>
 *         &lt;element ref="{http://mindmap.com/xml/vmlmap}stroke"/>
 *         &lt;element ref="{http://mindmap.com/xml/vmlmap}fill"/>
 *       &lt;/sequence>
 *       &lt;attribute name="arcsize" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="9830f" />
 *       &lt;attribute name="coordsize" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="21600,21600" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "stroke",
        "fill"
        })
@XmlRootElement(name = "roundrect")
public class Roundrect
        extends Element {

    @XmlElement(required = true)
    protected Stroke stroke;
    @XmlElement(required = true)
    protected Fill fill;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String arcsize;
    @XmlAttribute(required = true)
    protected String coordsize;

    /**
     * Gets the value of the stroke property.
     *
     * @return possible object is
     *         {@link Stroke }
     */
    public Stroke getStroke() {
        return stroke;
    }

    /**
     * Sets the value of the stroke property.
     *
     * @param value allowed object is
     *              {@link Stroke }
     */
    public void setStroke(Stroke value) {
        this.stroke = value;
    }

    /**
     * Gets the value of the fill property.
     *
     * @return possible object is
     *         {@link Fill }
     */
    public Fill getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     *
     * @param value allowed object is
     *              {@link Fill }
     */
    public void setFill(Fill value) {
        this.fill = value;
    }

    /**
     * Gets the value of the arcsize property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getArcsize() {
        if (arcsize == null) {
            return "9830f";
        } else {
            return arcsize;
        }
    }

    /**
     * Sets the value of the arcsize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArcsize(String value) {
        this.arcsize = value;
    }

    /**
     * Gets the value of the coordsize property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCoordsize() {
        if (coordsize == null) {
            return "21600,21600";
        } else {
            return coordsize;
        }
    }

    /**
     * Sets the value of the coordsize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCoordsize(String value) {
        this.coordsize = value;
    }

}
