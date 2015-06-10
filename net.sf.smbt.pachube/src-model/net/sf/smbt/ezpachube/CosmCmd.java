/**
 */
package net.sf.smbt.ezpachube;

import net.sf.smbt.comm.httpcmd.HttpCommCmd;

import org.eeml.xsd._0._5.EemlType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cosm Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezpachube.CosmCmd#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.CosmCmd#getAccess <em>Access</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.CosmCmd#getJson <em>Json</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.CosmCmd#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.CosmCmd#getFeedKind <em>Feed Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.CosmCmd#getFeed <em>Feed</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.CosmCmd#getEeml <em>Eeml</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.CosmCmd#getDatastream <em>Datastream</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezpachube.EzpachubePackage#getCosmCmd()
 * @model
 * @generated
 */
public interface CosmCmd extends HttpCommCmd {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS
	 * @see #setStatus(PACHUBE_HTTP_STATUS)
	 * @see net.sf.smbt.ezpachube.EzpachubePackage#getCosmCmd_Status()
	 * @model
	 * @generated
	 */
	PACHUBE_HTTP_STATUS getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezpachube.CosmCmd#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PACHUBE_HTTP_STATUS value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezpachube.PACHUBE_ACCESS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see net.sf.smbt.ezpachube.PACHUBE_ACCESS
	 * @see #setAccess(PACHUBE_ACCESS)
	 * @see net.sf.smbt.ezpachube.EzpachubePackage#getCosmCmd_Access()
	 * @model
	 * @generated
	 */
	PACHUBE_ACCESS getAccess();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezpachube.CosmCmd#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see net.sf.smbt.ezpachube.PACHUBE_ACCESS
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(PACHUBE_ACCESS value);

	/**
	 * Returns the value of the '<em><b>Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json</em>' attribute.
	 * @see #setJson(Object)
	 * @see net.sf.smbt.ezpachube.EzpachubePackage#getCosmCmd_Json()
	 * @model
	 * @generated
	 */
	Object getJson();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezpachube.CosmCmd#getJson <em>Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json</em>' attribute.
	 * @see #getJson()
	 * @generated
	 */
	void setJson(Object value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezpachube.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see net.sf.smbt.ezpachube.Version
	 * @see #setVersion(Version)
	 * @see net.sf.smbt.ezpachube.EzpachubePackage#getCosmCmd_Version()
	 * @model
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezpachube.CosmCmd#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see net.sf.smbt.ezpachube.Version
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Feed Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezpachube.FeedKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Kind</em>' attribute.
	 * @see net.sf.smbt.ezpachube.FeedKind
	 * @see #setFeedKind(FeedKind)
	 * @see net.sf.smbt.ezpachube.EzpachubePackage#getCosmCmd_FeedKind()
	 * @model
	 * @generated
	 */
	FeedKind getFeedKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezpachube.CosmCmd#getFeedKind <em>Feed Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Kind</em>' attribute.
	 * @see net.sf.smbt.ezpachube.FeedKind
	 * @see #getFeedKind()
	 * @generated
	 */
	void setFeedKind(FeedKind value);

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
	 * @see net.sf.smbt.ezpachube.EzpachubePackage#getCosmCmd_Feed()
	 * @model
	 * @generated
	 */
	String getFeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezpachube.CosmCmd#getFeed <em>Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed</em>' attribute.
	 * @see #getFeed()
	 * @generated
	 */
	void setFeed(String value);

	/**
	 * Returns the value of the '<em><b>Eeml</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eeml</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eeml</em>' reference.
	 * @see #setEeml(EemlType)
	 * @see net.sf.smbt.ezpachube.EzpachubePackage#getCosmCmd_Eeml()
	 * @model
	 * @generated
	 */
	EemlType getEeml();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezpachube.CosmCmd#getEeml <em>Eeml</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eeml</em>' reference.
	 * @see #getEeml()
	 * @generated
	 */
	void setEeml(EemlType value);

	/**
	 * Returns the value of the '<em><b>Datastream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datastream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastream</em>' attribute.
	 * @see #setDatastream(String)
	 * @see net.sf.smbt.ezpachube.EzpachubePackage#getCosmCmd_Datastream()
	 * @model
	 * @generated
	 */
	String getDatastream();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezpachube.CosmCmd#getDatastream <em>Datastream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datastream</em>' attribute.
	 * @see #getDatastream()
	 * @generated
	 */
	void setDatastream(String value);

} // CosmCmd
