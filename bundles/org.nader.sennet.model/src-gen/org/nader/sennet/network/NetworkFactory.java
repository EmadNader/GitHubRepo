/**
 */
package org.nader.sennet.network;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.network.NetworkPackage
 * @generated
 */
public interface NetworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkFactory eINSTANCE = org.nader.sennet.network.impl.NetworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flat Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flat Network</em>'.
	 * @generated
	 */
	FlatNetwork createFlatNetwork();

	/**
	 * Returns a new object of class '<em>Clustered Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clustered Network</em>'.
	 * @generated
	 */
	ClusteredNetwork createClusteredNetwork();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	Cluster createCluster();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NetworkPackage getNetworkPackage();

} //NetworkFactory
