/**
 */
package org.nader.sennet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nader.sennet.LogicalCondition;
import org.nader.sennet.SennetFactory;
import org.nader.sennet.SennetPackage;
import org.nader.sennet.WSNapp;

import org.nader.sennet.enums.EnumsPackage;

import org.nader.sennet.enums.impl.EnumsPackageImpl;

import org.nader.sennet.job.JobPackage;

import org.nader.sennet.job.actions.ActionsPackage;

import org.nader.sennet.job.actions.impl.ActionsPackageImpl;

import org.nader.sennet.job.impl.JobPackageImpl;

import org.nader.sennet.network.NetworkPackage;

import org.nader.sennet.network.impl.NetworkPackageImpl;

import org.nader.sennet.node.NodePackage;

import org.nader.sennet.node.impl.NodePackageImpl;

import org.nader.sennet.port.PortPackage;

import org.nader.sennet.port.impl.PortPackageImpl;

import org.nader.sennet.sensor.SensorPackage;

import org.nader.sennet.sensor.impl.SensorPackageImpl;

import org.nader.sennet.toplevelstructure.ToplevelstructurePackage;

import org.nader.sennet.toplevelstructure.impl.ToplevelstructurePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SennetPackageImpl extends EPackageImpl implements SennetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsNappEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalConditionEClass = null;

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
	 * @see org.nader.sennet.SennetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SennetPackageImpl() {
		super(eNS_URI, SennetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SennetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SennetPackage init() {
		if (isInited) return (SennetPackage)EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI);

		// Obtain or create and register package
		SennetPackageImpl theSennetPackage = (SennetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SennetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SennetPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ToplevelstructurePackageImpl theToplevelstructurePackage = (ToplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) instanceof ToplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) : ToplevelstructurePackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		JobPackageImpl theJobPackage = (JobPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) instanceof JobPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) : JobPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		SensorPackageImpl theSensorPackage = (SensorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) instanceof SensorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) : SensorPackage.eINSTANCE);
		PortPackageImpl thePortPackage = (PortPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) instanceof PortPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) : PortPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);

		// Create package meta-data objects
		theSennetPackage.createPackageContents();
		theToplevelstructurePackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theNodePackage.createPackageContents();
		theJobPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theSensorPackage.createPackageContents();
		thePortPackage.createPackageContents();
		theNetworkPackage.createPackageContents();

		// Initialize created meta-data
		theSennetPackage.initializePackageContents();
		theToplevelstructurePackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theJobPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theSensorPackage.initializePackageContents();
		thePortPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSennetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SennetPackage.eNS_URI, theSennetPackage);
		return theSennetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSNapp() {
		return wsNappEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWSNapp_Network() {
		return (EReference)wsNappEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWSNapp_Jobs() {
		return (EReference)wsNappEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalCondition() {
		return logicalConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalCondition_JobSchedule() {
		return (EAttribute)logicalConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalCondition_SensorTerm() {
		return (EAttribute)logicalConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalCondition_LogicalSymbol() {
		return (EAttribute)logicalConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalCondition_Value() {
		return (EAttribute)logicalConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalCondition_Unit() {
		return (EAttribute)logicalConditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SennetFactory getSennetFactory() {
		return (SennetFactory)getEFactoryInstance();
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
		wsNappEClass = createEClass(WS_NAPP);
		createEReference(wsNappEClass, WS_NAPP__NETWORK);
		createEReference(wsNappEClass, WS_NAPP__JOBS);

		logicalConditionEClass = createEClass(LOGICAL_CONDITION);
		createEAttribute(logicalConditionEClass, LOGICAL_CONDITION__JOB_SCHEDULE);
		createEAttribute(logicalConditionEClass, LOGICAL_CONDITION__SENSOR_TERM);
		createEAttribute(logicalConditionEClass, LOGICAL_CONDITION__LOGICAL_SYMBOL);
		createEAttribute(logicalConditionEClass, LOGICAL_CONDITION__VALUE);
		createEAttribute(logicalConditionEClass, LOGICAL_CONDITION__UNIT);
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
		ToplevelstructurePackage theToplevelstructurePackage = (ToplevelstructurePackage)EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		NodePackage theNodePackage = (NodePackage)EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI);
		JobPackage theJobPackage = (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);
		SensorPackage theSensorPackage = (SensorPackage)EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI);
		PortPackage thePortPackage = (PortPackage)EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theToplevelstructurePackage);
		getESubpackages().add(theEnumsPackage);
		getESubpackages().add(theNodePackage);
		getESubpackages().add(theJobPackage);
		getESubpackages().add(theSensorPackage);
		getESubpackages().add(thePortPackage);
		getESubpackages().add(theNetworkPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wsNappEClass.getESuperTypes().add(theToplevelstructurePackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(wsNappEClass, WSNapp.class, "WSNapp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWSNapp_Network(), theNetworkPackage.getAbstractNetwork(), null, "network", null, 0, 1, WSNapp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWSNapp_Jobs(), theJobPackage.getAbstractJob(), null, "jobs", null, 0, -1, WSNapp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalConditionEClass, LogicalCondition.class, "LogicalCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalCondition_JobSchedule(), theEnumsPackage.getJobSchedule(), "jobSchedule", null, 0, 1, LogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalCondition_SensorTerm(), ecorePackage.getEString(), "sensorTerm", null, 0, 1, LogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalCondition_LogicalSymbol(), theEnumsPackage.getLogicalSymbol(), "logicalSymbol", null, 0, 1, LogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalCondition_Value(), ecorePackage.getELong(), "value", null, 0, 1, LogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalCondition_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, LogicalCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SennetPackageImpl
