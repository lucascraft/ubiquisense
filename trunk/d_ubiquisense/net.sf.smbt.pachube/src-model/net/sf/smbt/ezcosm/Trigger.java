/**
 */
package net.sf.smbt.ezcosm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezcosm.Trigger#getFeed <em>Feed</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.Trigger#getStream <em>Stream</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.Trigger#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.Trigger#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.Trigger#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.Trigger#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezcosm.EzcosmPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {

	/**
	 * Returns the value of the '<em><b>Feed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed</em>' attribute.
	 * @see #setFeed(String)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getTrigger_Feed()
	 * @model
	 * @generated
	 */
	String getFeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.Trigger#getFeed <em>Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed</em>' attribute.
	 * @see #getFeed()
	 * @generated
	 */
	void setFeed(String value);

	/**
	 * Returns the value of the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream</em>' attribute.
	 * @see #setStream(String)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getTrigger_Stream()
	 * @model
	 * @generated
	 */
	String getStream();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.Trigger#getStream <em>Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream</em>' attribute.
	 * @see #getStream()
	 * @generated
	 */
	void setStream(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezcosm.TriggerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezcosm.TriggerKind
	 * @see #setKind(TriggerKind)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getTrigger_Kind()
	 * @model
	 * @generated
	 */
	TriggerKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.Trigger#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezcosm.TriggerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TriggerKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getTrigger_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.Trigger#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getTrigger_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.Trigger#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getTrigger_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.Trigger#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);
} // Trigger
