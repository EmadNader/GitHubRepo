/**
 */
package org.nader.sennet.job.actions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.nader.sennet.job.actions.ActionsFactory
 * @model kind="package"
 * @generated
 */
public interface ActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "actions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.nader.org/sennet/jb/ac";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionsPackage eINSTANCE = org.nader.sennet.job.actions.impl.ActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.AbstractJobActionImpl <em>Abstract Job Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.AbstractJobActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAbstractJobAction()
	 * @generated
	 */
	int ABSTRACT_JOB_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB_ACTION__SINK_NODE = 0;

	/**
	 * The number of structural features of the '<em>Abstract Job Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Job Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JOB_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.AbstractCommonJobActionImpl <em>Abstract Common Job Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.AbstractCommonJobActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAbstractCommonJobAction()
	 * @generated
	 */
	int ABSTRACT_COMMON_JOB_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_JOB_ACTION__SINK_NODE = ABSTRACT_JOB_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE = ABSTRACT_JOB_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Common Job Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_JOB_ACTION_FEATURE_COUNT = ABSTRACT_JOB_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Common Job Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMON_JOB_ACTION_OPERATION_COUNT = ABSTRACT_JOB_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.AbstractNodeMemoryActionImpl <em>Abstract Node Memory Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.AbstractNodeMemoryActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAbstractNodeMemoryAction()
	 * @generated
	 */
	int ABSTRACT_NODE_MEMORY_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION__SINK_NODE = ABSTRACT_COMMON_JOB_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION__TARGET_NODE = ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>Abstract Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION_FEATURE_COUNT = ABSTRACT_COMMON_JOB_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_MEMORY_ACTION_OPERATION_COUNT = ABSTRACT_COMMON_JOB_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.AbstractMessageActionImpl <em>Abstract Message Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.AbstractMessageActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAbstractMessageAction()
	 * @generated
	 */
	int ABSTRACT_MESSAGE_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESSAGE_ACTION__SINK_NODE = ABSTRACT_COMMON_JOB_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESSAGE_ACTION__TARGET_NODE = ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>Abstract Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESSAGE_ACTION_FEATURE_COUNT = ABSTRACT_COMMON_JOB_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESSAGE_ACTION_OPERATION_COUNT = ABSTRACT_COMMON_JOB_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.SenseForwardActionImpl <em>Sense Forward Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.SenseForwardActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getSenseForwardAction()
	 * @generated
	 */
	int SENSE_FORWARD_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_ACTION__SINK_NODE = ABSTRACT_COMMON_JOB_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_ACTION__TARGET_NODE = ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>Sense Forward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_ACTION_FEATURE_COUNT = ABSTRACT_COMMON_JOB_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sense Forward Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FORWARD_ACTION_OPERATION_COUNT = ABSTRACT_COMMON_JOB_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.AggregationActionImpl <em>Aggregation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.AggregationActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAggregationAction()
	 * @generated
	 */
	int AGGREGATION_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_ACTION__SINK_NODE = ABSTRACT_COMMON_JOB_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_ACTION__TARGET_NODE = ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_ACTION__AGGREGATION = ABSTRACT_COMMON_JOB_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_ACTION_FEATURE_COUNT = ABSTRACT_COMMON_JOB_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aggregation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_ACTION_OPERATION_COUNT = ABSTRACT_COMMON_JOB_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.FusionActionImpl <em>Fusion Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.FusionActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getFusionAction()
	 * @generated
	 */
	int FUSION_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_ACTION__SINK_NODE = ABSTRACT_JOB_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Fusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_ACTION__FUSION = ABSTRACT_JOB_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compu Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_ACTION__COMPU_NODE = ABSTRACT_JOB_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cluster Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_ACTION__CLUSTER_HEAD = ABSTRACT_JOB_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fusion Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_ACTION_FEATURE_COUNT = ABSTRACT_JOB_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fusion Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUSION_ACTION_OPERATION_COUNT = ABSTRACT_JOB_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.ReadNodeMemoryActionImpl <em>Read Node Memory Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.ReadNodeMemoryActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getReadNodeMemoryAction()
	 * @generated
	 */
	int READ_NODE_MEMORY_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION__SINK_NODE = ABSTRACT_NODE_MEMORY_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION__TARGET_NODE = ABSTRACT_NODE_MEMORY_ACTION__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>Read Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION_FEATURE_COUNT = ABSTRACT_NODE_MEMORY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_NODE_MEMORY_ACTION_OPERATION_COUNT = ABSTRACT_NODE_MEMORY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.WriteNodeMemoryActionImpl <em>Write Node Memory Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.WriteNodeMemoryActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getWriteNodeMemoryAction()
	 * @generated
	 */
	int WRITE_NODE_MEMORY_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION__SINK_NODE = ABSTRACT_NODE_MEMORY_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION__TARGET_NODE = ABSTRACT_NODE_MEMORY_ACTION__TARGET_NODE;

	/**
	 * The number of structural features of the '<em>Write Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION_FEATURE_COUNT = ABSTRACT_NODE_MEMORY_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Write Node Memory Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_NODE_MEMORY_ACTION_OPERATION_COUNT = ABSTRACT_NODE_MEMORY_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.SendMessageActionImpl <em>Send Message Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.SendMessageActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getSendMessageAction()
	 * @generated
	 */
	int SEND_MESSAGE_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__SINK_NODE = ABSTRACT_MESSAGE_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__TARGET_NODE = ABSTRACT_MESSAGE_ACTION__TARGET_NODE;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__OUT_PORT = ABSTRACT_MESSAGE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION__TEXT = ABSTRACT_MESSAGE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION_FEATURE_COUNT = ABSTRACT_MESSAGE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Send Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_ACTION_OPERATION_COUNT = ABSTRACT_MESSAGE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nader.sennet.job.actions.impl.ReceiveMessageActionImpl <em>Receive Message Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nader.sennet.job.actions.impl.ReceiveMessageActionImpl
	 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getReceiveMessageAction()
	 * @generated
	 */
	int RECEIVE_MESSAGE_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Sink Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_ACTION__SINK_NODE = ABSTRACT_MESSAGE_ACTION__SINK_NODE;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_ACTION__TARGET_NODE = ABSTRACT_MESSAGE_ACTION__TARGET_NODE;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_ACTION__IN_PORT = ABSTRACT_MESSAGE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Receive Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_ACTION_FEATURE_COUNT = ABSTRACT_MESSAGE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Receive Message Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_ACTION_OPERATION_COUNT = ABSTRACT_MESSAGE_ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.AbstractJobAction <em>Abstract Job Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Job Action</em>'.
	 * @see org.nader.sennet.job.actions.AbstractJobAction
	 * @generated
	 */
	EClass getAbstractJobAction();

	/**
	 * Returns the meta object for the reference '{@link org.nader.sennet.job.actions.AbstractJobAction#getSinkNode <em>Sink Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sink Node</em>'.
	 * @see org.nader.sennet.job.actions.AbstractJobAction#getSinkNode()
	 * @see #getAbstractJobAction()
	 * @generated
	 */
	EReference getAbstractJobAction_SinkNode();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.AbstractCommonJobAction <em>Abstract Common Job Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Common Job Action</em>'.
	 * @see org.nader.sennet.job.actions.AbstractCommonJobAction
	 * @generated
	 */
	EClass getAbstractCommonJobAction();

	/**
	 * Returns the meta object for the reference '{@link org.nader.sennet.job.actions.AbstractCommonJobAction#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Node</em>'.
	 * @see org.nader.sennet.job.actions.AbstractCommonJobAction#getTargetNode()
	 * @see #getAbstractCommonJobAction()
	 * @generated
	 */
	EReference getAbstractCommonJobAction_TargetNode();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.AbstractNodeMemoryAction <em>Abstract Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node Memory Action</em>'.
	 * @see org.nader.sennet.job.actions.AbstractNodeMemoryAction
	 * @generated
	 */
	EClass getAbstractNodeMemoryAction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.AbstractMessageAction <em>Abstract Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Message Action</em>'.
	 * @see org.nader.sennet.job.actions.AbstractMessageAction
	 * @generated
	 */
	EClass getAbstractMessageAction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.SenseForwardAction <em>Sense Forward Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense Forward Action</em>'.
	 * @see org.nader.sennet.job.actions.SenseForwardAction
	 * @generated
	 */
	EClass getSenseForwardAction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.AggregationAction <em>Aggregation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Action</em>'.
	 * @see org.nader.sennet.job.actions.AggregationAction
	 * @generated
	 */
	EClass getAggregationAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.actions.AggregationAction#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see org.nader.sennet.job.actions.AggregationAction#getAggregation()
	 * @see #getAggregationAction()
	 * @generated
	 */
	EAttribute getAggregationAction_Aggregation();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.FusionAction <em>Fusion Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fusion Action</em>'.
	 * @see org.nader.sennet.job.actions.FusionAction
	 * @generated
	 */
	EClass getFusionAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.actions.FusionAction#getFusion <em>Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fusion</em>'.
	 * @see org.nader.sennet.job.actions.FusionAction#getFusion()
	 * @see #getFusionAction()
	 * @generated
	 */
	EAttribute getFusionAction_Fusion();

	/**
	 * Returns the meta object for the reference '{@link org.nader.sennet.job.actions.FusionAction#getCompuNode <em>Compu Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compu Node</em>'.
	 * @see org.nader.sennet.job.actions.FusionAction#getCompuNode()
	 * @see #getFusionAction()
	 * @generated
	 */
	EReference getFusionAction_CompuNode();

	/**
	 * Returns the meta object for the reference '{@link org.nader.sennet.job.actions.FusionAction#getClusterHead <em>Cluster Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster Head</em>'.
	 * @see org.nader.sennet.job.actions.FusionAction#getClusterHead()
	 * @see #getFusionAction()
	 * @generated
	 */
	EReference getFusionAction_ClusterHead();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.ReadNodeMemoryAction <em>Read Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Node Memory Action</em>'.
	 * @see org.nader.sennet.job.actions.ReadNodeMemoryAction
	 * @generated
	 */
	EClass getReadNodeMemoryAction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.WriteNodeMemoryAction <em>Write Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Node Memory Action</em>'.
	 * @see org.nader.sennet.job.actions.WriteNodeMemoryAction
	 * @generated
	 */
	EClass getWriteNodeMemoryAction();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.SendMessageAction <em>Send Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message Action</em>'.
	 * @see org.nader.sennet.job.actions.SendMessageAction
	 * @generated
	 */
	EClass getSendMessageAction();

	/**
	 * Returns the meta object for the reference '{@link org.nader.sennet.job.actions.SendMessageAction#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Port</em>'.
	 * @see org.nader.sennet.job.actions.SendMessageAction#getOutPort()
	 * @see #getSendMessageAction()
	 * @generated
	 */
	EReference getSendMessageAction_OutPort();

	/**
	 * Returns the meta object for the attribute '{@link org.nader.sennet.job.actions.SendMessageAction#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nader.sennet.job.actions.SendMessageAction#getText()
	 * @see #getSendMessageAction()
	 * @generated
	 */
	EAttribute getSendMessageAction_Text();

	/**
	 * Returns the meta object for class '{@link org.nader.sennet.job.actions.ReceiveMessageAction <em>Receive Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Message Action</em>'.
	 * @see org.nader.sennet.job.actions.ReceiveMessageAction
	 * @generated
	 */
	EClass getReceiveMessageAction();

	/**
	 * Returns the meta object for the reference '{@link org.nader.sennet.job.actions.ReceiveMessageAction#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Port</em>'.
	 * @see org.nader.sennet.job.actions.ReceiveMessageAction#getInPort()
	 * @see #getReceiveMessageAction()
	 * @generated
	 */
	EReference getReceiveMessageAction_InPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionsFactory getActionsFactory();

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
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.AbstractJobActionImpl <em>Abstract Job Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.AbstractJobActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAbstractJobAction()
		 * @generated
		 */
		EClass ABSTRACT_JOB_ACTION = eINSTANCE.getAbstractJobAction();

		/**
		 * The meta object literal for the '<em><b>Sink Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_JOB_ACTION__SINK_NODE = eINSTANCE.getAbstractJobAction_SinkNode();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.AbstractCommonJobActionImpl <em>Abstract Common Job Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.AbstractCommonJobActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAbstractCommonJobAction()
		 * @generated
		 */
		EClass ABSTRACT_COMMON_JOB_ACTION = eINSTANCE.getAbstractCommonJobAction();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMON_JOB_ACTION__TARGET_NODE = eINSTANCE.getAbstractCommonJobAction_TargetNode();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.AbstractNodeMemoryActionImpl <em>Abstract Node Memory Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.AbstractNodeMemoryActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAbstractNodeMemoryAction()
		 * @generated
		 */
		EClass ABSTRACT_NODE_MEMORY_ACTION = eINSTANCE.getAbstractNodeMemoryAction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.AbstractMessageActionImpl <em>Abstract Message Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.AbstractMessageActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAbstractMessageAction()
		 * @generated
		 */
		EClass ABSTRACT_MESSAGE_ACTION = eINSTANCE.getAbstractMessageAction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.SenseForwardActionImpl <em>Sense Forward Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.SenseForwardActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getSenseForwardAction()
		 * @generated
		 */
		EClass SENSE_FORWARD_ACTION = eINSTANCE.getSenseForwardAction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.AggregationActionImpl <em>Aggregation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.AggregationActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getAggregationAction()
		 * @generated
		 */
		EClass AGGREGATION_ACTION = eINSTANCE.getAggregationAction();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_ACTION__AGGREGATION = eINSTANCE.getAggregationAction_Aggregation();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.FusionActionImpl <em>Fusion Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.FusionActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getFusionAction()
		 * @generated
		 */
		EClass FUSION_ACTION = eINSTANCE.getFusionAction();

		/**
		 * The meta object literal for the '<em><b>Fusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUSION_ACTION__FUSION = eINSTANCE.getFusionAction_Fusion();

		/**
		 * The meta object literal for the '<em><b>Compu Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUSION_ACTION__COMPU_NODE = eINSTANCE.getFusionAction_CompuNode();

		/**
		 * The meta object literal for the '<em><b>Cluster Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUSION_ACTION__CLUSTER_HEAD = eINSTANCE.getFusionAction_ClusterHead();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.ReadNodeMemoryActionImpl <em>Read Node Memory Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.ReadNodeMemoryActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getReadNodeMemoryAction()
		 * @generated
		 */
		EClass READ_NODE_MEMORY_ACTION = eINSTANCE.getReadNodeMemoryAction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.WriteNodeMemoryActionImpl <em>Write Node Memory Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.WriteNodeMemoryActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getWriteNodeMemoryAction()
		 * @generated
		 */
		EClass WRITE_NODE_MEMORY_ACTION = eINSTANCE.getWriteNodeMemoryAction();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.SendMessageActionImpl <em>Send Message Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.SendMessageActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getSendMessageAction()
		 * @generated
		 */
		EClass SEND_MESSAGE_ACTION = eINSTANCE.getSendMessageAction();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE_ACTION__OUT_PORT = eINSTANCE.getSendMessageAction_OutPort();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE_ACTION__TEXT = eINSTANCE.getSendMessageAction_Text();

		/**
		 * The meta object literal for the '{@link org.nader.sennet.job.actions.impl.ReceiveMessageActionImpl <em>Receive Message Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nader.sennet.job.actions.impl.ReceiveMessageActionImpl
		 * @see org.nader.sennet.job.actions.impl.ActionsPackageImpl#getReceiveMessageAction()
		 * @generated
		 */
		EClass RECEIVE_MESSAGE_ACTION = eINSTANCE.getReceiveMessageAction();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE_ACTION__IN_PORT = eINSTANCE.getReceiveMessageAction_InPort();

	}

} //ActionsPackage
