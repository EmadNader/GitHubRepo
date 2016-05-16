/**
 */
package org.nader.sennet.toplevelstructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.toplevelstructure.ToplevelstructurePackage
 * @generated
 */
public interface ToplevelstructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToplevelstructureFactory eINSTANCE = org.nader.sennet.toplevelstructure.impl.ToplevelstructureFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToplevelstructurePackage getToplevelstructurePackage();

} //ToplevelstructureFactory
