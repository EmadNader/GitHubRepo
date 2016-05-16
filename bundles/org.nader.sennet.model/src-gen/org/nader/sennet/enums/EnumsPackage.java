/**
 */
package org.nader.sennet.enums;

import org.eclipse.emf.ecore.EEnum;
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
 * @see org.nader.sennet.enums.EnumsFactory
 * @model kind="package"
 * @generated
 */
public interface EnumsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enums";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet/enums";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sne";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumsPackage eINSTANCE = org.nader.sennet.enums.impl.EnumsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.enums.Fusion <em>Fusion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.enums.Fusion
	 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getFusion()
	 * @generated
	 */
	int FUSION = 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.enums.Aggregation <em>Aggregation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.enums.Aggregation
	 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 1;

	/**
	 * The meta object id for the '{@link org.nader.sennet.enums.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.enums.Position
	 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 2;

	/**
	 * The meta object id for the '{@link org.nader.sennet.enums.RoutingProtocol <em>Routing Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.enums.RoutingProtocol
	 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getRoutingProtocol()
	 * @generated
	 */
	int ROUTING_PROTOCOL = 3;

	/**
	 * The meta object id for the '{@link org.nader.sennet.enums.InterNodeComm <em>Inter Node Comm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.enums.InterNodeComm
	 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getInterNodeComm()
	 * @generated
	 */
	int INTER_NODE_COMM = 4;

	/**
	 * The meta object id for the '{@link org.nader.sennet.enums.JobSchedule <em>Job Schedule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.enums.JobSchedule
	 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getJobSchedule()
	 * @generated
	 */
	int JOB_SCHEDULE = 5;

	/**
	 * The meta object id for the '{@link org.nader.sennet.enums.LogicalSymbol <em>Logical Symbol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.enums.LogicalSymbol
	 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getLogicalSymbol()
	 * @generated
	 */
	int LOGICAL_SYMBOL = 6;


	/**
	 * Returns the meta object for enum '{@link org.nader.sennet.enums.Fusion <em>Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fusion</em>'.
	 * @see org.nader.sennet.enums.Fusion
	 * @generated
	 */
	EEnum getFusion();

	/**
	 * Returns the meta object for enum '{@link org.nader.sennet.enums.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation</em>'.
	 * @see org.nader.sennet.enums.Aggregation
	 * @generated
	 */
	EEnum getAggregation();

	/**
	 * Returns the meta object for enum '{@link org.nader.sennet.enums.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see org.nader.sennet.enums.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link org.nader.sennet.enums.RoutingProtocol <em>Routing Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Routing Protocol</em>'.
	 * @see org.nader.sennet.enums.RoutingProtocol
	 * @generated
	 */
	EEnum getRoutingProtocol();

	/**
	 * Returns the meta object for enum '{@link org.nader.sennet.enums.InterNodeComm <em>Inter Node Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inter Node Comm</em>'.
	 * @see org.nader.sennet.enums.InterNodeComm
	 * @generated
	 */
	EEnum getInterNodeComm();

	/**
	 * Returns the meta object for enum '{@link org.nader.sennet.enums.JobSchedule <em>Job Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Schedule</em>'.
	 * @see org.nader.sennet.enums.JobSchedule
	 * @generated
	 */
	EEnum getJobSchedule();

	/**
	 * Returns the meta object for enum '{@link org.nader.sennet.enums.LogicalSymbol <em>Logical Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Symbol</em>'.
	 * @see org.nader.sennet.enums.LogicalSymbol
	 * @generated
	 */
	EEnum getLogicalSymbol();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumsFactory getEnumsFactory();

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
		 * The meta object literal for the '{@link org.nader.sennet.enums.Fusion <em>Fusion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.enums.Fusion
		 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getFusion()
		 * @generated
		 */
		EEnum FUSION = eINSTANCE.getFusion();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.enums.Aggregation <em>Aggregation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.enums.Aggregation
		 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getAggregation()
		 * @generated
		 */
		EEnum AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.enums.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.enums.Position
		 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.enums.RoutingProtocol <em>Routing Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.enums.RoutingProtocol
		 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getRoutingProtocol()
		 * @generated
		 */
		EEnum ROUTING_PROTOCOL = eINSTANCE.getRoutingProtocol();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.enums.InterNodeComm <em>Inter Node Comm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.enums.InterNodeComm
		 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getInterNodeComm()
		 * @generated
		 */
		EEnum INTER_NODE_COMM = eINSTANCE.getInterNodeComm();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.enums.JobSchedule <em>Job Schedule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.enums.JobSchedule
		 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getJobSchedule()
		 * @generated
		 */
		EEnum JOB_SCHEDULE = eINSTANCE.getJobSchedule();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.enums.LogicalSymbol <em>Logical Symbol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.enums.LogicalSymbol
		 * @see org.nader.sennet.enums.impl.EnumsPackageImpl#getLogicalSymbol()
		 * @generated
		 */
		EEnum LOGICAL_SYMBOL = eINSTANCE.getLogicalSymbol();

	}

} //EnumsPackage
