/**
 */
package org.nader.sennet.job.jobaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nader.sennet.job.jobaction.JobactionPackage;
import org.nader.sennet.job.jobaction.SendMessageAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Message Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nader.sennet.job.jobaction.impl.SendMessageActionImpl#getSendMessageTo <em>Send Message To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendMessageActionImpl extends AbstractResponceActionImpl implements SendMessageAction {
	/**
	 * The default value of the '{@link #getSendMessageTo() <em>Send Message To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendMessageTo()
	 * @generated
	 * @ordered
	 */
	protected static final int SEND_MESSAGE_TO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSendMessageTo() <em>Send Message To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendMessageTo()
	 * @generated
	 * @ordered
	 */
	protected int sendMessageTo = SEND_MESSAGE_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMessageActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobactionPackage.Literals.SEND_MESSAGE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSendMessageTo() {
		return sendMessageTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendMessageTo(int newSendMessageTo) {
		int oldSendMessageTo = sendMessageTo;
		sendMessageTo = newSendMessageTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobactionPackage.SEND_MESSAGE_ACTION__SEND_MESSAGE_TO, oldSendMessageTo, sendMessageTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobactionPackage.SEND_MESSAGE_ACTION__SEND_MESSAGE_TO:
				return getSendMessageTo();
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
			case JobactionPackage.SEND_MESSAGE_ACTION__SEND_MESSAGE_TO:
				setSendMessageTo((Integer)newValue);
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
			case JobactionPackage.SEND_MESSAGE_ACTION__SEND_MESSAGE_TO:
				setSendMessageTo(SEND_MESSAGE_TO_EDEFAULT);
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
			case JobactionPackage.SEND_MESSAGE_ACTION__SEND_MESSAGE_TO:
				return sendMessageTo != SEND_MESSAGE_TO_EDEFAULT;
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
		result.append(" (sendMessageTo: ");
		result.append(sendMessageTo);
		result.append(')');
		return result.toString();
	}

} //SendMessageActionImpl
