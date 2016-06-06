/**
 */
package org.nader.sennet.job.jobtrigger.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nader.sennet.job.jobtrigger.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.jobtrigger.JobtriggerPackage
 * @generated
 */
public class JobtriggerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JobtriggerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobtriggerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JobtriggerPackage.eINSTANCE;
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
	protected JobtriggerSwitch<Adapter> modelSwitch =
		new JobtriggerSwitch<Adapter>() {
			@Override
			public Adapter caseReceiveMessageTrigger(ReceiveMessageTrigger object) {
				return createReceiveMessageTriggerAdapter();
			}
			@Override
			public Adapter caseRecieveSerialMsgTrigger(RecieveSerialMsgTrigger object) {
				return createRecieveSerialMsgTriggerAdapter();
			}
			@Override
			public Adapter caseStartJobTrigger(StartJobTrigger object) {
				return createStartJobTriggerAdapter();
			}
			@Override
			public Adapter caseStopJobTrigger(StopJobTrigger object) {
				return createStopJobTriggerAdapter();
			}
			@Override
			public Adapter casePushButtomTrigger(PushButtomTrigger object) {
				return createPushButtomTriggerAdapter();
			}
			@Override
			public Adapter caseAbstractRecieveTrigger(AbstractRecieveTrigger object) {
				return createAbstractRecieveTriggerAdapter();
			}
			@Override
			public Adapter caseAbstractStartEndingJobTrigger(AbstractStartEndingJobTrigger object) {
				return createAbstractStartEndingJobTriggerAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.jobtrigger.ReceiveMessageTrigger <em>Receive Message Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.jobtrigger.ReceiveMessageTrigger
	 * @generated
	 */
	public Adapter createReceiveMessageTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.jobtrigger.RecieveSerialMsgTrigger <em>Recieve Serial Msg Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.jobtrigger.RecieveSerialMsgTrigger
	 * @generated
	 */
	public Adapter createRecieveSerialMsgTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.jobtrigger.StartJobTrigger <em>Start Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.jobtrigger.StartJobTrigger
	 * @generated
	 */
	public Adapter createStartJobTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.jobtrigger.StopJobTrigger <em>Stop Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.jobtrigger.StopJobTrigger
	 * @generated
	 */
	public Adapter createStopJobTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.jobtrigger.PushButtomTrigger <em>Push Buttom Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.jobtrigger.PushButtomTrigger
	 * @generated
	 */
	public Adapter createPushButtomTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.jobtrigger.AbstractRecieveTrigger <em>Abstract Recieve Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.jobtrigger.AbstractRecieveTrigger
	 * @generated
	 */
	public Adapter createAbstractRecieveTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nader.sennet.job.jobtrigger.AbstractStartEndingJobTrigger <em>Abstract Start Ending Job Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nader.sennet.job.jobtrigger.AbstractStartEndingJobTrigger
	 * @generated
	 */
	public Adapter createAbstractStartEndingJobTriggerAdapter() {
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

} //JobtriggerAdapterFactory
