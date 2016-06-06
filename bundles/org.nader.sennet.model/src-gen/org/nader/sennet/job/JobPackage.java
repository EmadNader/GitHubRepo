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
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__JOB_TARGET_NODE = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__JOB_TARGET_NETWORK = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__START_END_TRIGGER = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB__JOBACTION = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB_FEATURE_COUNT = ToplevelstructurePackage.IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB_OPERATION_COUNT = ToplevelstructurePackage.IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.SenseForwardJobImpl <em>Sense Forward Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.SenseForwardJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getSenseForwardJob()
	 * @generated
	 */
	int SENSE_FORWARD_JOB = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The feature id for the '<em><b>Sensing Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_JOB__SENSING_THRESHOLD = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sense Forward Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sense Forward Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.AggregationJobImpl <em>Aggregation Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.AggregationJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getAggregationJob()
	 * @generated
	 */
	int AGGREGATION_JOB = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_JOB__AGGREGATION = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregation Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aggregation Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.FusionJobImpl <em>Fusion Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.FusionJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getFusionJob()
	 * @generated
	 */
	int FUSION_JOB = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The feature id for the '<em><b>Fusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_JOB__FUSION = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fusion Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fusion Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.SenseNowJobImpl <em>Sense Now Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.SenseNowJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getSenseNowJob()
	 * @generated
	 */
	int SENSE_NOW_JOB = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The number of structural features of the '<em>Sense Now Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sense Now Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_NOW_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.SinkJobImpl <em>Sink Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.SinkJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getSinkJob()
	 * @generated
	 */
	int SINK_JOB = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The number of structural features of the '<em>Sink Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.impl.RegularSenseJobImpl <em>Regular Sense Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.impl.RegularSenseJobImpl
	 * @see org.nader.sennet.job.impl.JobPackageImpl#getRegularSenseJob()
	 * @generated
	 */
	int REGULAR_SENSE_JOB = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SENSE_JOB__ID = ABSTRACT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job Target Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SENSE_JOB__JOB_TARGET_NODE = ABSTRACT_JOB__JOB_TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Job Target Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SENSE_JOB__JOB_TARGET_NETWORK = ABSTRACT_JOB__JOB_TARGET_NETWORK;

	/**
	 * The feature id for the '<em><b>Start End Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SENSE_JOB__START_END_TRIGGER = ABSTRACT_JOB__START_END_TRIGGER;

	/**
	 * The feature id for the '<em><b>Jobaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SENSE_JOB__JOBACTION = ABSTRACT_JOB__JOBACTION;

	/**
	 * The feature id for the '<em><b>Sensing Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SENSE_JOB__SENSING_THRESHOLD = ABSTRACT_JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regular Sense Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SENSE_JOB_FEATURE_COUNT = ABSTRACT_JOB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regular Sense Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_SENSE_JOB_OPERATION_COUNT = ABSTRACT_JOB_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference '{@link org.nader.sennet.job.AbstractJob#getJobTargetNode <em>Job Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Target Node</em>'.
	 * @see org.nader.sennet.job.AbstractJob#getJobTargetNode()
	 * @see #getAbstractJob()
	 * @generated
	 */
	EReference getAbstractJob_JobTargetNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.nader.sennet.job.AbstractJob#getJobTargetNetwork <em>Job Target Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Target Network</em>'.
	 * @see org.nader.sennet.job.AbstractJob#getJobTargetNetwork()
	 * @see #getAbstractJob()
	 * @generated
	 */
	EReference getAbstractJob_JobTargetNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nader.sennet.job.AbstractJob#getStartEndTrigger <em>Start End Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start End Trigger</em>'.
	 * @see org.nader.sennet.job.AbstractJob#getStartEndTrigger()
	 * @see #getAbstractJob()
	 * @generated
	 */
	EReference getAbstractJob_StartEndTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nader.sennet.job.AbstractJob#getJobaction <em>Jobaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobaction</em>'.
	 * @see org.nader.sennet.job.AbstractJob#getJobaction()
	 * @see #getAbstractJob()
	 * @generated
	 */
	EReference getAbstractJob_Jobaction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.SenseForwardJob <em>Sense Forward Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Forward Job</em>'.
	 * @see org.nader.sennet.job.SenseForwardJob
	 * @generated
	 */
	EClass getSenseForwardJob();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.SenseForwardJob#getSensingThreshold <em>Sensing Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensing Threshold</em>'.
	 * @see org.nader.sennet.job.SenseForwardJob#getSensingThreshold()
	 * @see #getSenseForwardJob()
	 * @generated
	 */
	EAttribute getSenseForwardJob_SensingThreshold();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.AggregationJob <em>Aggregation Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Job</em>'.
	 * @see org.nader.sennet.job.AggregationJob
	 * @generated
	 */
	EClass getAggregationJob();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.AggregationJob#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see org.nader.sennet.job.AggregationJob#getAggregation()
	 * @see #getAggregationJob()
	 * @generated
	 */
	EAttribute getAggregationJob_Aggregation();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.FusionJob <em>Fusion Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fusion Job</em>'.
	 * @see org.nader.sennet.job.FusionJob
	 * @generated
	 */
	EClass getFusionJob();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.FusionJob#getFusion <em>Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fusion</em>'.
	 * @see org.nader.sennet.job.FusionJob#getFusion()
	 * @see #getFusionJob()
	 * @generated
	 */
	EAttribute getFusionJob_Fusion();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.SenseNowJob <em>Sense Now Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Now Job</em>'.
	 * @see org.nader.sennet.job.SenseNowJob
	 * @generated
	 */
	EClass getSenseNowJob();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.SinkJob <em>Sink Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Job</em>'.
	 * @see org.nader.sennet.job.SinkJob
	 * @generated
	 */
	EClass getSinkJob();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.RegularSenseJob <em>Regular Sense Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular Sense Job</em>'.
	 * @see org.nader.sennet.job.RegularSenseJob
	 * @generated
	 */
	EClass getRegularSenseJob();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.RegularSenseJob#getSensingThreshold <em>Sensing Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensing Threshold</em>'.
	 * @see org.nader.sennet.job.RegularSenseJob#getSensingThreshold()
	 * @see #getRegularSenseJob()
	 * @generated
	 */
	EAttribute getRegularSenseJob_SensingThreshold();

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
		 * The meta object literal for the '<em><b>Job Target Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB__JOB_TARGET_NODE = eINSTANCE.getAbstractJob_JobTargetNode();

		/**
		 * The meta object literal for the '<em><b>Job Target Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB__JOB_TARGET_NETWORK = eINSTANCE.getAbstractJob_JobTargetNetwork();

		/**
		 * The meta object literal for the '<em><b>Start End Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB__START_END_TRIGGER = eINSTANCE.getAbstractJob_StartEndTrigger();

		/**
		 * The meta object literal for the '<em><b>Jobaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB__JOBACTION = eINSTANCE.getAbstractJob_Jobaction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.SenseForwardJobImpl <em>Sense Forward Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.SenseForwardJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getSenseForwardJob()
		 * @generated
		 */
		EClass SENSE_FORWARD_JOB = eINSTANCE.getSenseForwardJob();

		/**
		 * The meta object literal for the '<em><b>Sensing Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE_FORWARD_JOB__SENSING_THRESHOLD = eINSTANCE.getSenseForwardJob_SensingThreshold();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.AggregationJobImpl <em>Aggregation Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.AggregationJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getAggregationJob()
		 * @generated
		 */
		EClass AGGREGATION_JOB = eINSTANCE.getAggregationJob();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_JOB__AGGREGATION = eINSTANCE.getAggregationJob_Aggregation();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.FusionJobImpl <em>Fusion Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.FusionJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getFusionJob()
		 * @generated
		 */
		EClass FUSION_JOB = eINSTANCE.getFusionJob();

		/**
		 * The meta object literal for the '<em><b>Fusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUSION_JOB__FUSION = eINSTANCE.getFusionJob_Fusion();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.SenseNowJobImpl <em>Sense Now Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.SenseNowJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getSenseNowJob()
		 * @generated
		 */
		EClass SENSE_NOW_JOB = eINSTANCE.getSenseNowJob();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.SinkJobImpl <em>Sink Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.SinkJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getSinkJob()
		 * @generated
		 */
		EClass SINK_JOB = eINSTANCE.getSinkJob();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.impl.RegularSenseJobImpl <em>Regular Sense Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.impl.RegularSenseJobImpl
		 * @see org.nader.sennet.job.impl.JobPackageImpl#getRegularSenseJob()
		 * @generated
		 */
		EClass REGULAR_SENSE_JOB = eINSTANCE.getRegularSenseJob();

		/**
		 * The meta object literal for the '<em><b>Sensing Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULAR_SENSE_JOB__SENSING_THRESHOLD = eINSTANCE.getRegularSenseJob_SensingThreshold();

	}

} //JobPackage
