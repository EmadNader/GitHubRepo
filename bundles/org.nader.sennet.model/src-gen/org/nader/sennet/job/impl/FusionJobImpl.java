/**
 */
package org.nader.sennet.job.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nader.sennet.enums.Fusion;

import org.nader.sennet.job.FusionJob;
import org.nader.sennet.job.JobPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fusion Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nader.sennet.job.impl.FusionJobImpl#getFusion <em>Fusion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FusionJobImpl extends AbstractJobImpl implements FusionJob {
	/**
	 * The default value of the '{@link #getFusion() <em>Fusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFusion()
	 * @generated
	 * @ordered
	 */
	protected static final Fusion FUSION_EDEFAULT = Fusion.CLASSIFICATION;

	/**
	 * The cached value of the '{@link #getFusion() <em>Fusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFusion()
	 * @generated
	 * @ordered
	 */
	protected Fusion fusion = FUSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FusionJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.FUSION_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fusion getFusion() {
		return fusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFusion(Fusion newFusion) {
		Fusion oldFusion = fusion;
		fusion = newFusion == null ? FUSION_EDEFAULT : newFusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.FUSION_JOB__FUSION, oldFusion, fusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobPackage.FUSION_JOB__FUSION:
				return getFusion();
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
			case JobPackage.FUSION_JOB__FUSION:
				setFusion((Fusion)newValue);
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
			case JobPackage.FUSION_JOB__FUSION:
				setFusion(FUSION_EDEFAULT);
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
			case JobPackage.FUSION_JOB__FUSION:
				return fusion != FUSION_EDEFAULT;
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
		result.append(" (fusion: ");
		result.append(fusion);
		result.append(')');
		return result.toString();
	}

} //FusionJobImpl
