/**
 */
package org.nader.sennet.job.actions;

import org.nader.sennet.node.AbstractNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Common Job Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.actions.AbstractCommonJobAction#getTargetNode <em>Target Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.actions.ActionsPackage#getAbstractCommonJobAction()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCommonJobAction extends AbstractJobAction {
	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Node</em>' reference.
	 * @see #setTargetNode(AbstractNode)
	 * @see org.nader.sennet.job.actions.ActionsPackage#getAbstractCommonJobAction_TargetNode()
	 * @model
	 * @generated
	 */
	AbstractNode getTargetNode();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.actions.AbstractCommonJobAction#getTargetNode <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Node</em>' reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(AbstractNode value);

} // AbstractCommonJobAction
