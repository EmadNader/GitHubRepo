/**
 */
package org.nader.sennet;

import org.eclipse.emf.ecore.EObject;

import org.nader.sennet.enums.JobSchedule;
import org.nader.sennet.enums.LogicalSymbol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nader.sennet.LogicalCondition#getJobSchedule <em>Job Schedule</em>}</li>
 *   <li>{@link org.nader.sennet.LogicalCondition#getSensorTerm <em>Sensor Term</em>}</li>
 *   <li>{@link org.nader.sennet.LogicalCondition#getLogicalSymbol <em>Logical Symbol</em>}</li>
 *   <li>{@link org.nader.sennet.LogicalCondition#getValue <em>Value</em>}</li>
 *   <li>{@link org.nader.sennet.LogicalCondition#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nader.sennet.SennetPackage#getLogicalCondition()
 * @model
 * @generated
 */
public interface LogicalCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Job Schedule</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nader.sennet.enums.JobSchedule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Schedule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Schedule</em>' attribute.
	 * @see org.nader.sennet.enums.JobSchedule
	 * @see #setJobSchedule(JobSchedule)
	 * @see org.nader.sennet.SennetPackage#getLogicalCondition_JobSchedule()
	 * @model
	 * @generated
	 */
	JobSchedule getJobSchedule();

	/**
	 * Sets the value of the '{@link org.nader.sennet.LogicalCondition#getJobSchedule <em>Job Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Schedule</em>' attribute.
	 * @see org.nader.sennet.enums.JobSchedule
	 * @see #getJobSchedule()
	 * @generated
	 */
	void setJobSchedule(JobSchedule value);

	/**
	 * Returns the value of the '<em><b>Sensor Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Term</em>' attribute.
	 * @see #setSensorTerm(String)
	 * @see org.nader.sennet.SennetPackage#getLogicalCondition_SensorTerm()
	 * @model
	 * @generated
	 */
	String getSensorTerm();

	/**
	 * Sets the value of the '{@link org.nader.sennet.LogicalCondition#getSensorTerm <em>Sensor Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Term</em>' attribute.
	 * @see #getSensorTerm()
	 * @generated
	 */
	void setSensorTerm(String value);

	/**
	 * Returns the value of the '<em><b>Logical Symbol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nader.sennet.enums.LogicalSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Symbol</em>' attribute.
	 * @see org.nader.sennet.enums.LogicalSymbol
	 * @see #setLogicalSymbol(LogicalSymbol)
	 * @see org.nader.sennet.SennetPackage#getLogicalCondition_LogicalSymbol()
	 * @model
	 * @generated
	 */
	LogicalSymbol getLogicalSymbol();

	/**
	 * Sets the value of the '{@link org.nader.sennet.LogicalCondition#getLogicalSymbol <em>Logical Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Symbol</em>' attribute.
	 * @see org.nader.sennet.enums.LogicalSymbol
	 * @see #getLogicalSymbol()
	 * @generated
	 */
	void setLogicalSymbol(LogicalSymbol value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see org.nader.sennet.SennetPackage#getLogicalCondition_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link org.nader.sennet.LogicalCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.nader.sennet.SennetPackage#getLogicalCondition_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.nader.sennet.LogicalCondition#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // LogicalCondition
