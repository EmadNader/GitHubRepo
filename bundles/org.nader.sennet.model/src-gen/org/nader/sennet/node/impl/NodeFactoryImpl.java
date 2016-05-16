/**
 */
package org.nader.sennet.node.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nader.sennet.node.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeFactoryImpl extends EFactoryImpl implements NodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodeFactory init() {
		try {
			NodeFactory theNodeFactory = (NodeFactory)EPackage.Registry.INSTANCE.getEFactory(NodePackage.eNS_URI);
			if (theNodeFactory != null) {
				return theNodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NodePackage.SENSOR_NODE: return createSensorNode();
			case NodePackage.CLUSTER_HEAD_NODE: return createClusterHeadNode();
			case NodePackage.SINK_NODE: return createSinkNode();
			case NodePackage.COMPUTATION_NODE: return createComputationNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorNode createSensorNode() {
		SensorNodeImpl sensorNode = new SensorNodeImpl();
		return sensorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterHeadNode createClusterHeadNode() {
		ClusterHeadNodeImpl clusterHeadNode = new ClusterHeadNodeImpl();
		return clusterHeadNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkNode createSinkNode() {
		SinkNodeImpl sinkNode = new SinkNodeImpl();
		return sinkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationNode createComputationNode() {
		ComputationNodeImpl computationNode = new ComputationNodeImpl();
		return computationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodePackage getNodePackage() {
		return (NodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NodePackage getPackage() {
		return NodePackage.eINSTANCE;
	}

} //NodeFactoryImpl
