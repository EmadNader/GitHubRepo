/**
 */
package org.nader.sennet.network;

import org.eclipse.emf.common.util.EList;

import org.nader.sennet.node.AbstractClusterNode;
import org.nader.sennet.node.ClusterHeadNode;

import org.nader.sennet.toplevelstructure.AbstractResource;
import org.nader.sennet.toplevelstructure.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.network.Cluster#getHead <em>Head</em>}</li>
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
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(ClusterHeadNode)
	 * @see org.nader.sennet.network.NetworkPackage#getCluster_Head()
	 * @model containment="true"
	 * @generated
	 */
	ClusterHeadNode getHead();

	/**
	 * Sets the value of the '{@link org.nader.sennet.network.Cluster#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(ClusterHeadNode value);

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
	 * The list contents are of type {@link org.nader.sennet.toplevelstructure.AbstractResource}.
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
	EList<AbstractResource> getResources();

} // Cluster
