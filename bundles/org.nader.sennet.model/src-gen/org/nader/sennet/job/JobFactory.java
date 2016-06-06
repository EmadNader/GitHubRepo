/**
 */
package org.nader.sennet.job;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.JobPackage
 * @generated
 */
public interface JobFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobFactory eINSTANCE = org.nader.sennet.job.impl.JobFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sense Forward Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Forward Job</em>'.
	 * @generated
	 */
	SenseForwardJob createSenseForwardJob();

	/**
	 * Returns a new object of class '<em>Aggregation Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Job</em>'.
	 * @generated
	 */
	AggregationJob createAggregationJob();

	/**
	 * Returns a new object of class '<em>Fusion Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fusion Job</em>'.
	 * @generated
	 */
	FusionJob createFusionJob();

	/**
	 * Returns a new object of class '<em>Sense Now Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Now Job</em>'.
	 * @generated
	 */
	SenseNowJob createSenseNowJob();

	/**
	 * Returns a new object of class '<em>Sink Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink Job</em>'.
	 * @generated
	 */
	SinkJob createSinkJob();

	/**
	 * Returns a new object of class '<em>Regular Sense Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular Sense Job</em>'.
	 * @generated
	 */
	RegularSenseJob createRegularSenseJob();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobPackage getJobPackage();

} //JobFactory
