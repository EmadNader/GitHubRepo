/**
 */
package org.nader.sennet.port;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.nader.sennet.toplevelstructure.ToplevelstructurePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nader.sennet.port.PortFactory
 * @model kind="package"
 * @generated
 */
public interface PortPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "port";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet/pt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortPackage eINSTANCE = org.nader.sennet.port.impl.PortPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.port.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.port.impl.AbstractPortImpl
	 * @see org.nader.sennet.port.impl.PortPackageImpl#getAbstractPort()
	 * @generated
	 */
	int ABSTRACT_PORT = 0;

	/**
	 * The number of structural features of the '<em>Abstract Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT_FEATURE_COUNT = ToplevelstructurePackage.ABSTRACT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT_OPERATION_COUNT = ToplevelstructurePackage.ABSTRACT_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.port.impl.InPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.port.impl.InPortImpl
	 * @see org.nader.sennet.port.impl.PortPackageImpl#getInPort()
	 * @generated
	 */
	int IN_PORT = 4;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_OPERATION_COUNT = ABSTRACT_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.port.impl.UsbPortImpl <em>Usb Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.port.impl.UsbPortImpl
	 * @see org.nader.sennet.port.impl.PortPackageImpl#getUsbPort()
	 * @generated
	 */
	int USB_PORT = 1;

	/**
	 * The number of structural features of the '<em>Usb Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_PORT_FEATURE_COUNT = IN_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Usb Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_PORT_OPERATION_COUNT = IN_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.port.impl.SerialPortImpl <em>Serial Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.port.impl.SerialPortImpl
	 * @see org.nader.sennet.port.impl.PortPackageImpl#getSerialPort()
	 * @generated
	 */
	int SERIAL_PORT = 2;

	/**
	 * The number of structural features of the '<em>Serial Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_PORT_FEATURE_COUNT = IN_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Serial Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_PORT_OPERATION_COUNT = IN_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.port.impl.OutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.port.impl.OutPortImpl
	 * @see org.nader.sennet.port.impl.PortPackageImpl#getOutPort()
	 * @generated
	 */
	int OUT_PORT = 3;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_OPERATION_COUNT = ABSTRACT_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.port.impl.TransmitterImpl <em>Transmitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.port.impl.TransmitterImpl
	 * @see org.nader.sennet.port.impl.PortPackageImpl#getTransmitter()
	 * @generated
	 */
	int TRANSMITTER = 5;

	/**
	 * The number of structural features of the '<em>Transmitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_FEATURE_COUNT = OUT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transmitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_OPERATION_COUNT = OUT_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.port.impl.RecieverImpl <em>Reciever</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.port.impl.RecieverImpl
	 * @see org.nader.sennet.port.impl.PortPackageImpl#getReciever()
	 * @generated
	 */
	int RECIEVER = 6;

	/**
	 * The number of structural features of the '<em>Reciever</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVER_FEATURE_COUNT = IN_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reciever</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIEVER_OPERATION_COUNT = IN_PORT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.port.AbstractPort <em>Abstract Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Port</em>'.
	 * @see org.nader.sennet.port.AbstractPort
	 * @generated
	 */
	EClass getAbstractPort();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.port.UsbPort <em>Usb Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usb Port</em>'.
	 * @see org.nader.sennet.port.UsbPort
	 * @generated
	 */
	EClass getUsbPort();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.port.SerialPort <em>Serial Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serial Port</em>'.
	 * @see org.nader.sennet.port.SerialPort
	 * @generated
	 */
	EClass getSerialPort();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.port.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see org.nader.sennet.port.OutPort
	 * @generated
	 */
	EClass getOutPort();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.port.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see org.nader.sennet.port.InPort
	 * @generated
	 */
	EClass getInPort();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.port.Transmitter <em>Transmitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmitter</em>'.
	 * @see org.nader.sennet.port.Transmitter
	 * @generated
	 */
	EClass getTransmitter();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.port.Reciever <em>Reciever</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reciever</em>'.
	 * @see org.nader.sennet.port.Reciever
	 * @generated
	 */
	EClass getReciever();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PortFactory getPortFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nader.sennet.port.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.port.impl.AbstractPortImpl
		 * @see org.nader.sennet.port.impl.PortPackageImpl#getAbstractPort()
		 * @generated
		 */
		EClass ABSTRACT_PORT = eINSTANCE.getAbstractPort();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.port.impl.UsbPortImpl <em>Usb Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.port.impl.UsbPortImpl
		 * @see org.nader.sennet.port.impl.PortPackageImpl#getUsbPort()
		 * @generated
		 */
		EClass USB_PORT = eINSTANCE.getUsbPort();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.port.impl.SerialPortImpl <em>Serial Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.port.impl.SerialPortImpl
		 * @see org.nader.sennet.port.impl.PortPackageImpl#getSerialPort()
		 * @generated
		 */
		EClass SERIAL_PORT = eINSTANCE.getSerialPort();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.port.impl.OutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.port.impl.OutPortImpl
		 * @see org.nader.sennet.port.impl.PortPackageImpl#getOutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getOutPort();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.port.impl.InPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.port.impl.InPortImpl
		 * @see org.nader.sennet.port.impl.PortPackageImpl#getInPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getInPort();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.port.impl.TransmitterImpl <em>Transmitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.port.impl.TransmitterImpl
		 * @see org.nader.sennet.port.impl.PortPackageImpl#getTransmitter()
		 * @generated
		 */
		EClass TRANSMITTER = eINSTANCE.getTransmitter();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.port.impl.RecieverImpl <em>Reciever</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.port.impl.RecieverImpl
		 * @see org.nader.sennet.port.impl.PortPackageImpl#getReciever()
		 * @generated
		 */
		EClass RECIEVER = eINSTANCE.getReciever();

	}

} //PortPackage
