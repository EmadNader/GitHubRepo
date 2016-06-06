/**
 */
package org.nader.sennet.job.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nader.sennet.job.AbstractJob;
import org.nader.sennet.job.JobPackage;

import org.nader.sennet.job.jobaction.JobactionFactory;

import org.nader.sennet.job.jobtrigger.JobtriggerFactory;

import org.nader.sennet.network.NetworkFactory;

import org.nader.sennet.node.NodeFactory;

import org.nader.sennet.provider.SenNetEditPlugin;

import org.nader.sennet.toplevelstructure.provider.IdentifiableItemProvider;

/**
 * This is the item provider adapter for a {@link org.nader.sennet.job.AbstractJob} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractJobItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractJobItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(JobPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE);
			childrenFeatures.add(JobPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NETWORK);
			childrenFeatures.add(JobPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER);
			childrenFeatures.add(JobPackage.Literals.ABSTRACT_JOB__JOBACTION);
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
		AbstractJob abstractJob = (AbstractJob)object;
		return getString("_UI_AbstractJob_type") + " " + abstractJob.getId();
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

		switch (notification.getFeatureID(AbstractJob.class)) {
			case JobPackage.ABSTRACT_JOB__JOB_TARGET_NODE:
			case JobPackage.ABSTRACT_JOB__JOB_TARGET_NETWORK:
			case JobPackage.ABSTRACT_JOB__START_END_TRIGGER:
			case JobPackage.ABSTRACT_JOB__JOBACTION:
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
				(JobPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE,
				 NodeFactory.eINSTANCE.createSensorNode()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE,
				 NodeFactory.eINSTANCE.createClusterHeadNode()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE,
				 NodeFactory.eINSTANCE.createSinkNode()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NODE,
				 NodeFactory.eINSTANCE.createComputationNode()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NETWORK,
				 NetworkFactory.eINSTANCE.createFlatNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOB_TARGET_NETWORK,
				 NetworkFactory.eINSTANCE.createClusteredNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 JobtriggerFactory.eINSTANCE.createStartJobTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 JobtriggerFactory.eINSTANCE.createReceiveMessageTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 JobtriggerFactory.eINSTANCE.createRecieveSerialMsgTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 JobtriggerFactory.eINSTANCE.createStopJobTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__START_END_TRIGGER,
				 JobtriggerFactory.eINSTANCE.createPushButtomTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 JobactionFactory.eINSTANCE.createReadNodeMemoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 JobactionFactory.eINSTANCE.createWriteNodeMemoryAction()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 JobactionFactory.eINSTANCE.createSendMessageAction()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 JobactionFactory.eINSTANCE.createBlinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(JobPackage.Literals.ABSTRACT_JOB__JOBACTION,
				 JobactionFactory.eINSTANCE.createSendSerialPortMsgAction()));
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
