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
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}ActualParameters"/>
 *           &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}DataMappings"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.wfmc.org/2008/XPDL2.1}EndPoint" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.wfmc.org/2008/XPDL2.1}IdRef" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Execution" default="SYNCHR">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ASYNCHR"/>
 *             &lt;enumeration value="SYNCHR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="View" default="COLLAPSED">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="COLLAPSED"/>
 *             &lt;enumeration value="EXPANDED"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PackageRef" type="{http://www.wfmc.org/2008/XPDL2.1}IdRef" />
 *       &lt;attribute name="InstanceDataField" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StartActivitySetId" type="{http://www.wfmc.org/2008/XPDL2.1}IdRef" />
 *       &lt;attribute name="StartActivityId" type="{http://www.wfmc.org/2008/XPDL2.1}IdRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "actualParameters", "dataMappings",
		"endPoint", "any" })
@XmlRootElement(name = "SubFlow")
public class SubFlow {

	@XmlElement(name = "ActualParameters")
	protected ActualParameters actualParameters;
	@XmlElement(name = "DataMappings")
	protected DataMappings dataMappings;
	@XmlElement(name = "EndPoint")
	protected EndPoint endPoint;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAttribute(name = "Id", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String id;
	@XmlAttribute(name = "Name")
	protected String name;
	@XmlAttribute(name = "Execution")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String execution;
	@XmlAttribute(name = "View")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String view;
	@XmlAttribute(name = "PackageRef")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String packageRef;
	@XmlAttribute(name = "InstanceDataField")
	protected String instanceDataField;
	@XmlAttribute(name = "StartActivitySetId")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String startActivitySetId;
	@XmlAttribute(name = "StartActivityId")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String startActivityId;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the actualParameters property.
	 * 
	 * @return possible object is {@link ActualParameters }
	 * 
	 */
	public ActualParameters getActualParameters() {
		return actualParameters;
	}

	/**
	 * Sets the value of the actualParameters property.
	 * 
	 * @param value
	 *            allowed object is {@link ActualParameters }
	 * 
	 */
	public void setActualParameters(ActualParameters value) {
		this.actualParameters = value;
	}

	/**
	 * Gets the value of the dataMappings property.
	 * 
	 * @return possible object is {@link DataMappings }
	 * 
	 */
	public DataMappings getDataMappings() {
		return dataMappings;
	}

	/**
	 * Sets the value of the dataMappings property.
	 * 
	 * @param value
	 *            allowed object is {@link DataMappings }
	 * 
	 */
	public void setDataMappings(DataMappings value) {
		this.dataMappings = value;
	}

	/**
	 * Gets the value of the endPoint property.
	 * 
	 * @return possible object is {@link EndPoint }
	 * 
	 */
	public EndPoint getEndPoint() {
		return endPoint;
	}

	/**
	 * Sets the value of the endPoint property.
	 * 
	 * @param value
	 *            allowed object is {@link EndPoint }
	 * 
	 */
	public void setEndPoint(EndPoint value) {
		this.endPoint = value;
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
	 * Gets the value of the execution property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExecution() {
		if (execution == null) {
			return "SYNCHR";
		} else {
			return execution;
		}
	}

	/**
	 * Sets the value of the execution property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExecution(String value) {
		this.execution = value;
	}

	/**
	 * Gets the value of the view property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getView() {
		if (view == null) {
			return "COLLAPSED";
		} else {
			return view;
		}
	}

	/**
	 * Sets the value of the view property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setView(String value) {
		this.view = value;
	}

	/**
	 * Gets the value of the packageRef property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPackageRef() {
		return packageRef;
	}

	/**
	 * Sets the value of the packageRef property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPackageRef(String value) {
		this.packageRef = value;
	}

	/**
	 * Gets the value of the instanceDataField property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInstanceDataField() {
		return instanceDataField;
	}

	/**
	 * Sets the value of the instanceDataField property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInstanceDataField(String value) {
		this.instanceDataField = value;
	}

	/**
	 * Gets the value of the startActivitySetId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartActivitySetId() {
		return startActivitySetId;
	}

	/**
	 * Sets the value of the startActivitySetId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartActivitySetId(String value) {
		this.startActivitySetId = value;
	}

	/**
	 * Gets the value of the startActivityId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartActivityId() {
		return startActivityId;
	}

	/**
	 * Sets the value of the startActivityId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartActivityId(String value) {
		this.startActivityId = value;
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

}
