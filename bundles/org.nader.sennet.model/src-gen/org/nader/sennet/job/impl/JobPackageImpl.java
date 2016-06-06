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
import org.nader.sennet.job.AggregationJob;
import org.nader.sennet.job.FusionJob;
import org.nader.sennet.job.JobFactory;
import org.nader.sennet.job.JobPackage;
import org.nader.sennet.job.RegularSenseJob;
import org.nader.sennet.job.SenseForwardJob;
import org.nader.sennet.job.SenseNowJob;
import org.nader.sennet.job.SinkJob;

import org.nader.sennet.job.jobaction.JobactionPackage;

import org.nader.sennet.job.jobaction.impl.JobactionPackageImpl;

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
	private EClass senseForwardJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fusionJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseNowJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularSenseJobEClass = null;

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
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);
		ToplevelstructurePackageImpl theToplevelstructurePackage = (ToplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) instanceof ToplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) : ToplevelstructurePackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		SensorsPackageImpl theSensorsPackage = (SensorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI) instanceof SensorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI) : SensorsPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		JobtriggerPackageImpl theJobtriggerPackage = (JobtriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobtriggerPackage.eNS_URI) instanceof JobtriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobtriggerPackage.eNS_URI) : JobtriggerPackage.eINSTANCE);
		JobactionPackageImpl theJobactionPackage = (JobactionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobactionPackage.eNS_URI) instanceof JobactionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobactionPackage.eNS_URI) : JobactionPackage.eINSTANCE);

		// Create package meta-data objects
		theJobPackage.createPackageContents();
		theSennetPackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theToplevelstructurePackage.createPackageContents();
		theNodePackage.createPackageContents();
		theSensorsPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theJobtriggerPackage.createPackageContents();
		theJobactionPackage.createPackageContents();

		// Initialize created meta-data
		theJobPackage.initializePackageContents();
		theSennetPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theToplevelstructurePackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theSensorsPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theJobtriggerPackage.initializePackageContents();
		theJobactionPackage.initializePackageContents();

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
	public EReference getAbstractJob_JobTargetNode() {
		return (EReference)abstractJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractJob_JobTargetNetwork() {
		return (EReference)abstractJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractJob_StartEndTrigger() {
		return (EReference)abstractJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractJob_Jobaction() {
		return (EReference)abstractJobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenseForwardJob() {
		return senseForwardJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenseForwardJob_SensingThreshold() {
		return (EAttribute)senseForwardJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationJob() {
		return aggregationJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationJob_Aggregation() {
		return (EAttribute)aggregationJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFusionJob() {
		return fusionJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFusionJob_Fusion() {
		return (EAttribute)fusionJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenseNowJob() {
		return senseNowJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkJob() {
		return sinkJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularSenseJob() {
		return regularSenseJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularSenseJob_SensingThreshold() {
		return (EAttribute)regularSenseJobEClass.getEStructuralFeatures().get(0);
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
		createEReference(abstractJobEClass, ABSTRACT_JOB__JOB_TARGET_NODE);
		createEReference(abstractJobEClass, ABSTRACT_JOB__JOB_TARGET_NETWORK);
		createEReference(abstractJobEClass, ABSTRACT_JOB__START_END_TRIGGER);
		createEReference(abstractJobEClass, ABSTRACT_JOB__JOBACTION);

		senseForwardJobEClass = createEClass(SENSE_FORWARD_JOB);
		createEAttribute(senseForwardJobEClass, SENSE_FORWARD_JOB__SENSING_THRESHOLD);

		aggregationJobEClass = createEClass(AGGREGATION_JOB);
		createEAttribute(aggregationJobEClass, AGGREGATION_JOB__AGGREGATION);

		fusionJobEClass = createEClass(FUSION_JOB);
		createEAttribute(fusionJobEClass, FUSION_JOB__FUSION);

		senseNowJobEClass = createEClass(SENSE_NOW_JOB);

		sinkJobEClass = createEClass(SINK_JOB);

		regularSenseJobEClass = createEClass(REGULAR_SENSE_JOB);
		createEAttribute(regularSenseJobEClass, REGULAR_SENSE_JOB__SENSING_THRESHOLD);
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
		JobtriggerPackage theJobtriggerPackage = (JobtriggerPackage)EPackage.Registry.INSTANCE.getEPackage(JobtriggerPackage.eNS_URI);
		JobactionPackage theJobactionPackage = (JobactionPackage)EPackage.Registry.INSTANCE.getEPackage(JobactionPackage.eNS_URI);
		ToplevelstructurePackage theToplevelstructurePackage = (ToplevelstructurePackage)EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI);
		NodePackage theNodePackage = (NodePackage)EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI);
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theJobtriggerPackage);
		getESubpackages().add(theJobactionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractJobEClass.getESuperTypes().add(theToplevelstructurePackage.getIdentifiable());
		senseForwardJobEClass.getESuperTypes().add(this.getAbstractJob());
		aggregationJobEClass.getESuperTypes().add(this.getAbstractJob());
		fusionJobEClass.getESuperTypes().add(this.getAbstractJob());
		senseNowJobEClass.getESuperTypes().add(this.getAbstractJob());
		sinkJobEClass.getESuperTypes().add(this.getAbstractJob());
		regularSenseJobEClass.getESuperTypes().add(this.getAbstractJob());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractJobEClass, AbstractJob.class, "AbstractJob", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractJob_JobTargetNode(), theNodePackage.getAbstractNode(), null, "JobTargetNode", null, 0, 1, AbstractJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractJob_JobTargetNetwork(), theNetworkPackage.getAbstractNetwork(), null, "JobTargetNetwork", null, 0, 1, AbstractJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractJob_StartEndTrigger(), theJobtriggerPackage.getAbstractStartEndingJobTrigger(), null, "startEndTrigger", null, 0, -1, AbstractJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractJob_Jobaction(), theJobactionPackage.getAbstratAction(), null, "jobaction", null, 0, -1, AbstractJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseForwardJobEClass, SenseForwardJob.class, "SenseForwardJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSenseForwardJob_SensingThreshold(), ecorePackage.getELong(), "sensingThreshold", null, 0, 1, SenseForwardJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationJobEClass, AggregationJob.class, "AggregationJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregationJob_Aggregation(), theEnumsPackage.getAggregation(), "aggregation", null, 0, 1, AggregationJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fusionJobEClass, FusionJob.class, "FusionJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFusionJob_Fusion(), theEnumsPackage.getFusion(), "fusion", null, 0, 1, FusionJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseNowJobEClass, SenseNowJob.class, "SenseNowJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinkJobEClass, SinkJob.class, "SinkJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regularSenseJobEClass, RegularSenseJob.class, "RegularSenseJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegularSenseJob_SensingThreshold(), ecorePackage.getELong(), "sensingThreshold", null, 0, 1, RegularSenseJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //JobPackageImpl
