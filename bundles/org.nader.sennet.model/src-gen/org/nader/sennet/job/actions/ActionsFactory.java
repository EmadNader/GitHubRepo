/**
 */
package org.nader.sennet.job.actions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.actions.ActionsPackage
 * @generated
 */
public interface ActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionsFactory eINSTANCE = org.nader.sennet.job.actions.impl.ActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sense Forward Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sense Forward Action</em>'.
	 * @generated
	 */
	SenseForwardAction createSenseForwardAction();

	/**
	 * Returns a new object of class '<em>Aggregation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Action</em>'.
	 * @generated
	 */
	AggregationAction createAggregationAction();

	/**
	 * Returns a new object of class '<em>Fusion Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fusion Action</em>'.
	 * @generated
	 */
	FusionAction createFusionAction();

	/**
	 * Returns a new object of class '<em>Read Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Node Memory Action</em>'.
	 * @generated
	 */
	ReadNodeMemoryAction createReadNodeMemoryAction();

	/**
	 * Returns a new object of class '<em>Write Node Memory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Node Memory Action</em>'.
	 * @generated
	 */
	WriteNodeMemoryAction createWriteNodeMemoryAction();

	/**
	 * Returns a new object of class '<em>Send Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Message Action</em>'.
	 * @generated
	 */
	SendMessageAction createSendMessageAction();

	/**
	 * Returns a new object of class '<em>Receive Message Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Message Action</em>'.
	 * @generated
	 */
	ReceiveMessageAction createReceiveMessageAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionsPackage getActionsPackage();

} //ActionsFactory
