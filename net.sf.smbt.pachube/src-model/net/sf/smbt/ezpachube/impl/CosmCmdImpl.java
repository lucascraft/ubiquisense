/**
 */
package net.sf.smbt.ezpachube.impl;

import net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl;
import net.sf.smbt.ezpachube.CosmCmd;
import net.sf.smbt.ezpachube.EzpachubePackage;
import net.sf.smbt.ezpachube.FeedKind;
import net.sf.smbt.ezpachube.PACHUBE_ACCESS;
import net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS;
import net.sf.smbt.ezpachube.Version;

import org.eclipse.emf.ecore.EClass;
import org.eeml.xsd._0._5.EemlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cosm Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl#getJson <em>Json</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl#getFeedKind <em>Feed Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl#getFeed <em>Feed</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl#getEeml <em>Eeml</em>}</li>
 *   <li>{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl#getDatastream <em>Datastream</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CosmCmdImpl extends HttpCommCmdImpl implements CosmCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CosmCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzpachubePackage.Literals.COSM_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PACHUBE_HTTP_STATUS getStatus() {
		return (PACHUBE_HTTP_STATUS)eGet(EzpachubePackage.Literals.COSM_CMD__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PACHUBE_HTTP_STATUS newStatus) {
		eSet(EzpachubePackage.Literals.COSM_CMD__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PACHUBE_ACCESS getAccess() {
		return (PACHUBE_ACCESS)eGet(EzpachubePackage.Literals.COSM_CMD__ACCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(PACHUBE_ACCESS newAccess) {
		eSet(EzpachubePackage.Literals.COSM_CMD__ACCESS, newAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getJson() {
		return (Object)eGet(EzpachubePackage.Literals.COSM_CMD__JSON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJson(Object newJson) {
		eSet(EzpachubePackage.Literals.COSM_CMD__JSON, newJson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		return (Version)eGet(EzpachubePackage.Literals.COSM_CMD__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		eSet(EzpachubePackage.Literals.COSM_CMD__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedKind getFeedKind() {
		return (FeedKind)eGet(EzpachubePackage.Literals.COSM_CMD__FEED_KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedKind(FeedKind newFeedKind) {
		eSet(EzpachubePackage.Literals.COSM_CMD__FEED_KIND, newFeedKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeed() {
		return (String)eGet(EzpachubePackage.Literals.COSM_CMD__FEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeed(String newFeed) {
		eSet(EzpachubePackage.Literals.COSM_CMD__FEED, newFeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EemlType getEeml() {
		return (EemlType)eGet(EzpachubePackage.Literals.COSM_CMD__EEML, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEeml(EemlType newEeml) {
		eSet(EzpachubePackage.Literals.COSM_CMD__EEML, newEeml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatastream() {
		return (String)eGet(EzpachubePackage.Literals.COSM_CMD__DATASTREAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatastream(String newDatastream) {
		eSet(EzpachubePackage.Literals.COSM_CMD__DATASTREAM, newDatastream);
	}

} //CosmCmdImpl
