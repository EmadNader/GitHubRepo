/**
 */
package org.nader.sennet.job;

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
 * @see org.nader.sennet.job.JobFactory
 * @model kind="package"
 * @generated
 */
public interface JobPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "job";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet/jb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobPackage eINSTANCE = org.nader.sennet.job.impl.JobPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.AbstractJobImpl <em>Abstract Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.AbstractJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getAbstractJob()
	 * @generated
	 */
	int ABSTRACT_JOB = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__ID = ToplevelstructurePackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__ACTION = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB_FEATURE_COUNT = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB_OPERATION_COUNT = ToplevelstructurePackage.IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.ContinuousJobImpl <em>Continuous Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.ContinuousJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getContinuousJob()
	 * @generated
	 */
	int CONTINUOUS_JOB = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_JOB__ACTION = ABSTRACT_JOB__ACTION;

	/**
	 * The number of structural features of the '<em>Continuous Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Continuous Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.EventDrivenJobImpl <em>Event Driven Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.EventDrivenJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getEventDrivenJob()
	 * @generated
	 */
	int EVENT_DRIVEN_JOB = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN_JOB__ACTION = ABSTRACT_JOB__ACTION;

	/**
	 * The feature id for the '<em><b>Event Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN_JOB__EVENT_CONDITION = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Driven Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Driven Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.PeriodicJobImpl <em>Periodic Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.PeriodicJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getPeriodicJob()
	 * @generated
	 */
	int PERIODIC_JOB = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_JOB__ACTION = ABSTRACT_JOB__ACTION;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_JOB__TIMER = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Periodic Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Periodic Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.RequestReplayJobImpl <em>Request Replay Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.RequestReplayJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getRequestReplayJob()
	 * @generated
	 */
	int REQUEST_REPLAY_JOB = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_REPLAY_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_REPLAY_JOB__ACTION = ABSTRACT_JOB__ACTION;

	/**
	 * The number of structural features of the '<em>Request Replay Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_REPLAY_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Replay Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_REPLAY_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.AbstractJob <em>Abstract Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Job</em>'.
	 * @see org.nader.sennet.job.AbstractJob
	 * @generated
	 */
	EClass getAbstractJob();

	/**
	 * Returns the meta object for the containment reference '{@link org.nader.sennet.job.AbstractJob#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.nader.sennet.job.AbstractJob#getAction()
	 * @see #getAbstractJob()
	 * @generated
	 */
	EReference getAbstractJob_Action();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.ContinuousJob <em>Continuous Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Job</em>'.
	 * @see org.nader.sennet.job.ContinuousJob
	 * @generated
	 */
	EClass getContinuousJob();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.EventDrivenJob <em>Event Driven Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Driven Job</em>'.
	 * @see org.nader.sennet.job.EventDrivenJob
	 * @generated
	 */
	EClass getEventDrivenJob();

	/**
	 * Returns the meta object for the containment reference '{@link org.nader.sennet.job.EventDrivenJob#getEventCondition <em>Event Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Condition</em>'.
	 * @see org.nader.sennet.job.EventDrivenJob#getEventCondition()
	 * @see #getEventDrivenJob()
	 * @generated
	 */
	EReference getEventDrivenJob_EventCondition();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.PeriodicJob <em>Periodic Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Job</em>'.
	 * @see org.nader.sennet.job.PeriodicJob
	 * @generated
	 */
	EClass getPeriodicJob();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.PeriodicJob#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see org.nader.sennet.job.PeriodicJob#getTimer()
	 * @see #getPeriodicJob()
	 * @generated
	 */
	EAttribute getPeriodicJob_Timer();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.RequestReplayJob <em>Request Replay Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Replay Job</em>'.
	 * @see org.nader.sennet.job.RequestReplayJob
	 * @generated
	 */
	EClass getRequestReplayJob();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobFactory getJobFactory();

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
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.AbstractJobImpl <em>Abstract Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.AbstractJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getAbstractJob()
		 * @generated
		 */
		EClass ABSTRACT_JOB = eINSTANCE.getAbstractJob();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB__ACTION = eINSTANCE.getAbstractJob_Action();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.ContinuousJobImpl <em>Continuous Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.ContinuousJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getContinuousJob()
		 * @generated
		 */
		EClass CONTINUOUS_JOB = eINSTANCE.getContinuousJob();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.EventDrivenJobImpl <em>Event Driven Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.EventDrivenJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getEventDrivenJob()
		 * @generated
		 */
		EClass EVENT_DRIVEN_JOB = eINSTANCE.getEventDrivenJob();

		/**
		 * The meta object literal for the '<em><b>Event Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_DRIVEN_JOB__EVENT_CONDITION = eINSTANCE.getEventDrivenJob_EventCondition();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.PeriodicJobImpl <em>Periodic Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.PeriodicJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getPeriodicJob()
		 * @generated
		 */
		EClass PERIODIC_JOB = eINSTANCE.getPeriodicJob();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_JOB__TIMER = eINSTANCE.getPeriodicJob_Timer();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.RequestReplayJobImpl <em>Request Replay Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.RequestReplayJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getRequestReplayJob()
		 * @generated
		 */
		EClass REQUEST_REPLAY_JOB = eINSTANCE.getRequestReplayJob();

	}

} //JobPackage
