/**
 */
package org.nader.sennet.sensors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.nader.sennet.sensors.SensorsFactory
 * @model kind="package"
 * @generated
 */
public interface SensorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet/sn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensorsPackage eINSTANCE = org.nader.sennet.sensors.impl.SensorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensors.impl.AbstractSensorImpl <em>Abstract Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensors.impl.AbstractSensorImpl
	 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getAbstractSensor()
	 * @generated
	 */
	int ABSTRACT_SENSOR = 0;

	/**
	 * The number of structural features of the '<em>Abstract Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SENSOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensors.impl.AccelerometerSensorImpl <em>Accelerometer Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensors.impl.AccelerometerSensorImpl
	 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getAccelerometerSensor()
	 * @generated
	 */
	int ACCELEROMETER_SENSOR = 1;

	/**
	 * The number of structural features of the '<em>Accelerometer Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accelerometer Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensors.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensors.impl.LightSensorImpl
	 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getLightSensor()
	 * @generated
	 */
	int LIGHT_SENSOR = 2;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensors.impl.LocationSensorImpl <em>Location Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensors.impl.LocationSensorImpl
	 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getLocationSensor()
	 * @generated
	 */
	int LOCATION_SENSOR = 3;

	/**
	 * The number of structural features of the '<em>Location Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensors.impl.MicrophoneSensorImpl <em>Microphone Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensors.impl.MicrophoneSensorImpl
	 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getMicrophoneSensor()
	 * @generated
	 */
	int MICROPHONE_SENSOR = 4;

	/**
	 * The number of structural features of the '<em>Microphone Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Microphone Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensors.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensors.impl.TemperatureSensorImpl
	 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getTemperatureSensor()
	 * @generated
	 */
	int TEMPERATURE_SENSOR = 5;

	/**
	 * The number of structural features of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensors.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensors.impl.PressureSensorImpl
	 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getPressureSensor()
	 * @generated
	 */
	int PRESSURE_SENSOR = 6;

	/**
	 * The number of structural features of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pressure Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSURE_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensors.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensors.impl.HumiditySensorImpl
	 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getHumiditySensor()
	 * @generated
	 */
	int HUMIDITY_SENSOR = 7;

	/**
	 * The number of structural features of the '<em>Humidity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Humidity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMIDITY_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensors.impl.VoltageSensorImpl <em>Voltage Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensors.impl.VoltageSensorImpl
	 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getVoltageSensor()
	 * @generated
	 */
	int VOLTAGE_SENSOR = 8;

	/**
	 * The number of structural features of the '<em>Voltage Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Voltage Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensors.AbstractSensor <em>Abstract Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sensor</em>'.
	 * @see org.nader.sennet.sensors.AbstractSensor
	 * @generated
	 */
	EClass getAbstractSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensors.AccelerometerSensor <em>Accelerometer Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accelerometer Sensor</em>'.
	 * @see org.nader.sennet.sensors.AccelerometerSensor
	 * @generated
	 */
	EClass getAccelerometerSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensors.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see org.nader.sennet.sensors.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensors.LocationSensor <em>Location Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Sensor</em>'.
	 * @see org.nader.sennet.sensors.LocationSensor
	 * @generated
	 */
	EClass getLocationSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensors.MicrophoneSensor <em>Microphone Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microphone Sensor</em>'.
	 * @see org.nader.sennet.sensors.MicrophoneSensor
	 * @generated
	 */
	EClass getMicrophoneSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensors.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Sensor</em>'.
	 * @see org.nader.sennet.sensors.TemperatureSensor
	 * @generated
	 */
	EClass getTemperatureSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensors.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor</em>'.
	 * @see org.nader.sennet.sensors.PressureSensor
	 * @generated
	 */
	EClass getPressureSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensors.HumiditySensor <em>Humidity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidity Sensor</em>'.
	 * @see org.nader.sennet.sensors.HumiditySensor
	 * @generated
	 */
	EClass getHumiditySensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensors.VoltageSensor <em>Voltage Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Sensor</em>'.
	 * @see org.nader.sennet.sensors.VoltageSensor
	 * @generated
	 */
	EClass getVoltageSensor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SensorsFactory getSensorsFactory();

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
		 * The meta object literal for the '{@link org.nader.sennet.sensors.impl.AbstractSensorImpl <em>Abstract Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensors.impl.AbstractSensorImpl
		 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getAbstractSensor()
		 * @generated
		 */
		EClass ABSTRACT_SENSOR = eINSTANCE.getAbstractSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensors.impl.AccelerometerSensorImpl <em>Accelerometer Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensors.impl.AccelerometerSensorImpl
		 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getAccelerometerSensor()
		 * @generated
		 */
		EClass ACCELEROMETER_SENSOR = eINSTANCE.getAccelerometerSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensors.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensors.impl.LightSensorImpl
		 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensors.impl.LocationSensorImpl <em>Location Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensors.impl.LocationSensorImpl
		 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getLocationSensor()
		 * @generated
		 */
		EClass LOCATION_SENSOR = eINSTANCE.getLocationSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensors.impl.MicrophoneSensorImpl <em>Microphone Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensors.impl.MicrophoneSensorImpl
		 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getMicrophoneSensor()
		 * @generated
		 */
		EClass MICROPHONE_SENSOR = eINSTANCE.getMicrophoneSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensors.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensors.impl.TemperatureSensorImpl
		 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getTemperatureSensor()
		 * @generated
		 */
		EClass TEMPERATURE_SENSOR = eINSTANCE.getTemperatureSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensors.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensors.impl.PressureSensorImpl
		 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getPressureSensor()
		 * @generated
		 */
		EClass PRESSURE_SENSOR = eINSTANCE.getPressureSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensors.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensors.impl.HumiditySensorImpl
		 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getHumiditySensor()
		 * @generated
		 */
		EClass HUMIDITY_SENSOR = eINSTANCE.getHumiditySensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensors.impl.VoltageSensorImpl <em>Voltage Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensors.impl.VoltageSensorImpl
		 * @see org.nader.sennet.sensors.impl.SensorsPackageImpl#getVoltageSensor()
		 * @generated
		 */
		EClass VOLTAGE_SENSOR = eINSTANCE.getVoltageSensor();

	}

} //SensorsPackage
