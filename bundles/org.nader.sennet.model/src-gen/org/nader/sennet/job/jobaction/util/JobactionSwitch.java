/**
 */
package org.nader.sennet.job.jobaction.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nader.sennet.job.jobaction.*;

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
 * @see org.nader.sennet.job.jobaction.JobactionPackage
 * @generated
 */
public class JobactionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JobactionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobactionSwitch() {
		if (modelPackage == null) {
			modelPackage = JobactionPackage.eINSTANCE;
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
			case JobactionPackage.ABSTRAT_ACTION: {
				AbstratAction abstratAction = (AbstratAction)theEObject;
				T result = caseAbstratAction(abstratAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobactionPackage.CONDITIONAL_ACTION: {
				ConditionalAction conditionalAction = (ConditionalAction)theEObject;
				T result = caseConditionalAction(conditionalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobactionPackage.ABSTRACT_NODE_MEMORY_ACTION: {
				AbstractNodeMemoryAction abstractNodeMemoryAction = (AbstractNodeMemoryAction)theEObject;
				T result = caseAbstractNodeMemoryAction(abstractNodeMemoryAction);
				if (result == null) result = caseAbstratAction(abstractNodeMemoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobactionPackage.READ_NODE_MEMORY_ACTION: {
				ReadNodeMemoryAction readNodeMemoryAction = (ReadNodeMemoryAction)theEObject;
				T result = caseReadNodeMemoryAction(readNodeMemoryAction);
				if (result == null) result = caseAbstractNodeMemoryAction(readNodeMemoryAction);
				if (result == null) result = caseAbstratAction(readNodeMemoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobactionPackage.WRITE_NODE_MEMORY_ACTION: {
				WriteNodeMemoryAction writeNodeMemoryAction = (WriteNodeMemoryAction)theEObject;
				T result = caseWriteNodeMemoryAction(writeNodeMemoryAction);
				if (result == null) result = caseAbstractNodeMemoryAction(writeNodeMemoryAction);
				if (result == null) result = caseAbstractResponceAction(writeNodeMemoryAction);
				if (result == null) result = caseAbstratAction(writeNodeMemoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobactionPackage.SEND_MESSAGE_ACTION: {
				SendMessageAction sendMessageAction = (SendMessageAction)theEObject;
				T result = caseSendMessageAction(sendMessageAction);
				if (result == null) result = caseAbstractResponceAction(sendMessageAction);
				if (result == null) result = caseAbstratAction(sendMessageAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobactionPackage.BLINK_ACTION: {
				BlinkAction blinkAction = (BlinkAction)theEObject;
				T result = caseBlinkAction(blinkAction);
				if (result == null) result = caseAbstractResponceAction(blinkAction);
				if (result == null) result = caseAbstratAction(blinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobactionPackage.ABSTRACT_RESPONCE_ACTION: {
				AbstractResponceAction abstractResponceAction = (AbstractResponceAction)theEObject;
				T result = caseAbstractResponceAction(abstractResponceAction);
				if (result == null) result = caseAbstratAction(abstractResponceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobactionPackage.SEND_SERIAL_PORT_MSG_ACTION: {
				SendSerialPortMsgAction sendSerialPortMsgAction = (SendSerialPortMsgAction)theEObject;
				T result = caseSendSerialPortMsgAction(sendSerialPortMsgAction);
				if (result == null) result = caseAbstractResponceAction(sendSerialPortMsgAction);
				if (result == null) result = caseAbstratAction(sendSerialPortMsgAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstrat Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstrat Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstratAction(AbstratAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAction(ConditionalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node Memory Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNodeMemoryAction(AbstractNodeMemoryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Node Memory Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadNodeMemoryAction(ReadNodeMemoryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Node Memory Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteNodeMemoryAction(WriteNodeMemoryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Message Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendMessageAction(SendMessageAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blink Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blink Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlinkAction(BlinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Responce Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Responce Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResponceAction(AbstractResponceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Serial Port Msg Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Serial Port Msg Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSerialPortMsgAction(SendSerialPortMsgAction object) {
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

} //JobactionSwitch
