/**
 */
package org.nader.sennet.job.jobaction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstrat Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.jobaction.AbstratAction#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.jobaction.JobactionPackage#getAbstratAction()
 * @model abstract="true"
 * @generated
 */
public interface AbstratAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ConditionalAction)
	 * @see org.nader.sennet.job.jobaction.JobactionPackage#getAbstratAction_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionalAction getCondition();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.jobaction.AbstratAction#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ConditionalAction value);

} // AbstratAction
