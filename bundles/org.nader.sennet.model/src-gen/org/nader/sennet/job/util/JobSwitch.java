/**
 */
package org.nader.sennet.job.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nader.sennet.job.*;

import org.nader.sennet.toplevelstructure.Identifiable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nader.sennet.job.JobPackage
 * @generated
 */
public class JobSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JobPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSwitch() {
		if (modelPackage == null) {
			modelPackage = JobPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JobPackage.ABSTRACT_JOB: {
				AbstractJob abstractJob = (AbstractJob)theEObject;
				T result = caseAbstractJob(abstractJob);
				if (result == null) result = caseIdentifiable(abstractJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.SENSE_FORWARD_JOB: {
				SenseForwardJob senseForwardJob = (SenseForwardJob)theEObject;
				T result = caseSenseForwardJob(senseForwardJob);
				if (result == null) result = caseAbstractJob(senseForwardJob);
				if (result == null) result = caseIdentifiable(senseForwardJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.AGGREGATION_JOB: {
				AggregationJob aggregationJob = (AggregationJob)theEObject;
				T result = caseAggregationJob(aggregationJob);
				if (result == null) result = caseAbstractJob(aggregationJob);
				if (result == null) result = caseIdentifiable(aggregationJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.FUSION_JOB: {
				FusionJob fusionJob = (FusionJob)theEObject;
				T result = caseFusionJob(fusionJob);
				if (result == null) result = caseAbstractJob(fusionJob);
				if (result == null) result = caseIdentifiable(fusionJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.SENSE_NOW_JOB: {
				SenseNowJob senseNowJob = (SenseNowJob)theEObject;
				T result = caseSenseNowJob(senseNowJob);
				if (result == null) result = caseAbstractJob(senseNowJob);
				if (result == null) result = caseIdentifiable(senseNowJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.SINK_JOB: {
				SinkJob sinkJob = (SinkJob)theEObject;
				T result = caseSinkJob(sinkJob);
				if (result == null) result = caseAbstractJob(sinkJob);
				if (result == null) result = caseIdentifiable(sinkJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.REGULAR_SENSE_JOB: {
				RegularSenseJob regularSenseJob = (RegularSenseJob)theEObject;
				T result = caseRegularSenseJob(regularSenseJob);
				if (result == null) result = caseAbstractJob(regularSenseJob);
				if (result == null) result = caseIdentifiable(regularSenseJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractJob(AbstractJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Forward Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Forward Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseForwardJob(SenseForwardJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationJob(AggregationJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fusion Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fusion Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFusionJob(FusionJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sense Now Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sense Now Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenseNowJob(SenseNowJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinkJob(SinkJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Sense Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Sense Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularSenseJob(RegularSenseJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JobSwitch
