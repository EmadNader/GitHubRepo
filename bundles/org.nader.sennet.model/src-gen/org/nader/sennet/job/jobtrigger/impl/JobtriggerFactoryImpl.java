/**
 */
package org.nader.sennet.job.jobtrigger.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nader.sennet.job.jobtrigger.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobtriggerFactoryImpl extends EFactoryImpl implements JobtriggerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobtriggerFactory init() {
		try {
			JobtriggerFactory theJobtriggerFactory = (JobtriggerFactory)EPackage.Registry.INSTANCE.getEFactory(JobtriggerPackage.eNS_URI);
			if (theJobtriggerFactory != null) {
				return theJobtriggerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobtriggerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobtriggerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JobtriggerPackage.RECEIVE_MESSAGE_TRIGGER: return createReceiveMessageTrigger();
			case JobtriggerPackage.RECIEVE_SERIAL_MSG_TRIGGER: return createRecieveSerialMsgTrigger();
			case JobtriggerPackage.START_JOB_TRIGGER: return createStartJobTrigger();
			case JobtriggerPackage.STOP_JOB_TRIGGER: return createStopJobTrigger();
			case JobtriggerPackage.PUSH_BUTTOM_TRIGGER: return createPushButtomTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessageTrigger createReceiveMessageTrigger() {
		ReceiveMessageTriggerImpl receiveMessageTrigger = new ReceiveMessageTriggerImpl();
		return receiveMessageTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecieveSerialMsgTrigger createRecieveSerialMsgTrigger() {
		RecieveSerialMsgTriggerImpl recieveSerialMsgTrigger = new RecieveSerialMsgTriggerImpl();
		return recieveSerialMsgTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartJobTrigger createStartJobTrigger() {
		StartJobTriggerImpl startJobTrigger = new StartJobTriggerImpl();
		return startJobTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopJobTrigger createStopJobTrigger() {
		StopJobTriggerImpl stopJobTrigger = new StopJobTriggerImpl();
		return stopJobTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushButtomTrigger createPushButtomTrigger() {
		PushButtomTriggerImpl pushButtomTrigger = new PushButtomTriggerImpl();
		return pushButtomTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobtriggerPackage getJobtriggerPackage() {
		return (JobtriggerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobtriggerPackage getPackage() {
		return JobtriggerPackage.eINSTANCE;
	}

} //JobtriggerFactoryImpl
