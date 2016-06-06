/**
 */
package org.nader.sennet.job.jobtrigger;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.jobtrigger.JobtriggerPackage
 * @generated
 */
public interface JobtriggerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobtriggerFactory eINSTANCE = org.nader.sennet.job.jobtrigger.impl.JobtriggerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Receive Message Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Message Trigger</em>'.
	 * @generated
	 */
	ReceiveMessageTrigger createReceiveMessageTrigger();

	/**
	 * Returns a new object of class '<em>Recieve Serial Msg Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recieve Serial Msg Trigger</em>'.
	 * @generated
	 */
	RecieveSerialMsgTrigger createRecieveSerialMsgTrigger();

	/**
	 * Returns a new object of class '<em>Start Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Job Trigger</em>'.
	 * @generated
	 */
	StartJobTrigger createStartJobTrigger();

	/**
	 * Returns a new object of class '<em>Stop Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Job Trigger</em>'.
	 * @generated
	 */
	StopJobTrigger createStopJobTrigger();

	/**
	 * Returns a new object of class '<em>Push Buttom Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Buttom Trigger</em>'.
	 * @generated
	 */
	PushButtomTrigger createPushButtomTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobtriggerPackage getJobtriggerPackage();

} //JobtriggerFactory
