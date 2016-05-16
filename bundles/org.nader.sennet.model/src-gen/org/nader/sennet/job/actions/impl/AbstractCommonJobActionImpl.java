/**
 */
package org.nader.sennet.job.actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nader.sennet.job.actions.AbstractCommonJobAction;
import org.nader.sennet.job.actions.ActionsPackage;

import org.nader.sennet.node.AbstractNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Common Job Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nader.sennet.job.actions.impl.AbstractCommonJobActionImpl#getTargetNode <em>Target Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCommonJobActionImpl extends AbstractJobActionImpl implements AbstractCommonJobAction {
	/**
	 * The cached value of the '{@link #getTargetNode() <em>Target Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNode()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode targetNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCommonJobActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ABSTRACT_COMMON_JOB_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getTargetNode() {
		if (targetNode != null && targetNode.eIsProxy()) {
			InternalEObject oldTargetNode = (InternalEObject)targetNode;
			targetNode = (AbstractNode)eResolveProxy(oldTargetNode);
			if (targetNode != oldTargetNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE, oldTargetNode, targetNode));
			}
		}
		return targetNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetTargetNode() {
		return targetNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNode(AbstractNode newTargetNode) {
		AbstractNode oldTargetNode = targetNode;
		targetNode = newTargetNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE, oldTargetNode, targetNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionsPackage.ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE:
				if (resolve) return getTargetNode();
				return basicGetTargetNode();
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
			case ActionsPackage.ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE:
				setTargetNode((AbstractNode)newValue);
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
			case ActionsPackage.ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE:
				setTargetNode((AbstractNode)null);
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
			case ActionsPackage.ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE:
				return targetNode != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractCommonJobActionImpl
