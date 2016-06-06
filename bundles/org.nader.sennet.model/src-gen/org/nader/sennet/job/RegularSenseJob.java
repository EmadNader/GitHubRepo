/**
 */
package org.nader.sennet.job;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Sense Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.RegularSenseJob#getSensingThreshold <em>Sensing Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.JobPackage#getRegularSenseJob()
 * @model
 * @generated
 */
public interface RegularSenseJob extends AbstractJob {
	/**
	 * Returns the value of the '<em><b>Sensing Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensing Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensing Threshold</em>' attribute.
	 * @see #setSensingThreshold(long)
	 * @see org.nader.sennet.job.JobPackage#getRegularSenseJob_SensingThreshold()
	 * @model
	 * @generated
	 */
	long getSensingThreshold();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.RegularSenseJob#getSensingThreshold <em>Sensing Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensing Threshold</em>' attribute.
	 * @see #getSensingThreshold()
	 * @generated
	 */
	void setSensingThreshold(long value);

} // RegularSenseJob
