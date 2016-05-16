/**
 */
package org.nader.sennet.sensor;

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
 * @see org.nader.sennet.sensor.SensorFactory
 * @model kind="package"
 * @generated
 */
public interface SensorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensor";

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
	SensorPackage eINSTANCE = org.nader.sennet.sensor.impl.SensorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensor.impl.AbstractSensorImpl <em>Abstract Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensor.impl.AbstractSensorImpl
	 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getAbstractSensor()
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
	int ABSTRACT_SENSOR_FEATURE_COUNT = ToplevelstructurePackage.ABSTRACT_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SENSOR_OPERATION_COUNT = ToplevelstructurePackage.ABSTRACT_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.sensor.impl.AccelerometerSensorImpl <em>Accelerometer Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensor.impl.AccelerometerSensorImpl
	 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getAccelerometerSensor()
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
	 * The meta object id for the '{@link org.nader.sennet.sensor.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensor.impl.LightSensorImpl
	 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getLightSensor()
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
	 * The meta object id for the '{@link org.nader.sennet.sensor.impl.LocationSensorImpl <em>Location Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensor.impl.LocationSensorImpl
	 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getLocationSensor()
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
	 * The meta object id for the '{@link org.nader.sennet.sensor.impl.MicrophoneSensorImpl <em>Microphone Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensor.impl.MicrophoneSensorImpl
	 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getMicrophoneSensor()
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
	 * The meta object id for the '{@link org.nader.sennet.sensor.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensor.impl.TemperatureSensorImpl
	 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getTemperatureSensor()
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
	 * The meta object id for the '{@link org.nader.sennet.sensor.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensor.impl.PressureSensorImpl
	 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getPressureSensor()
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
	 * The meta object id for the '{@link org.nader.sennet.sensor.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensor.impl.HumiditySensorImpl
	 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getHumiditySensor()
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
	 * The meta object id for the '{@link org.nader.sennet.sensor.impl.ChemicalSensorImpl <em>Chemical Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.sensor.impl.ChemicalSensorImpl
	 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getChemicalSensor()
	 * @generated
	 */
	int CHEMICAL_SENSOR = 8;

	/**
	 * The number of structural features of the '<em>Chemical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEMICAL_SENSOR_FEATURE_COUNT = ABSTRACT_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chemical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEMICAL_SENSOR_OPERATION_COUNT = ABSTRACT_SENSOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensor.AbstractSensor <em>Abstract Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sensor</em>'.
	 * @see org.nader.sennet.sensor.AbstractSensor
	 * @generated
	 */
	EClass getAbstractSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensor.AccelerometerSensor <em>Accelerometer Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accelerometer Sensor</em>'.
	 * @see org.nader.sennet.sensor.AccelerometerSensor
	 * @generated
	 */
	EClass getAccelerometerSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensor.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see org.nader.sennet.sensor.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensor.LocationSensor <em>Location Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Sensor</em>'.
	 * @see org.nader.sennet.sensor.LocationSensor
	 * @generated
	 */
	EClass getLocationSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensor.MicrophoneSensor <em>Microphone Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microphone Sensor</em>'.
	 * @see org.nader.sennet.sensor.MicrophoneSensor
	 * @generated
	 */
	EClass getMicrophoneSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensor.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Sensor</em>'.
	 * @see org.nader.sennet.sensor.TemperatureSensor
	 * @generated
	 */
	EClass getTemperatureSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensor.PressureSensor <em>Pressure Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressure Sensor</em>'.
	 * @see org.nader.sennet.sensor.PressureSensor
	 * @generated
	 */
	EClass getPressureSensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensor.HumiditySensor <em>Humidity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humidity Sensor</em>'.
	 * @see org.nader.sennet.sensor.HumiditySensor
	 * @generated
	 */
	EClass getHumiditySensor();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.sensor.ChemicalSensor <em>Chemical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chemical Sensor</em>'.
	 * @see org.nader.sennet.sensor.ChemicalSensor
	 * @generated
	 */
	EClass getChemicalSensor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SensorFactory getSensorFactory();

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
		 * The meta object literal for the '{@link org.nader.sennet.sensor.impl.AbstractSensorImpl <em>Abstract Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensor.impl.AbstractSensorImpl
		 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getAbstractSensor()
		 * @generated
		 */
		EClass ABSTRACT_SENSOR = eINSTANCE.getAbstractSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensor.impl.AccelerometerSensorImpl <em>Accelerometer Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensor.impl.AccelerometerSensorImpl
		 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getAccelerometerSensor()
		 * @generated
		 */
		EClass ACCELEROMETER_SENSOR = eINSTANCE.getAccelerometerSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensor.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensor.impl.LightSensorImpl
		 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensor.impl.LocationSensorImpl <em>Location Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensor.impl.LocationSensorImpl
		 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getLocationSensor()
		 * @generated
		 */
		EClass LOCATION_SENSOR = eINSTANCE.getLocationSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensor.impl.MicrophoneSensorImpl <em>Microphone Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensor.impl.MicrophoneSensorImpl
		 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getMicrophoneSensor()
		 * @generated
		 */
		EClass MICROPHONE_SENSOR = eINSTANCE.getMicrophoneSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensor.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensor.impl.TemperatureSensorImpl
		 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getTemperatureSensor()
		 * @generated
		 */
		EClass TEMPERATURE_SENSOR = eINSTANCE.getTemperatureSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensor.impl.PressureSensorImpl <em>Pressure Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensor.impl.PressureSensorImpl
		 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getPressureSensor()
		 * @generated
		 */
		EClass PRESSURE_SENSOR = eINSTANCE.getPressureSensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensor.impl.HumiditySensorImpl <em>Humidity Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensor.impl.HumiditySensorImpl
		 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getHumiditySensor()
		 * @generated
		 */
		EClass HUMIDITY_SENSOR = eINSTANCE.getHumiditySensor();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.sensor.impl.ChemicalSensorImpl <em>Chemical Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.sensor.impl.ChemicalSensorImpl
		 * @see org.nader.sennet.sensor.impl.SensorPackageImpl#getChemicalSensor()
		 * @generated
		 */
		EClass CHEMICAL_SENSOR = eINSTANCE.getChemicalSensor();

	}

} //SensorPackage
