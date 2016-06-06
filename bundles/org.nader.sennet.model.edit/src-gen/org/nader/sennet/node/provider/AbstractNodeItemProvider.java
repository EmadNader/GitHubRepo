/**
 */
package org.nader.sennet.node.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nader.sennet.node.AbstractNode;
import org.nader.sennet.node.NodePackage;

import org.nader.sennet.provider.SenNetEditPlugin;

import org.nader.sennet.sensors.SensorsFactory;

import org.nader.sennet.toplevelstructure.provider.IdentifiableItemProvider;

/**
 * This is the item provider adapter for a {@link org.nader.sennet.node.AbstractNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractNodeItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPositionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNode_position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNode_position_feature", "_UI_AbstractNode_type"),
				 NodePackage.Literals.ABSTRACT_NODE__POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NodePackage.Literals.ABSTRACT_NODE__NODE_RESOURCES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AbstractNode abstractNode = (AbstractNode)object;
		return getString("_UI_AbstractNode_type") + " " + abstractNode.getId();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractNode.class)) {
			case NodePackage.ABSTRACT_NODE__POSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NodePackage.ABSTRACT_NODE__NODE_RESOURCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(NodePackage.Literals.ABSTRACT_NODE__NODE_RESOURCES,
				 SensorsFactory.eINSTANCE.createAccelerometerSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NodePackage.Literals.ABSTRACT_NODE__NODE_RESOURCES,
				 SensorsFactory.eINSTANCE.createLightSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NodePackage.Literals.ABSTRACT_NODE__NODE_RESOURCES,
				 SensorsFactory.eINSTANCE.createLocationSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NodePackage.Literals.ABSTRACT_NODE__NODE_RESOURCES,
				 SensorsFactory.eINSTANCE.createMicrophoneSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NodePackage.Literals.ABSTRACT_NODE__NODE_RESOURCES,
				 SensorsFactory.eINSTANCE.createTemperatureSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NodePackage.Literals.ABSTRACT_NODE__NODE_RESOURCES,
				 SensorsFactory.eINSTANCE.createPressureSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NodePackage.Literals.ABSTRACT_NODE__NODE_RESOURCES,
				 SensorsFactory.eINSTANCE.createHumiditySensor()));

		newChildDescriptors.add
			(createChildParameter
				(NodePackage.Literals.ABSTRACT_NODE__NODE_RESOURCES,
				 SensorsFactory.eINSTANCE.createVoltageSensor()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SenNetEditPlugin.INSTANCE;
	}

}
