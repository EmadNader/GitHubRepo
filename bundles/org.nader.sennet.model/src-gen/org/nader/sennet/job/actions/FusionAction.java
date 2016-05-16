/**
 */
package org.nader.sennet.job.actions;

import org.nader.sennet.enums.Fusion;

import org.nader.sennet.node.ClusterHeadNode;
import org.nader.sennet.node.ComputationNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fusion Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.actions.FusionAction#getFusion <em>Fusion</em>}</li>
 *   <li>{@link org.nader.sennet.job.actions.FusionAction#getCompuNode <em>Compu Node</em>}</li>
 *   <li>{@link org.nader.sennet.job.actions.FusionAction#getClusterHead <em>Cluster Head</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.actions.ActionsPackage#getFusionAction()
 * @model
 * @generated
 */
public interface FusionAction extends AbstractJobAction {
	/**
	 * Returns the value of the '<em><b>Fusion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nader.sennet.enums.Fusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fusion</em>' attribute.
	 * @see org.nader.sennet.enums.Fusion
	 * @see #setFusion(Fusion)
	 * @see org.nader.sennet.job.actions.ActionsPackage#getFusionAction_Fusion()
	 * @model
	 * @generated
	 */
	Fusion getFusion();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.actions.FusionAction#getFusion <em>Fusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fusion</em>' attribute.
	 * @see org.nader.sennet.enums.Fusion
	 * @see #getFusion()
	 * @generated
	 */
	void setFusion(Fusion value);

	/**
	 * Returns the value of the '<em><b>Compu Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compu Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compu Node</em>' reference.
	 * @see #setCompuNode(ComputationNode)
	 * @see org.nader.sennet.job.actions.ActionsPackage#getFusionAction_CompuNode()
	 * @model
	 * @generated
	 */
	ComputationNode getCompuNode();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.actions.FusionAction#getCompuNode <em>Compu Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compu Node</em>' reference.
	 * @see #getCompuNode()
	 * @generated
	 */
	void setCompuNode(ComputationNode value);

	/**
	 * Returns the value of the '<em><b>Cluster Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster Head</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Head</em>' reference.
	 * @see #setClusterHead(ClusterHeadNode)
	 * @see org.nader.sennet.job.actions.ActionsPackage#getFusionAction_ClusterHead()
	 * @model
	 * @generated
	 */
	ClusterHeadNode getClusterHead();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.actions.FusionAction#getClusterHead <em>Cluster Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Head</em>' reference.
	 * @see #getClusterHead()
	 * @generated
	 */
	void setClusterHead(ClusterHeadNode value);

} // FusionAction
