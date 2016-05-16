/**
 */
package org.nader.sennet.node.impl;

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

import org.nader.sennet.job.actions.ActionsPackage;

import org.nader.sennet.job.actions.impl.ActionsPackageImpl;

import org.nader.sennet.job.impl.JobPackageImpl;

import org.nader.sennet.network.NetworkPackage;

import org.nader.sennet.network.impl.NetworkPackageImpl;

import org.nader.sennet.node.AbstractClusterNode;
import org.nader.sennet.node.AbstractFlatNode;
import org.nader.sennet.node.AbstractNode;
import org.nader.sennet.node.ClusterHeadNode;
import org.nader.sennet.node.ComputationNode;
import org.nader.sennet.node.NodeFactory;
import org.nader.sennet.node.NodePackage;
import org.nader.sennet.node.SensorNode;
import org.nader.sennet.node.SinkNode;

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
public class NodePackageImpl extends EPackageImpl implements NodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFlatNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractClusterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterHeadNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationNodeEClass = null;

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
	 * @see org.nader.sennet.node.NodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NodePackageImpl() {
		super(eNS_URI, NodeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NodePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NodePackage init() {
		if (isInited) return (NodePackage)EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI);

		// Obtain or create and register package
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NodePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SennetPackageImpl theSennetPackage = (SennetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) instanceof SennetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) : SennetPackage.eINSTANCE);
		ToplevelstructurePackageImpl theToplevelstructurePackage = (ToplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) instanceof ToplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) : ToplevelstructurePackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);
		JobPackageImpl theJobPackage = (JobPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) instanceof JobPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) : JobPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		SensorPackageImpl theSensorPackage = (SensorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) instanceof SensorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) : SensorPackage.eINSTANCE);
		PortPackageImpl thePortPackage = (PortPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) instanceof PortPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) : PortPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);

		// Create package meta-data objects
		theNodePackage.createPackageContents();
		theSennetPackage.createPackageContents();
		theToplevelstructurePackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theJobPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theSensorPackage.createPackageContents();
		thePortPackage.createPackageContents();
		theNetworkPackage.createPackageContents();

		// Initialize created meta-data
		theNodePackage.initializePackageContents();
		theSennetPackage.initializePackageContents();
		theToplevelstructurePackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theJobPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theSensorPackage.initializePackageContents();
		thePortPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNodePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NodePackage.eNS_URI, theNodePackage);
		return theNodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Position() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_Resources() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFlatNode() {
		return abstractFlatNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractClusterNode() {
		return abstractClusterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorNode() {
		return sensorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusterHeadNode() {
		return clusterHeadNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinkNode() {
		return sinkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputationNode() {
		return computationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFactory getNodeFactory() {
		return (NodeFactory)getEFactoryInstance();
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
		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__POSITION);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__RESOURCES);

		abstractFlatNodeEClass = createEClass(ABSTRACT_FLAT_NODE);

		abstractClusterNodeEClass = createEClass(ABSTRACT_CLUSTER_NODE);

		sensorNodeEClass = createEClass(SENSOR_NODE);

		clusterHeadNodeEClass = createEClass(CLUSTER_HEAD_NODE);

		sinkNodeEClass = createEClass(SINK_NODE);

		computationNodeEClass = createEClass(COMPUTATION_NODE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractNodeEClass.getESuperTypes().add(theToplevelstructurePackage.getIdentifiable());
		abstractFlatNodeEClass.getESuperTypes().add(this.getAbstractNode());
		abstractClusterNodeEClass.getESuperTypes().add(this.getAbstractNode());
		sensorNodeEClass.getESuperTypes().add(this.getAbstractClusterNode());
		sensorNodeEClass.getESuperTypes().add(this.getAbstractFlatNode());
		clusterHeadNodeEClass.getESuperTypes().add(this.getAbstractClusterNode());
		sinkNodeEClass.getESuperTypes().add(this.getAbstractNode());
		computationNodeEClass.getESuperTypes().add(this.getAbstractFlatNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNode_Position(), theEnumsPackage.getPosition(), "position", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_Resources(), theToplevelstructurePackage.getAbstractResource(), null, "resources", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFlatNodeEClass, AbstractFlatNode.class, "AbstractFlatNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractClusterNodeEClass, AbstractClusterNode.class, "AbstractClusterNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorNodeEClass, SensorNode.class, "SensorNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clusterHeadNodeEClass, ClusterHeadNode.class, "ClusterHeadNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinkNodeEClass, SinkNode.class, "SinkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computationNodeEClass, ComputationNode.class, "ComputationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //NodePackageImpl
