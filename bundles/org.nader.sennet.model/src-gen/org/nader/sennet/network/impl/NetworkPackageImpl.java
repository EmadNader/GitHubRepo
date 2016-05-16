/**
 */
package org.nader.sennet.network.impl;

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

import org.nader.sennet.network.AbstractNetwork;
import org.nader.sennet.network.Cluster;
import org.nader.sennet.network.ClusteredNetwork;
import org.nader.sennet.network.FlatNetwork;
import org.nader.sennet.network.NetworkFactory;
import org.nader.sennet.network.NetworkPackage;

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
public class NetworkPackageImpl extends EPackageImpl implements NetworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusteredNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

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
	 * @see org.nader.sennet.network.NetworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NetworkPackageImpl() {
		super(eNS_URI, NetworkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NetworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NetworkPackage init() {
		if (isInited) return (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Obtain or create and register package
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NetworkPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SennetPackageImpl theSennetPackage = (SennetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) instanceof SennetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) : SennetPackage.eINSTANCE);
		ToplevelstructurePackageImpl theToplevelstructurePackage = (ToplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) instanceof ToplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) : ToplevelstructurePackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		JobPackageImpl theJobPackage = (JobPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) instanceof JobPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) : JobPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		SensorPackageImpl theSensorPackage = (SensorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) instanceof SensorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) : SensorPackage.eINSTANCE);
		PortPackageImpl thePortPackage = (PortPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) instanceof PortPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) : PortPackage.eINSTANCE);

		// Create package meta-data objects
		theNetworkPackage.createPackageContents();
		theSennetPackage.createPackageContents();
		theToplevelstructurePackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theNodePackage.createPackageContents();
		theJobPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theSensorPackage.createPackageContents();
		thePortPackage.createPackageContents();

		// Initialize created meta-data
		theNetworkPackage.initializePackageContents();
		theSennetPackage.initializePackageContents();
		theToplevelstructurePackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theJobPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theSensorPackage.initializePackageContents();
		thePortPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNetworkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NetworkPackage.eNS_URI, theNetworkPackage);
		return theNetworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNetwork() {
		return abstractNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNetwork_NbOfNodes() {
		return (EAttribute)abstractNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNetwork_InterNodeComm() {
		return (EAttribute)abstractNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNetwork_RoutingProtocol() {
		return (EAttribute)abstractNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNetwork_Sink() {
		return (EReference)abstractNetworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNetwork_Sensors() {
		return (EReference)abstractNetworkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNetwork_Ports() {
		return (EReference)abstractNetworkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatNetwork() {
		return flatNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlatNetwork_Nodes() {
		return (EReference)flatNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusteredNetwork() {
		return clusteredNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClusteredNetwork_Clusters() {
		return (EReference)clusteredNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Head() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Nodes() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Resources() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkFactory getNetworkFactory() {
		return (NetworkFactory)getEFactoryInstance();
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
		abstractNetworkEClass = createEClass(ABSTRACT_NETWORK);
		createEAttribute(abstractNetworkEClass, ABSTRACT_NETWORK__NB_OF_NODES);
		createEAttribute(abstractNetworkEClass, ABSTRACT_NETWORK__INTER_NODE_COMM);
		createEAttribute(abstractNetworkEClass, ABSTRACT_NETWORK__ROUTING_PROTOCOL);
		createEReference(abstractNetworkEClass, ABSTRACT_NETWORK__SINK);
		createEReference(abstractNetworkEClass, ABSTRACT_NETWORK__SENSORS);
		createEReference(abstractNetworkEClass, ABSTRACT_NETWORK__PORTS);

		flatNetworkEClass = createEClass(FLAT_NETWORK);
		createEReference(flatNetworkEClass, FLAT_NETWORK__NODES);

		clusteredNetworkEClass = createEClass(CLUSTERED_NETWORK);
		createEReference(clusteredNetworkEClass, CLUSTERED_NETWORK__CLUSTERS);

		clusterEClass = createEClass(CLUSTER);
		createEReference(clusterEClass, CLUSTER__HEAD);
		createEReference(clusterEClass, CLUSTER__NODES);
		createEReference(clusterEClass, CLUSTER__RESOURCES);
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
		SensorPackage theSensorPackage = (SensorPackage)EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI);
		PortPackage thePortPackage = (PortPackage)EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractNetworkEClass.getESuperTypes().add(theToplevelstructurePackage.getIdentifiable());
		flatNetworkEClass.getESuperTypes().add(this.getAbstractNetwork());
		clusteredNetworkEClass.getESuperTypes().add(this.getAbstractNetwork());
		clusterEClass.getESuperTypes().add(theToplevelstructurePackage.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractNetworkEClass, AbstractNetwork.class, "AbstractNetwork", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNetwork_NbOfNodes(), ecorePackage.getEInt(), "nbOfNodes", null, 0, 1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNetwork_InterNodeComm(), theEnumsPackage.getInterNodeComm(), "interNodeComm", null, 0, 1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNetwork_RoutingProtocol(), theEnumsPackage.getRoutingProtocol(), "routingProtocol", null, 0, 1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNetwork_Sink(), theNodePackage.getSinkNode(), null, "sink", null, 0, 1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNetwork_Sensors(), theSensorPackage.getAbstractSensor(), null, "sensors", null, 0, -1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNetwork_Ports(), thePortPackage.getAbstractPort(), null, "ports", null, 0, -1, AbstractNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flatNetworkEClass, FlatNetwork.class, "FlatNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlatNetwork_Nodes(), theNodePackage.getAbstractFlatNode(), null, "nodes", null, 0, -1, FlatNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusteredNetworkEClass, ClusteredNetwork.class, "ClusteredNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClusteredNetwork_Clusters(), this.getCluster(), null, "clusters", null, 0, -1, ClusteredNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCluster_Head(), theNodePackage.getClusterHeadNode(), null, "head", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_Nodes(), theNodePackage.getAbstractClusterNode(), null, "nodes", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_Resources(), theToplevelstructurePackage.getAbstractResource(), null, "resources", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //NetworkPackageImpl
