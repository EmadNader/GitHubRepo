/**
 */
package org.nader.sennet.job;

import org.nader.sennet.job.actions.AbstractJobAction;
import org.nader.sennet.toplevelstructure.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.AbstractJob#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.JobPackage#getAbstractJob()
 * @model abstract="true"
 * @generated
 */
public interface AbstractJob extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(AbstractJobAction)
	 * @see org.nader.sennet.job.JobPackage#getAbstractJob_Action()
	 * @model containment="true"
	 * @generated
	 */
	AbstractJobAction getAction();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.AbstractJob#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AbstractJobAction value);

} // AbstractJob
