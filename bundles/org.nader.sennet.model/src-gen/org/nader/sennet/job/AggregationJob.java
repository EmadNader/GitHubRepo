/**
 */
package org.nader.sennet.job;

import org.nader.sennet.enums.Aggregation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.job.AggregationJob#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.job.JobPackage#getAggregationJob()
 * @model
 * @generated
 */
public interface AggregationJob extends AbstractJob {
	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nader.sennet.enums.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see org.nader.sennet.enums.Aggregation
	 * @see #setAggregation(Aggregation)
	 * @see org.nader.sennet.job.JobPackage#getAggregationJob_Aggregation()
	 * @model
	 * @generated
	 */
	Aggregation getAggregation();

	/**
	 * Sets the value of the '{@link org.nader.sennet.job.AggregationJob#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see org.nader.sennet.enums.Aggregation
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(Aggregation value);

} // AggregationJob
