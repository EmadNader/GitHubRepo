/**
 */
package org.nader.sennet.job.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nader.sennet.job.JobPackage;
import org.nader.sennet.job.RegularSenseJob;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Sense Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nader.sennet.job.impl.RegularSenseJobImpl#getSensingThreshold <em>Sensing Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularSenseJobImpl extends AbstractJobImpl implements RegularSenseJob {
	/**
	 * The default value of the '{@link #getSensingThreshold() <em>Sensing Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final long SENSING_THRESHOLD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSensingThreshold() <em>Sensing Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingThreshold()
	 * @generated
	 * @ordered
	 */
	protected long sensingThreshold = SENSING_THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularSenseJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.REGULAR_SENSE_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSensingThreshold() {
		return sensingThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensingThreshold(long newSensingThreshold) {
		long oldSensingThreshold = sensingThreshold;
		sensingThreshold = newSensingThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.REGULAR_SENSE_JOB__SENSING_THRESHOLD, oldSensingThreshold, sensingThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobPackage.REGULAR_SENSE_JOB__SENSING_THRESHOLD:
				return getSensingThreshold();
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
			case JobPackage.REGULAR_SENSE_JOB__SENSING_THRESHOLD:
				setSensingThreshold((Long)newValue);
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
			case JobPackage.REGULAR_SENSE_JOB__SENSING_THRESHOLD:
				setSensingThreshold(SENSING_THRESHOLD_EDEFAULT);
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
			case JobPackage.REGULAR_SENSE_JOB__SENSING_THRESHOLD:
				return sensingThreshold != SENSING_THRESHOLD_EDEFAULT;
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
		result.append(" (sensingThreshold: ");
		result.append(sensingThreshold);
		result.append(')');
		return result.toString();
	}

} //RegularSenseJobImpl
