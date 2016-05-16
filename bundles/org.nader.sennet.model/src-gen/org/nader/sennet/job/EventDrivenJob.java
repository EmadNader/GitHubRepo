/**
 */
package org.nader.sennet.job;

import org.nader.sennet.LogicalCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Driven Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.EventDrivenJob#getEventCondition <em>Event Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.JobPackage#getEventDrivenJob()
 * @model
 * @generated
 */
public interface EventDrivenJob extends AbstractJob {
	/**
	 * Returns the value of the '<em><b>Event Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Condition</em>' containment reference.
	 * @see #setEventCondition(LogicalCondition)
	 * @see org.nader.sennet.job.JobPackage#getEventDrivenJob_EventCondition()
	 * @model containment="true"
	 * @generated
	 */
	LogicalCondition getEventCondition();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.EventDrivenJob#getEventCondition <em>Event Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Condition</em>' containment reference.
	 * @see #getEventCondition()
	 * @generated
	 */
	void setEventCondition(LogicalCondition value);

} // EventDrivenJob
