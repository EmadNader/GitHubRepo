/**
 */
package org.nader.sennet.network;

import org.eclipse.emf.common.util.EList;

import org.nader.sennet.node.AbstractFlatNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flat Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.network.FlatNetwork#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.network.NetworkPackage#getFlatNetwork()
 * @model
 * @generated
 */
public interface FlatNetwork extends AbstractNetwork {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nader.sennet.node.AbstractFlatNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.nader.sennet.network.NetworkPackage#getFlatNetwork_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractFlatNode> getNodes();

} // FlatNetwork
