/**
 */
package org.nader.sennet.job.jobtrigger.impl;

import org.eclipse.emf.ecore.EClass;

import org.nader.sennet.job.jobtrigger.JobtriggerPackage;
import org.nader.sennet.job.jobtrigger.StopJobTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Job Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StopJobTriggerImpl extends AbstractStartEndingJobTriggerImpl implements StopJobTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopJobTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobtriggerPackage.Literals.STOP_JOB_TRIGGER;
	}

} //StopJobTriggerImpl
