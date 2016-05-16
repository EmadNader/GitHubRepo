package org.nader.sennet.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.nader.sennet.LogicalCondition;
import org.nader.sennet.SennetPackage;
import org.nader.sennet.WSNapp;
import org.nader.sennet.job.ContinuousJob;
import org.nader.sennet.job.EventDrivenJob;
import org.nader.sennet.job.JobPackage;
import org.nader.sennet.job.PeriodicJob;
import org.nader.sennet.job.RequestReplayJob;
import org.nader.sennet.job.actions.ActionsPackage;
import org.nader.sennet.job.actions.AggregationAction;
import org.nader.sennet.job.actions.FusionAction;
import org.nader.sennet.job.actions.ReadNodeMemoryAction;
import org.nader.sennet.job.actions.ReceiveMessageAction;
import org.nader.sennet.job.actions.SendMessageAction;
import org.nader.sennet.job.actions.SenseForwardAction;
import org.nader.sennet.job.actions.WriteNodeMemoryAction;
import org.nader.sennet.network.Cluster;
import org.nader.sennet.network.ClusteredNetwork;
import org.nader.sennet.network.FlatNetwork;
import org.nader.sennet.network.NetworkPackage;
import org.nader.sennet.node.ClusterHeadNode;
import org.nader.sennet.node.ComputationNode;
import org.nader.sennet.node.NodePackage;
import org.nader.sennet.node.SensorNode;
import org.nader.sennet.node.SinkNode;
import org.nader.sennet.port.InPort;
import org.nader.sennet.port.OutPort;
import org.nader.sennet.port.PortPackage;
import org.nader.sennet.port.Reciever;
import org.nader.sennet.port.SerialPort;
import org.nader.sennet.port.Transmitter;
import org.nader.sennet.port.UsbPort;
import org.nader.sennet.sensor.AccelerometerSensor;
import org.nader.sennet.sensor.ChemicalSensor;
import org.nader.sennet.sensor.HumiditySensor;
import org.nader.sennet.sensor.LightSensor;
import org.nader.sennet.sensor.LocationSensor;
import org.nader.sennet.sensor.MicrophoneSensor;
import org.nader.sennet.sensor.PressureSensor;
import org.nader.sennet.sensor.SensorPackage;
import org.nader.sennet.sensor.TemperatureSensor;
import org.nader.sennet.xtext.services.SNDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractSNDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SNDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ActionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ActionsPackage.AGGREGATION_ACTION:
				if(context == grammarAccess.getAbstractJobActionRule() ||
				   context == grammarAccess.getAggregationActionRule()) {
					sequence_AggregationAction(context, (AggregationAction) semanticObject); 
					return; 
				}
				else break;
			case ActionsPackage.FUSION_ACTION:
				if(context == grammarAccess.getAbstractJobActionRule() ||
				   context == grammarAccess.getFusionActionRule()) {
					sequence_FusionAction(context, (FusionAction) semanticObject); 
					return; 
				}
				else break;
			case ActionsPackage.READ_NODE_MEMORY_ACTION:
				if(context == grammarAccess.getAbstractJobActionRule() ||
				   context == grammarAccess.getReadNodeMemoryActionRule()) {
					sequence_ReadNodeMemoryAction(context, (ReadNodeMemoryAction) semanticObject); 
					return; 
				}
				else break;
			case ActionsPackage.RECEIVE_MESSAGE_ACTION:
				if(context == grammarAccess.getAbstractJobActionRule() ||
				   context == grammarAccess.getReceiveMessageActionRule()) {
					sequence_ReceiveMessageAction(context, (ReceiveMessageAction) semanticObject); 
					return; 
				}
				else break;
			case ActionsPackage.SEND_MESSAGE_ACTION:
				if(context == grammarAccess.getAbstractJobActionRule() ||
				   context == grammarAccess.getSendMessageActionRule()) {
					sequence_SendMessageAction(context, (SendMessageAction) semanticObject); 
					return; 
				}
				else break;
			case ActionsPackage.SENSE_FORWARD_ACTION:
				if(context == grammarAccess.getAbstractJobActionRule() ||
				   context == grammarAccess.getSenseForwardActionRule()) {
					sequence_SenseForwardAction(context, (SenseForwardAction) semanticObject); 
					return; 
				}
				else break;
			case ActionsPackage.WRITE_NODE_MEMORY_ACTION:
				if(context == grammarAccess.getAbstractJobActionRule() ||
				   context == grammarAccess.getWriteNodeMemoryActionRule()) {
					sequence_WriteNodeMemoryAction(context, (WriteNodeMemoryAction) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == JobPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JobPackage.CONTINUOUS_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getContinuousJobRule()) {
					sequence_ContinuousJob(context, (ContinuousJob) semanticObject); 
					return; 
				}
				else break;
			case JobPackage.EVENT_DRIVEN_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getEventDrivenJobRule()) {
					sequence_EventDrivenJob(context, (EventDrivenJob) semanticObject); 
					return; 
				}
				else break;
			case JobPackage.PERIODIC_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getPeriodicJobRule()) {
					sequence_PeriodicJob(context, (PeriodicJob) semanticObject); 
					return; 
				}
				else break;
			case JobPackage.REQUEST_REPLAY_JOB:
				if(context == grammarAccess.getAbstractJobRule() ||
				   context == grammarAccess.getRequestReplayJobRule()) {
					sequence_RequestReplayJob(context, (RequestReplayJob) semanticObject); 
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
		else if(semanticObject.eClass().getEPackage() == PortPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PortPackage.IN_PORT:
				if(context == grammarAccess.getAbstractPortRule() ||
				   context == grammarAccess.getInPortRule() ||
				   context == grammarAccess.getInPort_ImplRule()) {
					sequence_InPort_Impl(context, (InPort) semanticObject); 
					return; 
				}
				else break;
			case PortPackage.OUT_PORT:
				if(context == grammarAccess.getAbstractPortRule() ||
				   context == grammarAccess.getOutPortRule() ||
				   context == grammarAccess.getOutPort_ImplRule()) {
					sequence_OutPort_Impl(context, (OutPort) semanticObject); 
					return; 
				}
				else break;
			case PortPackage.RECIEVER:
				if(context == grammarAccess.getAbstractPortRule() ||
				   context == grammarAccess.getInPortRule() ||
				   context == grammarAccess.getRecieverRule()) {
					sequence_Reciever(context, (Reciever) semanticObject); 
					return; 
				}
				else break;
			case PortPackage.SERIAL_PORT:
				if(context == grammarAccess.getAbstractPortRule() ||
				   context == grammarAccess.getInPortRule() ||
				   context == grammarAccess.getOutPortRule() ||
				   context == grammarAccess.getSerialPortRule()) {
					sequence_SerialPort(context, (SerialPort) semanticObject); 
					return; 
				}
				else break;
			case PortPackage.TRANSMITTER:
				if(context == grammarAccess.getAbstractPortRule() ||
				   context == grammarAccess.getOutPortRule() ||
				   context == grammarAccess.getTransmitterRule()) {
					sequence_Transmitter(context, (Transmitter) semanticObject); 
					return; 
				}
				else break;
			case PortPackage.USB_PORT:
				if(context == grammarAccess.getAbstractPortRule() ||
				   context == grammarAccess.getInPortRule() ||
				   context == grammarAccess.getOutPortRule() ||
				   context == grammarAccess.getUsbPortRule()) {
					sequence_UsbPort(context, (UsbPort) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SennetPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SennetPackage.LOGICAL_CONDITION:
				if(context == grammarAccess.getLogicalConditionRule()) {
					sequence_LogicalCondition(context, (LogicalCondition) semanticObject); 
					return; 
				}
				else break;
			case SennetPackage.WS_NAPP:
				if(context == grammarAccess.getWSNappRule()) {
					sequence_WSNapp(context, (WSNapp) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SensorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SensorPackage.ACCELEROMETER_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getAccelerometerSensorRule()) {
					sequence_AccelerometerSensor(context, (AccelerometerSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorPackage.CHEMICAL_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getChemicalSensorRule()) {
					sequence_ChemicalSensor(context, (ChemicalSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorPackage.HUMIDITY_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getHumiditySensorRule()) {
					sequence_HumiditySensor(context, (HumiditySensor) semanticObject); 
					return; 
				}
				else break;
			case SensorPackage.LIGHT_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getLightSensorRule()) {
					sequence_LightSensor(context, (LightSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorPackage.LOCATION_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getLocationSensorRule()) {
					sequence_LocationSensor(context, (LocationSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorPackage.MICROPHONE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getMicrophoneSensorRule()) {
					sequence_MicrophoneSensor(context, (MicrophoneSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorPackage.PRESSURE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getPressureSensorRule()) {
					sequence_PressureSensor(context, (PressureSensor) semanticObject); 
					return; 
				}
				else break;
			case SensorPackage.TEMPERATURE_SENSOR:
				if(context == grammarAccess.getAbstractSensorRule() ||
				   context == grammarAccess.getTemperatureSensorRule()) {
					sequence_TemperatureSensor(context, (TemperatureSensor) semanticObject); 
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
	 *     (aggregation=Aggregation? sinkNode=[SinkNode|EString]? targetNode=[AbstractNode|EString]?)
	 */
	protected void sequence_AggregationAction(EObject context, AggregationAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ChemicalSensor}
	 */
	protected void sequence_ChemicalSensor(EObject context, ChemicalSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         position=Position? 
	 *         (ports+=[AbstractPort|EString] ports+=[AbstractPort|EString]*)? 
	 *         (sensors+=[AbstractSensor|EString] sensors+=[AbstractSensor|EString]*)?
	 *     )
	 */
	protected void sequence_ClusterHeadNode(EObject context, ClusterHeadNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         (resources+=[AbstractResource|EString] resources+=[AbstractResource|EString]*)? 
	 *         head=ClusterHeadNode? 
	 *         (nodes+=AbstractClusterNode nodes+=AbstractClusterNode*)?
	 *     )
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
	 *         sink=[SinkNode|EString]? 
	 *         (sensors+=AbstractSensor sensors+=AbstractSensor*)? 
	 *         (ports+=AbstractPort ports+=AbstractPort*)? 
	 *         (clusters+=Cluster clusters+=Cluster*)?
	 *     )
	 */
	protected void sequence_ClusteredNetwork(EObject context, ClusteredNetwork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         position=Position? 
	 *         (ports+=[AbstractPort|EString] ports+=[AbstractPort|EString]*)? 
	 *         (sensors+=[AbstractSensor|EString] sensors+=[AbstractSensor|EString]*)?
	 *     )
	 */
	protected void sequence_ComputationNode(EObject context, ComputationNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? action=AbstractJobAction?)
	 */
	protected void sequence_ContinuousJob(EObject context, ContinuousJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? action=AbstractJobAction? eventCondition=LogicalCondition?)
	 */
	protected void sequence_EventDrivenJob(EObject context, EventDrivenJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         nbOfNodes=EInt? 
	 *         interNodeComm=InterNodeComm? 
	 *         routingProtocol=RoutingProtocol? 
	 *         sink=[SinkNode|EString]? 
	 *         (sensors+=AbstractSensor sensors+=AbstractSensor*)? 
	 *         (ports+=AbstractPort ports+=AbstractPort*)? 
	 *         (nodes+=AbstractFlatNode nodes+=AbstractFlatNode*)?
	 *     )
	 */
	protected void sequence_FlatNetwork(EObject context, FlatNetwork semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fusion=Fusion? sinkNode=[SinkNode|EString]? compuNode=[ComputationNode|EString]? clusterHead=[ClusterHeadNode|EString]?)
	 */
	protected void sequence_FusionAction(EObject context, FusionAction semanticObject) {
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
	 *     {InPort}
	 */
	protected void sequence_InPort_Impl(EObject context, InPort semanticObject) {
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
	 *     (jobSchedule=JobSchedule? sensorTerm=EString? logicalSymbol=LogicalSymbol? value=ELong? unit=EString?)
	 */
	protected void sequence_LogicalCondition(EObject context, LogicalCondition semanticObject) {
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
	 *     {OutPort}
	 */
	protected void sequence_OutPort_Impl(EObject context, OutPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? timer=ELong? action=AbstractJobAction?)
	 */
	protected void sequence_PeriodicJob(EObject context, PeriodicJob semanticObject) {
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
	 *     (sinkNode=[SinkNode|EString]? targetNode=[AbstractNode|EString]?)
	 */
	protected void sequence_ReadNodeMemoryAction(EObject context, ReadNodeMemoryAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sinkNode=[SinkNode|EString]? targetNode=[AbstractNode|EString]? inPort=[InPort|EString]?)
	 */
	protected void sequence_ReceiveMessageAction(EObject context, ReceiveMessageAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Reciever}
	 */
	protected void sequence_Reciever(EObject context, Reciever semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EInt? action=AbstractJobAction?)
	 */
	protected void sequence_RequestReplayJob(EObject context, RequestReplayJob semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (text=EString? sinkNode=[SinkNode|EString]? targetNode=[AbstractNode|EString]? outPort=[OutPort|EString]?)
	 */
	protected void sequence_SendMessageAction(EObject context, SendMessageAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sinkNode=[SinkNode|EString]? targetNode=[AbstractNode|EString]?)
	 */
	protected void sequence_SenseForwardAction(EObject context, SenseForwardAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         position=Position? 
	 *         (ports+=[AbstractPort|EString] ports+=[AbstractPort|EString]*)? 
	 *         (sensors+=[AbstractSensor|EString] sensors+=[AbstractSensor|EString]*)?
	 *     )
	 */
	protected void sequence_SensorNode(EObject context, SensorNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SerialPort}
	 */
	protected void sequence_SerialPort(EObject context, SerialPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=EInt? 
	 *         position=Position? 
	 *         (ports+=[AbstractPort|EString] ports+=[AbstractPort|EString]*)? 
	 *         (sensors+=[AbstractSensor|EString] sensors+=[AbstractSensor|EString]*)?
	 *     )
	 */
	protected void sequence_SinkNode(EObject context, SinkNode semanticObject) {
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
	 *     {Transmitter}
	 */
	protected void sequence_Transmitter(EObject context, Transmitter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UsbPort}
	 */
	protected void sequence_UsbPort(EObject context, UsbPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString id=EInt? network=AbstractNetwork? (jobs+=AbstractJob jobs+=AbstractJob*)?)
	 */
	protected void sequence_WSNapp(EObject context, WSNapp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sinkNode=[SinkNode|EString]? targetNode=[AbstractNode|EString]?)
	 */
	protected void sequence_WriteNodeMemoryAction(EObject context, WriteNodeMemoryAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
