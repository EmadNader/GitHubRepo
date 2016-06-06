/**
 */
package org.nader.sennet.job.jobaction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nader.sennet.job.jobaction.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobactionFactoryImpl extends EFactoryImpl implements JobactionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobactionFactory init() {
		try {
			JobactionFactory theJobactionFactory = (JobactionFactory)EPackage.Registry.INSTANCE.getEFactory(JobactionPackage.eNS_URI);
			if (theJobactionFactory != null) {
				return theJobactionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobactionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobactionFactoryImpl() {
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
			case JobactionPackage.CONDITIONAL_ACTION: return createConditionalAction();
			case JobactionPackage.READ_NODE_MEMORY_ACTION: return createReadNodeMemoryAction();
			case JobactionPackage.WRITE_NODE_MEMORY_ACTION: return createWriteNodeMemoryAction();
			case JobactionPackage.SEND_MESSAGE_ACTION: return createSendMessageAction();
			case JobactionPackage.BLINK_ACTION: return createBlinkAction();
			case JobactionPackage.SEND_SERIAL_PORT_MSG_ACTION: return createSendSerialPortMsgAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalAction createConditionalAction() {
		ConditionalActionImpl conditionalAction = new ConditionalActionImpl();
		return conditionalAction;
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
	public BlinkAction createBlinkAction() {
		BlinkActionImpl blinkAction = new BlinkActionImpl();
		return blinkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSerialPortMsgAction createSendSerialPortMsgAction() {
		SendSerialPortMsgActionImpl sendSerialPortMsgAction = new SendSerialPortMsgActionImpl();
		return sendSerialPortMsgAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobactionPackage getJobactionPackage() {
		return (JobactionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobactionPackage getPackage() {
		return JobactionPackage.eINSTANCE;
	}

} //JobactionFactoryImpl
