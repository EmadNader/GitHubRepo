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
			case JobPackage.CONTINUOUS_JOB: return createContinuousJob();
			case JobPackage.EVENT_DRIVEN_JOB: return createEventDrivenJob();
			case JobPackage.PERIODIC_JOB: return createPeriodicJob();
			case JobPackage.REQUEST_REPLAY_JOB: return createRequestReplayJob();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousJob createContinuousJob() {
		ContinuousJobImpl continuousJob = new ContinuousJobImpl();
		return continuousJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDrivenJob createEventDrivenJob() {
		EventDrivenJobImpl eventDrivenJob = new EventDrivenJobImpl();
		return eventDrivenJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicJob createPeriodicJob() {
		PeriodicJobImpl periodicJob = new PeriodicJobImpl();
		return periodicJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestReplayJob createRequestReplayJob() {
		RequestReplayJobImpl requestReplayJob = new RequestReplayJobImpl();
		return requestReplayJob;
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
