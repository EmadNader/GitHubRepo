/**
 */
package org.nader.sennet.node.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nader.sennet.node.*;

import org.nader.sennet.toplevelstructure.Identifiable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.node.NodePackage
 * @generated
 */
public class NodeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NodePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSwitch() {
		if (modelPackage == null) {
			modelPackage = NodePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NodePackage.ABSTRACT_NODE: {
				AbstractNode abstractNode = (AbstractNode)theEObject;
				T result = caseAbstractNode(abstractNode);
				if (result == null) result = caseIdentifiable(abstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NodePackage.ABSTRACT_FLAT_NODE: {
				AbstractFlatNode abstractFlatNode = (AbstractFlatNode)theEObject;
				T result = caseAbstractFlatNode(abstractFlatNode);
				if (result == null) result = caseAbstractNode(abstractFlatNode);
				if (result == null) result = caseIdentifiable(abstractFlatNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NodePackage.ABSTRACT_CLUSTER_NODE: {
				AbstractClusterNode abstractClusterNode = (AbstractClusterNode)theEObject;
				T result = caseAbstractClusterNode(abstractClusterNode);
				if (result == null) result = caseAbstractNode(abstractClusterNode);
				if (result == null) result = caseIdentifiable(abstractClusterNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NodePackage.SENSOR_NODE: {
				SensorNode sensorNode = (SensorNode)theEObject;
				T result = caseSensorNode(sensorNode);
				if (result == null) result = caseAbstractClusterNode(sensorNode);
				if (result == null) result = caseAbstractFlatNode(sensorNode);
				if (result == null) result = caseAbstractNode(sensorNode);
				if (result == null) result = caseIdentifiable(sensorNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NodePackage.CLUSTER_HEAD_NODE: {
				ClusterHeadNode clusterHeadNode = (ClusterHeadNode)theEObject;
				T result = caseClusterHeadNode(clusterHeadNode);
				if (result == null) result = caseAbstractClusterNode(clusterHeadNode);
				if (result == null) result = caseAbstractNode(clusterHeadNode);
				if (result == null) result = caseIdentifiable(clusterHeadNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NodePackage.SINK_NODE: {
				SinkNode sinkNode = (SinkNode)theEObject;
				T result = caseSinkNode(sinkNode);
				if (result == null) result = caseAbstractNode(sinkNode);
				if (result == null) result = caseIdentifiable(sinkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NodePackage.COMPUTATION_NODE: {
				ComputationNode computationNode = (ComputationNode)theEObject;
				T result = caseComputationNode(computationNode);
				if (result == null) result = caseAbstractFlatNode(computationNode);
				if (result == null) result = caseAbstractNode(computationNode);
				if (result == null) result = caseIdentifiable(computationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNode(AbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Flat Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Flat Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFlatNode(AbstractFlatNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Cluster Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Cluster Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractClusterNode(AbstractClusterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorNode(SensorNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Head Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Head Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusterHeadNode(ClusterHeadNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkNode(SinkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputationNode(ComputationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NodeSwitch
