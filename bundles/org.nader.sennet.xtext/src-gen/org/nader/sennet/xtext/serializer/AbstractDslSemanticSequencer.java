package org.nader.sennet.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.nader.sennet.SeNetApp;
import org.nader.sennet.SennetPackage;
import org.nader.sennet.job.AggregationJob;
import org.nader.sennet.job.FusionJob;
import org.nader.sennet.job.JobPackage;
import org.nader.sennet.job.RegularSenseJob;
import org.nader.sennet.job.SenseForwardJob;
import org.nader.sennet.job.SenseNowJob;
import org.nader.sennet.job.SinkJob;
import org.nader.sennet.job.jobaction.BlinkAction;
import org.nader.sennet.job.jobaction.ConditionalAction;
import org.nader.sennet.job.jobaction.JobactionPackage;
import org.nader.sennet.job.jobaction.ReadNodeMemoryAction;
import org.nader.sennet.job.jobaction.SendMessageAction;
import org.nader.sennet.job.jobaction.SendSerialPortMsgAction;
import org.nader.sennet.job.jobaction.WriteNodeMemoryAction;
import org.nader.sennet.job.jobtrigger.JobtriggerPackage;
import org.nader.sennet.job.jobtrigger.PushButtomTrigger;
import org.nader.sennet.job.jobtrigger.ReceiveMessageTrigger;
import org.nader.sennet.job.jobtrigger.RecieveSerialMsgTrigger;
import org.nader.sennet.job.jobtrigger.StartJobTrigger;
import org.nader.sennet.job.jobtrigger.StopJobTrigger;
import org.nader.sennet.network.Cluster;
import org.nader.sennet.network.ClusteredNetwork;
import org.nader.sennet.network.FlatNetwork;
import org.nader.sennet.network.NetworkPackage;
import org.nader.sennet.node.ClusterHeadNode;
import org.nader.sennet.node.ComputationNode;
import org.nader.sennet.node.NodePackage;
import org.nader.sennet.node.SensorNode;
import org.nader.sennet.node.SinkNode;
import org.nader.sennet.sensors.AccelerometerSensor;
import org.nader.sennet.sensors.HumiditySensor;
import org.nader.sennet.sensors.LightSensor;
import org.nader.sennet.sensors.LocationSensor;
import org.nader.sennet.sensors.MicrophoneSensor;
import org.nader.sennet.sensors.PressureSensor;
import org.nader.sennet.sensors.SensorsPackage;
import org.nader.sennet.sensors.TemperatureSensor;
import org.nader.sennet.sensors.VoltageSensor;
import org.nader.sennet.xtext.services.DslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JobPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JobPackage.AGGREGATION_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getAggregationJobRule()) {
					sequence_AggregationJob(context, (AggregationJob) semanticObject); 
					return; 
				}
				else break;
			case JobPackage.FUSION_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getFusionJobRule()) {
					sequence_FusionJob(context, (FusionJob) semanticObject); 
					return; 
				}
				else break;
			case JobPackage.REGULAR_SENSE_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getRegularSenseJobRule()) {
					sequence_RegularSenseJob(context, (RegularSenseJob) semanticObject); 
					return; 
				}
				else break;
			case JobPackage.SENSE_FORWARD_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getSenseForwardJobRule()) {
					sequence_SenseForwardJob(context, (SenseForwardJob) semanticObject); 
					return; 
				}
				else break;
			case JobPackage.SENSE_NOW_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getSenseNowJobRule()) {
					sequence_SenseNowJob(context, (SenseNowJob) semanticObject); 
					return; 
				}
				else break;
			case JobPackage.SINK_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getSinkJobRule()) {
					sequence_SinkJob(context, (SinkJob) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == JobactionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JobactionPackage.BLINK_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getBlinkActionRule()) {
					sequence_BlinkAction(context, (BlinkAction) semanticObject); 
					return; 
				}
				else break;
			case JobactionPackage.CONDITIONAL_ACTION:
				if(context == grammarAccess.getConditionalActionRule()) {
					sequence_ConditionalAction(context, (ConditionalAction) semanticObject); 
					return; 
				}
				else break;
			case JobactionPackage.READ_NODE_MEMORY_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getReadNodeMemoryActionRule()) {
					sequence_ReadNodeMemoryAction(context, (ReadNodeMemoryAction) semanticObject); 
					return; 
				}
				else break;
			case JobactionPackage.SEND_MESSAGE_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getSendMessageActionRule()) {
					sequence_SendMessageAction(context, (SendMessageAction) semanticObject); 
					return; 
				}
				else break;
			case JobactionPackage.SEND_SERIAL_PORT_MSG_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getSendSerialPortMsgActionRule()) {
					sequence_SendSerialPortMsgAction(context, (SendSerialPortMsgAction) semanticObject); 
					return; 
				}
				else break;
			case JobactionPackage.WRITE_NODE_MEMORY_ACTION:
				if(context == grammarAccess.getAbstratActionRule() ||
				   context == grammarAccess.getWriteNodeMemoryActionRule()) {
					sequence_WriteNodeMemoryAction(context, (WriteNodeMemoryAction) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == JobtriggerPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JobtriggerPackage.PUSH_BUTTOM_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getPushButtomTriggerRule()) {
					sequence_PushButtomTrigger(context, (PushButtomTrigger) semanticObject); 
					return; 
				}
				else break;
			case JobtriggerPackage.RECEIVE_MESSAGE_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getReceiveMessageTriggerRule()) {
					sequence_ReceiveMessageTrigger(context, (ReceiveMessageTrigger) semanticObject); 
					return; 
				}
				else break;
			case JobtriggerPackage.RECIEVE_SERIAL_MSG_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getRecieveSerialMsgTriggerRule()) {
					sequence_RecieveSerialMsgTrigger(context, (RecieveSerialMsgTrigger) semanticObject); 
					return; 
				}
				else break;
			case JobtriggerPackage.START_JOB_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getStartJobTrigger_ImplRule()) {
					sequence_StartJobTrigger_Impl(context, (StartJobTrigger) semanticObject); 
					return; 
				}
				else break;
			case JobtriggerPackage.STOP_JOB_TRIGGER:
				if(context == grammarAccess.getAbstractStartEndingJobTriggerRule() ||
				   context == grammarAccess.getStopJobTrigger_ImplRule()) {
					sequence_StopJobTrigger_Impl(context, (StopJobTrigger) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == NetworkPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case NetworkPackage.CLUSTER:
				if(context == grammarAccess.getClusterRule()) {
					sequence_Cluster(context, (Cluster) semanticObject); 
					return; 
				}
				else break;
			case NetworkPackage.CLUSTERED_NETWORK:
				if(context == grammarAccess.getAbstractNetworkRule() ||
				   context == grammarAccess.getClusteredNetworkRule()) {
					sequence_ClusteredNetwork(context, (ClusteredNetwork) semanticObject); 
					return; 
				}
				else break;
			case NetworkPackage.FLAT_NETWORK:
				if(context == grammarAccess.getAbstractNetworkRule() ||
				   context == grammarAccess.getFlatNetworkRule()) {
					sequence_FlatNetwork(context, (FlatNetwork) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == NodePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case NodePackage.CLUSTER_HEAD_NODE:
				if(context == grammarAccess.getAbstractClusterNodeRule() ||
				   context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getClusterHeadNodeRule()) {
					sequence_ClusterHeadNode(context, (ClusterHeadNode) semanticObject); 
					return; 
				}
				else break;
			case NodePackage.COMPUTATION_NODE:
				if(context == grammarAccess.getAbstractFlatNodeRule() ||
				   context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getComputationNodeRule()) {
					sequence_ComputationNode(context, (ComputationNode) semanticObject); 
					return; 
				}
				else break;
			case NodePackage.SENSOR_NODE:
				if(context == grammarAccess.getAbstractClusterNodeRule() ||
				   context == grammarAccess.getAbstractFlatNodeRule() ||
				   context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getSensorNodeRule()) {
					sequence_SensorNode(context, (SensorNode) semanticObject); 
					return; 
				}
				else break;
			case NodePackage.SINK_NODE:
				if(context == grammarAccess.getAbstractNodeRule() ||
				   context == grammarAccess.getSinkNodeRule()) {
					sequence_SinkNode(context, (SinkNode) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SennetPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SennetPackage.SE_NET_APP:
				if(context == grammarAccess.getSeNetAppRule()) {
					sequence_SeNetApp(context, (SeNetApp) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SensorsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SensorsPackage.ACCELEROMETER_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getAccelerometerSensorRule()) {
					sequence_AccelerometerSensor(context, (AccelerometerSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorsPackage.HUMIDITY_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getHumiditySensorRule()) {
					sequence_HumiditySensor(context, (HumiditySensor) semanticObject); 
					return; 
				}
				else break;
			case SensorsPackage.LIGHT_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getLightSensorRule()) {
					sequence_LightSensor(context, (LightSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorsPackage.LOCATION_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getLocationSensorRule()) {
					sequence_LocationSensor(context, (LocationSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorsPackage.MICROPHONE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getMicrophoneSensorRule()) {
					sequence_MicrophoneSensor(context, (MicrophoneSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorsPackage.PRESSURE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getPressureSensorRule()) {
					sequence_PressureSensor(context, (PressureSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorsPackage.TEMPERATURE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getTemperatureSensorRule()) {
					sequence_TemperatureSensor(context, (TemperatureSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorsPackage.VOLTAGE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getVoltageSensorRule()) {
					sequence_VoltageSensor(context, (VoltageSensor) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {AccelerometerSensor}
	 */
	protected void sequence_AccelerometerSensor(EObject context, AccelerometerSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         aggregation=Aggregation? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_AggregationJob(EObject context, AggregationJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (led=Leds? status=LedStatus? condition=ConditionalAction)
	 */
	protected void sequence_BlinkAction(EObject context, BlinkAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? position=Position? (nodeResources+=AbstractSensor nodeResources+=AbstractSensor*)?)
	 */
	protected void sequence_ClusterHeadNode(EObject context, ClusterHeadNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? (resources+=[AbstractSensor|EString] resources+=[AbstractSensor|EString]*)? (nodes+=AbstractClusterNode nodes+=AbstractClusterNode*)?)
	 */
	protected void sequence_Cluster(EObject context, Cluster semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         nbOfNodes=EInt? 
	 *         interNodeComm=InterNodeComm? 
	 *         routingProtocol=RoutingProtocol? 
	 *         (resources+=AbstractSensor resources+=AbstractSensor*)? 
	 *         sink=SinkNode 
	 *         (clusters+=Cluster clusters+=Cluster*)?
	 *     )
	 */
	protected void sequence_ClusteredNetwork(EObject context, ClusteredNetwork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? position=Position? (nodeResources+=AbstractSensor nodeResources+=AbstractSensor*)?)
	 */
	protected void sequence_ComputationNode(EObject context, ComputationNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sensorTerm=EString? logicalSymbol=LogicalSymbol? value=ELong? unit=EString?)
	 */
	protected void sequence_ConditionalAction(EObject context, ConditionalAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         nbOfNodes=EInt? 
	 *         interNodeComm=InterNodeComm? 
	 *         routingProtocol=RoutingProtocol? 
	 *         (resources+=AbstractSensor resources+=AbstractSensor*)? 
	 *         sink=SinkNode 
	 *         (nodes+=AbstractFlatNode nodes+=AbstractFlatNode*)?
	 *     )
	 */
	protected void sequence_FlatNetwork(EObject context, FlatNetwork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         fusion=Fusion? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_FusionJob(EObject context, FusionJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {HumiditySensor}
	 */
	protected void sequence_HumiditySensor(EObject context, HumiditySensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LightSensor}
	 */
	protected void sequence_LightSensor(EObject context, LightSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LocationSensor}
	 */
	protected void sequence_LocationSensor(EObject context, LocationSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MicrophoneSensor}
	 */
	protected void sequence_MicrophoneSensor(EObject context, MicrophoneSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PressureSensor}
	 */
	protected void sequence_PressureSensor(EObject context, PressureSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PushButtomTrigger}
	 */
	protected void sequence_PushButtomTrigger(EObject context, PushButtomTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     condition=ConditionalAction
	 */
	protected void sequence_ReadNodeMemoryAction(EObject context, ReadNodeMemoryAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JobactionPackage.Literals.ABSTRAT_ACTION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JobactionPackage.Literals.ABSTRAT_ACTION__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReadNodeMemoryActionAccess().getConditionConditionalActionParserRuleCall_3_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ReceiveMessageTrigger}
	 */
	protected void sequence_ReceiveMessageTrigger(EObject context, ReceiveMessageTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RecieveSerialMsgTrigger}
	 */
	protected void sequence_RecieveSerialMsgTrigger(EObject context, RecieveSerialMsgTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         sensingThreshold=ELong? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_RegularSenseJob(EObject context, RegularSenseJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString id=EInt? (jobs+=AbstractJob jobs+=AbstractJob*)?)
	 */
	protected void sequence_SeNetApp(EObject context, SeNetApp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sendMessageTo=EInt? condition=ConditionalAction)
	 */
	protected void sequence_SendMessageAction(EObject context, SendMessageAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     condition=ConditionalAction
	 */
	protected void sequence_SendSerialPortMsgAction(EObject context, SendSerialPortMsgAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JobactionPackage.Literals.ABSTRAT_ACTION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JobactionPackage.Literals.ABSTRAT_ACTION__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSendSerialPortMsgActionAccess().getConditionConditionalActionParserRuleCall_3_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         sensingThreshold=ELong? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_SenseForwardJob(EObject context, SenseForwardJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_SenseNowJob(EObject context, SenseNowJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? position=Position? (nodeResources+=AbstractSensor nodeResources+=AbstractSensor*)?)
	 */
	protected void sequence_SensorNode(EObject context, SensorNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         JobTargetNode=AbstractNode? 
	 *         JobTargetNetwork=AbstractNetwork? 
	 *         (startEndTrigger+=AbstractStartEndingJobTrigger startEndTrigger+=AbstractStartEndingJobTrigger*)? 
	 *         (jobaction+=AbstratAction jobaction+=AbstratAction*)?
	 *     )
	 */
	protected void sequence_SinkJob(EObject context, SinkJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? position=Position? (nodeResources+=AbstractSensor nodeResources+=AbstractSensor*)?)
	 */
	protected void sequence_SinkNode(EObject context, SinkNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StartJobTrigger}
	 */
	protected void sequence_StartJobTrigger_Impl(EObject context, StartJobTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StopJobTrigger}
	 */
	protected void sequence_StopJobTrigger_Impl(EObject context, StopJobTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {TemperatureSensor}
	 */
	protected void sequence_TemperatureSensor(EObject context, TemperatureSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {VoltageSensor}
	 */
	protected void sequence_VoltageSensor(EObject context, VoltageSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     condition=ConditionalAction
	 */
	protected void sequence_WriteNodeMemoryAction(EObject context, WriteNodeMemoryAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JobactionPackage.Literals.ABSTRAT_ACTION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JobactionPackage.Literals.ABSTRAT_ACTION__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWriteNodeMemoryActionAccess().getConditionConditionalActionParserRuleCall_3_0(), semanticObject.getCondition());
		feeder.finish();
	}
}
