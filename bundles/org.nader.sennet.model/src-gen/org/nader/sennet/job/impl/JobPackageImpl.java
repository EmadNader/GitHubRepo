/**
 */
package org.nader.sennet.job.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nader.sennet.SennetPackage;

import org.nader.sennet.enums.EnumsPackage;

import org.nader.sennet.enums.impl.EnumsPackageImpl;

import org.nader.sennet.impl.SennetPackageImpl;

import org.nader.sennet.job.AbstractJob;
import org.nader.sennet.job.ContinuousJob;
import org.nader.sennet.job.EventDrivenJob;
import org.nader.sennet.job.JobFactory;
import org.nader.sennet.job.JobPackage;
import org.nader.sennet.job.PeriodicJob;
import org.nader.sennet.job.RequestReplayJob;

import org.nader.sennet.job.actions.ActionsPackage;

import org.nader.sennet.job.actions.impl.ActionsPackageImpl;

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
public class JobPackageImpl extends EPackageImpl implements JobPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDrivenJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestReplayJobEClass = null;

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
	 * @see org.nader.sennet.job.JobPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobPackageImpl() {
		super(eNS_URI, JobFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JobPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobPackage init() {
		if (isInited) return (JobPackage)EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI);

		// Obtain or create and register package
		JobPackageImpl theJobPackage = (JobPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JobPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JobPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SennetPackageImpl theSennetPackage = (SennetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) instanceof SennetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) : SennetPackage.eINSTANCE);
		ToplevelstructurePackageImpl theToplevelstructurePackage = (ToplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) instanceof ToplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) : ToplevelstructurePackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		SensorPackageImpl theSensorPackage = (SensorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) instanceof SensorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) : SensorPackage.eINSTANCE);
		PortPackageImpl thePortPackage = (PortPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) instanceof PortPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) : PortPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);

		// Create package meta-data objects
		theJobPackage.createPackageContents();
		theSennetPackage.createPackageContents();
		theToplevelstructurePackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theNodePackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theSensorPackage.createPackageContents();
		thePortPackage.createPackageContents();
		theNetworkPackage.createPackageContents();

		// Initialize created meta-data
		theJobPackage.initializePackageContents();
		theSennetPackage.initializePackageContents();
		theToplevelstructurePackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theSensorPackage.initializePackageContents();
		thePortPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobPackage.eNS_URI, theJobPackage);
		return theJobPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractJob() {
		return abstractJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractJob_Action() {
		return (EReference)abstractJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousJob() {
		return continuousJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDrivenJob() {
		return eventDrivenJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventDrivenJob_EventCondition() {
		return (EReference)eventDrivenJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicJob() {
		return periodicJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicJob_Timer() {
		return (EAttribute)periodicJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestReplayJob() {
		return requestReplayJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobFactory getJobFactory() {
		return (JobFactory)getEFactoryInstance();
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
		abstractJobEClass = createEClass(ABSTRACT_JOB);
		createEReference(abstractJobEClass, ABSTRACT_JOB__ACTION);

		continuousJobEClass = createEClass(CONTINUOUS_JOB);

		eventDrivenJobEClass = createEClass(EVENT_DRIVEN_JOB);
		createEReference(eventDrivenJobEClass, EVENT_DRIVEN_JOB__EVENT_CONDITION);

		periodicJobEClass = createEClass(PERIODIC_JOB);
		createEAttribute(periodicJobEClass, PERIODIC_JOB__TIMER);

		requestReplayJobEClass = createEClass(REQUEST_REPLAY_JOB);
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
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		ToplevelstructurePackage theToplevelstructurePackage = (ToplevelstructurePackage)EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI);
		SennetPackage theSennetPackage = (SennetPackage)EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractJobEClass.getESuperTypes().add(theToplevelstructurePackage.getIdentifiable());
		continuousJobEClass.getESuperTypes().add(this.getAbstractJob());
		eventDrivenJobEClass.getESuperTypes().add(this.getAbstractJob());
		periodicJobEClass.getESuperTypes().add(this.getAbstractJob());
		requestReplayJobEClass.getESuperTypes().add(this.getAbstractJob());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractJobEClass, AbstractJob.class, "AbstractJob", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractJob_Action(), theActionsPackage.getAbstractJobAction(), null, "action", null, 0, 1, AbstractJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continuousJobEClass, ContinuousJob.class, "ContinuousJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventDrivenJobEClass, EventDrivenJob.class, "EventDrivenJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventDrivenJob_EventCondition(), theSennetPackage.getLogicalCondition(), null, "eventCondition", null, 0, 1, EventDrivenJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicJobEClass, PeriodicJob.class, "PeriodicJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicJob_Timer(), ecorePackage.getELong(), "timer", null, 0, 1, PeriodicJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestReplayJobEClass, RequestReplayJob.class, "RequestReplayJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //JobPackageImpl
