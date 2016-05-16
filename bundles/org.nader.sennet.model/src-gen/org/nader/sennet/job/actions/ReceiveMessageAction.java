/**
 */
package org.nader.sennet.job.actions;

import org.nader.sennet.port.InPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Message Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.actions.ReceiveMessageAction#getInPort <em>In Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.actions.ActionsPackage#getReceiveMessageAction()
 * @model
 * @generated
 */
public interface ReceiveMessageAction extends AbstractMessageAction {
	/**
	 * Returns the value of the '<em><b>In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' reference.
	 * @see #setInPort(InPort)
	 * @see org.nader.sennet.job.actions.ActionsPackage#getReceiveMessageAction_InPort()
	 * @model
	 * @generated
	 */
	InPort getInPort();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.actions.ReceiveMessageAction#getInPort <em>In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(InPort value);

} // ReceiveMessageAction
