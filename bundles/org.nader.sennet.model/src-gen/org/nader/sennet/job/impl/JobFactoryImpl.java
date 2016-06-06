/**
 */
package org.nader.sennet.job.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nader.sennet.job.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobFactoryImpl extends EFactoryImpl implements JobFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobFactory init() {
		try {
			JobFactory theJobFactory = (JobFactory)EPackage.Registry.INSTANCE.getEFactory(JobPackage.eNS_URI);
			if (theJobFactory != null) {
				return theJobFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JobFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobFactoryImpl() {
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
			case JobPackage.SENSE_FORWARD_JOB: return createSenseForwardJob();
			case JobPackage.AGGREGATION_JOB: return createAggregationJob();
			case JobPackage.FUSION_JOB: return createFusionJob();
			case JobPackage.SENSE_NOW_JOB: return createSenseNowJob();
			case JobPackage.SINK_JOB: return createSinkJob();
			case JobPackage.REGULAR_SENSE_JOB: return createRegularSenseJob();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenseForwardJob createSenseForwardJob() {
		SenseForwardJobImpl senseForwardJob = new SenseForwardJobImpl();
		return senseForwardJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationJob createAggregationJob() {
		AggregationJobImpl aggregationJob = new AggregationJobImpl();
		return aggregationJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FusionJob createFusionJob() {
		FusionJobImpl fusionJob = new FusionJobImpl();
		return fusionJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenseNowJob createSenseNowJob() {
		SenseNowJobImpl senseNowJob = new SenseNowJobImpl();
		return senseNowJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkJob createSinkJob() {
		SinkJobImpl sinkJob = new SinkJobImpl();
		return sinkJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularSenseJob createRegularSenseJob() {
		RegularSenseJobImpl regularSenseJob = new RegularSenseJobImpl();
		return regularSenseJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobPackage getJobPackage() {
		return (JobPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JobPackage getPackage() {
		return JobPackage.eINSTANCE;
	}

} //JobFactoryImpl
