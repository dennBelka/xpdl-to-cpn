package dk.au.daimi.ascoveco.cpn.model;

/**
 * @model
 * @author michael
 */
public interface RefTrans extends TransitionNode {
	/**
	 * @model required="true" containment="false"
	 * @return the transition this reference point to
	 */
	public TransitionNode getRef();

	/**
	 * Sets the value of the '{@link dk.au.daimi.ascoveco.cpn.model.RefTrans#getRef <em>Ref</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(TransitionNode value);
}
