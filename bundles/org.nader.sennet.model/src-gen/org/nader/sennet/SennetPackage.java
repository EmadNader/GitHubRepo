/**
 */
package org.nader.sennet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.nader.sennet.SennetFactory
 * @model kind="package"
 * @generated
 */
public interface SennetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sennet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet";

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
	SennetPackage eINSTANCE = org.nader.sennet.impl.SennetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.impl.WSNappImpl <em>WS Napp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.impl.WSNappImpl
	 * @see org.nader.sennet.impl.SennetPackageImpl#getWSNapp()
	 * @generated
	 */
	int WS_NAPP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_NAPP__ID = ToplevelstructurePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_NAPP__NAME = ToplevelstructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_NAPP__NETWORK = ToplevelstructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_NAPP__JOBS = ToplevelstructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WS Napp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_NAPP_FEATURE_COUNT = ToplevelstructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>WS Napp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_NAPP_OPERATION_COUNT = ToplevelstructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.impl.LogicalConditionImpl <em>Logical Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.impl.LogicalConditionImpl
	 * @see org.nader.sennet.impl.SennetPackageImpl#getLogicalCondition()
	 * @generated
	 */
	int LOGICAL_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Job Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__JOB_SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>Sensor Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__SENSOR_TERM = 1;

	/**
	 * The feature id for the '<em><b>Logical Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__LOGICAL_SYMBOL = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION__UNIT = 4;

	/**
	 * The number of structural features of the '<em>Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Logical Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONDITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.WSNapp <em>WS Napp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WS Napp</em>'.
	 * @see org.nader.sennet.WSNapp
	 * @generated
	 */
	EClass getWSNapp();

	/**
	 * Returns the meta object for the containment reference '{@link org.nader.sennet.WSNapp#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see org.nader.sennet.WSNapp#getNetwork()
	 * @see #getWSNapp()
	 * @generated
	 */
	EReference getWSNapp_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nader.sennet.WSNapp#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see org.nader.sennet.WSNapp#getJobs()
	 * @see #getWSNapp()
	 * @generated
	 */
	EReference getWSNapp_Jobs();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.LogicalCondition <em>Logical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Condition</em>'.
	 * @see org.nader.sennet.LogicalCondition
	 * @generated
	 */
	EClass getLogicalCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.LogicalCondition#getJobSchedule <em>Job Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Schedule</em>'.
	 * @see org.nader.sennet.LogicalCondition#getJobSchedule()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EAttribute getLogicalCondition_JobSchedule();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.LogicalCondition#getSensorTerm <em>Sensor Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Term</em>'.
	 * @see org.nader.sennet.LogicalCondition#getSensorTerm()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EAttribute getLogicalCondition_SensorTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.LogicalCondition#getLogicalSymbol <em>Logical Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Symbol</em>'.
	 * @see org.nader.sennet.LogicalCondition#getLogicalSymbol()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EAttribute getLogicalCondition_LogicalSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.LogicalCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nader.sennet.LogicalCondition#getValue()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EAttribute getLogicalCondition_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.LogicalCondition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.nader.sennet.LogicalCondition#getUnit()
	 * @see #getLogicalCondition()
	 * @generated
	 */
	EAttribute getLogicalCondition_Unit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SennetFactory getSennetFactory();

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
		 * The meta object literal for the '{@link org.nader.sennet.impl.WSNappImpl <em>WS Napp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.impl.WSNappImpl
		 * @see org.nader.sennet.impl.SennetPackageImpl#getWSNapp()
		 * @generated
		 */
		EClass WS_NAPP = eINSTANCE.getWSNapp();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WS_NAPP__NETWORK = eINSTANCE.getWSNapp_Network();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WS_NAPP__JOBS = eINSTANCE.getWSNapp_Jobs();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.impl.LogicalConditionImpl <em>Logical Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.impl.LogicalConditionImpl
		 * @see org.nader.sennet.impl.SennetPackageImpl#getLogicalCondition()
		 * @generated
		 */
		EClass LOGICAL_CONDITION = eINSTANCE.getLogicalCondition();

		/**
		 * The meta object literal for the '<em><b>Job Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CONDITION__JOB_SCHEDULE = eINSTANCE.getLogicalCondition_JobSchedule();

		/**
		 * The meta object literal for the '<em><b>Sensor Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CONDITION__SENSOR_TERM = eINSTANCE.getLogicalCondition_SensorTerm();

		/**
		 * The meta object literal for the '<em><b>Logical Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CONDITION__LOGICAL_SYMBOL = eINSTANCE.getLogicalCondition_LogicalSymbol();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CONDITION__VALUE = eINSTANCE.getLogicalCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CONDITION__UNIT = eINSTANCE.getLogicalCondition_Unit();

	}

} //SennetPackage
