/**
 */
package org.nader.sennet.network.provider;


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

import org.nader.sennet.network.AbstractNetwork;
import org.nader.sennet.network.NetworkPackage;

import org.nader.sennet.node.NodeFactory;

import org.nader.sennet.provider.SenNetEditPlugin;

import org.nader.sennet.sensors.SensorsFactory;

import org.nader.sennet.toplevelstructure.provider.IdentifiableItemProvider;

/**
 * This is the item provider adapter for a {@link org.nader.sennet.network.AbstractNetwork} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractNetworkItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNetworkItemProvider(AdapterFactory adapterFactory) {
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

			addNbOfNodesPropertyDescriptor(object);
			addInterNodeCommPropertyDescriptor(object);
			addRoutingProtocolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nb Of Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbOfNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNetwork_nbOfNodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNetwork_nbOfNodes_feature", "_UI_AbstractNetwork_type"),
				 NetworkPackage.Literals.ABSTRACT_NETWORK__NB_OF_NODES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inter Node Comm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterNodeCommPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNetwork_interNodeComm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNetwork_interNodeComm_feature", "_UI_AbstractNetwork_type"),
				 NetworkPackage.Literals.ABSTRACT_NETWORK__INTER_NODE_COMM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Routing Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutingProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNetwork_routingProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNetwork_routingProtocol_feature", "_UI_AbstractNetwork_type"),
				 NetworkPackage.Literals.ABSTRACT_NETWORK__ROUTING_PROTOCOL,
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
			childrenFeatures.add(NetworkPackage.Literals.ABSTRACT_NETWORK__RESOURCES);
			childrenFeatures.add(NetworkPackage.Literals.ABSTRACT_NETWORK__SINK);
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
		AbstractNetwork abstractNetwork = (AbstractNetwork)object;
		return getString("_UI_AbstractNetwork_type") + " " + abstractNetwork.getId();
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

		switch (notification.getFeatureID(AbstractNetwork.class)) {
			case NetworkPackage.ABSTRACT_NETWORK__NB_OF_NODES:
			case NetworkPackage.ABSTRACT_NETWORK__INTER_NODE_COMM:
			case NetworkPackage.ABSTRACT_NETWORK__ROUTING_PROTOCOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NetworkPackage.ABSTRACT_NETWORK__RESOURCES:
			case NetworkPackage.ABSTRACT_NETWORK__SINK:
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
				(NetworkPackage.Literals.ABSTRACT_NETWORK__RESOURCES,
				 SensorsFactory.eINSTANCE.createAccelerometerSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkPackage.Literals.ABSTRACT_NETWORK__RESOURCES,
				 SensorsFactory.eINSTANCE.createLightSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkPackage.Literals.ABSTRACT_NETWORK__RESOURCES,
				 SensorsFactory.eINSTANCE.createLocationSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkPackage.Literals.ABSTRACT_NETWORK__RESOURCES,
				 SensorsFactory.eINSTANCE.createMicrophoneSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkPackage.Literals.ABSTRACT_NETWORK__RESOURCES,
				 SensorsFactory.eINSTANCE.createTemperatureSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkPackage.Literals.ABSTRACT_NETWORK__RESOURCES,
				 SensorsFactory.eINSTANCE.createPressureSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkPackage.Literals.ABSTRACT_NETWORK__RESOURCES,
				 SensorsFactory.eINSTANCE.createHumiditySensor()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkPackage.Literals.ABSTRACT_NETWORK__RESOURCES,
				 SensorsFactory.eINSTANCE.createVoltageSensor()));

		newChildDescriptors.add
			(createChildParameter
				(NetworkPackage.Literals.ABSTRACT_NETWORK__SINK,
				 NodeFactory.eINSTANCE.createSinkNode()));
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
