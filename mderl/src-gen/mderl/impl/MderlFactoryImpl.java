/**
 */
package mderl.impl;

import mderl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MderlFactoryImpl extends EFactoryImpl implements MderlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MderlFactory init() {
		try {
			MderlFactory theMderlFactory = (MderlFactory) EPackage.Registry.INSTANCE.getEFactory(MderlPackage.eNS_URI);
			if (theMderlFactory != null) {
				return theMderlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MderlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MderlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MderlPackage.EXPERIMENT:
			return createExperiment();
		case MderlPackage.AGENT:
			return createAgent();
		case MderlPackage.ENVIRONMENT:
			return createEnvironment();
		case MderlPackage.DUMMY:
			return createDummy();
		case MderlPackage.PANDA:
			return createPanda();
		case MderlPackage.TURTLE_BOT:
			return createTurtleBot();
		case MderlPackage.AR_DRONE:
			return createARDrone();
		case MderlPackage.RLK_ALGORITHM:
			return createRLKAlgorithm();
		case MderlPackage.RLK_CONFIG:
			return createRLKConfig();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Experiment createExperiment() {
		ExperimentImpl experiment = new ExperimentImpl();
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dummy createDummy() {
		DummyImpl dummy = new DummyImpl();
		return dummy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Panda createPanda() {
		PandaImpl panda = new PandaImpl();
		return panda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TurtleBot createTurtleBot() {
		TurtleBotImpl turtleBot = new TurtleBotImpl();
		return turtleBot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ARDrone createARDrone() {
		ARDroneImpl arDrone = new ARDroneImpl();
		return arDrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RLKAlgorithm createRLKAlgorithm() {
		RLKAlgorithmImpl rlkAlgorithm = new RLKAlgorithmImpl();
		return rlkAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RLKConfig createRLKConfig() {
		RLKConfigImpl rlkConfig = new RLKConfigImpl();
		return rlkConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MderlPackage getMderlPackage() {
		return (MderlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MderlPackage getPackage() {
		return MderlPackage.eINSTANCE;
	}

} //MderlFactoryImpl
