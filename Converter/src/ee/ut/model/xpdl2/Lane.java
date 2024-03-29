//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.15 at 06:18:08 PM EST 
//

package ee.ut.model.xpdl2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import org.w3c.dom.Element;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}Object" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}NodeGraphicsInfos" minOccurs="0"/>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}Performers" minOccurs="0"/>
 *         &lt;element name="NestedLane" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="LaneId" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParentLane" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="ParentPool" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "object", "nodeGraphicsInfos", "performers",
		"nestedLane", "any" })
@XmlRootElement(name = "Lane")
public class Lane {

	@XmlElement(name = "Object")
	protected ee.ut.model.xpdl2.Object object;
	@XmlElement(name = "NodeGraphicsInfos")
	protected NodeGraphicsInfos nodeGraphicsInfos;
	@XmlElement(name = "Performers")
	protected Performers performers;
	@XmlElement(name = "NestedLane")
	protected List<Lane.NestedLane> nestedLane;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAttribute(name = "Id", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NMTOKEN")
	protected String id;
	@XmlAttribute(name = "Name")
	protected String name;
	@XmlAttribute(name = "ParentLane")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NMTOKEN")
	protected String parentLane;
	@XmlAttribute(name = "ParentPool")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NMTOKEN")
	protected String parentPool;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the object property.
	 * 
	 * @return possible object is {@link ee.ut.model.xpdl2.Object }
	 * 
	 */
	public ee.ut.model.xpdl2.Object getObject() {
		return object;
	}

	/**
	 * Sets the value of the object property.
	 * 
	 * @param value
	 *            allowed object is {@link ee.ut.model.xpdl2.Object }
	 * 
	 */
	public void setObject(ee.ut.model.xpdl2.Object value) {
		this.object = value;
	}

	/**
	 * Gets the value of the nodeGraphicsInfos property.
	 * 
	 * @return possible object is {@link NodeGraphicsInfos }
	 * 
	 */
	public NodeGraphicsInfos getNodeGraphicsInfos() {
		return nodeGraphicsInfos;
	}

	/**
	 * Sets the value of the nodeGraphicsInfos property.
	 * 
	 * @param value
	 *            allowed object is {@link NodeGraphicsInfos }
	 * 
	 */
	public void setNodeGraphicsInfos(NodeGraphicsInfos value) {
		this.nodeGraphicsInfos = value;
	}

	/**
	 * Gets the value of the performers property.
	 * 
	 * @return possible object is {@link Performers }
	 * 
	 */
	public Performers getPerformers() {
		return performers;
	}

	/**
	 * Sets the value of the performers property.
	 * 
	 * @param value
	 *            allowed object is {@link Performers }
	 * 
	 */
	public void setPerformers(Performers value) {
		this.performers = value;
	}

	/**
	 * Gets the value of the nestedLane property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the nestedLane property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNestedLane().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Lane.NestedLane }
	 * 
	 * 
	 */
	public List<Lane.NestedLane> getNestedLane() {
		if (nestedLane == null) {
			nestedLane = new ArrayList<Lane.NestedLane>();
		}
		return this.nestedLane;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element }
	 * {@link java.lang.Object }
	 * 
	 * 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<java.lang.Object>();
		}
		return this.any;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the parentLane property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentLane() {
		return parentLane;
	}

	/**
	 * Sets the value of the parentLane property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParentLane(String value) {
		this.parentLane = value;
	}

	/**
	 * Gets the value of the parentPool property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentPool() {
		return parentPool;
	}

	/**
	 * Sets the value of the parentPool property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParentPool(String value) {
		this.parentPool = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;attribute name="LaneId" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class NestedLane {

		@XmlAttribute(name = "LaneId", required = true)
		@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
		@XmlSchemaType(name = "NMTOKEN")
		protected String laneId;

		/**
		 * Gets the value of the laneId property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLaneId() {
			return laneId;
		}

		/**
		 * Sets the value of the laneId property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLaneId(String value) {
			this.laneId = value;
		}

	}

}
