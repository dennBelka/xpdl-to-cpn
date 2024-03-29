package dk.au.daimi.ascoveco.cpn.model;

import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="true" interface="true"
 * @author michael Addition compared to HLPN standard. Makes it possible to have reverse references for labels.
 */
public interface HasName extends EObject {
	/**
	 * @model required="false"
	 * @return the name of the object
	 */
	public Name getName();

	/**
	 * Sets the value of the '{@link dk.au.daimi.ascoveco.cpn.model.HasName#getName <em>Name</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);
}
