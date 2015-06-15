/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2T3D;
import net.sf.smbt.osccmd.provider.OscCmdItemProvider;

import net.sf.xqz.model.cmd.PRIORITY;
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
 * This is the item provider adapter for a {@link net.sf.smbt.osc.eztuio2.Tuio2T3D} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Tuio2T3DItemProvider
	extends OscCmdItemProvider
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
	public Tuio2T3DItemProvider(AdapterFactory adapterFactory) {
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

			addS_idPropertyDescriptor(object);
			addTu_idPropertyDescriptor(object);
			addC_idPropertyDescriptor(object);
			addX_posPropertyDescriptor(object);
			addY_posPropertyDescriptor(object);
			addZ_posPropertyDescriptor(object);
			addYawPropertyDescriptor(object);
			addPitchPropertyDescriptor(object);
			addRollPropertyDescriptor(object);
			addX_velPropertyDescriptor(object);
			addY_velPropertyDescriptor(object);
			addZ_velPropertyDescriptor(object);
			addA_velPropertyDescriptor(object);
			addB_velPropertyDescriptor(object);
			addC_velPropertyDescriptor(object);
			addM_accPropertyDescriptor(object);
			addR_accPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addS_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_s_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_s_id_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__SID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tu id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTu_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_tu_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_tu_id_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__TU_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addC_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_c_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_c_id_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__CID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xpos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addX_posPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_x_pos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_x_pos_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__XPOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ypos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addY_posPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_y_pos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_y_pos_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__YPOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zpos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZ_posPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_z_pos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_z_pos_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__ZPOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Yaw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYawPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_yaw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_yaw_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__YAW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pitch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPitchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_pitch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_pitch_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__PITCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Roll feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRollPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_roll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_roll_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__ROLL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xvel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addX_velPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_x_vel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_x_vel_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__XVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Yvel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addY_velPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_y_vel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_y_vel_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__YVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zvel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZ_velPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_z_vel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_z_vel_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__ZVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Avel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addA_velPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_a_vel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_a_vel_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__AVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bvel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addB_velPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_b_vel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_b_vel_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__BVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cvel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addC_velPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_c_vel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_c_vel_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__CVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Macc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_accPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_m_acc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_m_acc_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__MACC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Racc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addR_accPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tuio2T3D_r_acc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tuio2T3D_r_acc_feature", "_UI_Tuio2T3D_type"),
				 Eztuio2Package.Literals.TUIO2_T3D__RACC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Tuio2T3D.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tuio2T3D"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PRIORITY labelValue = ((Tuio2T3D)object).getPriority();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Tuio2T3D_type") :
			getString("_UI_Tuio2T3D_type") + " " + label;
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

		switch (notification.getFeatureID(Tuio2T3D.class)) {
			case Eztuio2Package.TUIO2_T3D__SID:
			case Eztuio2Package.TUIO2_T3D__TU_ID:
			case Eztuio2Package.TUIO2_T3D__CID:
			case Eztuio2Package.TUIO2_T3D__XPOS:
			case Eztuio2Package.TUIO2_T3D__YPOS:
			case Eztuio2Package.TUIO2_T3D__ZPOS:
			case Eztuio2Package.TUIO2_T3D__YAW:
			case Eztuio2Package.TUIO2_T3D__PITCH:
			case Eztuio2Package.TUIO2_T3D__ROLL:
			case Eztuio2Package.TUIO2_T3D__XVEL:
			case Eztuio2Package.TUIO2_T3D__YVEL:
			case Eztuio2Package.TUIO2_T3D__ZVEL:
			case Eztuio2Package.TUIO2_T3D__AVEL:
			case Eztuio2Package.TUIO2_T3D__BVEL:
			case Eztuio2Package.TUIO2_T3D__CVEL:
			case Eztuio2Package.TUIO2_T3D__MACC:
			case Eztuio2Package.TUIO2_T3D__RACC:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EztuioX2EditPlugin.INSTANCE;
	}

}
