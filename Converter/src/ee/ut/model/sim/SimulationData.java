//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.02 at 10:31:06 AM EEST 
//

package ee.ut.model.sim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SimulationData complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SimulationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SimulationProfile" type="{}SimulationProfile"/>
 *         &lt;element name="Tasks" type="{}Tasks" minOccurs="0"/>
 *         &lt;element name="Gateways" type="{}Gateways" minOccurs="0"/>
 *         &lt;element name="Resources" type="{}Resources" minOccurs="0"/>
 *         &lt;element name="MessageEvents" type="{}MessageEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimulationData", propOrder = { "simulationProfile", "tasks",
		"gateways", "resources", "messageEvents" })
public class SimulationData {

	@XmlElement(name = "SimulationProfile", required = true)
	protected SimulationProfile simulationProfile;
	@XmlElement(name = "Tasks")
	protected Tasks tasks;
	@XmlElement(name = "Gateways")
	protected Gateways gateways;
	@XmlElement(name = "Resources")
	protected Resources resources;
	@XmlElement(name = "MessageEvents")
	protected MessageEvents messageEvents;

	/**
	 * Gets the value of the simulationProfile property.
	 * 
	 * @return possible object is {@link SimulationProfile }
	 * 
	 */
	public SimulationProfile getSimulationProfile() {
		return simulationProfile;
	}

	/**
	 * Sets the value of the simulationProfile property.
	 * 
	 * @param value
	 *            allowed object is {@link SimulationProfile }
	 * 
	 */
	public void setSimulationProfile(SimulationProfile value) {
		this.simulationProfile = value;
	}

	/**
	 * Gets the value of the tasks property.
	 * 
	 * @return possible object is {@link Tasks }
	 * 
	 */
	public Tasks getTasks() {
		return tasks;
	}

	/**
	 * Sets the value of the tasks property.
	 * 
	 * @param value
	 *            allowed object is {@link Tasks }
	 * 
	 */
	public void setTasks(Tasks value) {
		this.tasks = value;
	}

	/**
	 * Gets the value of the gateways property.
	 * 
	 * @return possible object is {@link Gateways }
	 * 
	 */
	public Gateways getGateways() {
		return gateways;
	}

	/**
	 * Sets the value of the gateways property.
	 * 
	 * @param value
	 *            allowed object is {@link Gateways }
	 * 
	 */
	public void setGateways(Gateways value) {
		this.gateways = value;
	}

	/**
	 * Gets the value of the resources property.
	 * 
	 * @return possible object is {@link Resources }
	 * 
	 */
	public Resources getResources() {
		return resources;
	}

	/**
	 * Sets the value of the resources property.
	 * 
	 * @param value
	 *            allowed object is {@link Resources }
	 * 
	 */
	public void setResources(Resources value) {
		this.resources = value;
	}

	/**
	 * Gets the value of the messageEvents property.
	 * 
	 * @return possible object is {@link MessageEvents }
	 * 
	 */
	public MessageEvents getMessageEvents() {
		return messageEvents;
	}

	/**
	 * Sets the value of the messageEvents property.
	 * 
	 * @param value
	 *            allowed object is {@link MessageEvents }
	 * 
	 */
	public void setMessageEvents(MessageEvents value) {
		this.messageEvents = value;
	}

}
