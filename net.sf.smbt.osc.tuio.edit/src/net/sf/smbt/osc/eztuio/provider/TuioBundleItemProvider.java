/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.osc.eztuio.EztuioFactory;
import net.sf.smbt.osc.eztuio.EztuioPackage;
import net.sf.smbt.osc.eztuio.TuioBundle;
import net.sf.smbt.osccmd.OsccmdFactory;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.cmd.PRIORITY;
import net.sf.xqz.model.cmd.provider.CompoundCmdItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
 * This is the item provider adapter for a {@link net.sf.smbt.osc.eztuio.TuioBundle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TuioBundleItemProvider
	extends CompoundCmdItemProvider
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
	public TuioBundleItemProvider(AdapterFactory adapterFactory) {
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

			addTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TuioBundle_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TuioBundle_time_feature", "_UI_TuioBundle_type"),
				 EztuioPackage.Literals.TUIO_BUNDLE__TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TuioBundle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TuioBundle"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PRIORITY labelValue = ((TuioBundle)object).getPriority();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_TuioBundle_type") :
			getString("_UI_TuioBundle_type") + " " + label;
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

		switch (notification.getFeatureID(TuioBundle.class)) {
			case EztuioPackage.TUIO_BUNDLE__TIME:
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

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio2DObj()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio2DCur()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio3DObj()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio3DCur()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio25Obj()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio25Cur()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio3DBlob()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio25Blob()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio2DObjAdd()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio2DObjUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio2DObjRemove()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio2DCurAdd()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio2DCurUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuio2DCurRemove()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EztuioFactory.eINSTANCE.createTuioBundle()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 OsccmdFactory.eINSTANCE.createOscCmd()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 OsccmdFactory.eINSTANCE.createOscSndCmd()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 OsccmdFactory.eINSTANCE.createOscRcvCmd()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EztuioXEditPlugin.INSTANCE;
	}

}
