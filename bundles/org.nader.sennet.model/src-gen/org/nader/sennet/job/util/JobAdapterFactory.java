/**
 */
package org.nader.sennet.job.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nader.sennet.job.*;

import org.nader.sennet.toplevelstructure.Identifiable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.JobPackage
 * @generated
 */
public class JobAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JobPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JobPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobSwitch<Adapter> modelSwitch =
		new JobSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractJob(AbstractJob object) {
				return createAbstractJobAdapter();
			}
			@Override
			public Adapter caseContinuousJob(ContinuousJob object) {
				return createContinuousJobAdapter();
			}
			@Override
			public Adapter caseEventDrivenJob(EventDrivenJob object) {
				return createEventDrivenJobAdapter();
			}
			@Override
			public Adapter casePeriodicJob(PeriodicJob object) {
				return createPeriodicJobAdapter();
			}
			@Override
			public Adapter caseRequestReplayJob(RequestReplayJob object) {
				return createRequestReplayJobAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.AbstractJob <em>Abstract Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.AbstractJob
	 * @generated
	 */
	public Adapter createAbstractJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.ContinuousJob <em>Continuous Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.ContinuousJob
	 * @generated
	 */
	public Adapter createContinuousJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.EventDrivenJob <em>Event Driven Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.EventDrivenJob
	 * @generated
	 */
	public Adapter createEventDrivenJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.PeriodicJob <em>Periodic Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.PeriodicJob
	 * @generated
	 */
	public Adapter createPeriodicJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.RequestReplayJob <em>Request Replay Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.RequestReplayJob
	 * @generated
	 */
	public Adapter createRequestReplayJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.toplevelstructure.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.toplevelstructure.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JobAdapterFactory
