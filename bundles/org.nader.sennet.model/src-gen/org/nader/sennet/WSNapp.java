/**
 */
package org.nader.sennet;

import org.eclipse.emf.common.util.EList;

import org.nader.sennet.job.AbstractJob;

import org.nader.sennet.network.AbstractNetwork;

import org.nader.sennet.toplevelstructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WS Napp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.WSNapp#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.nader.sennet.WSNapp#getJobs <em>Jobs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.SennetPackage#getWSNapp()
 * @model
 * @generated
 */
public interface WSNapp extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(AbstractNetwork)
	 * @see org.nader.sennet.SennetPackage#getWSNapp_Network()
	 * @model containment="true"
	 * @generated
	 */
	AbstractNetwork getNetwork();

	/**
	 * Sets the value of the '{@link org.nader.sennet.WSNapp#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(AbstractNetwork value);

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
	 * @see org.nader.sennet.SennetPackage#getWSNapp_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractJob> getJobs();

} // WSNapp
