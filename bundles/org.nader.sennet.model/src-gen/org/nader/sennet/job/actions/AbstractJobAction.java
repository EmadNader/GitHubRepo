/**
 */
package org.nader.sennet.job.actions;

import org.eclipse.emf.ecore.EObject;

import org.nader.sennet.node.SinkNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Job Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.actions.AbstractJobAction#getSinkNode <em>Sink Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.actions.ActionsPackage#getAbstractJobAction()
 * @model abstract="true"
 * @generated
 */
public interface AbstractJobAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink Node</em>' reference.
	 * @see #setSinkNode(SinkNode)
	 * @see org.nader.sennet.job.actions.ActionsPackage#getAbstractJobAction_SinkNode()
	 * @model
	 * @generated
	 */
	SinkNode getSinkNode();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.actions.AbstractJobAction#getSinkNode <em>Sink Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink Node</em>' reference.
	 * @see #getSinkNode()
	 * @generated
	 */
	void setSinkNode(SinkNode value);

} // AbstractJobAction
