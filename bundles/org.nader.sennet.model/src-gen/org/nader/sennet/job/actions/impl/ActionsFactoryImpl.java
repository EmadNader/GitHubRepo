/**
 */
package org.nader.sennet.job.actions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nader.sennet.job.actions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionsFactoryImpl extends EFactoryImpl implements ActionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionsFactory init() {
		try {
			ActionsFactory theActionsFactory = (ActionsFactory)EPackage.Registry.INSTANCE.getEFactory(ActionsPackage.eNS_URI);
			if (theActionsFactory != null) {
				return theActionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsFactoryImpl() {
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
			case ActionsPackage.SENSE_FORWARD_ACTION: return createSenseForwardAction();
			case ActionsPackage.AGGREGATION_ACTION: return createAggregationAction();
			case ActionsPackage.FUSION_ACTION: return createFusionAction();
			case ActionsPackage.READ_NODE_MEMORY_ACTION: return createReadNodeMemoryAction();
			case ActionsPackage.WRITE_NODE_MEMORY_ACTION: return createWriteNodeMemoryAction();
			case ActionsPackage.SEND_MESSAGE_ACTION: return createSendMessageAction();
			case ActionsPackage.RECEIVE_MESSAGE_ACTION: return createReceiveMessageAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenseForwardAction createSenseForwardAction() {
		SenseForwardActionImpl senseForwardAction = new SenseForwardActionImpl();
		return senseForwardAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationAction createAggregationAction() {
		AggregationActionImpl aggregationAction = new AggregationActionImpl();
		return aggregationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FusionAction createFusionAction() {
		FusionActionImpl fusionAction = new FusionActionImpl();
		return fusionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadNodeMemoryAction createReadNodeMemoryAction() {
		ReadNodeMemoryActionImpl readNodeMemoryAction = new ReadNodeMemoryActionImpl();
		return readNodeMemoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteNodeMemoryAction createWriteNodeMemoryAction() {
		WriteNodeMemoryActionImpl writeNodeMemoryAction = new WriteNodeMemoryActionImpl();
		return writeNodeMemoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessageAction createSendMessageAction() {
		SendMessageActionImpl sendMessageAction = new SendMessageActionImpl();
		return sendMessageAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessageAction createReceiveMessageAction() {
		ReceiveMessageActionImpl receiveMessageAction = new ReceiveMessageActionImpl();
		return receiveMessageAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsPackage getActionsPackage() {
		return (ActionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActionsPackage getPackage() {
		return ActionsPackage.eINSTANCE;
	}

} //ActionsFactoryImpl
