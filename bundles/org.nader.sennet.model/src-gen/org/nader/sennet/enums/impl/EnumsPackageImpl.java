/**
 */
package org.nader.sennet.enums.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nader.sennet.SennetPackage;

import org.nader.sennet.enums.Aggregation;
import org.nader.sennet.enums.EnumsFactory;
import org.nader.sennet.enums.EnumsPackage;
import org.nader.sennet.enums.Fusion;
import org.nader.sennet.enums.InterNodeComm;
import org.nader.sennet.enums.JobSchedule;
import org.nader.sennet.enums.LogicalSymbol;
import org.nader.sennet.enums.Position;
import org.nader.sennet.enums.RoutingProtocol;

import org.nader.sennet.impl.SennetPackageImpl;

import org.nader.sennet.job.JobPackage;

import org.nader.sennet.job.actions.ActionsPackage;

import org.nader.sennet.job.actions.impl.ActionsPackageImpl;

import org.nader.sennet.job.impl.JobPackageImpl;

import org.nader.sennet.network.NetworkPackage;

import org.nader.sennet.network.impl.NetworkPackageImpl;

import org.nader.sennet.node.NodePackage;

import org.nader.sennet.node.impl.NodePackageImpl;

import org.nader.sennet.port.PortPackage;

import org.nader.sennet.port.impl.PortPackageImpl;

import org.nader.sennet.sensor.SensorPackage;

import org.nader.sennet.sensor.impl.SensorPackageImpl;

import org.nader.sennet.toplevelstructure.ToplevelstructurePackage;

import org.nader.sennet.toplevelstructure.impl.ToplevelstructurePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumsPackageImpl extends EPackageImpl implements EnumsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fusionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routingProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interNodeCommEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobScheduleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalSymbolEEnum = null;

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
	 * @see org.nader.sennet.enums.EnumsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumsPackageImpl() {
		super(eNS_URI, EnumsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumsPackage init() {
		if (isInited) return (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Obtain or create and register package
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnumsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnumsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SennetPackageImpl theSennetPackage = (SennetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) instanceof SennetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SennetPackage.eNS_URI) : SennetPackage.eINSTANCE);
		ToplevelstructurePackageImpl theToplevelstructurePackage = (ToplevelstructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) instanceof ToplevelstructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ToplevelstructurePackage.eNS_URI) : ToplevelstructurePackage.eINSTANCE);
		NodePackageImpl theNodePackage = (NodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) instanceof NodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NodePackage.eNS_URI) : NodePackage.eINSTANCE);
		JobPackageImpl theJobPackage = (JobPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) instanceof JobPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JobPackage.eNS_URI) : JobPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		SensorPackageImpl theSensorPackage = (SensorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) instanceof SensorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SensorPackage.eNS_URI) : SensorPackage.eINSTANCE);
		PortPackageImpl thePortPackage = (PortPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) instanceof PortPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortPackage.eNS_URI) : PortPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);

		// Create package meta-data objects
		theEnumsPackage.createPackageContents();
		theSennetPackage.createPackageContents();
		theToplevelstructurePackage.createPackageContents();
		theNodePackage.createPackageContents();
		theJobPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theSensorPackage.createPackageContents();
		thePortPackage.createPackageContents();
		theNetworkPackage.createPackageContents();

		// Initialize created meta-data
		theEnumsPackage.initializePackageContents();
		theSennetPackage.initializePackageContents();
		theToplevelstructurePackage.initializePackageContents();
		theNodePackage.initializePackageContents();
		theJobPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theSensorPackage.initializePackageContents();
		thePortPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumsPackage.eNS_URI, theEnumsPackage);
		return theEnumsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFusion() {
		return fusionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregation() {
		return aggregationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPosition() {
		return positionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoutingProtocol() {
		return routingProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterNodeComm() {
		return interNodeCommEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJobSchedule() {
		return jobScheduleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalSymbol() {
		return logicalSymbolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumsFactory getEnumsFactory() {
		return (EnumsFactory)getEFactoryInstance();
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

		// Create enums
		fusionEEnum = createEEnum(FUSION);
		aggregationEEnum = createEEnum(AGGREGATION);
		positionEEnum = createEEnum(POSITION);
		routingProtocolEEnum = createEEnum(ROUTING_PROTOCOL);
		interNodeCommEEnum = createEEnum(INTER_NODE_COMM);
		jobScheduleEEnum = createEEnum(JOB_SCHEDULE);
		logicalSymbolEEnum = createEEnum(LOGICAL_SYMBOL);
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

		// Initialize enums and add enum literals
		initEEnum(fusionEEnum, Fusion.class, "Fusion");
		addEEnumLiteral(fusionEEnum, Fusion.CLASSIFICATION);
		addEEnumLiteral(fusionEEnum, Fusion.EVENT_DETECTION);
		addEEnumLiteral(fusionEEnum, Fusion.TRACKING);
		addEEnumLiteral(fusionEEnum, Fusion.DECISION_MAKING);

		initEEnum(aggregationEEnum, Aggregation.class, "Aggregation");
		addEEnumLiteral(aggregationEEnum, Aggregation.FILTERING);
		addEEnumLiteral(aggregationEEnum, Aggregation.COMPRESSION);
		addEEnumLiteral(aggregationEEnum, Aggregation.MAX);
		addEEnumLiteral(aggregationEEnum, Aggregation.MIN);
		addEEnumLiteral(aggregationEEnum, Aggregation.AVG);
		addEEnumLiteral(aggregationEEnum, Aggregation.COUNT);

		initEEnum(positionEEnum, Position.class, "Position");
		addEEnumLiteral(positionEEnum, Position.MOBILE);
		addEEnumLiteral(positionEEnum, Position.STATIC);

		initEEnum(routingProtocolEEnum, RoutingProtocol.class, "RoutingProtocol");
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.LEACH);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.LQRP);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.SPIN);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.AODV);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.DODV);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.DSR);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.DSDV);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.GSR);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.HEED);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.GAF);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.GEAR);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.TBF);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.EAD);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.PEGASIS);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.TEEN);
		addEEnumLiteral(routingProtocolEEnum, RoutingProtocol.SPEED);

		initEEnum(interNodeCommEEnum, InterNodeComm.class, "InterNodeComm");
		addEEnumLiteral(interNodeCommEEnum, InterNodeComm.BT);
		addEEnumLiteral(interNodeCommEEnum, InterNodeComm.ZIGBEE);
		addEEnumLiteral(interNodeCommEEnum, InterNodeComm.WLAN);
		addEEnumLiteral(interNodeCommEEnum, InterNodeComm.RF);

		initEEnum(jobScheduleEEnum, JobSchedule.class, "JobSchedule");
		addEEnumLiteral(jobScheduleEEnum, JobSchedule.START);
		addEEnumLiteral(jobScheduleEEnum, JobSchedule.STOP);

		initEEnum(logicalSymbolEEnum, LogicalSymbol.class, "LogicalSymbol");
		addEEnumLiteral(logicalSymbolEEnum, LogicalSymbol.EQUAL);
		addEEnumLiteral(logicalSymbolEEnum, LogicalSymbol.GREATER_THAN);
		addEEnumLiteral(logicalSymbolEEnum, LogicalSymbol.GREATER_OR_EQUAL_THAN);
		addEEnumLiteral(logicalSymbolEEnum, LogicalSymbol.LESS_THAN);
		addEEnumLiteral(logicalSymbolEEnum, LogicalSymbol.LESS_OR_EQUAL_THAN);
		addEEnumLiteral(logicalSymbolEEnum, LogicalSymbol.NOT);
	}

} //EnumsPackageImpl
