/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezmojo.EzmojoPackage;

import net.sf.smbt.ezmotion.EzmotionFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.ezmojo.EZMojoNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EZMojoNodeItemProvider
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
	public EZMojoNodeItemProvider(AdapterFactory adapterFactory) {
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

			addTtlPropertyDescriptor(object);
			addTokenPropertyDescriptor(object);
			addUuidPropertyDescriptor(object);
			addTogglePropertyDescriptor(object);
			addLastBangPropertyDescriptor(object);
			addListenersPropertyDescriptor(object);
			addForwardsPropertyDescriptor(object);
			addClockPropertyDescriptor(object);
			addHitsRatePerSecPropertyDescriptor(object);
			addTouchesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ttl feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTtlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_ttl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_ttl_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__TTL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Token feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTokenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_token_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_token_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__TOKEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uuid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_uuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_uuid_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__UUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Toggle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTogglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_toggle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_toggle_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__TOGGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Bang feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastBangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_lastBang_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_lastBang_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__LAST_BANG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Listeners feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListenersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_listeners_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_listeners_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__LISTENERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Forwards feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForwardsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_forwards_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_forwards_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__FORWARDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_clock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_clock_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__CLOCK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hits Rate Per Sec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHitsRatePerSecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_hitsRatePerSec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_hitsRatePerSec_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__HITS_RATE_PER_SEC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Touches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTouchesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoNode_touches_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoNode_touches_feature", "_UI_EZMojoNode_type"),
				 EzmojoPackage.Literals.EZ_MOJO_NODE__TOUCHES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(EzmojoPackage.Literals.EZ_MOJO_NODE__VARS);
			childrenFeatures.add(EzmojoPackage.Literals.EZ_MOJO_NODE__ELEMENTS);
			childrenFeatures.add(EzmojoPackage.Literals.EZ_MOJO_NODE__SERVICE);
			childrenFeatures.add(EzmojoPackage.Literals.EZ_MOJO_NODE__MOTIONS);
			childrenFeatures.add(EzmojoPackage.Literals.EZ_MOJO_NODE__SCRIPTS);
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
	 * This returns EZMojoNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EZMojoNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		EZMojoNode ezMojoNode = (EZMojoNode)object;
		return ezMojoNode.getToken();
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

		switch (notification.getFeatureID(EZMojoNode.class)) {
			case EzmojoPackage.EZ_MOJO_NODE__TOKEN:
			case EzmojoPackage.EZ_MOJO_NODE__TOGGLE:
			case EzmojoPackage.EZ_MOJO_NODE__CLOCK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EzmojoPackage.EZ_MOJO_NODE__VARS:
			case EzmojoPackage.EZ_MOJO_NODE__ELEMENTS:
			case EzmojoPackage.EZ_MOJO_NODE__SERVICE:
			case EzmojoPackage.EZ_MOJO_NODE__MOTIONS:
			case EzmojoPackage.EZ_MOJO_NODE__SCRIPTS:
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
				(EzmojoPackage.Literals.EZ_MOJO_NODE__VARS,
				 EzmojoFactory.eINSTANCE.createEZVar()));

		newChildDescriptors.add
			(createChildParameter
				(EzmojoPackage.Literals.EZ_MOJO_NODE__VARS,
				 EzmojoFactory.eINSTANCE.createEZTUIOVar()));

		newChildDescriptors.add
			(createChildParameter
				(EzmojoPackage.Literals.EZ_MOJO_NODE__ELEMENTS,
				 EzmojoFactory.eINSTANCE.createEZMojoNode()));

		newChildDescriptors.add
			(createChildParameter
				(EzmojoPackage.Literals.EZ_MOJO_NODE__SERVICE,
				 EzmojoFactory.eINSTANCE.createEzMojoService()));

		newChildDescriptors.add
			(createChildParameter
				(EzmojoPackage.Literals.EZ_MOJO_NODE__MOTIONS,
				 EzmotionFactory.eINSTANCE.createMotion()));

		newChildDescriptors.add
			(createChildParameter
				(EzmojoPackage.Literals.EZ_MOJO_NODE__SCRIPTS,
				 EzmojoFactory.eINSTANCE.createEZScript()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EzmojoEditPlugin.INSTANCE;
	}

}
