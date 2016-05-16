/**
 */
package org.nader.sennet.job.actions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nader.sennet.job.actions.*;

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
 * @see org.nader.sennet.job.actions.ActionsPackage
 * @generated
 */
public class ActionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ActionsPackage.eINSTANCE;
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
			case ActionsPackage.ABSTRACT_JOB_ACTION: {
				AbstractJobAction abstractJobAction = (AbstractJobAction)theEObject;
				T result = caseAbstractJobAction(abstractJobAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ABSTRACT_COMMON_JOB_ACTION: {
				AbstractCommonJobAction abstractCommonJobAction = (AbstractCommonJobAction)theEObject;
				T result = caseAbstractCommonJobAction(abstractCommonJobAction);
				if (result == null) result = caseAbstractJobAction(abstractCommonJobAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ABSTRACT_NODE_MEMORY_ACTION: {
				AbstractNodeMemoryAction abstractNodeMemoryAction = (AbstractNodeMemoryAction)theEObject;
				T result = caseAbstractNodeMemoryAction(abstractNodeMemoryAction);
				if (result == null) result = caseAbstractCommonJobAction(abstractNodeMemoryAction);
				if (result == null) result = caseAbstractJobAction(abstractNodeMemoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ABSTRACT_MESSAGE_ACTION: {
				AbstractMessageAction abstractMessageAction = (AbstractMessageAction)theEObject;
				T result = caseAbstractMessageAction(abstractMessageAction);
				if (result == null) result = caseAbstractCommonJobAction(abstractMessageAction);
				if (result == null) result = caseAbstractJobAction(abstractMessageAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.SENSE_FORWARD_ACTION: {
				SenseForwardAction senseForwardAction = (SenseForwardAction)theEObject;
				T result = caseSenseForwardAction(senseForwardAction);
				if (result == null) result = caseAbstractCommonJobAction(senseForwardAction);
				if (result == null) result = caseAbstractJobAction(senseForwardAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.AGGREGATION_ACTION: {
				AggregationAction aggregationAction = (AggregationAction)theEObject;
				T result = caseAggregationAction(aggregationAction);
				if (result == null) result = caseAbstractCommonJobAction(aggregationAction);
				if (result == null) result = caseAbstractJobAction(aggregationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.FUSION_ACTION: {
				FusionAction fusionAction = (FusionAction)theEObject;
				T result = caseFusionAction(fusionAction);
				if (result == null) result = caseAbstractJobAction(fusionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.READ_NODE_MEMORY_ACTION: {
				ReadNodeMemoryAction readNodeMemoryAction = (ReadNodeMemoryAction)theEObject;
				T result = caseReadNodeMemoryAction(readNodeMemoryAction);
				if (result == null) result = caseAbstractNodeMemoryAction(readNodeMemoryAction);
				if (result == null) result = caseAbstractCommonJobAction(readNodeMemoryAction);
				if (result == null) result = caseAbstractJobAction(readNodeMemoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.WRITE_NODE_MEMORY_ACTION: {
				WriteNodeMemoryAction writeNodeMemoryAction = (WriteNodeMemoryAction)theEObject;
				T result = caseWriteNodeMemoryAction(writeNodeMemoryAction);
				if (result == null) result = caseAbstractNodeMemoryAction(writeNodeMemoryAction);
				if (result == null) result = caseAbstractCommonJobAction(writeNodeMemoryAction);
				if (result == null) result = caseAbstractJobAction(writeNodeMemoryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.SEND_MESSAGE_ACTION: {
				SendMessageAction sendMessageAction = (SendMessageAction)theEObject;
				T result = caseSendMessageAction(sendMessageAction);
				if (result == null) result = caseAbstractMessageAction(sendMessageAction);
				if (result == null) result = caseAbstractCommonJobAction(sendMessageAction);
				if (result == null) result = caseAbstractJobAction(sendMessageAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.RECEIVE_MESSAGE_ACTION: {
				ReceiveMessageAction receiveMessageAction = (ReceiveMessageAction)theEObject;
				T result = caseReceiveMessageAction(receiveMessageAction);
				if (result == null) result = caseAbstractMessageAction(receiveMessageAction);
				if (result == null) result = caseAbstractCommonJobAction(receiveMessageAction);
				if (result == null) result = caseAbstractJobAction(receiveMessageAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Job Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Job Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractJobAction(AbstractJobAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Common Job Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Common Job Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCommonJobAction(AbstractCommonJobAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Message Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMessageAction(AbstractMessageAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Forward Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Forward Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseForwardAction(SenseForwardAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationAction(AggregationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fusion Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fusion Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFusionAction(FusionAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Receive Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Message Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveMessageAction(ReceiveMessageAction object) {
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

} //ActionsSwitch
