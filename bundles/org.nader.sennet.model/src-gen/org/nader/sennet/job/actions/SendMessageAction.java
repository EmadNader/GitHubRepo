/**
 */
package org.nader.sennet.job.actions;

import org.nader.sennet.port.OutPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Message Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.actions.SendMessageAction#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link org.nader.sennet.job.actions.SendMessageAction#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.actions.ActionsPackage#getSendMessageAction()
 * @model
 * @generated
 */
public interface SendMessageAction extends AbstractMessageAction {
	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Port</em>' reference.
	 * @see #setOutPort(OutPort)
	 * @see org.nader.sennet.job.actions.ActionsPackage#getSendMessageAction_OutPort()
	 * @model
	 * @generated
	 */
	OutPort getOutPort();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.actions.SendMessageAction#getOutPort <em>Out Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(OutPort value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nader.sennet.job.actions.ActionsPackage#getSendMessageAction_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.actions.SendMessageAction#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // SendMessageAction
