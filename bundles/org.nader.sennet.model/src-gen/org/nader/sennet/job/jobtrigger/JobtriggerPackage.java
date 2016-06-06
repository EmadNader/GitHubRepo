/**
 */
package org.nader.sennet.job.jobtrigger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.jobtrigger.JobtriggerFactory
 * @model kind="package"
 * @generated
 */
public interface JobtriggerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobtrigger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet/jb/jt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobtriggerPackage eINSTANCE = org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobtrigger.impl.AbstractStartEndingJobTriggerImpl <em>Abstract Start Ending Job Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobtrigger.impl.AbstractStartEndingJobTriggerImpl
	 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getAbstractStartEndingJobTrigger()
	 * @generated
	 */
	int ABSTRACT_START_ENDING_JOB_TRIGGER = 6;

	/**
	 * The number of structural features of the '<em>Abstract Start Ending Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_START_ENDING_JOB_TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Start Ending Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_START_ENDING_JOB_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobtrigger.impl.StartJobTriggerImpl <em>Start Job Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobtrigger.impl.StartJobTriggerImpl
	 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getStartJobTrigger()
	 * @generated
	 */
	int START_JOB_TRIGGER = 2;

	/**
	 * The number of structural features of the '<em>Start Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_JOB_TRIGGER_FEATURE_COUNT = ABSTRACT_START_ENDING_JOB_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_JOB_TRIGGER_OPERATION_COUNT = ABSTRACT_START_ENDING_JOB_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobtrigger.impl.AbstractRecieveTriggerImpl <em>Abstract Recieve Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobtrigger.impl.AbstractRecieveTriggerImpl
	 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getAbstractRecieveTrigger()
	 * @generated
	 */
	int ABSTRACT_RECIEVE_TRIGGER = 5;

	/**
	 * The number of structural features of the '<em>Abstract Recieve Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECIEVE_TRIGGER_FEATURE_COUNT = START_JOB_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Recieve Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RECIEVE_TRIGGER_OPERATION_COUNT = START_JOB_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobtrigger.impl.ReceiveMessageTriggerImpl <em>Receive Message Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobtrigger.impl.ReceiveMessageTriggerImpl
	 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getReceiveMessageTrigger()
	 * @generated
	 */
	int RECEIVE_MESSAGE_TRIGGER = 0;

	/**
	 * The number of structural features of the '<em>Receive Message Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_TRIGGER_FEATURE_COUNT = ABSTRACT_RECIEVE_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receive Message Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_TRIGGER_OPERATION_COUNT = ABSTRACT_RECIEVE_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobtrigger.impl.RecieveSerialMsgTriggerImpl <em>Recieve Serial Msg Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobtrigger.impl.RecieveSerialMsgTriggerImpl
	 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getRecieveSerialMsgTrigger()
	 * @generated
	 */
	int RECIEVE_SERIAL_MSG_TRIGGER = 1;

	/**
	 * The number of structural features of the '<em>Recieve Serial Msg Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVE_SERIAL_MSG_TRIGGER_FEATURE_COUNT = ABSTRACT_RECIEVE_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recieve Serial Msg Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVE_SERIAL_MSG_TRIGGER_OPERATION_COUNT = ABSTRACT_RECIEVE_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobtrigger.impl.StopJobTriggerImpl <em>Stop Job Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobtrigger.impl.StopJobTriggerImpl
	 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getStopJobTrigger()
	 * @generated
	 */
	int STOP_JOB_TRIGGER = 3;

	/**
	 * The number of structural features of the '<em>Stop Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_JOB_TRIGGER_FEATURE_COUNT = ABSTRACT_START_ENDING_JOB_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop Job Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_JOB_TRIGGER_OPERATION_COUNT = ABSTRACT_START_ENDING_JOB_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobtrigger.impl.PushButtomTriggerImpl <em>Push Buttom Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobtrigger.impl.PushButtomTriggerImpl
	 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getPushButtomTrigger()
	 * @generated
	 */
	int PUSH_BUTTOM_TRIGGER = 4;

	/**
	 * The number of structural features of the '<em>Push Buttom Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTOM_TRIGGER_FEATURE_COUNT = ABSTRACT_RECIEVE_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Push Buttom Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_BUTTOM_TRIGGER_OPERATION_COUNT = ABSTRACT_RECIEVE_TRIGGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobtrigger.ReceiveMessageTrigger <em>Receive Message Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Message Trigger</em>'.
	 * @see org.nader.sennet.job.jobtrigger.ReceiveMessageTrigger
	 * @generated
	 */
	EClass getReceiveMessageTrigger();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobtrigger.RecieveSerialMsgTrigger <em>Recieve Serial Msg Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recieve Serial Msg Trigger</em>'.
	 * @see org.nader.sennet.job.jobtrigger.RecieveSerialMsgTrigger
	 * @generated
	 */
	EClass getRecieveSerialMsgTrigger();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobtrigger.StartJobTrigger <em>Start Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Job Trigger</em>'.
	 * @see org.nader.sennet.job.jobtrigger.StartJobTrigger
	 * @generated
	 */
	EClass getStartJobTrigger();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobtrigger.StopJobTrigger <em>Stop Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Job Trigger</em>'.
	 * @see org.nader.sennet.job.jobtrigger.StopJobTrigger
	 * @generated
	 */
	EClass getStopJobTrigger();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobtrigger.PushButtomTrigger <em>Push Buttom Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Buttom Trigger</em>'.
	 * @see org.nader.sennet.job.jobtrigger.PushButtomTrigger
	 * @generated
	 */
	EClass getPushButtomTrigger();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobtrigger.AbstractRecieveTrigger <em>Abstract Recieve Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Recieve Trigger</em>'.
	 * @see org.nader.sennet.job.jobtrigger.AbstractRecieveTrigger
	 * @generated
	 */
	EClass getAbstractRecieveTrigger();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobtrigger.AbstractStartEndingJobTrigger <em>Abstract Start Ending Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Start Ending Job Trigger</em>'.
	 * @see org.nader.sennet.job.jobtrigger.AbstractStartEndingJobTrigger
	 * @generated
	 */
	EClass getAbstractStartEndingJobTrigger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobtriggerFactory getJobtriggerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobtrigger.impl.ReceiveMessageTriggerImpl <em>Receive Message Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobtrigger.impl.ReceiveMessageTriggerImpl
		 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getReceiveMessageTrigger()
		 * @generated
		 */
		EClass RECEIVE_MESSAGE_TRIGGER = eINSTANCE.getReceiveMessageTrigger();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobtrigger.impl.RecieveSerialMsgTriggerImpl <em>Recieve Serial Msg Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobtrigger.impl.RecieveSerialMsgTriggerImpl
		 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getRecieveSerialMsgTrigger()
		 * @generated
		 */
		EClass RECIEVE_SERIAL_MSG_TRIGGER = eINSTANCE.getRecieveSerialMsgTrigger();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobtrigger.impl.StartJobTriggerImpl <em>Start Job Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobtrigger.impl.StartJobTriggerImpl
		 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getStartJobTrigger()
		 * @generated
		 */
		EClass START_JOB_TRIGGER = eINSTANCE.getStartJobTrigger();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobtrigger.impl.StopJobTriggerImpl <em>Stop Job Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobtrigger.impl.StopJobTriggerImpl
		 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getStopJobTrigger()
		 * @generated
		 */
		EClass STOP_JOB_TRIGGER = eINSTANCE.getStopJobTrigger();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobtrigger.impl.PushButtomTriggerImpl <em>Push Buttom Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobtrigger.impl.PushButtomTriggerImpl
		 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getPushButtomTrigger()
		 * @generated
		 */
		EClass PUSH_BUTTOM_TRIGGER = eINSTANCE.getPushButtomTrigger();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobtrigger.impl.AbstractRecieveTriggerImpl <em>Abstract Recieve Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobtrigger.impl.AbstractRecieveTriggerImpl
		 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getAbstractRecieveTrigger()
		 * @generated
		 */
		EClass ABSTRACT_RECIEVE_TRIGGER = eINSTANCE.getAbstractRecieveTrigger();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobtrigger.impl.AbstractStartEndingJobTriggerImpl <em>Abstract Start Ending Job Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobtrigger.impl.AbstractStartEndingJobTriggerImpl
		 * @see org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl#getAbstractStartEndingJobTrigger()
		 * @generated
		 */
		EClass ABSTRACT_START_ENDING_JOB_TRIGGER = eINSTANCE.getAbstractStartEndingJobTrigger();

	}

} //JobtriggerPackage
