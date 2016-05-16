/**
 */
package org.nader.sennet.job;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.PeriodicJob#getTimer <em>Timer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.JobPackage#getPeriodicJob()
 * @model
 * @generated
 */
public interface PeriodicJob extends AbstractJob {
	/**
	 * Returns the value of the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' attribute.
	 * @see #setTimer(long)
	 * @see org.nader.sennet.job.JobPackage#getPeriodicJob_Timer()
	 * @model
	 * @generated
	 */
	long getTimer();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.PeriodicJob#getTimer <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' attribute.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(long value);

} // PeriodicJob
