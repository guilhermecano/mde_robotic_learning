/**
 */
package mderl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mderl.MderlPackage
 * @generated
 */
public interface MderlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MderlFactory eINSTANCE = mderl.impl.MderlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment</em>'.
	 * @generated
	 */
	Experiment createExperiment();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
	Environment createEnvironment();

	/**
	 * Returns a new object of class '<em>Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dummy</em>'.
	 * @generated
	 */
	Dummy createDummy();

	/**
	 * Returns a new object of class '<em>Panda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Panda</em>'.
	 * @generated
	 */
	Panda createPanda();

	/**
	 * Returns a new object of class '<em>Turtle Bot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turtle Bot</em>'.
	 * @generated
	 */
	TurtleBot createTurtleBot();

	/**
	 * Returns a new object of class '<em>AR Drone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AR Drone</em>'.
	 * @generated
	 */
	ARDrone createARDrone();

	/**
	 * Returns a new object of class '<em>RLK Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RLK Algorithm</em>'.
	 * @generated
	 */
	RLKAlgorithm createRLKAlgorithm();

	/**
	 * Returns a new object of class '<em>RLK Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RLK Config</em>'.
	 * @generated
	 */
	RLKConfig createRLKConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MderlPackage getMderlPackage();

} //MderlFactory
