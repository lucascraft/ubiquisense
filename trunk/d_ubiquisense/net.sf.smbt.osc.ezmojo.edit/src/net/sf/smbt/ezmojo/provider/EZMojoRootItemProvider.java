/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezmojo.EzmojoPackage;

import net.sf.xqz.model.engine.EnginePackage;

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
 * This is the item provider adapter for a {@link net.sf.smbt.ezmojo.EZMojoRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EZMojoRootItemProvider
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
	public EZMojoRootItemProvider(AdapterFactory adapterFactory) {
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

			addEnginesPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addFeedbackPropertyDescriptor(object);
			addVarsModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Engines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnginesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IConnectedUnit_engines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IConnectedUnit_engines_feature", "_UI_IConnectedUnit_type"),
				 EnginePackage.Literals.ICONNECTED_UNIT__ENGINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IConnectedUnit_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IConnectedUnit_default_feature", "_UI_IConnectedUnit_type"),
				 EnginePackage.Literals.ICONNECTED_UNIT__DEFAULT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoRoot_selected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoRoot_selected_feature", "_UI_EZMojoRoot_type"),
				 EzmojoPackage.Literals.EZ_MOJO_ROOT__SELECTED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoRoot_feedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoRoot_feedback_feature", "_UI_EZMojoRoot_type"),
				 EzmojoPackage.Literals.EZ_MOJO_ROOT__FEEDBACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vars Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVarsModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZMojoRoot_varsMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZMojoRoot_varsMode_feature", "_UI_EZMojoRoot_type"),
				 EzmojoPackage.Literals.EZ_MOJO_ROOT__VARS_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(EzmojoPackage.Literals.EZ_MOJO_ROOT__ROOT);
			childrenFeatures.add(EzmojoPackage.Literals.EZ_MOJO_ROOT__TARGETS);
			childrenFeatures.add(EzmojoPackage.Literals.EZ_MOJO_ROOT__MOTION_REACTOR);
			childrenFeatures.add(EzmojoPackage.Literals.EZ_MOJO_ROOT__INDEX);
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
	 * This returns EZMojoRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EZMojoRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EZMojoRoot ezMojoRoot = (EZMojoRoot)object;
		return getString("_UI_EZMojoRoot_type") + " " + ezMojoRoot.isFeedback();
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

		switch (notification.getFeatureID(EZMojoRoot.class)) {
			case EzmojoPackage.EZ_MOJO_ROOT__FEEDBACK:
			case EzmojoPackage.EZ_MOJO_ROOT__VARS_MODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EzmojoPackage.EZ_MOJO_ROOT__ROOT:
			case EzmojoPackage.EZ_MOJO_ROOT__TARGETS:
			case EzmojoPackage.EZ_MOJO_ROOT__MOTION_REACTOR:
			case EzmojoPackage.EZ_MOJO_ROOT__INDEX:
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
				(EzmojoPackage.Literals.EZ_MOJO_ROOT__ROOT,
				 EzmojoFactory.eINSTANCE.createEZMojoNode()));

		newChildDescriptors.add
			(createChildParameter
				(EzmojoPackage.Literals.EZ_MOJO_ROOT__TARGETS,
				 EzmojoFactory.eINSTANCE.createEZMojoTarget()));

		newChildDescriptors.add
			(createChildParameter
				(EzmojoPackage.Literals.EZ_MOJO_ROOT__MOTION_REACTOR,
				 EzmojoFactory.eINSTANCE.createMotionReactor()));

		newChildDescriptors.add
			(createChildParameter
				(EzmojoPackage.Literals.EZ_MOJO_ROOT__INDEX,
				 EzmojoFactory.eINSTANCE.create(EzmojoPackage.Literals.INDEX2_MOJO_NODE)));
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
