/**
 */
package org.nader.sennet.sensors.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nader.sennet.SennetPackage;

import org.nader.sennet.enums.EnumsPackage;

import org.nader.sennet.enums.impl.EnumsPackageImpl;

import org.nader.sennet.impl.SennetPackageImpl;

import org.nader.sennet.job.JobPackage;

import org.nader.sennet.job.impl.JobPackageImpl;

import org.nader.sennet.job.jobaction.JobactionPackage;

import org.nader.sennet.job.jobaction.impl.JobactionPackageImpl;

import org.nader.sennet.job.jobtrigger.JobtriggerPackage;

import org.nader.sennet.job.jobtrigger.impl.JobtriggerPackageImpl;

import org.nader.sennet.network.NetworkPackage;

import org.nader.sennet.network.impl.NetworkPackageImpl;

import org.nader.sennet.node.NodePackage;

import org.nader.sennet.node.impl.NodePackageImpl;

import org.nader.sennet.sensors.AbstractSensor;
import org.nader.sennet.sensors.AccelerometerSensor;
import org.nader.sennet.sensors.HumiditySensor;
import org.nader.sennet.sensors.LightSensor;
import org.nader.sennet.sensors.LocationSensor;
import org.nader.sennet.sensors.MicrophoneSensor;
import org.nader.sennet.sensors.PressureSensor;
import org.nader.sennet.sensors.SensorsFactory;
import org.nader.sennet.sensors.SensorsPackage;
import org.nader.sennet.sensors.TemperatureSensor;
import org.nader.sennet.sensors.VoltageSensor;

import org.nader.sennet.toplevelstructure.ToplevelstructurePackage;

import org.nader.sennet.toplevelstructure.impl.ToplevelstructurePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorsPackageImpl extends EPackageImpl implements SensorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerometerSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microphoneSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humiditySensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageSensorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nader.sennet.sensors.SensorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SensorsPackageImpl() {
		super(eNS_URI, SensorsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SensorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SensorsPackage init() {
		if (isInited) return (SensorsPackage)EPackage.Registry.INSTANCE.getEPackage(SensorsPackage.eNS_URI);

		// Obtain or create and register package
		SensorsPackageImpl theSensorsPackage = (SensorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SensorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SensorsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SennetPackageImpl theSennetPackage = (SennetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) instanceof SennetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) : SennetPackage.eINSTANCE);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI) : EnumsPackage.eINSTANCE);
		ToplevelstructurePackageImpl theToplevelstructurePackage = (ToplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) instanceof ToplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) : ToplevelstructurePackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		JobPackageImpl theJobPackage = (JobPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) instanceof JobPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) : JobPackage.eINSTANCE);
		JobtriggerPackageImpl theJobtriggerPackage = (JobtriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobtriggerPackage.eNS_URI) instanceof JobtriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobtriggerPackage.eNS_URI) : JobtriggerPackage.eINSTANCE);
		JobactionPackageImpl theJobactionPackage = (JobactionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobactionPackage.eNS_URI) instanceof JobactionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobactionPackage.eNS_URI) : JobactionPackage.eINSTANCE);

		// Create package meta-data objects
		theSensorsPackage.createPackageContents();
		theSennetPackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theToplevelstructurePackage.createPackageContents();
		theNodePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theJobPackage.createPackageContents();
		theJobtriggerPackage.createPackageContents();
		theJobactionPackage.createPackageContents();

		// Initialize created meta-data
		theSensorsPackage.initializePackageContents();
		theSennetPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theToplevelstructurePackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theJobPackage.initializePackageContents();
		theJobtriggerPackage.initializePackageContents();
		theJobactionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSensorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SensorsPackage.eNS_URI, theSensorsPackage);
		return theSensorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSensor() {
		return abstractSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccelerometerSensor() {
		return accelerometerSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSensor() {
		return lightSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationSensor() {
		return locationSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrophoneSensor() {
		return microphoneSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemperatureSensor() {
		return temperatureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressureSensor() {
		return pressureSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumiditySensor() {
		return humiditySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoltageSensor() {
		return voltageSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorsFactory getSensorsFactory() {
		return (SensorsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractSensorEClass = createEClass(ABSTRACT_SENSOR);

		accelerometerSensorEClass = createEClass(ACCELEROMETER_SENSOR);

		lightSensorEClass = createEClass(LIGHT_SENSOR);

		locationSensorEClass = createEClass(LOCATION_SENSOR);

		microphoneSensorEClass = createEClass(MICROPHONE_SENSOR);

		temperatureSensorEClass = createEClass(TEMPERATURE_SENSOR);

		pressureSensorEClass = createEClass(PRESSURE_SENSOR);

		humiditySensorEClass = createEClass(HUMIDITY_SENSOR);

		voltageSensorEClass = createEClass(VOLTAGE_SENSOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accelerometerSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		lightSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		locationSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		microphoneSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		temperatureSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		pressureSensorEClass.getESuperTypes().add(this.getAbstractSensor());
		humiditySensorEClass.getESuperTypes().add(this.getAbstractSensor());
		voltageSensorEClass.getESuperTypes().add(this.getAbstractSensor());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractSensorEClass, AbstractSensor.class, "AbstractSensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accelerometerSensorEClass, AccelerometerSensor.class, "AccelerometerSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightSensorEClass, LightSensor.class, "LightSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationSensorEClass, LocationSensor.class, "LocationSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microphoneSensorEClass, MicrophoneSensor.class, "MicrophoneSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temperatureSensorEClass, TemperatureSensor.class, "TemperatureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressureSensorEClass, PressureSensor.class, "PressureSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humiditySensorEClass, HumiditySensor.class, "HumiditySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(voltageSensorEClass, VoltageSensor.class, "VoltageSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //SensorsPackageImpl
