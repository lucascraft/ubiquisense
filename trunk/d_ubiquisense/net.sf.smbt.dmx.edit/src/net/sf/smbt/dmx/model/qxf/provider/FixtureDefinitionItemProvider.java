/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.dmx.model.qxf.QxfFactory;
import net.sf.smbt.dmx.model.qxf.QxfPackage;

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
 * This is the item provider adapter for a {@link net.sf.smbt.dmx.model.qxf.FixtureDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FixtureDefinitionItemProvider
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
	public FixtureDefinitionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QxfPackage.Literals.FIXTURE_DEFINITION__CREATOR);
			childrenFeatures.add(QxfPackage.Literals.FIXTURE_DEFINITION__MANUFACTURER);
			childrenFeatures.add(QxfPackage.Literals.FIXTURE_DEFINITION__MODEL);
			childrenFeatures.add(QxfPackage.Literals.FIXTURE_DEFINITION__TYPE);
			childrenFeatures.add(QxfPackage.Literals.FIXTURE_DEFINITION__CHANNEL);
			childrenFeatures.add(QxfPackage.Literals.FIXTURE_DEFINITION__MODE);
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
	 * This returns FixtureDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FixtureDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		FixtureDefinition fixture = (FixtureDefinition) object;
		String label = fixture.getModel();
		return label == null || label.length() == 0 ?
			"???" :
			label;
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

		switch (notification.getFeatureID(FixtureDefinition.class)) {
			case QxfPackage.FIXTURE_DEFINITION__CREATOR:
			case QxfPackage.FIXTURE_DEFINITION__MODEL:
			case QxfPackage.FIXTURE_DEFINITION__TYPE:
			case QxfPackage.FIXTURE_DEFINITION__CHANNEL:
			case QxfPackage.FIXTURE_DEFINITION__MODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			case QxfPackage.FIXTURE_DEFINITION__MANUFACTURER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
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
				(QxfPackage.Literals.FIXTURE_DEFINITION__CREATOR,
				 QxfFactory.eINSTANCE.createCreator()));

		newChildDescriptors.add
			(createChildParameter
				(QxfPackage.Literals.FIXTURE_DEFINITION__MANUFACTURER,
				 ""));

		newChildDescriptors.add
			(createChildParameter
				(QxfPackage.Literals.FIXTURE_DEFINITION__MODEL,
				 ""));

		newChildDescriptors.add
			(createChildParameter
				(QxfPackage.Literals.FIXTURE_DEFINITION__TYPE,
				 ""));

		newChildDescriptors.add
			(createChildParameter
				(QxfPackage.Literals.FIXTURE_DEFINITION__CHANNEL,
				 QxfFactory.eINSTANCE.createChannel()));

		newChildDescriptors.add
			(createChildParameter
				(QxfPackage.Literals.FIXTURE_DEFINITION__MODE,
				 QxfFactory.eINSTANCE.createMode()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QxfEditPlugin.INSTANCE;
	}

}
