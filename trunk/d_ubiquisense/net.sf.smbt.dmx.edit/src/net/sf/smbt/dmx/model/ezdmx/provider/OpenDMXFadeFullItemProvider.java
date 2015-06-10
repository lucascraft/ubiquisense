/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull;
import net.sf.xqz.model.cmd.PRIORITY;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenDMXFadeFullItemProvider
	extends OpenDMXCmdItemProvider
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
	public OpenDMXFadeFullItemProvider(AdapterFactory adapterFactory) {
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

			addRPropertyDescriptor(object);
			addGPropertyDescriptor(object);
			addBPropertyDescriptor(object);
			addFullColorPropertyDescriptor(object);
			addStrobePropertyDescriptor(object);
			addModiPropertyDescriptor(object);
			addExtPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenDMXFadeFull_r_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeFull_r_feature", "_UI_OpenDMXFadeFull_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__R,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the G feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenDMXFadeFull_g_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeFull_g_feature", "_UI_OpenDMXFadeFull_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__G,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenDMXFadeFull_b_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeFull_b_feature", "_UI_OpenDMXFadeFull_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__B,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Full Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenDMXFadeFull_fullColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeFull_fullColor_feature", "_UI_OpenDMXFadeFull_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__FULL_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strobe feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrobePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenDMXFadeFull_strobe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeFull_strobe_feature", "_UI_OpenDMXFadeFull_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__STROBE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenDMXFadeFull_modi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeFull_modi_feature", "_UI_OpenDMXFadeFull_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__MODI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ext feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenDMXFadeFull_ext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeFull_ext_feature", "_UI_OpenDMXFadeFull_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__EXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns OpenDMXFadeFull.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OpenDMXFadeFull"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PRIORITY labelValue = ((OpenDMXFadeFull)object).getPriority();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_OpenDMXFadeFull_type") :
			getString("_UI_OpenDMXFadeFull_type") + " " + label;
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

		switch (notification.getFeatureID(OpenDMXFadeFull.class)) {
			case EzdmxPackage.OPEN_DMX_FADE_FULL__R:
			case EzdmxPackage.OPEN_DMX_FADE_FULL__G:
			case EzdmxPackage.OPEN_DMX_FADE_FULL__B:
			case EzdmxPackage.OPEN_DMX_FADE_FULL__FULL_COLOR:
			case EzdmxPackage.OPEN_DMX_FADE_FULL__STROBE:
			case EzdmxPackage.OPEN_DMX_FADE_FULL__MODI:
			case EzdmxPackage.OPEN_DMX_FADE_FULL__EXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
