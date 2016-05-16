/**
 */
package org.nader.sennet.sensor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.sensor.SensorPackage
 * @generated
 */
public interface SensorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensorFactory eINSTANCE = org.nader.sennet.sensor.impl.SensorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Accelerometer Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accelerometer Sensor</em>'.
	 * @generated
	 */
	AccelerometerSensor createAccelerometerSensor();

	/**
	 * Returns a new object of class '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Sensor</em>'.
	 * @generated
	 */
	LightSensor createLightSensor();

	/**
	 * Returns a new object of class '<em>Location Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Sensor</em>'.
	 * @generated
	 */
	LocationSensor createLocationSensor();

	/**
	 * Returns a new object of class '<em>Microphone Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microphone Sensor</em>'.
	 * @generated
	 */
	MicrophoneSensor createMicrophoneSensor();

	/**
	 * Returns a new object of class '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature Sensor</em>'.
	 * @generated
	 */
	TemperatureSensor createTemperatureSensor();

	/**
	 * Returns a new object of class '<em>Pressure Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Sensor</em>'.
	 * @generated
	 */
	PressureSensor createPressureSensor();

	/**
	 * Returns a new object of class '<em>Humidity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Humidity Sensor</em>'.
	 * @generated
	 */
	HumiditySensor createHumiditySensor();

	/**
	 * Returns a new object of class '<em>Chemical Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chemical Sensor</em>'.
	 * @generated
	 */
	ChemicalSensor createChemicalSensor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SensorPackage getSensorPackage();

} //SensorFactory
