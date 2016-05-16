/**
 */
package org.nader.sennet.job.actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nader.sennet.job.actions.ActionsPackage;
import org.nader.sennet.job.actions.ReceiveMessageAction;

import org.nader.sennet.port.InPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Message Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nader.sennet.job.actions.impl.ReceiveMessageActionImpl#getInPort <em>In Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveMessageActionImpl extends AbstractMessageActionImpl implements ReceiveMessageAction {
	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected InPort inPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveMessageActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.RECEIVE_MESSAGE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort getInPort() {
		if (inPort != null && inPort.eIsProxy()) {
			InternalEObject oldInPort = (InternalEObject)inPort;
			inPort = (InPort)eResolveProxy(oldInPort);
			if (inPort != oldInPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.RECEIVE_MESSAGE_ACTION__IN_PORT, oldInPort, inPort));
			}
		}
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort basicGetInPort() {
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPort(InPort newInPort) {
		InPort oldInPort = inPort;
		inPort = newInPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.RECEIVE_MESSAGE_ACTION__IN_PORT, oldInPort, inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionsPackage.RECEIVE_MESSAGE_ACTION__IN_PORT:
				if (resolve) return getInPort();
				return basicGetInPort();
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
			case ActionsPackage.RECEIVE_MESSAGE_ACTION__IN_PORT:
				setInPort((InPort)newValue);
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
			case ActionsPackage.RECEIVE_MESSAGE_ACTION__IN_PORT:
				setInPort((InPort)null);
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
			case ActionsPackage.RECEIVE_MESSAGE_ACTION__IN_PORT:
				return inPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ReceiveMessageActionImpl
