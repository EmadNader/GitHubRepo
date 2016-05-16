/**
 */
package org.nader.sennet.port.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nader.sennet.port.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortFactoryImpl extends EFactoryImpl implements PortFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortFactory init() {
		try {
			PortFactory thePortFactory = (PortFactory)EPackage.Registry.INSTANCE.getEFactory(PortPackage.eNS_URI);
			if (thePortFactory != null) {
				return thePortFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PortFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PortPackage.USB_PORT: return createUsbPort();
			case PortPackage.SERIAL_PORT: return createSerialPort();
			case PortPackage.OUT_PORT: return createOutPort();
			case PortPackage.IN_PORT: return createInPort();
			case PortPackage.TRANSMITTER: return createTransmitter();
			case PortPackage.RECIEVER: return createReciever();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsbPort createUsbPort() {
		UsbPortImpl usbPort = new UsbPortImpl();
		return usbPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerialPort createSerialPort() {
		SerialPortImpl serialPort = new SerialPortImpl();
		return serialPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort createOutPort() {
		OutPortImpl outPort = new OutPortImpl();
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort createInPort() {
		InPortImpl inPort = new InPortImpl();
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transmitter createTransmitter() {
		TransmitterImpl transmitter = new TransmitterImpl();
		return transmitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reciever createReciever() {
		RecieverImpl reciever = new RecieverImpl();
		return reciever;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortPackage getPortPackage() {
		return (PortPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PortPackage getPackage() {
		return PortPackage.eINSTANCE;
	}

} //PortFactoryImpl
