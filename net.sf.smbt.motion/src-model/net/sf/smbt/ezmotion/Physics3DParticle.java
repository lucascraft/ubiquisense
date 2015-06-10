/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmotion;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physics3 DParticle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmotion.Physics3DParticle#getCharge <em>Charge</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Physics3DParticle#getMass <em>Mass</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Physics3DParticle#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Physics3DParticle#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Physics3DParticle#getPos <em>Pos</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Physics3DParticle#getRadiosity <em>Radiosity</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Physics3DParticle#getAccel <em>Accel</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Physics3DParticle#getRot <em>Rot</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmotion.EzmotionPackage#getPhysics3DParticle()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Physics3DParticle extends EObject {
	/**
	 * Returns the value of the '<em><b>Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge</em>' attribute.
	 * @see #setCharge(float)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getPhysics3DParticle_Charge()
	 * @model
	 * @generated
	 */
	float getCharge();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Physics3DParticle#getCharge <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge</em>' attribute.
	 * @see #getCharge()
	 * @generated
	 */
	void setCharge(float value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see #setMass(float)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getPhysics3DParticle_Mass()
	 * @model
	 * @generated
	 */
	float getMass();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Physics3DParticle#getMass <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' attribute.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(float value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getPhysics3DParticle_Speed()
	 * @model
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Physics3DParticle#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getPhysics3DParticle_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Physics3DParticle#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' reference.
	 * @see #setPos(Vect3f)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getPhysics3DParticle_Pos()
	 * @model
	 * @generated
	 */
	Vect3f getPos();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Physics3DParticle#getPos <em>Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(Vect3f value);

	/**
	 * Returns the value of the '<em><b>Radiosity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radiosity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radiosity</em>' attribute.
	 * @see #setRadiosity(float)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getPhysics3DParticle_Radiosity()
	 * @model
	 * @generated
	 */
	float getRadiosity();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Physics3DParticle#getRadiosity <em>Radiosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radiosity</em>' attribute.
	 * @see #getRadiosity()
	 * @generated
	 */
	void setRadiosity(float value);

	/**
	 * Returns the value of the '<em><b>Accel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accel</em>' reference.
	 * @see #setAccel(Vect3f)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getPhysics3DParticle_Accel()
	 * @model
	 * @generated
	 */
	Vect3f getAccel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Physics3DParticle#getAccel <em>Accel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accel</em>' reference.
	 * @see #getAccel()
	 * @generated
	 */
	void setAccel(Vect3f value);

	/**
	 * Returns the value of the '<em><b>Rot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rot</em>' reference.
	 * @see #setRot(Vect3f)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getPhysics3DParticle_Rot()
	 * @model
	 * @generated
	 */
	Vect3f getRot();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Physics3DParticle#getRot <em>Rot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot</em>' reference.
	 * @see #getRot()
	 * @generated
	 */
	void setRot(Vect3f value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void set3DPos(float x, float y, float z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void set3DRot(float xRot, float yRot, float zRot);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void set3DAccel(float xAccel, float yAccel, float zAccel);

} // Physics3DParticle
