/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.comm.ezxtopology.EzxtopologyFactory;
import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.SessionManager;
import net.sf.smbt.comm.script.netConf.NetConfFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.comm.ezxtopology.SessionManager} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SessionManagerItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionManagerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EzxtopologyPackage.Literals.SESSION_MANAGER__USB_CONNECTIONS);
			childrenFeatures.add(EzxtopologyPackage.Literals.SESSION_MANAGER__BLUETOOTH_CONNECTIONS);
			childrenFeatures.add(EzxtopologyPackage.Literals.SESSION_MANAGER__UDP_CONNECTIONS);
			childrenFeatures.add(EzxtopologyPackage.Literals.SESSION_MANAGER__TCP_CONNECTIONS);
			childrenFeatures.add(EzxtopologyPackage.Literals.SESSION_MANAGER__XBEE_CONNECTIONS);
			childrenFeatures.add(EzxtopologyPackage.Literals.SESSION_MANAGER__HTTP_CONNECTIONS);
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
	 * This returns SessionManager.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SessionManager"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SessionManager_type");
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

		switch (notification.getFeatureID(SessionManager.class)) {
			case EzxtopologyPackage.SESSION_MANAGER__USB_CONNECTIONS:
			case EzxtopologyPackage.SESSION_MANAGER__BLUETOOTH_CONNECTIONS:
			case EzxtopologyPackage.SESSION_MANAGER__UDP_CONNECTIONS:
			case EzxtopologyPackage.SESSION_MANAGER__TCP_CONNECTIONS:
			case EzxtopologyPackage.SESSION_MANAGER__XBEE_CONNECTIONS:
			case EzxtopologyPackage.SESSION_MANAGER__HTTP_CONNECTIONS:
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
				(EzxtopologyPackage.Literals.SESSION_MANAGER__USB_CONNECTIONS,
				 EzxtopologyFactory.eINSTANCE.createUsbConnection()));

		newChildDescriptors.add
			(createChildParameter
				(EzxtopologyPackage.Literals.SESSION_MANAGER__BLUETOOTH_CONNECTIONS,
				 EzxtopologyFactory.eINSTANCE.createBluetoothConnection()));

		newChildDescriptors.add
			(createChildParameter
				(EzxtopologyPackage.Literals.SESSION_MANAGER__UDP_CONNECTIONS,
				 EzxtopologyFactory.eINSTANCE.createUDPConnection()));

		newChildDescriptors.add
			(createChildParameter
				(EzxtopologyPackage.Literals.SESSION_MANAGER__TCP_CONNECTIONS,
				 EzxtopologyFactory.eINSTANCE.createTcpConnection()));

		newChildDescriptors.add
			(createChildParameter
				(EzxtopologyPackage.Literals.SESSION_MANAGER__XBEE_CONNECTIONS,
				 EzxtopologyFactory.eINSTANCE.createXBeeConnection()));

		newChildDescriptors.add
			(createChildParameter
				(EzxtopologyPackage.Literals.SESSION_MANAGER__HTTP_CONNECTIONS,
				 EzxtopologyFactory.eINSTANCE.createHTTPConnection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EzxtopologyEditPlugin.INSTANCE;
	}

}
