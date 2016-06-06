/**
 */
package org.nader.sennet.job;

import org.eclipse.emf.common.util.EList;

import org.nader.sennet.job.jobaction.AbstratAction;

import org.nader.sennet.job.jobtrigger.AbstractStartEndingJobTrigger;

import org.nader.sennet.network.AbstractNetwork;

import org.nader.sennet.node.AbstractNode;

import org.nader.sennet.toplevelstructure.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.AbstractJob#getJobTargetNode <em>Job Target Node</em>}</li>
 *   <li>{@link org.nader.sennet.job.AbstractJob#getJobTargetNetwork <em>Job Target Network</em>}</li>
 *   <li>{@link org.nader.sennet.job.AbstractJob#getStartEndTrigger <em>Start End Trigger</em>}</li>
 *   <li>{@link org.nader.sennet.job.AbstractJob#getJobaction <em>Jobaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.JobPackage#getAbstractJob()
 * @model abstract="true"
 * @generated
 */
public interface AbstractJob extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Target Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Target Node</em>' containment reference.
	 * @see #setJobTargetNode(AbstractNode)
	 * @see org.nader.sennet.job.JobPackage#getAbstractJob_JobTargetNode()
	 * @model containment="true"
	 * @generated
	 */
	AbstractNode getJobTargetNode();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.AbstractJob#getJobTargetNode <em>Job Target Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Target Node</em>' containment reference.
	 * @see #getJobTargetNode()
	 * @generated
	 */
	void setJobTargetNode(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Target Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Target Network</em>' containment reference.
	 * @see #setJobTargetNetwork(AbstractNetwork)
	 * @see org.nader.sennet.job.JobPackage#getAbstractJob_JobTargetNetwork()
	 * @model containment="true"
	 * @generated
	 */
	AbstractNetwork getJobTargetNetwork();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.AbstractJob#getJobTargetNetwork <em>Job Target Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Target Network</em>' containment reference.
	 * @see #getJobTargetNetwork()
	 * @generated
	 */
	void setJobTargetNetwork(AbstractNetwork value);

	/**
	 * Returns the value of the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.nader.sennet.job.jobtrigger.AbstractStartEndingJobTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start End Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start End Trigger</em>' containment reference list.
	 * @see org.nader.sennet.job.JobPackage#getAbstractJob_StartEndTrigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractStartEndingJobTrigger> getStartEndTrigger();

	/**
	 * Returns the value of the '<em><b>Jobaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.nader.sennet.job.jobaction.AbstratAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobaction</em>' containment reference list.
	 * @see org.nader.sennet.job.JobPackage#getAbstractJob_Jobaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstratAction> getJobaction();

} // AbstractJob
