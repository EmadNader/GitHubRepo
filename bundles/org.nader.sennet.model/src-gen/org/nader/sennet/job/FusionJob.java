/**
 */
package org.nader.sennet.job;

import org.nader.sennet.enums.Fusion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fusion Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.FusionJob#getFusion <em>Fusion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.JobPackage#getFusionJob()
 * @model
 * @generated
 */
public interface FusionJob extends AbstractJob {
	/**
	 * Returns the value of the '<em><b>Fusion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nader.sennet.enums.Fusion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fusion</em>' attribute.
	 * @see org.nader.sennet.enums.Fusion
	 * @see #setFusion(Fusion)
	 * @see org.nader.sennet.job.JobPackage#getFusionJob_Fusion()
	 * @model
	 * @generated
	 */
	Fusion getFusion();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.FusionJob#getFusion <em>Fusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fusion</em>' attribute.
	 * @see org.nader.sennet.enums.Fusion
	 * @see #getFusion()
	 * @generated
	 */
	void setFusion(Fusion value);

} // FusionJob
