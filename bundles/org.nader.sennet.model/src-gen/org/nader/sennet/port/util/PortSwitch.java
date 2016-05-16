/**
 */
package org.nader.sennet.port.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nader.sennet.port.*;

import org.nader.sennet.toplevelstructure.AbstractResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.port.PortPackage
 * @generated
 */
public class PortSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PortPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortSwitch() {
		if (modelPackage == null) {
			modelPackage = PortPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PortPackage.ABSTRACT_PORT: {
				AbstractPort abstractPort = (AbstractPort)theEObject;
				T result = caseAbstractPort(abstractPort);
				if (result == null) result = caseAbstractResource(abstractPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortPackage.USB_PORT: {
				UsbPort usbPort = (UsbPort)theEObject;
				T result = caseUsbPort(usbPort);
				if (result == null) result = caseInPort(usbPort);
				if (result == null) result = caseOutPort(usbPort);
				if (result == null) result = caseAbstractPort(usbPort);
				if (result == null) result = caseAbstractResource(usbPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortPackage.SERIAL_PORT: {
				SerialPort serialPort = (SerialPort)theEObject;
				T result = caseSerialPort(serialPort);
				if (result == null) result = caseInPort(serialPort);
				if (result == null) result = caseOutPort(serialPort);
				if (result == null) result = caseAbstractPort(serialPort);
				if (result == null) result = caseAbstractResource(serialPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortPackage.OUT_PORT: {
				OutPort outPort = (OutPort)theEObject;
				T result = caseOutPort(outPort);
				if (result == null) result = caseAbstractPort(outPort);
				if (result == null) result = caseAbstractResource(outPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortPackage.IN_PORT: {
				InPort inPort = (InPort)theEObject;
				T result = caseInPort(inPort);
				if (result == null) result = caseAbstractPort(inPort);
				if (result == null) result = caseAbstractResource(inPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortPackage.TRANSMITTER: {
				Transmitter transmitter = (Transmitter)theEObject;
				T result = caseTransmitter(transmitter);
				if (result == null) result = caseOutPort(transmitter);
				if (result == null) result = caseAbstractPort(transmitter);
				if (result == null) result = caseAbstractResource(transmitter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortPackage.RECIEVER: {
				Reciever reciever = (Reciever)theEObject;
				T result = caseReciever(reciever);
				if (result == null) result = caseInPort(reciever);
				if (result == null) result = caseAbstractPort(reciever);
				if (result == null) result = caseAbstractResource(reciever);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPort(AbstractPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usb Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usb Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsbPort(UsbPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serial Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serial Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerialPort(SerialPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPort(OutPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPort(InPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmitter(Transmitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reciever</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reciever</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReciever(Reciever object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResource(AbstractResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PortSwitch
