/**
 */
package org.nader.sennet.sensor.impl;

import org.eclipse.emf.ecore.EClass;

import org.nader.sennet.sensor.AbstractSensor;
import org.nader.sennet.sensor.SensorPackage;

import org.nader.sennet.toplevelstructure.impl.AbstractResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractSensorImpl extends AbstractResourceImpl implements AbstractSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorPackage.Literals.ABSTRACT_SENSOR;
	}

} //AbstractSensorImpl
