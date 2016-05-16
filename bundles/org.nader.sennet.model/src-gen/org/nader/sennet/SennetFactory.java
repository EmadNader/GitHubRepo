/**
 */
package org.nader.sennet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.SennetPackage
 * @generated
 */
public interface SennetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SennetFactory eINSTANCE = org.nader.sennet.impl.SennetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>WS Napp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WS Napp</em>'.
	 * @generated
	 */
	WSNapp createWSNapp();

	/**
	 * Returns a new object of class '<em>Logical Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Condition</em>'.
	 * @generated
	 */
	LogicalCondition createLogicalCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SennetPackage getSennetPackage();

} //SennetFactory
