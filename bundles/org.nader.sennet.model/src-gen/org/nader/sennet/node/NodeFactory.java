/**
 */
package org.nader.sennet.node;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.node.NodePackage
 * @generated
 */
public interface NodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodeFactory eINSTANCE = org.nader.sennet.node.impl.NodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sensor Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Node</em>'.
	 * @generated
	 */
	SensorNode createSensorNode();

	/**
	 * Returns a new object of class '<em>Cluster Head Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Head Node</em>'.
	 * @generated
	 */
	ClusterHeadNode createClusterHeadNode();

	/**
	 * Returns a new object of class '<em>Sink Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink Node</em>'.
	 * @generated
	 */
	SinkNode createSinkNode();

	/**
	 * Returns a new object of class '<em>Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computation Node</em>'.
	 * @generated
	 */
	ComputationNode createComputationNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NodePackage getNodePackage();

} //NodeFactory
