/**
 */
package org.nader.sennet.job.actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nader.sennet.enums.Fusion;

import org.nader.sennet.job.actions.ActionsPackage;
import org.nader.sennet.job.actions.FusionAction;

import org.nader.sennet.node.ClusterHeadNode;
import org.nader.sennet.node.ComputationNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fusion Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nader.sennet.job.actions.impl.FusionActionImpl#getFusion <em>Fusion</em>}</li>
 *   <li>{@link org.nader.sennet.job.actions.impl.FusionActionImpl#getCompuNode <em>Compu Node</em>}</li>
 *   <li>{@link org.nader.sennet.job.actions.impl.FusionActionImpl#getClusterHead <em>Cluster Head</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FusionActionImpl extends AbstractJobActionImpl implements FusionAction {
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
	 * The cached value of the '{@link #getCompuNode() <em>Compu Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompuNode()
	 * @generated
	 * @ordered
	 */
	protected ComputationNode compuNode;

	/**
	 * The cached value of the '{@link #getClusterHead() <em>Cluster Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterHead()
	 * @generated
	 * @ordered
	 */
	protected ClusterHeadNode clusterHead;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FusionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.FUSION_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.FUSION_ACTION__FUSION, oldFusion, fusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationNode getCompuNode() {
		if (compuNode != null && compuNode.eIsProxy()) {
			InternalEObject oldCompuNode = (InternalEObject)compuNode;
			compuNode = (ComputationNode)eResolveProxy(oldCompuNode);
			if (compuNode != oldCompuNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.FUSION_ACTION__COMPU_NODE, oldCompuNode, compuNode));
			}
		}
		return compuNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationNode basicGetCompuNode() {
		return compuNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompuNode(ComputationNode newCompuNode) {
		ComputationNode oldCompuNode = compuNode;
		compuNode = newCompuNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.FUSION_ACTION__COMPU_NODE, oldCompuNode, compuNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterHeadNode getClusterHead() {
		if (clusterHead != null && clusterHead.eIsProxy()) {
			InternalEObject oldClusterHead = (InternalEObject)clusterHead;
			clusterHead = (ClusterHeadNode)eResolveProxy(oldClusterHead);
			if (clusterHead != oldClusterHead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.FUSION_ACTION__CLUSTER_HEAD, oldClusterHead, clusterHead));
			}
		}
		return clusterHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterHeadNode basicGetClusterHead() {
		return clusterHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClusterHead(ClusterHeadNode newClusterHead) {
		ClusterHeadNode oldClusterHead = clusterHead;
		clusterHead = newClusterHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.FUSION_ACTION__CLUSTER_HEAD, oldClusterHead, clusterHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionsPackage.FUSION_ACTION__FUSION:
				return getFusion();
			case ActionsPackage.FUSION_ACTION__COMPU_NODE:
				if (resolve) return getCompuNode();
				return basicGetCompuNode();
			case ActionsPackage.FUSION_ACTION__CLUSTER_HEAD:
				if (resolve) return getClusterHead();
				return basicGetClusterHead();
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
			case ActionsPackage.FUSION_ACTION__FUSION:
				setFusion((Fusion)newValue);
				return;
			case ActionsPackage.FUSION_ACTION__COMPU_NODE:
				setCompuNode((ComputationNode)newValue);
				return;
			case ActionsPackage.FUSION_ACTION__CLUSTER_HEAD:
				setClusterHead((ClusterHeadNode)newValue);
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
			case ActionsPackage.FUSION_ACTION__FUSION:
				setFusion(FUSION_EDEFAULT);
				return;
			case ActionsPackage.FUSION_ACTION__COMPU_NODE:
				setCompuNode((ComputationNode)null);
				return;
			case ActionsPackage.FUSION_ACTION__CLUSTER_HEAD:
				setClusterHead((ClusterHeadNode)null);
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
			case ActionsPackage.FUSION_ACTION__FUSION:
				return fusion != FUSION_EDEFAULT;
			case ActionsPackage.FUSION_ACTION__COMPU_NODE:
				return compuNode != null;
			case ActionsPackage.FUSION_ACTION__CLUSTER_HEAD:
				return clusterHead != null;
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

} //FusionActionImpl
