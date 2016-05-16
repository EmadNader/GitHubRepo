/**
 */
package org.nader.sennet.sensor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nader.sennet.sensor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorFactoryImpl extends EFactoryImpl implements SensorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorFactory init() {
		try {
			SensorFactory theSensorFactory = (SensorFactory)EPackage.Registry.INSTANCE.getEFactory(SensorPackage.eNS_URI);
			if (theSensorFactory != null) {
				return theSensorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SensorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorFactoryImpl() {
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
			case SensorPackage.ACCELEROMETER_SENSOR: return createAccelerometerSensor();
			case SensorPackage.LIGHT_SENSOR: return createLightSensor();
			case SensorPackage.LOCATION_SENSOR: return createLocationSensor();
			case SensorPackage.MICROPHONE_SENSOR: return createMicrophoneSensor();
			case SensorPackage.TEMPERATURE_SENSOR: return createTemperatureSensor();
			case SensorPackage.PRESSURE_SENSOR: return createPressureSensor();
			case SensorPackage.HUMIDITY_SENSOR: return createHumiditySensor();
			case SensorPackage.CHEMICAL_SENSOR: return createChemicalSensor();
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
	public ChemicalSensor createChemicalSensor() {
		ChemicalSensorImpl chemicalSensor = new ChemicalSensorImpl();
		return chemicalSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorPackage getSensorPackage() {
		return (SensorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SensorPackage getPackage() {
		return SensorPackage.eINSTANCE;
	}

} //SensorFactoryImpl
