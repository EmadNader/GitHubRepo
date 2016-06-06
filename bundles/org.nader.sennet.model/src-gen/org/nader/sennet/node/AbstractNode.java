/**
 */
package org.nader.sennet.node;

import org.eclipse.emf.common.util.EList;

import org.nader.sennet.enums.Position;

import org.nader.sennet.sensors.AbstractSensor;

import org.nader.sennet.toplevelstructure.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.node.AbstractNode#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nader.sennet.node.AbstractNode#getNodeResources <em>Node Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.node.NodePackage#getAbstractNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNode extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nader.sennet.enums.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see org.nader.sennet.enums.Position
	 * @see #setPosition(Position)
	 * @see org.nader.sennet.node.NodePackage#getAbstractNode_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link org.nader.sennet.node.AbstractNode#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.nader.sennet.enums.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Node Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nader.sennet.sensors.AbstractSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Resources</em>' containment reference list.
	 * @see org.nader.sennet.node.NodePackage#getAbstractNode_NodeResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractSensor> getNodeResources();

} // AbstractNode
