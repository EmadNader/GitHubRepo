/**
 */
package org.nader.sennet.job.jobtrigger.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nader.sennet.SennetPackage;

import org.nader.sennet.enums.EnumsPackage;

import org.nader.sennet.enums.impl.EnumsPackageImpl;

import org.nader.sennet.impl.SennetPackageImpl;

import org.nader.sennet.job.JobPackage;

import org.nader.sennet.job.impl.JobPackageImpl;

import org.nader.sennet.job.jobaction.JobactionPackage;

import org.nader.sennet.job.jobaction.impl.JobactionPackageImpl;

import org.nader.sennet.job.jobtrigger.AbstractRecieveTrigger;
import org.nader.sennet.job.jobtrigger.AbstractStartEndingJobTrigger;
import org.nader.sennet.job.jobtrigger.JobtriggerFactory;
import org.nader.sennet.job.jobtrigger.JobtriggerPackage;
import org.nader.sennet.job.jobtrigger.PushButtomTrigger;
import org.nader.sennet.job.jobtrigger.ReceiveMessageTrigger;
import org.nader.sennet.job.jobtrigger.RecieveSerialMsgTrigger;
import org.nader.sennet.job.jobtrigger.StartJobTrigger;
import org.nader.sennet.job.jobtrigger.StopJobTrigger;

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
public class JobtriggerPackageImpl extends EPackageImpl implements JobtriggerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveMessageTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recieveSerialMsgTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startJobTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopJobTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushButtomTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRecieveTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStartEndingJobTriggerEClass = null;

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
	 * @see org.nader.sennet.job.jobtrigger.JobtriggerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobtriggerPackageImpl() {
		super(eNS_URI, JobtriggerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JobtriggerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobtriggerPackage init() {
		if (isInited) return (JobtriggerPackage)EPackage.Registry.INSTANCE.getEPackage(JobtriggerPackage.eNS_URI);

		// Obtain or create and register package
		JobtriggerPackageImpl theJobtriggerPackage = (JobtriggerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JobtriggerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JobtriggerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SennetPackageImpl theSennetPackage = (SennetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) instanceof SennetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) : SennetPackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);
		ToplevelstructurePackageImpl theToplevelstructurePackage = (ToplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) instanceof ToplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) : ToplevelstructurePackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		SensorsPackageImpl theSensorsPackage = (SensorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI) instanceof SensorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI) : SensorsPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		JobPackageImpl theJobPackage = (JobPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) instanceof JobPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) : JobPackage.eINSTANCE);
		JobactionPackageImpl theJobactionPackage = (JobactionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobactionPackage.eNS_URI) instanceof JobactionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobactionPackage.eNS_URI) : JobactionPackage.eINSTANCE);

		// Create package meta-data objects
		theJobtriggerPackage.createPackageContents();
		theSennetPackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theToplevelstructurePackage.createPackageContents();
		theNodePackage.createPackageContents();
		theSensorsPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theJobPackage.createPackageContents();
		theJobactionPackage.createPackageContents();

		// Initialize created meta-data
		theJobtriggerPackage.initializePackageContents();
		theSennetPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theToplevelstructurePackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theSensorsPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theJobPackage.initializePackageContents();
		theJobactionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobtriggerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobtriggerPackage.eNS_URI, theJobtriggerPackage);
		return theJobtriggerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveMessageTrigger() {
		return receiveMessageTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecieveSerialMsgTrigger() {
		return recieveSerialMsgTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartJobTrigger() {
		return startJobTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopJobTrigger() {
		return stopJobTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushButtomTrigger() {
		return pushButtomTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRecieveTrigger() {
		return abstractRecieveTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStartEndingJobTrigger() {
		return abstractStartEndingJobTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobtriggerFactory getJobtriggerFactory() {
		return (JobtriggerFactory)getEFactoryInstance();
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
		receiveMessageTriggerEClass = createEClass(RECEIVE_MESSAGE_TRIGGER);

		recieveSerialMsgTriggerEClass = createEClass(RECIEVE_SERIAL_MSG_TRIGGER);

		startJobTriggerEClass = createEClass(START_JOB_TRIGGER);

		stopJobTriggerEClass = createEClass(STOP_JOB_TRIGGER);

		pushButtomTriggerEClass = createEClass(PUSH_BUTTOM_TRIGGER);

		abstractRecieveTriggerEClass = createEClass(ABSTRACT_RECIEVE_TRIGGER);

		abstractStartEndingJobTriggerEClass = createEClass(ABSTRACT_START_ENDING_JOB_TRIGGER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		receiveMessageTriggerEClass.getESuperTypes().add(this.getAbstractRecieveTrigger());
		recieveSerialMsgTriggerEClass.getESuperTypes().add(this.getAbstractRecieveTrigger());
		startJobTriggerEClass.getESuperTypes().add(this.getAbstractStartEndingJobTrigger());
		stopJobTriggerEClass.getESuperTypes().add(this.getAbstractStartEndingJobTrigger());
		pushButtomTriggerEClass.getESuperTypes().add(this.getAbstractRecieveTrigger());
		abstractRecieveTriggerEClass.getESuperTypes().add(this.getStartJobTrigger());
		abstractRecieveTriggerEClass.getESuperTypes().add(this.getStopJobTrigger());

		// Initialize classes, features, and operations; add parameters
		initEClass(receiveMessageTriggerEClass, ReceiveMessageTrigger.class, "ReceiveMessageTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recieveSerialMsgTriggerEClass, RecieveSerialMsgTrigger.class, "RecieveSerialMsgTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startJobTriggerEClass, StartJobTrigger.class, "StartJobTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopJobTriggerEClass, StopJobTrigger.class, "StopJobTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pushButtomTriggerEClass, PushButtomTrigger.class, "PushButtomTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractRecieveTriggerEClass, AbstractRecieveTrigger.class, "AbstractRecieveTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractStartEndingJobTriggerEClass, AbstractStartEndingJobTrigger.class, "AbstractStartEndingJobTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //JobtriggerPackageImpl
