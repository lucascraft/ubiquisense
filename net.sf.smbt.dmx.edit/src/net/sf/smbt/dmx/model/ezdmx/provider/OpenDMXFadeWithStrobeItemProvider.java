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
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe;
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
 * This is the item provider adapter for a {@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenDMXFadeWithStrobeItemProvider
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
	public OpenDMXFadeWithStrobeItemProvider(AdapterFactory adapterFactory) {
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

			addChannelPropertyDescriptor(object);
			addRPropertyDescriptor(object);
			addBPropertyDescriptor(object);
			addGPropertyDescriptor(object);
			addStrobePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Channel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChannelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpenDMXFadeWithStrobe_channel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeWithStrobe_channel_feature", "_UI_OpenDMXFadeWithStrobe_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__CHANNEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_OpenDMXFadeWithStrobe_r_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeWithStrobe_r_feature", "_UI_OpenDMXFadeWithStrobe_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__R,
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
				 getString("_UI_OpenDMXFadeWithStrobe_b_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeWithStrobe_b_feature", "_UI_OpenDMXFadeWithStrobe_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__B,
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
				 getString("_UI_OpenDMXFadeWithStrobe_g_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeWithStrobe_g_feature", "_UI_OpenDMXFadeWithStrobe_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__G,
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
				 getString("_UI_OpenDMXFadeWithStrobe_strobe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpenDMXFadeWithStrobe_strobe_feature", "_UI_OpenDMXFadeWithStrobe_type"),
				 EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__STROBE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns OpenDMXFadeWithStrobe.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OpenDMXFadeWithStrobe"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PRIORITY labelValue = ((OpenDMXFadeWithStrobe)object).getPriority();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_OpenDMXFadeWithStrobe_type") :
			getString("_UI_OpenDMXFadeWithStrobe_type") + " " + label;
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

		switch (notification.getFeatureID(OpenDMXFadeWithStrobe.class)) {
			case EzdmxPackage.OPEN_DMX_FADE_WITH_STROBE__CHANNEL:
			case EzdmxPackage.OPEN_DMX_FADE_WITH_STROBE__R:
			case EzdmxPackage.OPEN_DMX_FADE_WITH_STROBE__B:
			case EzdmxPackage.OPEN_DMX_FADE_WITH_STROBE__G:
			case EzdmxPackage.OPEN_DMX_FADE_WITH_STROBE__STROBE:
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
