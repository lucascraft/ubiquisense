/**
 */
package net.sf.smbt.ezcosm.util;

import java.util.Map;

import net.sf.smbt.ezcosm.EzcosmPackage;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EzcosmXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzcosmXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EzcosmPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EzcosmResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EzcosmResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EzcosmResourceFactoryImpl());
		}
		return registrations;
	}

} //EzcosmXMLProcessor
