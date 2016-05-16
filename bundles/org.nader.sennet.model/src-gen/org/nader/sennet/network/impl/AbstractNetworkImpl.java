/**
 */
package org.nader.sennet.network.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nader.sennet.enums.InterNodeComm;
import org.nader.sennet.enums.RoutingProtocol;
import org.nader.sennet.network.AbstractNetwork;
import org.nader.sennet.network.NetworkPackage;
import org.nader.sennet.node.SinkNode;
import org.nader.sennet.port.AbstractPort;
import org.nader.sennet.sensor.AbstractSensor;
import org.nader.sennet.toplevelstructure.impl.IdentifiableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nader.sennet.network.impl.AbstractNetworkImpl#getNbOfNodes <em>Nb Of Nodes</em>}</li>
 *   <li>{@link org.nader.sennet.network.impl.AbstractNetworkImpl#getInterNodeComm <em>Inter Node Comm</em>}</li>
 *   <li>{@link org.nader.sennet.network.impl.AbstractNetworkImpl#getRoutingProtocol <em>Routing Protocol</em>}</li>
 *   <li>{@link org.nader.sennet.network.impl.AbstractNetworkImpl#getSink <em>Sink</em>}</li>
 *   <li>{@link org.nader.sennet.network.impl.AbstractNetworkImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link org.nader.sennet.network.impl.AbstractNetworkImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractNetworkImpl extends IdentifiableImpl implements AbstractNetwork {
	/**
	 * The default value of the '{@link #getNbOfNodes() <em>Nb Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OF_NODES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbOfNodes() <em>Nb Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfNodes()
	 * @generated
	 * @ordered
	 */
	protected int nbOfNodes = NB_OF_NODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterNodeComm() <em>Inter Node Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterNodeComm()
	 * @generated
	 * @ordered
	 */
	protected static final InterNodeComm INTER_NODE_COMM_EDEFAULT = InterNodeComm.BT;

	/**
	 * The cached value of the '{@link #getInterNodeComm() <em>Inter Node Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterNodeComm()
	 * @generated
	 * @ordered
	 */
	protected InterNodeComm interNodeComm = INTER_NODE_COMM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingProtocol() <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final RoutingProtocol ROUTING_PROTOCOL_EDEFAULT = RoutingProtocol.LEACH;

	/**
	 * The cached value of the '{@link #getRoutingProtocol() <em>Routing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingProtocol()
	 * @generated
	 * @ordered
	 */
	protected RoutingProtocol routingProtocol = ROUTING_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSink() <em>Sink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSink()
	 * @generated
	 * @ordered
	 */
	protected SinkNode sink;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSensor> sensors;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPort> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.ABSTRACT_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbOfNodes() {
		return nbOfNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOfNodes(int newNbOfNodes) {
		int oldNbOfNodes = nbOfNodes;
		nbOfNodes = newNbOfNodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ABSTRACT_NETWORK__NB_OF_NODES, oldNbOfNodes, nbOfNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterNodeComm getInterNodeComm() {
		return interNodeComm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterNodeComm(InterNodeComm newInterNodeComm) {
		InterNodeComm oldInterNodeComm = interNodeComm;
		interNodeComm = newInterNodeComm == null ? INTER_NODE_COMM_EDEFAULT : newInterNodeComm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ABSTRACT_NETWORK__INTER_NODE_COMM, oldInterNodeComm, interNodeComm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingProtocol getRoutingProtocol() {
		return routingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingProtocol(RoutingProtocol newRoutingProtocol) {
		RoutingProtocol oldRoutingProtocol = routingProtocol;
		routingProtocol = newRoutingProtocol == null ? ROUTING_PROTOCOL_EDEFAULT : newRoutingProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL, oldRoutingProtocol, routingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkNode getSink() {
		if (sink != null && sink.eIsProxy()) {
			InternalEObject oldSink = (InternalEObject)sink;
			sink = (SinkNode)eResolveProxy(oldSink);
			if (sink != oldSink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.ABSTRACT_NETWORK__SINK, oldSink, sink));
			}
		}
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkNode basicGetSink() {
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSink(SinkNode newSink) {
		SinkNode oldSink = sink;
		sink = newSink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.ABSTRACT_NETWORK__SINK, oldSink, sink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentEList<AbstractSensor>(AbstractSensor.class, this, NetworkPackage.ABSTRACT_NETWORK__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<AbstractPort>(AbstractPort.class, this, NetworkPackage.ABSTRACT_NETWORK__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkPackage.ABSTRACT_NETWORK__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
			case NetworkPackage.ABSTRACT_NETWORK__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkPackage.ABSTRACT_NETWORK__NB_OF_NODES:
				return getNbOfNodes();
			case NetworkPackage.ABSTRACT_NETWORK__INTER_NODE_COMM:
				return getInterNodeComm();
			case NetworkPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL:
				return getRoutingProtocol();
			case NetworkPackage.ABSTRACT_NETWORK__SINK:
				if (resolve) return getSink();
				return basicGetSink();
			case NetworkPackage.ABSTRACT_NETWORK__SENSORS:
				return getSensors();
			case NetworkPackage.ABSTRACT_NETWORK__PORTS:
				return getPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NetworkPackage.ABSTRACT_NETWORK__NB_OF_NODES:
				setNbOfNodes((Integer)newValue);
				return;
			case NetworkPackage.ABSTRACT_NETWORK__INTER_NODE_COMM:
				setInterNodeComm((InterNodeComm)newValue);
				return;
			case NetworkPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL:
				setRoutingProtocol((RoutingProtocol)newValue);
				return;
			case NetworkPackage.ABSTRACT_NETWORK__SINK:
				setSink((SinkNode)newValue);
				return;
			case NetworkPackage.ABSTRACT_NETWORK__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends AbstractSensor>)newValue);
				return;
			case NetworkPackage.ABSTRACT_NETWORK__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends AbstractPort>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NetworkPackage.ABSTRACT_NETWORK__NB_OF_NODES:
				setNbOfNodes(NB_OF_NODES_EDEFAULT);
				return;
			case NetworkPackage.ABSTRACT_NETWORK__INTER_NODE_COMM:
				setInterNodeComm(INTER_NODE_COMM_EDEFAULT);
				return;
			case NetworkPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL:
				setRoutingProtocol(ROUTING_PROTOCOL_EDEFAULT);
				return;
			case NetworkPackage.ABSTRACT_NETWORK__SINK:
				setSink((SinkNode)null);
				return;
			case NetworkPackage.ABSTRACT_NETWORK__SENSORS:
				getSensors().clear();
				return;
			case NetworkPackage.ABSTRACT_NETWORK__PORTS:
				getPorts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NetworkPackage.ABSTRACT_NETWORK__NB_OF_NODES:
				return nbOfNodes != NB_OF_NODES_EDEFAULT;
			case NetworkPackage.ABSTRACT_NETWORK__INTER_NODE_COMM:
				return interNodeComm != INTER_NODE_COMM_EDEFAULT;
			case NetworkPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL:
				return routingProtocol != ROUTING_PROTOCOL_EDEFAULT;
			case NetworkPackage.ABSTRACT_NETWORK__SINK:
				return sink != null;
			case NetworkPackage.ABSTRACT_NETWORK__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case NetworkPackage.ABSTRACT_NETWORK__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nbOfNodes: ");
		result.append(nbOfNodes);
		result.append(", interNodeComm: ");
		result.append(interNodeComm);
		result.append(", routingProtocol: ");
		result.append(routingProtocol);
		result.append(')');
		return result.toString();
	}

} //AbstractNetworkImpl
