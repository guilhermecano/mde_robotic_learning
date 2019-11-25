/**
 */
package mderl.impl;

import mderl.ARDrone;
import mderl.AerialRobot;
import mderl.Agent;
import mderl.Arm;
import mderl.Config;
import mderl.Dummy;
import mderl.Element;
import mderl.Environment;
import mderl.Experiment;
import mderl.Fixed;
import mderl.MderlFactory;
import mderl.MderlPackage;
import mderl.Mobile;
import mderl.Model;
import mderl.Panda;
import mderl.RLKAlgorithm;
import mderl.RLKConfig;
import mderl.RobotComponent;
import mderl.TurtleBot;
import mderl.WheeledRobot;

import mderl.general_elements;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MderlPackageImpl extends EPackageImpl implements MderlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass armEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pandaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turtleBotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aerialRobotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wheeledRobotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arDroneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rlkAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rlkConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass general_elementsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mderl.MderlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MderlPackageImpl() {
		super(eNS_URI, MderlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MderlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MderlPackage init() {
		if (isInited)
			return (MderlPackage) EPackage.Registry.INSTANCE.getEPackage(MderlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMderlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MderlPackageImpl theMderlPackage = registeredMderlPackage instanceof MderlPackageImpl
				? (MderlPackageImpl) registeredMderlPackage
				: new MderlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMderlPackage.createPackageContents();

		// Initialize created meta-data
		theMderlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMderlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MderlPackage.eNS_URI, theMderlPackage);
		return theMderlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperiment() {
		return experimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperiment_Name() {
		return (EAttribute) experimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperiment_Id() {
		return (EAttribute) experimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperiment_Agent() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperiment_Environment() {
		return (EReference) experimentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Robotcomponent() {
		return (EReference) agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Model() {
		return (EReference) agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgent_Dim_obs() {
		return (EAttribute) agentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgent_Dim_act() {
		return (EAttribute) agentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgent_Min_act_value() {
		return (EAttribute) agentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgent_Max_act_value() {
		return (EAttribute) agentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgent_Id() {
		return (EAttribute) agentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Scene() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironment_Elements() {
		return (EReference) environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Dynamic_reset() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Name() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Headless() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMobile() {
		return mobileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDummy() {
		return dummyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDummy_Element_type() {
		return (EAttribute) dummyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArm() {
		return armEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobotComponent() {
		return robotComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRobotComponent_Joint_names() {
		return (EAttribute) robotComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPanda() {
		return pandaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurtleBot() {
		return turtleBotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Position() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Orientation() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Linear_velocity() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Angular_velocity() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Id() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixed() {
		return fixedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAerialRobot() {
		return aerialRobotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAerialRobot_Propeller_name() {
		return (EAttribute) aerialRobotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWheeledRobot() {
		return wheeledRobotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWheeledRobot_Wheel_name() {
		return (EAttribute) wheeledRobotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getARDrone() {
		return arDroneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Config() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRLKAlgorithm() {
		return rlkAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRLKConfig() {
		return rlkConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Algorithm() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Version() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Layer_size() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Replay_buffer_size() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Num_epochs() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Num_eval_steps() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Num_trains() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Num_expl_steps() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Min_num_steps() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Max_path_length() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Discount() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Soft_target_tau() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Target_update_period() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Policy_lr() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Qf_lr() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Reward_scale() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Auto_entropy_tuning() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRLKConfig_Batch_size() {
		return (EAttribute) rlkConfigEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getgeneral_elements() {
		return general_elementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MderlFactory getMderlFactory() {
		return (MderlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		experimentEClass = createEClass(EXPERIMENT);
		createEAttribute(experimentEClass, EXPERIMENT__NAME);
		createEAttribute(experimentEClass, EXPERIMENT__ID);
		createEReference(experimentEClass, EXPERIMENT__AGENT);
		createEReference(experimentEClass, EXPERIMENT__ENVIRONMENT);

		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__ROBOTCOMPONENT);
		createEReference(agentEClass, AGENT__MODEL);
		createEAttribute(agentEClass, AGENT__DIM_OBS);
		createEAttribute(agentEClass, AGENT__DIM_ACT);
		createEAttribute(agentEClass, AGENT__MIN_ACT_VALUE);
		createEAttribute(agentEClass, AGENT__MAX_ACT_VALUE);
		createEAttribute(agentEClass, AGENT__ID);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__SCENE);
		createEReference(environmentEClass, ENVIRONMENT__ELEMENTS);
		createEAttribute(environmentEClass, ENVIRONMENT__DYNAMIC_RESET);
		createEAttribute(environmentEClass, ENVIRONMENT__NAME);
		createEAttribute(environmentEClass, ENVIRONMENT__HEADLESS);

		mobileEClass = createEClass(MOBILE);

		dummyEClass = createEClass(DUMMY);
		createEAttribute(dummyEClass, DUMMY__ELEMENT_TYPE);

		armEClass = createEClass(ARM);

		robotComponentEClass = createEClass(ROBOT_COMPONENT);
		createEAttribute(robotComponentEClass, ROBOT_COMPONENT__JOINT_NAMES);

		pandaEClass = createEClass(PANDA);

		turtleBotEClass = createEClass(TURTLE_BOT);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__POSITION);
		createEAttribute(elementEClass, ELEMENT__ORIENTATION);
		createEAttribute(elementEClass, ELEMENT__LINEAR_VELOCITY);
		createEAttribute(elementEClass, ELEMENT__ANGULAR_VELOCITY);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__NAME);

		fixedEClass = createEClass(FIXED);

		aerialRobotEClass = createEClass(AERIAL_ROBOT);
		createEAttribute(aerialRobotEClass, AERIAL_ROBOT__PROPELLER_NAME);

		wheeledRobotEClass = createEClass(WHEELED_ROBOT);
		createEAttribute(wheeledRobotEClass, WHEELED_ROBOT__WHEEL_NAME);

		arDroneEClass = createEClass(AR_DRONE);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONFIG);

		rlkAlgorithmEClass = createEClass(RLK_ALGORITHM);

		rlkConfigEClass = createEClass(RLK_CONFIG);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__ALGORITHM);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__VERSION);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__LAYER_SIZE);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__REPLAY_BUFFER_SIZE);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__NUM_EPOCHS);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__NUM_EVAL_STEPS);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__NUM_TRAINS);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__NUM_EXPL_STEPS);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__MIN_NUM_STEPS);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__MAX_PATH_LENGTH);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__DISCOUNT);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__SOFT_TARGET_TAU);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__TARGET_UPDATE_PERIOD);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__POLICY_LR);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__QF_LR);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__REWARD_SCALE);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__AUTO_ENTROPY_TUNING);
		createEAttribute(rlkConfigEClass, RLK_CONFIG__BATCH_SIZE);

		configEClass = createEClass(CONFIG);

		general_elementsEClass = createEClass(GENERAL_ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mobileEClass.getESuperTypes().add(this.getRobotComponent());
		dummyEClass.getESuperTypes().add(this.getgeneral_elements());
		armEClass.getESuperTypes().add(this.getFixed());
		robotComponentEClass.getESuperTypes().add(this.getElement());
		pandaEClass.getESuperTypes().add(this.getArm());
		turtleBotEClass.getESuperTypes().add(this.getWheeledRobot());
		fixedEClass.getESuperTypes().add(this.getRobotComponent());
		aerialRobotEClass.getESuperTypes().add(this.getMobile());
		wheeledRobotEClass.getESuperTypes().add(this.getMobile());
		arDroneEClass.getESuperTypes().add(this.getAerialRobot());
		rlkAlgorithmEClass.getESuperTypes().add(this.getModel());
		rlkConfigEClass.getESuperTypes().add(this.getConfig());
		general_elementsEClass.getESuperTypes().add(this.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(experimentEClass, Experiment.class, "Experiment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperiment_Name(), ecorePackage.getEString(), "name", "\"experiment\"", 0, 1,
				Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_Id(), ecorePackage.getEInt(), "id", "0", 1, 1, Experiment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperiment_Agent(), this.getAgent(), null, "agent", null, 1, 1, Experiment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperiment_Environment(), this.getEnvironment(), null, "environment", null, 1, 1,
				Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_Robotcomponent(), this.getRobotComponent(), null, "robotcomponent", null, 1, 1,
				Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Model(), this.getModel(), null, "model", null, 0, 1, Agent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAgent_Dim_obs(), ecorePackage.getEInt(), "dim_obs", null, 0, 1, Agent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgent_Dim_act(), ecorePackage.getEInt(), "dim_act", null, 0, 1, Agent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgent_Min_act_value(), ecorePackage.getEFloat(), "min_act_value", "0.0", 0, 1, Agent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgent_Max_act_value(), ecorePackage.getEFloat(), "max_act_value", "100.0", 0, 1, Agent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgent_Id(), ecorePackage.getEInt(), "id", "0", 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Scene(), ecorePackage.getEString(), "scene", null, 1, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_Elements(), this.getgeneral_elements(), null, "elements", null, 0, -1,
				Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Dynamic_reset(), ecorePackage.getEBoolean(), "dynamic_reset", "False", 1, 1,
				Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Name(), ecorePackage.getEString(), "name", "env", 1, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Headless(), ecorePackage.getEBoolean(), "headless", "False", 1, 1,
				Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mobileEClass, Mobile.class, "Mobile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dummyEClass, Dummy.class, "Dummy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDummy_Element_type(), ecorePackage.getEString(), "element_type", "Dummy", 1, 1, Dummy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(armEClass, Arm.class, "Arm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(robotComponentEClass, RobotComponent.class, "RobotComponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobotComponent_Joint_names(), ecorePackage.getEString(), "joint_names", null, 0, 1,
				RobotComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pandaEClass, Panda.class, "Panda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turtleBotEClass, TurtleBot.class, "TurtleBot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Position(), ecorePackage.getEFloat(), "position", null, 1, 3, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getElement_Orientation(), ecorePackage.getEFloat(), "orientation", null, 1, 3, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getElement_Linear_velocity(), ecorePackage.getEFloat(), "linear_velocity", "0.0", 0, 3,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Angular_velocity(), ecorePackage.getEFloat(), "angular_velocity", "0.0", 0, 3,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Id(), ecorePackage.getEInt(), "id", "0", 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", "", 1, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedEClass, Fixed.class, "Fixed", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aerialRobotEClass, AerialRobot.class, "AerialRobot", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAerialRobot_Propeller_name(), ecorePackage.getEString(), "propeller_name", null, 0, 1,
				AerialRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(wheeledRobotEClass, WheeledRobot.class, "WheeledRobot", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWheeledRobot_Wheel_name(), ecorePackage.getEString(), "wheel_name", null, 0, 1,
				WheeledRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(arDroneEClass, ARDrone.class, "ARDrone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelEClass, Model.class, "Model", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Config(), this.getConfig(), null, "config", null, 1, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rlkAlgorithmEClass, RLKAlgorithm.class, "RLKAlgorithm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rlkConfigEClass, RLKConfig.class, "RLKConfig", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRLKConfig_Algorithm(), ecorePackage.getEString(), "algorithm", "SAC", 1, 1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Version(), ecorePackage.getEString(), "version", "normal", 1, 1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Layer_size(), ecorePackage.getEInt(), "layer_size", "64", 0, -1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Replay_buffer_size(), ecorePackage.getEInt(), "replay_buffer_size", "1000000", 0, 1,
				RLKConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Num_epochs(), ecorePackage.getEInt(), "num_epochs", null, 0, 1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Num_eval_steps(), ecorePackage.getEInt(), "num_eval_steps", "1000", 0, 1,
				RLKConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Num_trains(), ecorePackage.getEInt(), "num_trains", "1000", 0, 1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Num_expl_steps(), ecorePackage.getEInt(), "num_expl_steps", "1000", 0, 1,
				RLKConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Min_num_steps(), ecorePackage.getEInt(), "min_num_steps", "1000", 0, 1,
				RLKConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Max_path_length(), ecorePackage.getEInt(), "max_path_length", "1000", 0, 1,
				RLKConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Discount(), ecorePackage.getEFloat(), "discount", "0.99", 0, 1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Soft_target_tau(), ecorePackage.getEFloat(), "soft_target_tau", "0.005", 0, 1,
				RLKConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Target_update_period(), ecorePackage.getEInt(), "target_update_period", "1", 0, 1,
				RLKConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Policy_lr(), ecorePackage.getEFloat(), "policy_lr", "0.0003", 0, 1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Qf_lr(), ecorePackage.getEFloat(), "qf_lr", "0.0003", 0, 1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Reward_scale(), ecorePackage.getEInt(), "reward_scale", "1", 0, 1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Auto_entropy_tuning(), ecorePackage.getEBoolean(), "auto_entropy_tuning", "True", 0,
				1, RLKConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRLKConfig_Batch_size(), ecorePackage.getEInt(), "batch_size", "256", 1, 1, RLKConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configEClass, Config.class, "Config", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(general_elementsEClass, general_elements.class, "general_elements", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MderlPackageImpl
