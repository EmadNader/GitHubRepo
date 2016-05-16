/**
 */
package org.nader.sennet.job.actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nader.sennet.job.actions.AbstractJobAction;
import org.nader.sennet.job.actions.ActionsPackage;

import org.nader.sennet.node.SinkNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Job Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nader.sennet.job.actions.impl.AbstractJobActionImpl#getSinkNode <em>Sink Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractJobActionImpl extends MinimalEObjectImpl.Container implements AbstractJobAction {
	/**
	 * The cached value of the '{@link #getSinkNode() <em>Sink Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinkNode()
	 * @generated
	 * @ordered
	 */
	protected SinkNode sinkNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractJobActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ABSTRACT_JOB_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkNode getSinkNode() {
		if (sinkNode != null && sinkNode.eIsProxy()) {
			InternalEObject oldSinkNode = (InternalEObject)sinkNode;
			sinkNode = (SinkNode)eResolveProxy(oldSinkNode);
			if (sinkNode != oldSinkNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.ABSTRACT_JOB_ACTION__SINK_NODE, oldSinkNode, sinkNode));
			}
		}
		return sinkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkNode basicGetSinkNode() {
		return sinkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinkNode(SinkNode newSinkNode) {
		SinkNode oldSinkNode = sinkNode;
		sinkNode = newSinkNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ABSTRACT_JOB_ACTION__SINK_NODE, oldSinkNode, sinkNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionsPackage.ABSTRACT_JOB_ACTION__SINK_NODE:
				if (resolve) return getSinkNode();
				return basicGetSinkNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActionsPackage.ABSTRACT_JOB_ACTION__SINK_NODE:
				setSinkNode((SinkNode)newValue);
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
			case ActionsPackage.ABSTRACT_JOB_ACTION__SINK_NODE:
				setSinkNode((SinkNode)null);
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
			case ActionsPackage.ABSTRACT_JOB_ACTION__SINK_NODE:
				return sinkNode != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractJobActionImpl
