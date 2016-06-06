/**
 */
package org.nader.sennet.sensors.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nader.sennet.sensors.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorsFactoryImpl extends EFactoryImpl implements SensorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorsFactory init() {
		try {
			SensorsFactory theSensorsFactory = (SensorsFactory)EPackage.Registry.INSTANCE.getEFactory(SensorsPackage.eNS_URI);
			if (theSensorsFactory != null) {
				return theSensorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SensorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorsFactoryImpl() {
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
			case SensorsPackage.ACCELEROMETER_SENSOR: return createAccelerometerSensor();
			case SensorsPackage.LIGHT_SENSOR: return createLightSensor();
			case SensorsPackage.LOCATION_SENSOR: return createLocationSensor();
			case SensorsPackage.MICROPHONE_SENSOR: return createMicrophoneSensor();
			case SensorsPackage.TEMPERATURE_SENSOR: return createTemperatureSensor();
			case SensorsPackage.PRESSURE_SENSOR: return createPressureSensor();
			case SensorsPackage.HUMIDITY_SENSOR: return createHumiditySensor();
			case SensorsPackage.VOLTAGE_SENSOR: return createVoltageSensor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccelerometerSensor createAccelerometerSensor() {
		AccelerometerSensorImpl accelerometerSensor = new AccelerometerSensorImpl();
		return accelerometerSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSensor createLightSensor() {
		LightSensorImpl lightSensor = new LightSensorImpl();
		return lightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationSensor createLocationSensor() {
		LocationSensorImpl locationSensor = new LocationSensorImpl();
		return locationSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrophoneSensor createMicrophoneSensor() {
		MicrophoneSensorImpl microphoneSensor = new MicrophoneSensorImpl();
		return microphoneSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureSensor createTemperatureSensor() {
		TemperatureSensorImpl temperatureSensor = new TemperatureSensorImpl();
		return temperatureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureSensor createPressureSensor() {
		PressureSensorImpl pressureSensor = new PressureSensorImpl();
		return pressureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumiditySensor createHumiditySensor() {
		HumiditySensorImpl humiditySensor = new HumiditySensorImpl();
		return humiditySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageSensor createVoltageSensor() {
		VoltageSensorImpl voltageSensor = new VoltageSensorImpl();
		return voltageSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorsPackage getSensorsPackage() {
		return (SensorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SensorsPackage getPackage() {
		return SensorsPackage.eINSTANCE;
	}

} //SensorsFactoryImpl
