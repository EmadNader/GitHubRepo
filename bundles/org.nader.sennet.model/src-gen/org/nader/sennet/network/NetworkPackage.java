/**
 */
package org.nader.sennet.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nader.sennet.toplevelstructure.ToplevelstructurePackage;

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
 * @see org.nader.sennet.network.NetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "network";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet/net";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkPackage eINSTANCE = org.nader.sennet.network.impl.NetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.network.impl.AbstractNetworkImpl <em>Abstract Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.network.impl.AbstractNetworkImpl
	 * @see org.nader.sennet.network.impl.NetworkPackageImpl#getAbstractNetwork()
	 * @generated
	 */
	int ABSTRACT_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__ID = ToplevelstructurePackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Nb Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__NB_OF_NODES = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inter Node Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__INTER_NODE_COMM = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__ROUTING_PROTOCOL = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__RESOURCES = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK__SINK = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK_FEATURE_COUNT = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Abstract Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NETWORK_OPERATION_COUNT = ToplevelstructurePackage.IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.network.impl.FlatNetworkImpl <em>Flat Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.network.impl.FlatNetworkImpl
	 * @see org.nader.sennet.network.impl.NetworkPackageImpl#getFlatNetwork()
	 * @generated
	 */
	int FLAT_NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__ID = ABSTRACT_NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Nb Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__NB_OF_NODES = ABSTRACT_NETWORK__NB_OF_NODES;

	/**
	 * The feature id for the '<em><b>Inter Node Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__INTER_NODE_COMM = ABSTRACT_NETWORK__INTER_NODE_COMM;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__ROUTING_PROTOCOL = ABSTRACT_NETWORK__ROUTING_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__RESOURCES = ABSTRACT_NETWORK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__SINK = ABSTRACT_NETWORK__SINK;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK__NODES = ABSTRACT_NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flat Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK_FEATURE_COUNT = ABSTRACT_NETWORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flat Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_NETWORK_OPERATION_COUNT = ABSTRACT_NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.network.impl.ClusteredNetworkImpl <em>Clustered Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.network.impl.ClusteredNetworkImpl
	 * @see org.nader.sennet.network.impl.NetworkPackageImpl#getClusteredNetwork()
	 * @generated
	 */
	int CLUSTERED_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__ID = ABSTRACT_NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Nb Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__NB_OF_NODES = ABSTRACT_NETWORK__NB_OF_NODES;

	/**
	 * The feature id for the '<em><b>Inter Node Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__INTER_NODE_COMM = ABSTRACT_NETWORK__INTER_NODE_COMM;

	/**
	 * The feature id for the '<em><b>Routing Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__ROUTING_PROTOCOL = ABSTRACT_NETWORK__ROUTING_PROTOCOL;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__RESOURCES = ABSTRACT_NETWORK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__SINK = ABSTRACT_NETWORK__SINK;

	/**
	 * The feature id for the '<em><b>Clusters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK__CLUSTERS = ABSTRACT_NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clustered Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK_FEATURE_COUNT = ABSTRACT_NETWORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clustered Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERED_NETWORK_OPERATION_COUNT = ABSTRACT_NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.network.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.network.impl.ClusterImpl
	 * @see org.nader.sennet.network.impl.NetworkPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ID = ToplevelstructurePackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NODES = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__RESOURCES = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = ToplevelstructurePackage.IDENTIFIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.network.AbstractNetwork <em>Abstract Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Network</em>'.
	 * @see org.nader.sennet.network.AbstractNetwork
	 * @generated
	 */
	EClass getAbstractNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.network.AbstractNetwork#getNbOfNodes <em>Nb Of Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Of Nodes</em>'.
	 * @see org.nader.sennet.network.AbstractNetwork#getNbOfNodes()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EAttribute getAbstractNetwork_NbOfNodes();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.network.AbstractNetwork#getInterNodeComm <em>Inter Node Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inter Node Comm</em>'.
	 * @see org.nader.sennet.network.AbstractNetwork#getInterNodeComm()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EAttribute getAbstractNetwork_InterNodeComm();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.network.AbstractNetwork#getRoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Protocol</em>'.
	 * @see org.nader.sennet.network.AbstractNetwork#getRoutingProtocol()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EAttribute getAbstractNetwork_RoutingProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nader.sennet.network.AbstractNetwork#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nader.sennet.network.AbstractNetwork#getResources()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EReference getAbstractNetwork_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link org.nader.sennet.network.AbstractNetwork#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sink</em>'.
	 * @see org.nader.sennet.network.AbstractNetwork#getSink()
	 * @see #getAbstractNetwork()
	 * @generated
	 */
	EReference getAbstractNetwork_Sink();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.network.FlatNetwork <em>Flat Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Network</em>'.
	 * @see org.nader.sennet.network.FlatNetwork
	 * @generated
	 */
	EClass getFlatNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nader.sennet.network.FlatNetwork#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.nader.sennet.network.FlatNetwork#getNodes()
	 * @see #getFlatNetwork()
	 * @generated
	 */
	EReference getFlatNetwork_Nodes();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.network.ClusteredNetwork <em>Clustered Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustered Network</em>'.
	 * @see org.nader.sennet.network.ClusteredNetwork
	 * @generated
	 */
	EClass getClusteredNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nader.sennet.network.ClusteredNetwork#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clusters</em>'.
	 * @see org.nader.sennet.network.ClusteredNetwork#getClusters()
	 * @see #getClusteredNetwork()
	 * @generated
	 */
	EReference getClusteredNetwork_Clusters();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.network.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see org.nader.sennet.network.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nader.sennet.network.Cluster#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.nader.sennet.network.Cluster#getNodes()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link org.nader.sennet.network.Cluster#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.nader.sennet.network.Cluster#getResources()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Resources();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkFactory getNetworkFactory();

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
		 * The meta object literal for the '{@link org.nader.sennet.network.impl.AbstractNetworkImpl <em>Abstract Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.network.impl.AbstractNetworkImpl
		 * @see org.nader.sennet.network.impl.NetworkPackageImpl#getAbstractNetwork()
		 * @generated
		 */
		EClass ABSTRACT_NETWORK = eINSTANCE.getAbstractNetwork();

		/**
		 * The meta object literal for the '<em><b>Nb Of Nodes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NETWORK__NB_OF_NODES = eINSTANCE.getAbstractNetwork_NbOfNodes();

		/**
		 * The meta object literal for the '<em><b>Inter Node Comm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NETWORK__INTER_NODE_COMM = eINSTANCE.getAbstractNetwork_InterNodeComm();

		/**
		 * The meta object literal for the '<em><b>Routing Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NETWORK__ROUTING_PROTOCOL = eINSTANCE.getAbstractNetwork_RoutingProtocol();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NETWORK__RESOURCES = eINSTANCE.getAbstractNetwork_Resources();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NETWORK__SINK = eINSTANCE.getAbstractNetwork_Sink();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.network.impl.FlatNetworkImpl <em>Flat Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.network.impl.FlatNetworkImpl
		 * @see org.nader.sennet.network.impl.NetworkPackageImpl#getFlatNetwork()
		 * @generated
		 */
		EClass FLAT_NETWORK = eINSTANCE.getFlatNetwork();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAT_NETWORK__NODES = eINSTANCE.getFlatNetwork_Nodes();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.network.impl.ClusteredNetworkImpl <em>Clustered Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.network.impl.ClusteredNetworkImpl
		 * @see org.nader.sennet.network.impl.NetworkPackageImpl#getClusteredNetwork()
		 * @generated
		 */
		EClass CLUSTERED_NETWORK = eINSTANCE.getClusteredNetwork();

		/**
		 * The meta object literal for the '<em><b>Clusters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTERED_NETWORK__CLUSTERS = eINSTANCE.getClusteredNetwork_Clusters();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.network.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.network.impl.ClusterImpl
		 * @see org.nader.sennet.network.impl.NetworkPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__NODES = eINSTANCE.getCluster_Nodes();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__RESOURCES = eINSTANCE.getCluster_Resources();

	}

} //NetworkPackage
