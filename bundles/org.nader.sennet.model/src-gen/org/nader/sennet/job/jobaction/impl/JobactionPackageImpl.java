/**
 */
package org.nader.sennet.job.jobaction.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nader.sennet.SennetPackage;

import org.nader.sennet.enums.EnumsPackage;

import org.nader.sennet.enums.impl.EnumsPackageImpl;

import org.nader.sennet.impl.SennetPackageImpl;

import org.nader.sennet.job.JobPackage;

import org.nader.sennet.job.impl.JobPackageImpl;

import org.nader.sennet.job.jobaction.AbstractNodeMemoryAction;
import org.nader.sennet.job.jobaction.AbstractResponceAction;
import org.nader.sennet.job.jobaction.AbstratAction;
import org.nader.sennet.job.jobaction.BlinkAction;
import org.nader.sennet.job.jobaction.ConditionalAction;
import org.nader.sennet.job.jobaction.JobactionFactory;
import org.nader.sennet.job.jobaction.JobactionPackage;
import org.nader.sennet.job.jobaction.ReadNodeMemoryAction;
import org.nader.sennet.job.jobaction.SendMessageAction;
import org.nader.sennet.job.jobaction.SendSerialPortMsgAction;
import org.nader.sennet.job.jobaction.WriteNodeMemoryAction;

import org.nader.sennet.job.jobtrigger.JobtriggerPackage;

import org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl;

import org.nader.sennet.network.NetworkPackage;

import org.nader.sennet.network.impl.NetworkPackageImpl;

import org.nader.sennet.node.NodePackage;

import org.nader.sennet.node.impl.NodePackageImpl;

import org.nader.sennet.sensors.SensorsPackage;

import org.nader.sennet.sensors.impl.SensorsPackageImpl;

import org.nader.sennet.toplevelstructure.ToplevelstructurePackage;

import org.nader.sennet.toplevelstructure.impl.ToplevelstructurePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobactionPackageImpl extends EPackageImpl implements JobactionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstratActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeMemoryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readNodeMemoryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeNodeMemoryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMessageActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractResponceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSerialPortMsgActionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nader.sennet.job.jobaction.JobactionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobactionPackageImpl() {
		super(eNS_URI, JobactionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JobactionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobactionPackage init() {
		if (isInited) return (JobactionPackage)EPackage.Registry.INSTANCE.getEPackage(JobactionPackage.eNS_URI);

		// Obtain or create and register package
		JobactionPackageImpl theJobactionPackage = (JobactionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JobactionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JobactionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SennetPackageImpl theSennetPackage = (SennetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) instanceof SennetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) : SennetPackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);
		ToplevelstructurePackageImpl theToplevelstructurePackage = (ToplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) instanceof ToplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) : ToplevelstructurePackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		SensorsPackageImpl theSensorsPackage = (SensorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI) instanceof SensorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI) : SensorsPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		JobPackageImpl theJobPackage = (JobPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) instanceof JobPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) : JobPackage.eINSTANCE);
		JobtriggerPackageImpl theJobtriggerPackage = (JobtriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobtriggerPackage.eNS_URI) instanceof JobtriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobtriggerPackage.eNS_URI) : JobtriggerPackage.eINSTANCE);

		// Create package meta-data objects
		theJobactionPackage.createPackageContents();
		theSennetPackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theToplevelstructurePackage.createPackageContents();
		theNodePackage.createPackageContents();
		theSensorsPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theJobPackage.createPackageContents();
		theJobtriggerPackage.createPackageContents();

		// Initialize created meta-data
		theJobactionPackage.initializePackageContents();
		theSennetPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theToplevelstructurePackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theSensorsPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theJobPackage.initializePackageContents();
		theJobtriggerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobactionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobactionPackage.eNS_URI, theJobactionPackage);
		return theJobactionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstratAction() {
		return abstratActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstratAction_Condition() {
		return (EReference)abstratActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalAction() {
		return conditionalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalAction_SensorTerm() {
		return (EAttribute)conditionalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalAction_LogicalSymbol() {
		return (EAttribute)conditionalActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalAction_Value() {
		return (EAttribute)conditionalActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalAction_Unit() {
		return (EAttribute)conditionalActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNodeMemoryAction() {
		return abstractNodeMemoryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadNodeMemoryAction() {
		return readNodeMemoryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteNodeMemoryAction() {
		return writeNodeMemoryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendMessageAction() {
		return sendMessageActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendMessageAction_SendMessageTo() {
		return (EAttribute)sendMessageActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlinkAction() {
		return blinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkAction_Led() {
		return (EAttribute)blinkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkAction_Status() {
		return (EAttribute)blinkActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractResponceAction() {
		return abstractResponceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSerialPortMsgAction() {
		return sendSerialPortMsgActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobactionFactory getJobactionFactory() {
		return (JobactionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstratActionEClass = createEClass(ABSTRAT_ACTION);
		createEReference(abstratActionEClass, ABSTRAT_ACTION__CONDITION);

		conditionalActionEClass = createEClass(CONDITIONAL_ACTION);
		createEAttribute(conditionalActionEClass, CONDITIONAL_ACTION__SENSOR_TERM);
		createEAttribute(conditionalActionEClass, CONDITIONAL_ACTION__LOGICAL_SYMBOL);
		createEAttribute(conditionalActionEClass, CONDITIONAL_ACTION__VALUE);
		createEAttribute(conditionalActionEClass, CONDITIONAL_ACTION__UNIT);

		abstractNodeMemoryActionEClass = createEClass(ABSTRACT_NODE_MEMORY_ACTION);

		readNodeMemoryActionEClass = createEClass(READ_NODE_MEMORY_ACTION);

		writeNodeMemoryActionEClass = createEClass(WRITE_NODE_MEMORY_ACTION);

		sendMessageActionEClass = createEClass(SEND_MESSAGE_ACTION);
		createEAttribute(sendMessageActionEClass, SEND_MESSAGE_ACTION__SEND_MESSAGE_TO);

		blinkActionEClass = createEClass(BLINK_ACTION);
		createEAttribute(blinkActionEClass, BLINK_ACTION__LED);
		createEAttribute(blinkActionEClass, BLINK_ACTION__STATUS);

		abstractResponceActionEClass = createEClass(ABSTRACT_RESPONCE_ACTION);

		sendSerialPortMsgActionEClass = createEClass(SEND_SERIAL_PORT_MSG_ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractNodeMemoryActionEClass.getESuperTypes().add(this.getAbstratAction());
		readNodeMemoryActionEClass.getESuperTypes().add(this.getAbstractNodeMemoryAction());
		writeNodeMemoryActionEClass.getESuperTypes().add(this.getAbstractNodeMemoryAction());
		writeNodeMemoryActionEClass.getESuperTypes().add(this.getAbstractResponceAction());
		sendMessageActionEClass.getESuperTypes().add(this.getAbstractResponceAction());
		blinkActionEClass.getESuperTypes().add(this.getAbstractResponceAction());
		abstractResponceActionEClass.getESuperTypes().add(this.getAbstratAction());
		sendSerialPortMsgActionEClass.getESuperTypes().add(this.getAbstractResponceAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstratActionEClass, AbstratAction.class, "AbstratAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstratAction_Condition(), this.getConditionalAction(), null, "condition", null, 1, 1, AbstratAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalActionEClass, ConditionalAction.class, "ConditionalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalAction_SensorTerm(), ecorePackage.getEString(), "sensorTerm", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalAction_LogicalSymbol(), theEnumsPackage.getLogicalSymbol(), "logicalSymbol", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalAction_Value(), ecorePackage.getELong(), "value", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalAction_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeMemoryActionEClass, AbstractNodeMemoryAction.class, "AbstractNodeMemoryAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readNodeMemoryActionEClass, ReadNodeMemoryAction.class, "ReadNodeMemoryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(writeNodeMemoryActionEClass, WriteNodeMemoryAction.class, "WriteNodeMemoryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendMessageActionEClass, SendMessageAction.class, "SendMessageAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendMessageAction_SendMessageTo(), ecorePackage.getEInt(), "sendMessageTo", null, 0, 1, SendMessageAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blinkActionEClass, BlinkAction.class, "BlinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlinkAction_Led(), theEnumsPackage.getLeds(), "led", null, 0, 1, BlinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlinkAction_Status(), theEnumsPackage.getLedStatus(), "status", null, 0, 1, BlinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractResponceActionEClass, AbstractResponceAction.class, "AbstractResponceAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendSerialPortMsgActionEClass, SendSerialPortMsgAction.class, "SendSerialPortMsgAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //JobactionPackageImpl
