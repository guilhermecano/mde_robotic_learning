/**
 */
package mderl.util;

import mderl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mderl.MderlPackage
 * @generated
 */
public class MderlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MderlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MderlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MderlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MderlSwitch<Adapter> modelSwitch = new MderlSwitch<Adapter>() {
		@Override
		public Adapter caseExperiment(Experiment object) {
			return createExperimentAdapter();
		}

		@Override
		public Adapter caseAgent(Agent object) {
			return createAgentAdapter();
		}

		@Override
		public Adapter caseEnvironment(Environment object) {
			return createEnvironmentAdapter();
		}

		@Override
		public Adapter caseMobile(Mobile object) {
			return createMobileAdapter();
		}

		@Override
		public Adapter caseDummy(Dummy object) {
			return createDummyAdapter();
		}

		@Override
		public Adapter caseArm(Arm object) {
			return createArmAdapter();
		}

		@Override
		public Adapter caseRobotComponent(RobotComponent object) {
			return createRobotComponentAdapter();
		}

		@Override
		public Adapter casePanda(Panda object) {
			return createPandaAdapter();
		}

		@Override
		public Adapter caseTurtleBot(TurtleBot object) {
			return createTurtleBotAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseFixed(Fixed object) {
			return createFixedAdapter();
		}

		@Override
		public Adapter caseAerialRobot(AerialRobot object) {
			return createAerialRobotAdapter();
		}

		@Override
		public Adapter caseWheeledRobot(WheeledRobot object) {
			return createWheeledRobotAdapter();
		}

		@Override
		public Adapter caseARDrone(ARDrone object) {
			return createARDroneAdapter();
		}

		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseRLKAlgorithm(RLKAlgorithm object) {
			return createRLKAlgorithmAdapter();
		}

		@Override
		public Adapter caseRLKConfig(RLKConfig object) {
			return createRLKConfigAdapter();
		}

		@Override
		public Adapter caseConfig(Config object) {
			return createConfigAdapter();
		}

		@Override
		public Adapter casegeneral_elements(general_elements object) {
			return creategeneral_elementsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Experiment
	 * @generated
	 */
	public Adapter createExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Mobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Mobile
	 * @generated
	 */
	public Adapter createMobileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Dummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Dummy
	 * @generated
	 */
	public Adapter createDummyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Arm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Arm
	 * @generated
	 */
	public Adapter createArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.RobotComponent <em>Robot Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.RobotComponent
	 * @generated
	 */
	public Adapter createRobotComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Panda <em>Panda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Panda
	 * @generated
	 */
	public Adapter createPandaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.TurtleBot <em>Turtle Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.TurtleBot
	 * @generated
	 */
	public Adapter createTurtleBotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Fixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Fixed
	 * @generated
	 */
	public Adapter createFixedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.AerialRobot <em>Aerial Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.AerialRobot
	 * @generated
	 */
	public Adapter createAerialRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.WheeledRobot <em>Wheeled Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.WheeledRobot
	 * @generated
	 */
	public Adapter createWheeledRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.ARDrone <em>AR Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.ARDrone
	 * @generated
	 */
	public Adapter createARDroneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.RLKAlgorithm <em>RLK Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.RLKAlgorithm
	 * @generated
	 */
	public Adapter createRLKAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.RLKConfig <em>RLK Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.RLKConfig
	 * @generated
	 */
	public Adapter createRLKConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.Config
	 * @generated
	 */
	public Adapter createConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mderl.general_elements <em>general elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mderl.general_elements
	 * @generated
	 */
	public Adapter creategeneral_elementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MderlAdapterFactory
