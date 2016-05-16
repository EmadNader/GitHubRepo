/**
 */
package org.nader.sennet.network;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clustered Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.network.ClusteredNetwork#getClusters <em>Clusters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.network.NetworkPackage#getClusteredNetwork()
 * @model
 * @generated
 */
public interface ClusteredNetwork extends AbstractNetwork {
	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nader.sennet.network.Cluster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clusters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' containment reference list.
	 * @see org.nader.sennet.network.NetworkPackage#getClusteredNetwork_Clusters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cluster> getClusters();

} // ClusteredNetwork
