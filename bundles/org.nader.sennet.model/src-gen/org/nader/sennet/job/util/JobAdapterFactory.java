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
			public Adapter caseSenseForwardJob(SenseForwardJob object) {
				return createSenseForwardJobAdapter();
			}
			@Override
			public Adapter caseAggregationJob(AggregationJob object) {
				return createAggregationJobAdapter();
			}
			@Override
			public Adapter caseFusionJob(FusionJob object) {
				return createFusionJobAdapter();
			}
			@Override
			public Adapter caseSenseNowJob(SenseNowJob object) {
				return createSenseNowJobAdapter();
			}
			@Override
			public Adapter caseSinkJob(SinkJob object) {
				return createSinkJobAdapter();
			}
			@Override
			public Adapter caseRegularSenseJob(RegularSenseJob object) {
				return createRegularSenseJobAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.SenseForwardJob <em>Sense Forward Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.SenseForwardJob
	 * @generated
	 */
	public Adapter createSenseForwardJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.AggregationJob <em>Aggregation Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.AggregationJob
	 * @generated
	 */
	public Adapter createAggregationJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.FusionJob <em>Fusion Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.FusionJob
	 * @generated
	 */
	public Adapter createFusionJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.SenseNowJob <em>Sense Now Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.SenseNowJob
	 * @generated
	 */
	public Adapter createSenseNowJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.SinkJob <em>Sink Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.SinkJob
	 * @generated
	 */
	public Adapter createSinkJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.RegularSenseJob <em>Regular Sense Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.RegularSenseJob
	 * @generated
	 */
	public Adapter createRegularSenseJobAdapter() {
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
