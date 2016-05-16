/**
 */
package org.nader.sennet.port;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.port.PortPackage
 * @generated
 */
public interface PortFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortFactory eINSTANCE = org.nader.sennet.port.impl.PortFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Usb Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usb Port</em>'.
	 * @generated
	 */
	UsbPort createUsbPort();

	/**
	 * Returns a new object of class '<em>Serial Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serial Port</em>'.
	 * @generated
	 */
	SerialPort createSerialPort();

	/**
	 * Returns a new object of class '<em>Out Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Port</em>'.
	 * @generated
	 */
	OutPort createOutPort();

	/**
	 * Returns a new object of class '<em>In Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Port</em>'.
	 * @generated
	 */
	InPort createInPort();

	/**
	 * Returns a new object of class '<em>Transmitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmitter</em>'.
	 * @generated
	 */
	Transmitter createTransmitter();

	/**
	 * Returns a new object of class '<em>Reciever</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reciever</em>'.
	 * @generated
	 */
	Reciever createReciever();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PortPackage getPortPackage();

} //PortFactory
