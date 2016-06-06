/**
 */
package org.nader.sennet.network;

import org.eclipse.emf.common.util.EList;

import org.nader.sennet.enums.InterNodeComm;
import org.nader.sennet.enums.RoutingProtocol;

import org.nader.sennet.node.SinkNode;

import org.nader.sennet.sensors.AbstractSensor;

import org.nader.sennet.toplevelstructure.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.network.AbstractNetwork#getNbOfNodes <em>Nb Of Nodes</em>}</li>
 *   <li>{@link org.nader.sennet.network.AbstractNetwork#getInterNodeComm <em>Inter Node Comm</em>}</li>
 *   <li>{@link org.nader.sennet.network.AbstractNetwork#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link org.nader.sennet.network.AbstractNetwork#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nader.sennet.network.AbstractNetwork#getSink <em>Sink</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.network.NetworkPackage#getAbstractNetwork()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNetwork extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Nb Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Of Nodes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Of Nodes</em>' attribute.
	 * @see #setNbOfNodes(int)
	 * @see org.nader.sennet.network.NetworkPackage#getAbstractNetwork_NbOfNodes()
	 * @model
	 * @generated
	 */
	int getNbOfNodes();

	/**
	 * Sets the value of the '{@link org.nader.sennet.network.AbstractNetwork#getNbOfNodes <em>Nb Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Of Nodes</em>' attribute.
	 * @see #getNbOfNodes()
	 * @generated
	 */
	void setNbOfNodes(int value);

	/**
	 * Returns the value of the '<em><b>Inter Node Comm</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nader.sennet.enums.InterNodeComm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Node Comm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Node Comm</em>' attribute.
	 * @see org.nader.sennet.enums.InterNodeComm
	 * @see #setInterNodeComm(InterNodeComm)
	 * @see org.nader.sennet.network.NetworkPackage#getAbstractNetwork_InterNodeComm()
	 * @model
	 * @generated
	 */
	InterNodeComm getInterNodeComm();

	/**
	 * Sets the value of the '{@link org.nader.sennet.network.AbstractNetwork#getInterNodeComm <em>Inter Node Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Node Comm</em>' attribute.
	 * @see org.nader.sennet.enums.InterNodeComm
	 * @see #getInterNodeComm()
	 * @generated
	 */
	void setInterNodeComm(InterNodeComm value);

	/**
	 * Returns the value of the '<em><b>Routing Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nader.sennet.enums.RoutingProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Protocol</em>' attribute.
	 * @see org.nader.sennet.enums.RoutingProtocol
	 * @see #setRoutingProtocol(RoutingProtocol)
	 * @see org.nader.sennet.network.NetworkPackage#getAbstractNetwork_RoutingProtocol()
	 * @model
	 * @generated
	 */
	RoutingProtocol getRoutingProtocol();

	/**
	 * Sets the value of the '{@link org.nader.sennet.network.AbstractNetwork#getRoutingProtocol <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Protocol</em>' attribute.
	 * @see org.nader.sennet.enums.RoutingProtocol
	 * @see #getRoutingProtocol()
	 * @generated
	 */
	void setRoutingProtocol(RoutingProtocol value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nader.sennet.sensors.AbstractSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nader.sennet.network.NetworkPackage#getAbstractNetwork_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractSensor> getResources();

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' containment reference.
	 * @see #setSink(SinkNode)
	 * @see org.nader.sennet.network.NetworkPackage#getAbstractNetwork_Sink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SinkNode getSink();

	/**
	 * Sets the value of the '{@link org.nader.sennet.network.AbstractNetwork#getSink <em>Sink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' containment reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(SinkNode value);

} // AbstractNetwork
