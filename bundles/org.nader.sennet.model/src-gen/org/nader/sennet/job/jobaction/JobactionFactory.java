/**
 */
package org.nader.sennet.job.jobaction;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.jobaction.JobactionPackage
 * @generated
 */
public interface JobactionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobactionFactory eINSTANCE = org.nader.sennet.job.jobaction.impl.JobactionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conditional Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Action</em>'.
	 * @generated
	 */
	ConditionalAction createConditionalAction();

	/**
	 * Returns a new object of class '<em>Read Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Node Memory Action</em>'.
	 * @generated
	 */
	ReadNodeMemoryAction createReadNodeMemoryAction();

	/**
	 * Returns a new object of class '<em>Write Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Node Memory Action</em>'.
	 * @generated
	 */
	WriteNodeMemoryAction createWriteNodeMemoryAction();

	/**
	 * Returns a new object of class '<em>Send Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Message Action</em>'.
	 * @generated
	 */
	SendMessageAction createSendMessageAction();

	/**
	 * Returns a new object of class '<em>Blink Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blink Action</em>'.
	 * @generated
	 */
	BlinkAction createBlinkAction();

	/**
	 * Returns a new object of class '<em>Send Serial Port Msg Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Serial Port Msg Action</em>'.
	 * @generated
	 */
	SendSerialPortMsgAction createSendSerialPortMsgAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobactionPackage getJobactionPackage();

} //JobactionFactory
