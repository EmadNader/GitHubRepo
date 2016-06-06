/**
 */
package org.nader.sennet;

import org.eclipse.emf.common.util.EList;

import org.nader.sennet.job.AbstractJob;

import org.nader.sennet.toplevelstructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Se Net App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.SeNetApp#getJobs <em>Jobs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.SennetPackage#getSeNetApp()
 * @model
 * @generated
 */
public interface SeNetApp extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nader.sennet.job.AbstractJob}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see org.nader.sennet.SennetPackage#getSeNetApp_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractJob> getJobs();

} // SeNetApp
