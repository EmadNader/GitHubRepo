/**
 */
package org.nader.sennet.job.jobaction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.nader.sennet.job.jobaction.JobactionFactory
 * @model kind="package"
 * @generated
 */
public interface JobactionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobaction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet/jb/ja";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ja";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobactionPackage eINSTANCE = org.nader.sennet.job.jobaction.impl.JobactionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobaction.impl.AbstratActionImpl <em>Abstrat Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobaction.impl.AbstratActionImpl
	 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getAbstratAction()
	 * @generated
	 */
	int ABSTRAT_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRAT_ACTION__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Abstrat Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRAT_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstrat Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRAT_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobaction.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobaction.impl.ConditionalActionImpl
	 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getConditionalAction()
	 * @generated
	 */
	int CONDITIONAL_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Sensor Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__SENSOR_TERM = 0;

	/**
	 * The feature id for the '<em><b>Logical Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__LOGICAL_SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION__UNIT = 3;

	/**
	 * The number of structural features of the '<em>Conditional Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Conditional Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobaction.impl.AbstractNodeMemoryActionImpl <em>Abstract Node Memory Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobaction.impl.AbstractNodeMemoryActionImpl
	 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getAbstractNodeMemoryAction()
	 * @generated
	 */
	int ABSTRACT_NODE_MEMORY_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION__CONDITION = ABSTRAT_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Abstract Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION_FEATURE_COUNT = ABSTRAT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION_OPERATION_COUNT = ABSTRAT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobaction.impl.ReadNodeMemoryActionImpl <em>Read Node Memory Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobaction.impl.ReadNodeMemoryActionImpl
	 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getReadNodeMemoryAction()
	 * @generated
	 */
	int READ_NODE_MEMORY_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION__CONDITION = ABSTRACT_NODE_MEMORY_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Read Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION_FEATURE_COUNT = ABSTRACT_NODE_MEMORY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION_OPERATION_COUNT = ABSTRACT_NODE_MEMORY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobaction.impl.WriteNodeMemoryActionImpl <em>Write Node Memory Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobaction.impl.WriteNodeMemoryActionImpl
	 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getWriteNodeMemoryAction()
	 * @generated
	 */
	int WRITE_NODE_MEMORY_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION__CONDITION = ABSTRACT_NODE_MEMORY_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Write Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION_FEATURE_COUNT = ABSTRACT_NODE_MEMORY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Write Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION_OPERATION_COUNT = ABSTRACT_NODE_MEMORY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobaction.impl.AbstractResponceActionImpl <em>Abstract Responce Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobaction.impl.AbstractResponceActionImpl
	 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getAbstractResponceAction()
	 * @generated
	 */
	int ABSTRACT_RESPONCE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESPONCE_ACTION__CONDITION = ABSTRAT_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Abstract Responce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT = ABSTRAT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Responce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESPONCE_ACTION_OPERATION_COUNT = ABSTRAT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobaction.impl.SendMessageActionImpl <em>Send Message Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobaction.impl.SendMessageActionImpl
	 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getSendMessageAction()
	 * @generated
	 */
	int SEND_MESSAGE_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__CONDITION = ABSTRACT_RESPONCE_ACTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Send Message To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__SEND_MESSAGE_TO = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION_FEATURE_COUNT = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Send Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION_OPERATION_COUNT = ABSTRACT_RESPONCE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobaction.impl.BlinkActionImpl <em>Blink Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobaction.impl.BlinkActionImpl
	 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getBlinkAction()
	 * @generated
	 */
	int BLINK_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION__CONDITION = ABSTRACT_RESPONCE_ACTION__CONDITION;

	/**
	 * The feature id for the '<em><b>Led</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION__LED = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION__STATUS = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Blink Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION_FEATURE_COUNT = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Blink Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_ACTION_OPERATION_COUNT = ABSTRACT_RESPONCE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.jobaction.impl.SendSerialPortMsgActionImpl <em>Send Serial Port Msg Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.jobaction.impl.SendSerialPortMsgActionImpl
	 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getSendSerialPortMsgAction()
	 * @generated
	 */
	int SEND_SERIAL_PORT_MSG_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SERIAL_PORT_MSG_ACTION__CONDITION = ABSTRACT_RESPONCE_ACTION__CONDITION;

	/**
	 * The number of structural features of the '<em>Send Serial Port Msg Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SERIAL_PORT_MSG_ACTION_FEATURE_COUNT = ABSTRACT_RESPONCE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Serial Port Msg Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SERIAL_PORT_MSG_ACTION_OPERATION_COUNT = ABSTRACT_RESPONCE_ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobaction.AbstratAction <em>Abstrat Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstrat Action</em>'.
	 * @see org.nader.sennet.job.jobaction.AbstratAction
	 * @generated
	 */
	EClass getAbstratAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.nader.sennet.job.jobaction.AbstratAction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.nader.sennet.job.jobaction.AbstratAction#getCondition()
	 * @see #getAbstratAction()
	 * @generated
	 */
	EReference getAbstratAction_Condition();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobaction.ConditionalAction <em>Conditional Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Action</em>'.
	 * @see org.nader.sennet.job.jobaction.ConditionalAction
	 * @generated
	 */
	EClass getConditionalAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.jobaction.ConditionalAction#getSensorTerm <em>Sensor Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Term</em>'.
	 * @see org.nader.sennet.job.jobaction.ConditionalAction#getSensorTerm()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EAttribute getConditionalAction_SensorTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.jobaction.ConditionalAction#getLogicalSymbol <em>Logical Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Symbol</em>'.
	 * @see org.nader.sennet.job.jobaction.ConditionalAction#getLogicalSymbol()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EAttribute getConditionalAction_LogicalSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.jobaction.ConditionalAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nader.sennet.job.jobaction.ConditionalAction#getValue()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EAttribute getConditionalAction_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.jobaction.ConditionalAction#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.nader.sennet.job.jobaction.ConditionalAction#getUnit()
	 * @see #getConditionalAction()
	 * @generated
	 */
	EAttribute getConditionalAction_Unit();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobaction.AbstractNodeMemoryAction <em>Abstract Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node Memory Action</em>'.
	 * @see org.nader.sennet.job.jobaction.AbstractNodeMemoryAction
	 * @generated
	 */
	EClass getAbstractNodeMemoryAction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobaction.ReadNodeMemoryAction <em>Read Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Node Memory Action</em>'.
	 * @see org.nader.sennet.job.jobaction.ReadNodeMemoryAction
	 * @generated
	 */
	EClass getReadNodeMemoryAction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobaction.WriteNodeMemoryAction <em>Write Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Node Memory Action</em>'.
	 * @see org.nader.sennet.job.jobaction.WriteNodeMemoryAction
	 * @generated
	 */
	EClass getWriteNodeMemoryAction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobaction.SendMessageAction <em>Send Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message Action</em>'.
	 * @see org.nader.sennet.job.jobaction.SendMessageAction
	 * @generated
	 */
	EClass getSendMessageAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.jobaction.SendMessageAction#getSendMessageTo <em>Send Message To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Message To</em>'.
	 * @see org.nader.sennet.job.jobaction.SendMessageAction#getSendMessageTo()
	 * @see #getSendMessageAction()
	 * @generated
	 */
	EAttribute getSendMessageAction_SendMessageTo();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobaction.BlinkAction <em>Blink Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blink Action</em>'.
	 * @see org.nader.sennet.job.jobaction.BlinkAction
	 * @generated
	 */
	EClass getBlinkAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.jobaction.BlinkAction#getLed <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Led</em>'.
	 * @see org.nader.sennet.job.jobaction.BlinkAction#getLed()
	 * @see #getBlinkAction()
	 * @generated
	 */
	EAttribute getBlinkAction_Led();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.jobaction.BlinkAction#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nader.sennet.job.jobaction.BlinkAction#getStatus()
	 * @see #getBlinkAction()
	 * @generated
	 */
	EAttribute getBlinkAction_Status();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobaction.AbstractResponceAction <em>Abstract Responce Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Responce Action</em>'.
	 * @see org.nader.sennet.job.jobaction.AbstractResponceAction
	 * @generated
	 */
	EClass getAbstractResponceAction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.jobaction.SendSerialPortMsgAction <em>Send Serial Port Msg Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Serial Port Msg Action</em>'.
	 * @see org.nader.sennet.job.jobaction.SendSerialPortMsgAction
	 * @generated
	 */
	EClass getSendSerialPortMsgAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobactionFactory getJobactionFactory();

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
		 * The meta object literal for the '{@link org.nader.sennet.job.jobaction.impl.AbstratActionImpl <em>Abstrat Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobaction.impl.AbstratActionImpl
		 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getAbstratAction()
		 * @generated
		 */
		EClass ABSTRAT_ACTION = eINSTANCE.getAbstratAction();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRAT_ACTION__CONDITION = eINSTANCE.getAbstratAction_Condition();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobaction.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobaction.impl.ConditionalActionImpl
		 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getConditionalAction()
		 * @generated
		 */
		EClass CONDITIONAL_ACTION = eINSTANCE.getConditionalAction();

		/**
		 * The meta object literal for the '<em><b>Sensor Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ACTION__SENSOR_TERM = eINSTANCE.getConditionalAction_SensorTerm();

		/**
		 * The meta object literal for the '<em><b>Logical Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ACTION__LOGICAL_SYMBOL = eINSTANCE.getConditionalAction_LogicalSymbol();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ACTION__VALUE = eINSTANCE.getConditionalAction_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_ACTION__UNIT = eINSTANCE.getConditionalAction_Unit();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobaction.impl.AbstractNodeMemoryActionImpl <em>Abstract Node Memory Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobaction.impl.AbstractNodeMemoryActionImpl
		 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getAbstractNodeMemoryAction()
		 * @generated
		 */
		EClass ABSTRACT_NODE_MEMORY_ACTION = eINSTANCE.getAbstractNodeMemoryAction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobaction.impl.ReadNodeMemoryActionImpl <em>Read Node Memory Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobaction.impl.ReadNodeMemoryActionImpl
		 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getReadNodeMemoryAction()
		 * @generated
		 */
		EClass READ_NODE_MEMORY_ACTION = eINSTANCE.getReadNodeMemoryAction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobaction.impl.WriteNodeMemoryActionImpl <em>Write Node Memory Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobaction.impl.WriteNodeMemoryActionImpl
		 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getWriteNodeMemoryAction()
		 * @generated
		 */
		EClass WRITE_NODE_MEMORY_ACTION = eINSTANCE.getWriteNodeMemoryAction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobaction.impl.SendMessageActionImpl <em>Send Message Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobaction.impl.SendMessageActionImpl
		 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getSendMessageAction()
		 * @generated
		 */
		EClass SEND_MESSAGE_ACTION = eINSTANCE.getSendMessageAction();

		/**
		 * The meta object literal for the '<em><b>Send Message To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE_ACTION__SEND_MESSAGE_TO = eINSTANCE.getSendMessageAction_SendMessageTo();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobaction.impl.BlinkActionImpl <em>Blink Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobaction.impl.BlinkActionImpl
		 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getBlinkAction()
		 * @generated
		 */
		EClass BLINK_ACTION = eINSTANCE.getBlinkAction();

		/**
		 * The meta object literal for the '<em><b>Led</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_ACTION__LED = eINSTANCE.getBlinkAction_Led();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_ACTION__STATUS = eINSTANCE.getBlinkAction_Status();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobaction.impl.AbstractResponceActionImpl <em>Abstract Responce Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobaction.impl.AbstractResponceActionImpl
		 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getAbstractResponceAction()
		 * @generated
		 */
		EClass ABSTRACT_RESPONCE_ACTION = eINSTANCE.getAbstractResponceAction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.jobaction.impl.SendSerialPortMsgActionImpl <em>Send Serial Port Msg Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.jobaction.impl.SendSerialPortMsgActionImpl
		 * @see org.nader.sennet.job.jobaction.impl.JobactionPackageImpl#getSendSerialPortMsgAction()
		 * @generated
		 */
		EClass SEND_SERIAL_PORT_MSG_ACTION = eINSTANCE.getSendSerialPortMsgAction();

	}

} //JobactionPackage
