/**
 */
package org.nader.sennet.job.jobaction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Message Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.jobaction.SendMessageAction#getSendMessageTo <em>Send Message To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.jobaction.JobactionPackage#getSendMessageAction()
 * @model
 * @generated
 */
public interface SendMessageAction extends AbstractResponceAction {
	/**
	 * Returns the value of the '<em><b>Send Message To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Message To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Message To</em>' attribute.
	 * @see #setSendMessageTo(int)
	 * @see org.nader.sennet.job.jobaction.JobactionPackage#getSendMessageAction_SendMessageTo()
	 * @model
	 * @generated
	 */
	int getSendMessageTo();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.jobaction.SendMessageAction#getSendMessageTo <em>Send Message To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Message To</em>' attribute.
	 * @see #getSendMessageTo()
	 * @generated
	 */
	void setSendMessageTo(int value);

} // SendMessageAction
