/**
 */
package org.nader.sennet.job.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nader.sennet.LogicalCondition;

import org.nader.sennet.job.EventDrivenJob;
import org.nader.sennet.job.JobPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Driven Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nader.sennet.job.impl.EventDrivenJobImpl#getEventCondition <em>Event Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventDrivenJobImpl extends AbstractJobImpl implements EventDrivenJob {
	/**
	 * The cached value of the '{@link #getEventCondition() <em>Event Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCondition()
	 * @generated
	 * @ordered
	 */
	protected LogicalCondition eventCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventDrivenJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.EVENT_DRIVEN_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCondition getEventCondition() {
		return eventCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventCondition(LogicalCondition newEventCondition, NotificationChain msgs) {
		LogicalCondition oldEventCondition = eventCondition;
		eventCondition = newEventCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobPackage.EVENT_DRIVEN_JOB__EVENT_CONDITION, oldEventCondition, newEventCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventCondition(LogicalCondition newEventCondition) {
		if (newEventCondition != eventCondition) {
			NotificationChain msgs = null;
			if (eventCondition != null)
				msgs = ((InternalEObject)eventCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobPackage.EVENT_DRIVEN_JOB__EVENT_CONDITION, null, msgs);
			if (newEventCondition != null)
				msgs = ((InternalEObject)newEventCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JobPackage.EVENT_DRIVEN_JOB__EVENT_CONDITION, null, msgs);
			msgs = basicSetEventCondition(newEventCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.EVENT_DRIVEN_JOB__EVENT_CONDITION, newEventCondition, newEventCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.EVENT_DRIVEN_JOB__EVENT_CONDITION:
				return basicSetEventCondition(null, msgs);
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
			case JobPackage.EVENT_DRIVEN_JOB__EVENT_CONDITION:
				return getEventCondition();
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
			case JobPackage.EVENT_DRIVEN_JOB__EVENT_CONDITION:
				setEventCondition((LogicalCondition)newValue);
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
			case JobPackage.EVENT_DRIVEN_JOB__EVENT_CONDITION:
				setEventCondition((LogicalCondition)null);
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
			case JobPackage.EVENT_DRIVEN_JOB__EVENT_CONDITION:
				return eventCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //EventDrivenJobImpl
