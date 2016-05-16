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
	 * Returns a new object of class '<em>Continuous Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous Job</em>'.
	 * @generated
	 */
	ContinuousJob createContinuousJob();

	/**
	 * Returns a new object of class '<em>Event Driven Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Driven Job</em>'.
	 * @generated
	 */
	EventDrivenJob createEventDrivenJob();

	/**
	 * Returns a new object of class '<em>Periodic Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Job</em>'.
	 * @generated
	 */
	PeriodicJob createPeriodicJob();

	/**
	 * Returns a new object of class '<em>Request Replay Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Replay Job</em>'.
	 * @generated
	 */
	RequestReplayJob createRequestReplayJob();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobPackage getJobPackage();

} //JobFactory
