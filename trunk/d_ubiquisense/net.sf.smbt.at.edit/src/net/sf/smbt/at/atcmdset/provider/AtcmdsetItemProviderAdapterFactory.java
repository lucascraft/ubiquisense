/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.smbt.at.atcmdset.util.AtcmdsetAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AtcmdsetItemProviderAdapterFactory extends AtcmdsetAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public AtcmdsetItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.at.atcmdset.ATCmd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATCmdItemProvider atCmdItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.at.atcmdset.ATCmd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATCmdAdapter() {
		if (atCmdItemProvider == null) {
			atCmdItemProvider = new ATCmdItemProvider(this);
		}

		return atCmdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.at.atcmdset.ATRetCmd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATRetCmdItemProvider atRetCmdItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.at.atcmdset.ATRetCmd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATRetCmdAdapter() {
		if (atRetCmdItemProvider == null) {
			atRetCmdItemProvider = new ATRetCmdItemProvider(this);
		}

		return atRetCmdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.at.atcmdset.ATPlusPlusPlus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATPlusPlusPlusItemProvider atPlusPlusPlusItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.at.atcmdset.ATPlusPlusPlus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATPlusPlusPlusAdapter() {
		if (atPlusPlusPlusItemProvider == null) {
			atPlusPlusPlusItemProvider = new ATPlusPlusPlusItemProvider(this);
		}

		return atPlusPlusPlusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.at.atcmdset.ATBD} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATBDItemProvider atbdItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.at.atcmdset.ATBD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATBDAdapter() {
		if (atbdItemProvider == null) {
			atbdItemProvider = new ATBDItemProvider(this);
		}

		return atbdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.at.atcmdset.ATWR} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATWRItemProvider atwrItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.at.atcmdset.ATWR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATWRAdapter() {
		if (atwrItemProvider == null) {
			atwrItemProvider = new ATWRItemProvider(this);
		}

		return atwrItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.at.atcmdset.ATCN} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATCNItemProvider atcnItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.at.atcmdset.ATCN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATCNAdapter() {
		if (atcnItemProvider == null) {
			atcnItemProvider = new ATCNItemProvider(this);
		}

		return atcnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.at.atcmdset.ATID} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATIDItemProvider atidItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.at.atcmdset.ATID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATIDAdapter() {
		if (atidItemProvider == null) {
			atidItemProvider = new ATIDItemProvider(this);
		}

		return atidItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.at.atcmdset.ATMY} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATMYItemProvider atmyItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.at.atcmdset.ATMY}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATMYAdapter() {
		if (atmyItemProvider == null) {
			atmyItemProvider = new ATMYItemProvider(this);
		}

		return atmyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.at.atcmdset.ATDL} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATDLItemProvider atdlItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.at.atcmdset.ATDL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATDLAdapter() {
		if (atdlItemProvider == null) {
			atdlItemProvider = new ATDLItemProvider(this);
		}

		return atdlItemProvider;
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
		if (atCmdItemProvider != null) atCmdItemProvider.dispose();
		if (atRetCmdItemProvider != null) atRetCmdItemProvider.dispose();
		if (atPlusPlusPlusItemProvider != null) atPlusPlusPlusItemProvider.dispose();
		if (atbdItemProvider != null) atbdItemProvider.dispose();
		if (atwrItemProvider != null) atwrItemProvider.dispose();
		if (atcnItemProvider != null) atcnItemProvider.dispose();
		if (atidItemProvider != null) atidItemProvider.dispose();
		if (atmyItemProvider != null) atmyItemProvider.dispose();
		if (atdlItemProvider != null) atdlItemProvider.dispose();
	}

}
