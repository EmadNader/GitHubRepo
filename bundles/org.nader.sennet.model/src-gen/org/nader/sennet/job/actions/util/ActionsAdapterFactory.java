/**
 */
package org.nader.sennet.job.actions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nader.sennet.job.actions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.actions.ActionsPackage
 * @generated
 */
public class ActionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActionsPackage.eINSTANCE;
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
	protected ActionsSwitch<Adapter> modelSwitch =
		new ActionsSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractJobAction(AbstractJobAction object) {
				return createAbstractJobActionAdapter();
			}
			@Override
			public Adapter caseAbstractCommonJobAction(AbstractCommonJobAction object) {
				return createAbstractCommonJobActionAdapter();
			}
			@Override
			public Adapter caseAbstractNodeMemoryAction(AbstractNodeMemoryAction object) {
				return createAbstractNodeMemoryActionAdapter();
			}
			@Override
			public Adapter caseAbstractMessageAction(AbstractMessageAction object) {
				return createAbstractMessageActionAdapter();
			}
			@Override
			public Adapter caseSenseForwardAction(SenseForwardAction object) {
				return createSenseForwardActionAdapter();
			}
			@Override
			public Adapter caseAggregationAction(AggregationAction object) {
				return createAggregationActionAdapter();
			}
			@Override
			public Adapter caseFusionAction(FusionAction object) {
				return createFusionActionAdapter();
			}
			@Override
			public Adapter caseReadNodeMemoryAction(ReadNodeMemoryAction object) {
				return createReadNodeMemoryActionAdapter();
			}
			@Override
			public Adapter caseWriteNodeMemoryAction(WriteNodeMemoryAction object) {
				return createWriteNodeMemoryActionAdapter();
			}
			@Override
			public Adapter caseSendMessageAction(SendMessageAction object) {
				return createSendMessageActionAdapter();
			}
			@Override
			public Adapter caseReceiveMessageAction(ReceiveMessageAction object) {
				return createReceiveMessageActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.AbstractJobAction <em>Abstract Job Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.AbstractJobAction
	 * @generated
	 */
	public Adapter createAbstractJobActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.AbstractCommonJobAction <em>Abstract Common Job Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.AbstractCommonJobAction
	 * @generated
	 */
	public Adapter createAbstractCommonJobActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.AbstractNodeMemoryAction <em>Abstract Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.AbstractNodeMemoryAction
	 * @generated
	 */
	public Adapter createAbstractNodeMemoryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.AbstractMessageAction <em>Abstract Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.AbstractMessageAction
	 * @generated
	 */
	public Adapter createAbstractMessageActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.SenseForwardAction <em>Sense Forward Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.SenseForwardAction
	 * @generated
	 */
	public Adapter createSenseForwardActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.AggregationAction <em>Aggregation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.AggregationAction
	 * @generated
	 */
	public Adapter createAggregationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.FusionAction <em>Fusion Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.FusionAction
	 * @generated
	 */
	public Adapter createFusionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.ReadNodeMemoryAction <em>Read Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.ReadNodeMemoryAction
	 * @generated
	 */
	public Adapter createReadNodeMemoryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.WriteNodeMemoryAction <em>Write Node Memory Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.WriteNodeMemoryAction
	 * @generated
	 */
	public Adapter createWriteNodeMemoryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.SendMessageAction <em>Send Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.SendMessageAction
	 * @generated
	 */
	public Adapter createSendMessageActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.actions.ReceiveMessageAction <em>Receive Message Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.actions.ReceiveMessageAction
	 * @generated
	 */
	public Adapter createReceiveMessageActionAdapter() {
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

} //ActionsAdapterFactory
