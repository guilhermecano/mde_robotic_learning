/**
 */
package mderl.util;

import mderl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mderl.MderlPackage
 * @generated
 */
public class MderlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MderlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MderlSwitch() {
		if (modelPackage == null) {
			modelPackage = MderlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MderlPackage.EXPERIMENT: {
			Experiment experiment = (Experiment) theEObject;
			T result = caseExperiment(experiment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.AGENT: {
			Agent agent = (Agent) theEObject;
			T result = caseAgent(agent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.ENVIRONMENT: {
			Environment environment = (Environment) theEObject;
			T result = caseEnvironment(environment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.MOBILE: {
			Mobile mobile = (Mobile) theEObject;
			T result = caseMobile(mobile);
			if (result == null)
				result = caseRobotComponent(mobile);
			if (result == null)
				result = caseElement(mobile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.DUMMY: {
			Dummy dummy = (Dummy) theEObject;
			T result = caseDummy(dummy);
			if (result == null)
				result = casegeneral_elements(dummy);
			if (result == null)
				result = caseElement(dummy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.ARM: {
			Arm arm = (Arm) theEObject;
			T result = caseArm(arm);
			if (result == null)
				result = caseFixed(arm);
			if (result == null)
				result = caseRobotComponent(arm);
			if (result == null)
				result = caseElement(arm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.ROBOT_COMPONENT: {
			RobotComponent robotComponent = (RobotComponent) theEObject;
			T result = caseRobotComponent(robotComponent);
			if (result == null)
				result = caseElement(robotComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.PANDA: {
			Panda panda = (Panda) theEObject;
			T result = casePanda(panda);
			if (result == null)
				result = caseArm(panda);
			if (result == null)
				result = caseFixed(panda);
			if (result == null)
				result = caseRobotComponent(panda);
			if (result == null)
				result = caseElement(panda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.TURTLE_BOT: {
			TurtleBot turtleBot = (TurtleBot) theEObject;
			T result = caseTurtleBot(turtleBot);
			if (result == null)
				result = caseWheeledRobot(turtleBot);
			if (result == null)
				result = caseMobile(turtleBot);
			if (result == null)
				result = caseRobotComponent(turtleBot);
			if (result == null)
				result = caseElement(turtleBot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.FIXED: {
			Fixed fixed = (Fixed) theEObject;
			T result = caseFixed(fixed);
			if (result == null)
				result = caseRobotComponent(fixed);
			if (result == null)
				result = caseElement(fixed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.AERIAL_ROBOT: {
			AerialRobot aerialRobot = (AerialRobot) theEObject;
			T result = caseAerialRobot(aerialRobot);
			if (result == null)
				result = caseMobile(aerialRobot);
			if (result == null)
				result = caseRobotComponent(aerialRobot);
			if (result == null)
				result = caseElement(aerialRobot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.WHEELED_ROBOT: {
			WheeledRobot wheeledRobot = (WheeledRobot) theEObject;
			T result = caseWheeledRobot(wheeledRobot);
			if (result == null)
				result = caseMobile(wheeledRobot);
			if (result == null)
				result = caseRobotComponent(wheeledRobot);
			if (result == null)
				result = caseElement(wheeledRobot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.AR_DRONE: {
			ARDrone arDrone = (ARDrone) theEObject;
			T result = caseARDrone(arDrone);
			if (result == null)
				result = caseAerialRobot(arDrone);
			if (result == null)
				result = caseMobile(arDrone);
			if (result == null)
				result = caseRobotComponent(arDrone);
			if (result == null)
				result = caseElement(arDrone);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.RLK_ALGORITHM: {
			RLKAlgorithm rlkAlgorithm = (RLKAlgorithm) theEObject;
			T result = caseRLKAlgorithm(rlkAlgorithm);
			if (result == null)
				result = caseModel(rlkAlgorithm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.RLK_CONFIG: {
			RLKConfig rlkConfig = (RLKConfig) theEObject;
			T result = caseRLKConfig(rlkConfig);
			if (result == null)
				result = caseConfig(rlkConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.CONFIG: {
			Config config = (Config) theEObject;
			T result = caseConfig(config);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MderlPackage.GENERAL_ELEMENTS: {
			general_elements general_elements = (general_elements) theEObject;
			T result = casegeneral_elements(general_elements);
			if (result == null)
				result = caseElement(general_elements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperiment(Experiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobile(Mobile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dummy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDummy(Dummy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArm(Arm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobotComponent(RobotComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanda(Panda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turtle Bot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turtle Bot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurtleBot(TurtleBot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixed(Fixed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aerial Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aerial Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAerialRobot(AerialRobot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wheeled Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wheeled Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWheeledRobot(WheeledRobot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AR Drone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AR Drone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARDrone(ARDrone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RLK Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RLK Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRLKAlgorithm(RLKAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RLK Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RLK Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRLKConfig(RLKConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfig(Config object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>general elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>general elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegeneral_elements(general_elements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MderlSwitch
