/**
 */
package org.nader.sennet.network;

import org.eclipse.emf.common.util.EList;

import org.nader.sennet.node.AbstractClusterNode;

import org.nader.sennet.sensors.AbstractSensor;

import org.nader.sennet.toplevelstructure.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.network.Cluster#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.nader.sennet.network.Cluster#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.network.NetworkPackage#getCluster()
 * @model
 * @generated
 */
public interface Cluster extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nader.sennet.node.AbstractClusterNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.nader.sennet.network.NetworkPackage#getCluster_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractClusterNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nader.sennet.sensors.AbstractSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nader.sennet.network.NetworkPackage#getCluster_Resources()
	 * @model
	 * @generated
	 */
	EList<AbstractSensor> getResources();

} // Cluster
