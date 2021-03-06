/**
 */
package org.nader.sennet.job.jobaction.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.nader.sennet.job.jobaction.util.JobactionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobactionItemProviderAdapterFactory extends JobactionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobactionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nader.sennet.job.jobaction.ConditionalAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalActionItemProvider conditionalActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nader.sennet.job.jobaction.ConditionalAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionalActionAdapter() {
		if (conditionalActionItemProvider == null) {
			conditionalActionItemProvider = new ConditionalActionItemProvider(this);
		}

		return conditionalActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nader.sennet.job.jobaction.ReadNodeMemoryAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadNodeMemoryActionItemProvider readNodeMemoryActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nader.sennet.job.jobaction.ReadNodeMemoryAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadNodeMemoryActionAdapter() {
		if (readNodeMemoryActionItemProvider == null) {
			readNodeMemoryActionItemProvider = new ReadNodeMemoryActionItemProvider(this);
		}

		return readNodeMemoryActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nader.sennet.job.jobaction.WriteNodeMemoryAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteNodeMemoryActionItemProvider writeNodeMemoryActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nader.sennet.job.jobaction.WriteNodeMemoryAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWriteNodeMemoryActionAdapter() {
		if (writeNodeMemoryActionItemProvider == null) {
			writeNodeMemoryActionItemProvider = new WriteNodeMemoryActionItemProvider(this);
		}

		return writeNodeMemoryActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nader.sennet.job.jobaction.SendMessageAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMessageActionItemProvider sendMessageActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nader.sennet.job.jobaction.SendMessageAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSendMessageActionAdapter() {
		if (sendMessageActionItemProvider == null) {
			sendMessageActionItemProvider = new SendMessageActionItemProvider(this);
		}

		return sendMessageActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nader.sennet.job.jobaction.BlinkAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlinkActionItemProvider blinkActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nader.sennet.job.jobaction.BlinkAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlinkActionAdapter() {
		if (blinkActionItemProvider == null) {
			blinkActionItemProvider = new BlinkActionItemProvider(this);
		}

		return blinkActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nader.sennet.job.jobaction.SendSerialPortMsgAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendSerialPortMsgActionItemProvider sendSerialPortMsgActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nader.sennet.job.jobaction.SendSerialPortMsgAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSendSerialPortMsgActionAdapter() {
		if (sendSerialPortMsgActionItemProvider == null) {
			sendSerialPortMsgActionItemProvider = new SendSerialPortMsgActionItemProvider(this);
		}

		return sendSerialPortMsgActionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (conditionalActionItemProvider != null) conditionalActionItemProvider.dispose();
		if (readNodeMemoryActionItemProvider != null) readNodeMemoryActionItemProvider.dispose();
		if (writeNodeMemoryActionItemProvider != null) writeNodeMemoryActionItemProvider.dispose();
		if (sendMessageActionItemProvider != null) sendMessageActionItemProvider.dispose();
		if (blinkActionItemProvider != null) blinkActionItemProvider.dispose();
		if (sendSerialPortMsgActionItemProvider != null) sendSerialPortMsgActionItemProvider.dispose();
	}

}
