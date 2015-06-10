/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlFactory;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;
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
 * This is the item provider adapter for a {@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DMXUniverseCtrlItemProvider
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
	public DMXUniverseCtrlItemProvider(AdapterFactory adapterFactory) {
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
			addVerPropertyDescriptor(object);
			addChannelsPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addAddrRangeMinPropertyDescriptor(object);
			addAddrRangeMaxPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Ver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DMXUniverseCtrl_ver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DMXUniverseCtrl_ver_feature", "_UI_DMXUniverseCtrl_type"),
				 EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__VER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Channels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChannelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DMXUniverseCtrl_channels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DMXUniverseCtrl_channels_feature", "_UI_DMXUniverseCtrl_type"),
				 EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__CHANNELS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DMXUniverseCtrl_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DMXUniverseCtrl_id_feature", "_UI_DMXUniverseCtrl_type"),
				 EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Addr Range Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddrRangeMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DMXUniverseCtrl_addrRangeMin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DMXUniverseCtrl_addrRangeMin_feature", "_UI_DMXUniverseCtrl_type"),
				 EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Addr Range Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddrRangeMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DMXUniverseCtrl_addrRangeMax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DMXUniverseCtrl_addrRangeMax_feature", "_UI_DMXUniverseCtrl_type"),
				 EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX,
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
			childrenFeatures.add(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__FIXTURES);
			childrenFeatures.add(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__CUES);
			childrenFeatures.add(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__STEPS);
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
	 * This returns DMXUniverseCtrl.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DMXUniverseCtrl"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DMXUniverseCtrl dmxUniverseCtrl = (DMXUniverseCtrl)object;
		return getString("_UI_DMXUniverseCtrl_type") + " " + dmxUniverseCtrl.getId();
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

		switch (notification.getFeatureID(DMXUniverseCtrl.class)) {
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__VER:
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ID:
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN:
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__FIXTURES:
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CUES:
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__STEPS:
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
				(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__FIXTURES,
				 EzdmxctrlFactory.eINSTANCE.createDMXFixtureValuations()));

		newChildDescriptors.add
			(createChildParameter
				(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__FIXTURES,
				 EzdmxctrlFactory.eINSTANCE.createDMXFixture()));

		newChildDescriptors.add
			(createChildParameter
				(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__FIXTURES,
				 EzdmxctrlFactory.eINSTANCE.createDMXFixtureSet()));

		newChildDescriptors.add
			(createChildParameter
				(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__CUES,
				 EzdmxctrlFactory.eINSTANCE.createDMXFixtureValuations()));

		newChildDescriptors.add
			(createChildParameter
				(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__CUES,
				 EzdmxctrlFactory.eINSTANCE.createDMXFixture()));

		newChildDescriptors.add
			(createChildParameter
				(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__CUES,
				 EzdmxctrlFactory.eINSTANCE.createDMXFixtureSet()));

		newChildDescriptors.add
			(createChildParameter
				(EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__STEPS,
				 EzdmxctrlFactory.eINSTANCE.createDMXCueSequence()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__FIXTURES ||
			childFeature == EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL__CUES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EzdmxctrlEditPlugin.INSTANCE;
	}

}
