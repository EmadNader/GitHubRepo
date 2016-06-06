/**
 */
package org.nader.sennet.job.jobtrigger.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nader.sennet.job.jobtrigger.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.jobtrigger.JobtriggerPackage
 * @generated
 */
public class JobtriggerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JobtriggerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobtriggerSwitch() {
		if (modelPackage == null) {
			modelPackage = JobtriggerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JobtriggerPackage.RECEIVE_MESSAGE_TRIGGER: {
				ReceiveMessageTrigger receiveMessageTrigger = (ReceiveMessageTrigger)theEObject;
				T result = caseReceiveMessageTrigger(receiveMessageTrigger);
				if (result == null) result = caseAbstractRecieveTrigger(receiveMessageTrigger);
				if (result == null) result = caseStartJobTrigger(receiveMessageTrigger);
				if (result == null) result = caseStopJobTrigger(receiveMessageTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(receiveMessageTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobtriggerPackage.RECIEVE_SERIAL_MSG_TRIGGER: {
				RecieveSerialMsgTrigger recieveSerialMsgTrigger = (RecieveSerialMsgTrigger)theEObject;
				T result = caseRecieveSerialMsgTrigger(recieveSerialMsgTrigger);
				if (result == null) result = caseAbstractRecieveTrigger(recieveSerialMsgTrigger);
				if (result == null) result = caseStartJobTrigger(recieveSerialMsgTrigger);
				if (result == null) result = caseStopJobTrigger(recieveSerialMsgTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(recieveSerialMsgTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobtriggerPackage.START_JOB_TRIGGER: {
				StartJobTrigger startJobTrigger = (StartJobTrigger)theEObject;
				T result = caseStartJobTrigger(startJobTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(startJobTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobtriggerPackage.STOP_JOB_TRIGGER: {
				StopJobTrigger stopJobTrigger = (StopJobTrigger)theEObject;
				T result = caseStopJobTrigger(stopJobTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(stopJobTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobtriggerPackage.PUSH_BUTTOM_TRIGGER: {
				PushButtomTrigger pushButtomTrigger = (PushButtomTrigger)theEObject;
				T result = casePushButtomTrigger(pushButtomTrigger);
				if (result == null) result = caseAbstractRecieveTrigger(pushButtomTrigger);
				if (result == null) result = caseStartJobTrigger(pushButtomTrigger);
				if (result == null) result = caseStopJobTrigger(pushButtomTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(pushButtomTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobtriggerPackage.ABSTRACT_RECIEVE_TRIGGER: {
				AbstractRecieveTrigger abstractRecieveTrigger = (AbstractRecieveTrigger)theEObject;
				T result = caseAbstractRecieveTrigger(abstractRecieveTrigger);
				if (result == null) result = caseStartJobTrigger(abstractRecieveTrigger);
				if (result == null) result = caseStopJobTrigger(abstractRecieveTrigger);
				if (result == null) result = caseAbstractStartEndingJobTrigger(abstractRecieveTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobtriggerPackage.ABSTRACT_START_ENDING_JOB_TRIGGER: {
				AbstractStartEndingJobTrigger abstractStartEndingJobTrigger = (AbstractStartEndingJobTrigger)theEObject;
				T result = caseAbstractStartEndingJobTrigger(abstractStartEndingJobTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Message Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Message Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveMessageTrigger(ReceiveMessageTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recieve Serial Msg Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recieve Serial Msg Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecieveSerialMsgTrigger(RecieveSerialMsgTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Job Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartJobTrigger(StartJobTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Job Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopJobTrigger(StopJobTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Buttom Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Buttom Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushButtomTrigger(PushButtomTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Recieve Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Recieve Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRecieveTrigger(AbstractRecieveTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Start Ending Job Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Start Ending Job Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStartEndingJobTrigger(AbstractStartEndingJobTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JobtriggerSwitch
