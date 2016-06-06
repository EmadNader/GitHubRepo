/**
 */
package org.nader.sennet.node;

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
 * @see org.nader.sennet.node.NodeFactory
 * @model kind="package"
 * @generated
 */
public interface NodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "node";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet/nd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodePackage eINSTANCE = org.nader.sennet.node.impl.NodePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.node.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.node.impl.AbstractNodeImpl
	 * @see org.nader.sennet.node.impl.NodePackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ID = ToplevelstructurePackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__POSITION = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__NODE_RESOURCES = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_OPERATION_COUNT = ToplevelstructurePackage.IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.node.impl.AbstractFlatNodeImpl <em>Abstract Flat Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.node.impl.AbstractFlatNodeImpl
	 * @see org.nader.sennet.node.impl.NodePackageImpl#getAbstractFlatNode()
	 * @generated
	 */
	int ABSTRACT_FLAT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE__POSITION = ABSTRACT_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE__NODE_RESOURCES = ABSTRACT_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Abstract Flat Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Flat Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FLAT_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.node.impl.AbstractClusterNodeImpl <em>Abstract Cluster Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.node.impl.AbstractClusterNodeImpl
	 * @see org.nader.sennet.node.impl.NodePackageImpl#getAbstractClusterNode()
	 * @generated
	 */
	int ABSTRACT_CLUSTER_NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE__POSITION = ABSTRACT_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE__NODE_RESOURCES = ABSTRACT_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Abstract Cluster Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Cluster Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLUSTER_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.node.impl.SensorNodeImpl <em>Sensor Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.node.impl.SensorNodeImpl
	 * @see org.nader.sennet.node.impl.NodePackageImpl#getSensorNode()
	 * @generated
	 */
	int SENSOR_NODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__ID = ABSTRACT_CLUSTER_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__POSITION = ABSTRACT_CLUSTER_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__NODE_RESOURCES = ABSTRACT_CLUSTER_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Sensor Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE_FEATURE_COUNT = ABSTRACT_CLUSTER_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE_OPERATION_COUNT = ABSTRACT_CLUSTER_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.node.impl.ClusterHeadNodeImpl <em>Cluster Head Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.node.impl.ClusterHeadNodeImpl
	 * @see org.nader.sennet.node.impl.NodePackageImpl#getClusterHeadNode()
	 * @generated
	 */
	int CLUSTER_HEAD_NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE__ID = ABSTRACT_CLUSTER_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE__POSITION = ABSTRACT_CLUSTER_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE__NODE_RESOURCES = ABSTRACT_CLUSTER_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Cluster Head Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE_FEATURE_COUNT = ABSTRACT_CLUSTER_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cluster Head Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_HEAD_NODE_OPERATION_COUNT = ABSTRACT_CLUSTER_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.node.impl.SinkNodeImpl <em>Sink Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.node.impl.SinkNodeImpl
	 * @see org.nader.sennet.node.impl.NodePackageImpl#getSinkNode()
	 * @generated
	 */
	int SINK_NODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__POSITION = ABSTRACT_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE__NODE_RESOURCES = ABSTRACT_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Sink Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.node.impl.ComputationNodeImpl <em>Computation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.node.impl.ComputationNodeImpl
	 * @see org.nader.sennet.node.impl.NodePackageImpl#getComputationNode()
	 * @generated
	 */
	int COMPUTATION_NODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE__ID = ABSTRACT_FLAT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE__POSITION = ABSTRACT_FLAT_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Node Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE__NODE_RESOURCES = ABSTRACT_FLAT_NODE__NODE_RESOURCES;

	/**
	 * The number of structural features of the '<em>Computation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE_FEATURE_COUNT = ABSTRACT_FLAT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_NODE_OPERATION_COUNT = ABSTRACT_FLAT_NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.node.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see org.nader.sennet.node.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.node.AbstractNode#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nader.sennet.node.AbstractNode#getPosition()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nader.sennet.node.AbstractNode#getNodeResources <em>Node Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Resources</em>'.
	 * @see org.nader.sennet.node.AbstractNode#getNodeResources()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_NodeResources();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.node.AbstractFlatNode <em>Abstract Flat Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Flat Node</em>'.
	 * @see org.nader.sennet.node.AbstractFlatNode
	 * @generated
	 */
	EClass getAbstractFlatNode();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.node.AbstractClusterNode <em>Abstract Cluster Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Cluster Node</em>'.
	 * @see org.nader.sennet.node.AbstractClusterNode
	 * @generated
	 */
	EClass getAbstractClusterNode();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.node.SensorNode <em>Sensor Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Node</em>'.
	 * @see org.nader.sennet.node.SensorNode
	 * @generated
	 */
	EClass getSensorNode();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.node.ClusterHeadNode <em>Cluster Head Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Head Node</em>'.
	 * @see org.nader.sennet.node.ClusterHeadNode
	 * @generated
	 */
	EClass getClusterHeadNode();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.node.SinkNode <em>Sink Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Node</em>'.
	 * @see org.nader.sennet.node.SinkNode
	 * @generated
	 */
	EClass getSinkNode();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.node.ComputationNode <em>Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computation Node</em>'.
	 * @see org.nader.sennet.node.ComputationNode
	 * @generated
	 */
	EClass getComputationNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NodeFactory getNodeFactory();

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
		 * The meta object literal for the '{@link org.nader.sennet.node.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.node.impl.AbstractNodeImpl
		 * @see org.nader.sennet.node.impl.NodePackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__POSITION = eINSTANCE.getAbstractNode_Position();

		/**
		 * The meta object literal for the '<em><b>Node Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__NODE_RESOURCES = eINSTANCE.getAbstractNode_NodeResources();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.node.impl.AbstractFlatNodeImpl <em>Abstract Flat Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.node.impl.AbstractFlatNodeImpl
		 * @see org.nader.sennet.node.impl.NodePackageImpl#getAbstractFlatNode()
		 * @generated
		 */
		EClass ABSTRACT_FLAT_NODE = eINSTANCE.getAbstractFlatNode();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.node.impl.AbstractClusterNodeImpl <em>Abstract Cluster Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.node.impl.AbstractClusterNodeImpl
		 * @see org.nader.sennet.node.impl.NodePackageImpl#getAbstractClusterNode()
		 * @generated
		 */
		EClass ABSTRACT_CLUSTER_NODE = eINSTANCE.getAbstractClusterNode();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.node.impl.SensorNodeImpl <em>Sensor Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.node.impl.SensorNodeImpl
		 * @see org.nader.sennet.node.impl.NodePackageImpl#getSensorNode()
		 * @generated
		 */
		EClass SENSOR_NODE = eINSTANCE.getSensorNode();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.node.impl.ClusterHeadNodeImpl <em>Cluster Head Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.node.impl.ClusterHeadNodeImpl
		 * @see org.nader.sennet.node.impl.NodePackageImpl#getClusterHeadNode()
		 * @generated
		 */
		EClass CLUSTER_HEAD_NODE = eINSTANCE.getClusterHeadNode();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.node.impl.SinkNodeImpl <em>Sink Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.node.impl.SinkNodeImpl
		 * @see org.nader.sennet.node.impl.NodePackageImpl#getSinkNode()
		 * @generated
		 */
		EClass SINK_NODE = eINSTANCE.getSinkNode();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.node.impl.ComputationNodeImpl <em>Computation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.node.impl.ComputationNodeImpl
		 * @see org.nader.sennet.node.impl.NodePackageImpl#getComputationNode()
		 * @generated
		 */
		EClass COMPUTATION_NODE = eINSTANCE.getComputationNode();

	}

} //NodePackage
