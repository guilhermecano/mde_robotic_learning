/**
 */
package mderl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mderl.MderlFactory
 * @model kind="package"
 * @generated
 */
public interface MderlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mderl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mderl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mderl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MderlPackage eINSTANCE = mderl.impl.MderlPackageImpl.init();

	/**
	 * The meta object id for the '{@link mderl.impl.ExperimentImpl <em>Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.ExperimentImpl
	 * @see mderl.impl.MderlPackageImpl#getExperiment()
	 * @generated
	 */
	int EXPERIMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__AGENT = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__ENVIRONMENT = 3;

	/**
	 * The number of structural features of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mderl.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.AgentImpl
	 * @see mderl.impl.MderlPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Robotcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ROBOTCOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Dim obs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DIM_OBS = 2;

	/**
	 * The feature id for the '<em><b>Dim act</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DIM_ACT = 3;

	/**
	 * The feature id for the '<em><b>Min act value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MIN_ACT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Max act value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MAX_ACT_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID = 6;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mderl.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.EnvironmentImpl
	 * @see mderl.impl.MderlPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SCENE = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Dynamic reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__DYNAMIC_RESET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Headless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__HEADLESS = 4;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mderl.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.ElementImpl
	 * @see mderl.impl.MderlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ORIENTATION = 1;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LINEAR_VELOCITY = 2;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANGULAR_VELOCITY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 5;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mderl.impl.RobotComponentImpl <em>Robot Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.RobotComponentImpl
	 * @see mderl.impl.MderlPackageImpl#getRobotComponent()
	 * @generated
	 */
	int ROBOT_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_COMPONENT__POSITION = ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_COMPONENT__ORIENTATION = ELEMENT__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_COMPONENT__LINEAR_VELOCITY = ELEMENT__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_COMPONENT__ANGULAR_VELOCITY = ELEMENT__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_COMPONENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_COMPONENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_COMPONENT__JOINT_NAMES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Robot Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Robot Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_COMPONENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.MobileImpl <em>Mobile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.MobileImpl
	 * @see mderl.impl.MderlPackageImpl#getMobile()
	 * @generated
	 */
	int MOBILE = 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__POSITION = ROBOT_COMPONENT__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__ORIENTATION = ROBOT_COMPONENT__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__LINEAR_VELOCITY = ROBOT_COMPONENT__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__ANGULAR_VELOCITY = ROBOT_COMPONENT__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__ID = ROBOT_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__NAME = ROBOT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE__JOINT_NAMES = ROBOT_COMPONENT__JOINT_NAMES;

	/**
	 * The number of structural features of the '<em>Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_FEATURE_COUNT = ROBOT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_OPERATION_COUNT = ROBOT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.general_elementsImpl <em>general elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.general_elementsImpl
	 * @see mderl.impl.MderlPackageImpl#getgeneral_elements()
	 * @generated
	 */
	int GENERAL_ELEMENTS = 18;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ELEMENTS__POSITION = ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ELEMENTS__ORIENTATION = ELEMENT__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ELEMENTS__LINEAR_VELOCITY = ELEMENT__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ELEMENTS__ANGULAR_VELOCITY = ELEMENT__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ELEMENTS__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ELEMENTS__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>general elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ELEMENTS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>general elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ELEMENTS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.DummyImpl <em>Dummy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.DummyImpl
	 * @see mderl.impl.MderlPackageImpl#getDummy()
	 * @generated
	 */
	int DUMMY = 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__POSITION = GENERAL_ELEMENTS__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__ORIENTATION = GENERAL_ELEMENTS__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__LINEAR_VELOCITY = GENERAL_ELEMENTS__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__ANGULAR_VELOCITY = GENERAL_ELEMENTS__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__ID = GENERAL_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__NAME = GENERAL_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Element type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__ELEMENT_TYPE = GENERAL_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dummy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_FEATURE_COUNT = GENERAL_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dummy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_OPERATION_COUNT = GENERAL_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.FixedImpl <em>Fixed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.FixedImpl
	 * @see mderl.impl.MderlPackageImpl#getFixed()
	 * @generated
	 */
	int FIXED = 10;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__POSITION = ROBOT_COMPONENT__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__ORIENTATION = ROBOT_COMPONENT__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__LINEAR_VELOCITY = ROBOT_COMPONENT__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__ANGULAR_VELOCITY = ROBOT_COMPONENT__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__ID = ROBOT_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__NAME = ROBOT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED__JOINT_NAMES = ROBOT_COMPONENT__JOINT_NAMES;

	/**
	 * The number of structural features of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_FEATURE_COUNT = ROBOT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OPERATION_COUNT = ROBOT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.ArmImpl <em>Arm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.ArmImpl
	 * @see mderl.impl.MderlPackageImpl#getArm()
	 * @generated
	 */
	int ARM = 5;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__POSITION = FIXED__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__ORIENTATION = FIXED__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__LINEAR_VELOCITY = FIXED__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__ANGULAR_VELOCITY = FIXED__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__ID = FIXED__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__NAME = FIXED__NAME;

	/**
	 * The feature id for the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM__JOINT_NAMES = FIXED__JOINT_NAMES;

	/**
	 * The number of structural features of the '<em>Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM_FEATURE_COUNT = FIXED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARM_OPERATION_COUNT = FIXED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.PandaImpl <em>Panda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.PandaImpl
	 * @see mderl.impl.MderlPackageImpl#getPanda()
	 * @generated
	 */
	int PANDA = 7;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANDA__POSITION = ARM__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANDA__ORIENTATION = ARM__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANDA__LINEAR_VELOCITY = ARM__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANDA__ANGULAR_VELOCITY = ARM__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANDA__ID = ARM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANDA__NAME = ARM__NAME;

	/**
	 * The feature id for the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANDA__JOINT_NAMES = ARM__JOINT_NAMES;

	/**
	 * The number of structural features of the '<em>Panda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANDA_FEATURE_COUNT = ARM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Panda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANDA_OPERATION_COUNT = ARM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.WheeledRobotImpl <em>Wheeled Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.WheeledRobotImpl
	 * @see mderl.impl.MderlPackageImpl#getWheeledRobot()
	 * @generated
	 */
	int WHEELED_ROBOT = 12;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT__POSITION = MOBILE__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT__ORIENTATION = MOBILE__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT__LINEAR_VELOCITY = MOBILE__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT__ANGULAR_VELOCITY = MOBILE__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT__ID = MOBILE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT__NAME = MOBILE__NAME;

	/**
	 * The feature id for the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT__JOINT_NAMES = MOBILE__JOINT_NAMES;

	/**
	 * The feature id for the '<em><b>Wheel name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT__WHEEL_NAME = MOBILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wheeled Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT_FEATURE_COUNT = MOBILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wheeled Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEELED_ROBOT_OPERATION_COUNT = MOBILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.TurtleBotImpl <em>Turtle Bot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.TurtleBotImpl
	 * @see mderl.impl.MderlPackageImpl#getTurtleBot()
	 * @generated
	 */
	int TURTLE_BOT = 8;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__POSITION = WHEELED_ROBOT__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__ORIENTATION = WHEELED_ROBOT__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__LINEAR_VELOCITY = WHEELED_ROBOT__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__ANGULAR_VELOCITY = WHEELED_ROBOT__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__ID = WHEELED_ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__NAME = WHEELED_ROBOT__NAME;

	/**
	 * The feature id for the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__JOINT_NAMES = WHEELED_ROBOT__JOINT_NAMES;

	/**
	 * The feature id for the '<em><b>Wheel name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT__WHEEL_NAME = WHEELED_ROBOT__WHEEL_NAME;

	/**
	 * The number of structural features of the '<em>Turtle Bot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT_FEATURE_COUNT = WHEELED_ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turtle Bot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_BOT_OPERATION_COUNT = WHEELED_ROBOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.AerialRobotImpl <em>Aerial Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.AerialRobotImpl
	 * @see mderl.impl.MderlPackageImpl#getAerialRobot()
	 * @generated
	 */
	int AERIAL_ROBOT = 11;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT__POSITION = MOBILE__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT__ORIENTATION = MOBILE__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT__LINEAR_VELOCITY = MOBILE__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT__ANGULAR_VELOCITY = MOBILE__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT__ID = MOBILE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT__NAME = MOBILE__NAME;

	/**
	 * The feature id for the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT__JOINT_NAMES = MOBILE__JOINT_NAMES;

	/**
	 * The feature id for the '<em><b>Propeller name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT__PROPELLER_NAME = MOBILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aerial Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT_FEATURE_COUNT = MOBILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aerial Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AERIAL_ROBOT_OPERATION_COUNT = MOBILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.ARDroneImpl <em>AR Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.ARDroneImpl
	 * @see mderl.impl.MderlPackageImpl#getARDrone()
	 * @generated
	 */
	int AR_DRONE = 13;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__POSITION = AERIAL_ROBOT__POSITION;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__ORIENTATION = AERIAL_ROBOT__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Linear velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__LINEAR_VELOCITY = AERIAL_ROBOT__LINEAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Angular velocity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__ANGULAR_VELOCITY = AERIAL_ROBOT__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__ID = AERIAL_ROBOT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__NAME = AERIAL_ROBOT__NAME;

	/**
	 * The feature id for the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__JOINT_NAMES = AERIAL_ROBOT__JOINT_NAMES;

	/**
	 * The feature id for the '<em><b>Propeller name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE__PROPELLER_NAME = AERIAL_ROBOT__PROPELLER_NAME;

	/**
	 * The number of structural features of the '<em>AR Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE_FEATURE_COUNT = AERIAL_ROBOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AR Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AR_DRONE_OPERATION_COUNT = AERIAL_ROBOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.ModelImpl
	 * @see mderl.impl.MderlPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 14;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mderl.impl.RLKAlgorithmImpl <em>RLK Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.RLKAlgorithmImpl
	 * @see mderl.impl.MderlPackageImpl#getRLKAlgorithm()
	 * @generated
	 */
	int RLK_ALGORITHM = 15;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_ALGORITHM__CONFIG = MODEL__CONFIG;

	/**
	 * The number of structural features of the '<em>RLK Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_ALGORITHM_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RLK Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_ALGORITHM_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mderl.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.ConfigImpl
	 * @see mderl.impl.MderlPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 17;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mderl.impl.RLKConfigImpl <em>RLK Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mderl.impl.RLKConfigImpl
	 * @see mderl.impl.MderlPackageImpl#getRLKConfig()
	 * @generated
	 */
	int RLK_CONFIG = 16;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__ALGORITHM = CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__VERSION = CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layer size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__LAYER_SIZE = CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replay buffer size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__REPLAY_BUFFER_SIZE = CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__NUM_EPOCHS = CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num eval steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__NUM_EVAL_STEPS = CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Num trains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__NUM_TRAINS = CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Num expl steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__NUM_EXPL_STEPS = CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min num steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__MIN_NUM_STEPS = CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max path length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__MAX_PATH_LENGTH = CONFIG_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__DISCOUNT = CONFIG_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Soft target tau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__SOFT_TARGET_TAU = CONFIG_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target update period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__TARGET_UPDATE_PERIOD = CONFIG_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Policy lr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__POLICY_LR = CONFIG_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Qf lr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__QF_LR = CONFIG_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reward scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__REWARD_SCALE = CONFIG_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Auto entropy tuning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__AUTO_ENTROPY_TUNING = CONFIG_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Batch size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG__BATCH_SIZE = CONFIG_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>RLK Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>RLK Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLK_CONFIG_OPERATION_COUNT = CONFIG_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link mderl.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment</em>'.
	 * @see mderl.Experiment
	 * @generated
	 */
	EClass getExperiment();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Experiment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mderl.Experiment#getName()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Name();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Experiment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mderl.Experiment#getId()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Id();

	/**
	 * Returns the meta object for the containment reference '{@link mderl.Experiment#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see mderl.Experiment#getAgent()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Agent();

	/**
	 * Returns the meta object for the containment reference '{@link mderl.Experiment#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see mderl.Experiment#getEnvironment()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Environment();

	/**
	 * Returns the meta object for class '{@link mderl.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see mderl.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the containment reference '{@link mderl.Agent#getRobotcomponent <em>Robotcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Robotcomponent</em>'.
	 * @see mderl.Agent#getRobotcomponent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Robotcomponent();

	/**
	 * Returns the meta object for the containment reference '{@link mderl.Agent#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see mderl.Agent#getModel()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Model();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Agent#getDim_obs <em>Dim obs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dim obs</em>'.
	 * @see mderl.Agent#getDim_obs()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Dim_obs();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Agent#getDim_act <em>Dim act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dim act</em>'.
	 * @see mderl.Agent#getDim_act()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Dim_act();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Agent#getMin_act_value <em>Min act value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min act value</em>'.
	 * @see mderl.Agent#getMin_act_value()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Min_act_value();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Agent#getMax_act_value <em>Max act value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max act value</em>'.
	 * @see mderl.Agent#getMax_act_value()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Max_act_value();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Agent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mderl.Agent#getId()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Id();

	/**
	 * Returns the meta object for class '{@link mderl.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see mderl.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Environment#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene</em>'.
	 * @see mderl.Environment#getScene()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Scene();

	/**
	 * Returns the meta object for the containment reference list '{@link mderl.Environment#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see mderl.Environment#getElements()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Elements();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Environment#isDynamic_reset <em>Dynamic reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic reset</em>'.
	 * @see mderl.Environment#isDynamic_reset()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Dynamic_reset();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mderl.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Environment#isHeadless <em>Headless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headless</em>'.
	 * @see mderl.Environment#isHeadless()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Headless();

	/**
	 * Returns the meta object for class '{@link mderl.Mobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile</em>'.
	 * @see mderl.Mobile
	 * @generated
	 */
	EClass getMobile();

	/**
	 * Returns the meta object for class '{@link mderl.Dummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy</em>'.
	 * @see mderl.Dummy
	 * @generated
	 */
	EClass getDummy();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Dummy#getElement_type <em>Element type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element type</em>'.
	 * @see mderl.Dummy#getElement_type()
	 * @see #getDummy()
	 * @generated
	 */
	EAttribute getDummy_Element_type();

	/**
	 * Returns the meta object for class '{@link mderl.Arm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arm</em>'.
	 * @see mderl.Arm
	 * @generated
	 */
	EClass getArm();

	/**
	 * Returns the meta object for class '{@link mderl.RobotComponent <em>Robot Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Component</em>'.
	 * @see mderl.RobotComponent
	 * @generated
	 */
	EClass getRobotComponent();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RobotComponent#getJoint_names <em>Joint names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joint names</em>'.
	 * @see mderl.RobotComponent#getJoint_names()
	 * @see #getRobotComponent()
	 * @generated
	 */
	EAttribute getRobotComponent_Joint_names();

	/**
	 * Returns the meta object for class '{@link mderl.Panda <em>Panda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panda</em>'.
	 * @see mderl.Panda
	 * @generated
	 */
	EClass getPanda();

	/**
	 * Returns the meta object for class '{@link mderl.TurtleBot <em>Turtle Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turtle Bot</em>'.
	 * @see mderl.TurtleBot
	 * @generated
	 */
	EClass getTurtleBot();

	/**
	 * Returns the meta object for class '{@link mderl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see mderl.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute list '{@link mderl.Element#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Position</em>'.
	 * @see mderl.Element#getPosition()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Position();

	/**
	 * Returns the meta object for the attribute list '{@link mderl.Element#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Orientation</em>'.
	 * @see mderl.Element#getOrientation()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Orientation();

	/**
	 * Returns the meta object for the attribute list '{@link mderl.Element#getLinear_velocity <em>Linear velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Linear velocity</em>'.
	 * @see mderl.Element#getLinear_velocity()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Linear_velocity();

	/**
	 * Returns the meta object for the attribute list '{@link mderl.Element#getAngular_velocity <em>Angular velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Angular velocity</em>'.
	 * @see mderl.Element#getAngular_velocity()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Angular_velocity();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mderl.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link mderl.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mderl.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link mderl.Fixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed</em>'.
	 * @see mderl.Fixed
	 * @generated
	 */
	EClass getFixed();

	/**
	 * Returns the meta object for class '{@link mderl.AerialRobot <em>Aerial Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aerial Robot</em>'.
	 * @see mderl.AerialRobot
	 * @generated
	 */
	EClass getAerialRobot();

	/**
	 * Returns the meta object for the attribute '{@link mderl.AerialRobot#getPropeller_name <em>Propeller name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propeller name</em>'.
	 * @see mderl.AerialRobot#getPropeller_name()
	 * @see #getAerialRobot()
	 * @generated
	 */
	EAttribute getAerialRobot_Propeller_name();

	/**
	 * Returns the meta object for class '{@link mderl.WheeledRobot <em>Wheeled Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheeled Robot</em>'.
	 * @see mderl.WheeledRobot
	 * @generated
	 */
	EClass getWheeledRobot();

	/**
	 * Returns the meta object for the attribute '{@link mderl.WheeledRobot#getWheel_name <em>Wheel name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wheel name</em>'.
	 * @see mderl.WheeledRobot#getWheel_name()
	 * @see #getWheeledRobot()
	 * @generated
	 */
	EAttribute getWheeledRobot_Wheel_name();

	/**
	 * Returns the meta object for class '{@link mderl.ARDrone <em>AR Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AR Drone</em>'.
	 * @see mderl.ARDrone
	 * @generated
	 */
	EClass getARDrone();

	/**
	 * Returns the meta object for class '{@link mderl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see mderl.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link mderl.Model#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see mderl.Model#getConfig()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Config();

	/**
	 * Returns the meta object for class '{@link mderl.RLKAlgorithm <em>RLK Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RLK Algorithm</em>'.
	 * @see mderl.RLKAlgorithm
	 * @generated
	 */
	EClass getRLKAlgorithm();

	/**
	 * Returns the meta object for class '{@link mderl.RLKConfig <em>RLK Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RLK Config</em>'.
	 * @see mderl.RLKConfig
	 * @generated
	 */
	EClass getRLKConfig();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see mderl.RLKConfig#getAlgorithm()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mderl.RLKConfig#getVersion()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Version();

	/**
	 * Returns the meta object for the attribute list '{@link mderl.RLKConfig#getLayer_size <em>Layer size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Layer size</em>'.
	 * @see mderl.RLKConfig#getLayer_size()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Layer_size();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getReplay_buffer_size <em>Replay buffer size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replay buffer size</em>'.
	 * @see mderl.RLKConfig#getReplay_buffer_size()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Replay_buffer_size();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getNum_epochs <em>Num epochs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num epochs</em>'.
	 * @see mderl.RLKConfig#getNum_epochs()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Num_epochs();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getNum_eval_steps <em>Num eval steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num eval steps</em>'.
	 * @see mderl.RLKConfig#getNum_eval_steps()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Num_eval_steps();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getNum_trains <em>Num trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num trains</em>'.
	 * @see mderl.RLKConfig#getNum_trains()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Num_trains();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getNum_expl_steps <em>Num expl steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num expl steps</em>'.
	 * @see mderl.RLKConfig#getNum_expl_steps()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Num_expl_steps();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getMin_num_steps <em>Min num steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min num steps</em>'.
	 * @see mderl.RLKConfig#getMin_num_steps()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Min_num_steps();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getMax_path_length <em>Max path length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max path length</em>'.
	 * @see mderl.RLKConfig#getMax_path_length()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Max_path_length();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount</em>'.
	 * @see mderl.RLKConfig#getDiscount()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Discount();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getSoft_target_tau <em>Soft target tau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soft target tau</em>'.
	 * @see mderl.RLKConfig#getSoft_target_tau()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Soft_target_tau();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getTarget_update_period <em>Target update period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target update period</em>'.
	 * @see mderl.RLKConfig#getTarget_update_period()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Target_update_period();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getPolicy_lr <em>Policy lr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy lr</em>'.
	 * @see mderl.RLKConfig#getPolicy_lr()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Policy_lr();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getQf_lr <em>Qf lr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qf lr</em>'.
	 * @see mderl.RLKConfig#getQf_lr()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Qf_lr();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getReward_scale <em>Reward scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward scale</em>'.
	 * @see mderl.RLKConfig#getReward_scale()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Reward_scale();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#isAuto_entropy_tuning <em>Auto entropy tuning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto entropy tuning</em>'.
	 * @see mderl.RLKConfig#isAuto_entropy_tuning()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Auto_entropy_tuning();

	/**
	 * Returns the meta object for the attribute '{@link mderl.RLKConfig#getBatch_size <em>Batch size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch size</em>'.
	 * @see mderl.RLKConfig#getBatch_size()
	 * @see #getRLKConfig()
	 * @generated
	 */
	EAttribute getRLKConfig_Batch_size();

	/**
	 * Returns the meta object for class '{@link mderl.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see mderl.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for class '{@link mderl.general_elements <em>general elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>general elements</em>'.
	 * @see mderl.general_elements
	 * @generated
	 */
	EClass getgeneral_elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MderlFactory getMderlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mderl.impl.ExperimentImpl <em>Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.ExperimentImpl
		 * @see mderl.impl.MderlPackageImpl#getExperiment()
		 * @generated
		 */
		EClass EXPERIMENT = eINSTANCE.getExperiment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__NAME = eINSTANCE.getExperiment_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__ID = eINSTANCE.getExperiment_Id();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__AGENT = eINSTANCE.getExperiment_Agent();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__ENVIRONMENT = eINSTANCE.getExperiment_Environment();

		/**
		 * The meta object literal for the '{@link mderl.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.AgentImpl
		 * @see mderl.impl.MderlPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Robotcomponent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ROBOTCOMPONENT = eINSTANCE.getAgent_Robotcomponent();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__MODEL = eINSTANCE.getAgent_Model();

		/**
		 * The meta object literal for the '<em><b>Dim obs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__DIM_OBS = eINSTANCE.getAgent_Dim_obs();

		/**
		 * The meta object literal for the '<em><b>Dim act</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__DIM_ACT = eINSTANCE.getAgent_Dim_act();

		/**
		 * The meta object literal for the '<em><b>Min act value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__MIN_ACT_VALUE = eINSTANCE.getAgent_Min_act_value();

		/**
		 * The meta object literal for the '<em><b>Max act value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__MAX_ACT_VALUE = eINSTANCE.getAgent_Max_act_value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__ID = eINSTANCE.getAgent_Id();

		/**
		 * The meta object literal for the '{@link mderl.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.EnvironmentImpl
		 * @see mderl.impl.MderlPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Scene</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__SCENE = eINSTANCE.getEnvironment_Scene();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__ELEMENTS = eINSTANCE.getEnvironment_Elements();

		/**
		 * The meta object literal for the '<em><b>Dynamic reset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__DYNAMIC_RESET = eINSTANCE.getEnvironment_Dynamic_reset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Headless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__HEADLESS = eINSTANCE.getEnvironment_Headless();

		/**
		 * The meta object literal for the '{@link mderl.impl.MobileImpl <em>Mobile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.MobileImpl
		 * @see mderl.impl.MderlPackageImpl#getMobile()
		 * @generated
		 */
		EClass MOBILE = eINSTANCE.getMobile();

		/**
		 * The meta object literal for the '{@link mderl.impl.DummyImpl <em>Dummy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.DummyImpl
		 * @see mderl.impl.MderlPackageImpl#getDummy()
		 * @generated
		 */
		EClass DUMMY = eINSTANCE.getDummy();

		/**
		 * The meta object literal for the '<em><b>Element type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUMMY__ELEMENT_TYPE = eINSTANCE.getDummy_Element_type();

		/**
		 * The meta object literal for the '{@link mderl.impl.ArmImpl <em>Arm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.ArmImpl
		 * @see mderl.impl.MderlPackageImpl#getArm()
		 * @generated
		 */
		EClass ARM = eINSTANCE.getArm();

		/**
		 * The meta object literal for the '{@link mderl.impl.RobotComponentImpl <em>Robot Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.RobotComponentImpl
		 * @see mderl.impl.MderlPackageImpl#getRobotComponent()
		 * @generated
		 */
		EClass ROBOT_COMPONENT = eINSTANCE.getRobotComponent();

		/**
		 * The meta object literal for the '<em><b>Joint names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_COMPONENT__JOINT_NAMES = eINSTANCE.getRobotComponent_Joint_names();

		/**
		 * The meta object literal for the '{@link mderl.impl.PandaImpl <em>Panda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.PandaImpl
		 * @see mderl.impl.MderlPackageImpl#getPanda()
		 * @generated
		 */
		EClass PANDA = eINSTANCE.getPanda();

		/**
		 * The meta object literal for the '{@link mderl.impl.TurtleBotImpl <em>Turtle Bot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.TurtleBotImpl
		 * @see mderl.impl.MderlPackageImpl#getTurtleBot()
		 * @generated
		 */
		EClass TURTLE_BOT = eINSTANCE.getTurtleBot();

		/**
		 * The meta object literal for the '{@link mderl.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.ElementImpl
		 * @see mderl.impl.MderlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__POSITION = eINSTANCE.getElement_Position();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ORIENTATION = eINSTANCE.getElement_Orientation();

		/**
		 * The meta object literal for the '<em><b>Linear velocity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__LINEAR_VELOCITY = eINSTANCE.getElement_Linear_velocity();

		/**
		 * The meta object literal for the '<em><b>Angular velocity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ANGULAR_VELOCITY = eINSTANCE.getElement_Angular_velocity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link mderl.impl.FixedImpl <em>Fixed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.FixedImpl
		 * @see mderl.impl.MderlPackageImpl#getFixed()
		 * @generated
		 */
		EClass FIXED = eINSTANCE.getFixed();

		/**
		 * The meta object literal for the '{@link mderl.impl.AerialRobotImpl <em>Aerial Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.AerialRobotImpl
		 * @see mderl.impl.MderlPackageImpl#getAerialRobot()
		 * @generated
		 */
		EClass AERIAL_ROBOT = eINSTANCE.getAerialRobot();

		/**
		 * The meta object literal for the '<em><b>Propeller name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AERIAL_ROBOT__PROPELLER_NAME = eINSTANCE.getAerialRobot_Propeller_name();

		/**
		 * The meta object literal for the '{@link mderl.impl.WheeledRobotImpl <em>Wheeled Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.WheeledRobotImpl
		 * @see mderl.impl.MderlPackageImpl#getWheeledRobot()
		 * @generated
		 */
		EClass WHEELED_ROBOT = eINSTANCE.getWheeledRobot();

		/**
		 * The meta object literal for the '<em><b>Wheel name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEELED_ROBOT__WHEEL_NAME = eINSTANCE.getWheeledRobot_Wheel_name();

		/**
		 * The meta object literal for the '{@link mderl.impl.ARDroneImpl <em>AR Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.ARDroneImpl
		 * @see mderl.impl.MderlPackageImpl#getARDrone()
		 * @generated
		 */
		EClass AR_DRONE = eINSTANCE.getARDrone();

		/**
		 * The meta object literal for the '{@link mderl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.ModelImpl
		 * @see mderl.impl.MderlPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONFIG = eINSTANCE.getModel_Config();

		/**
		 * The meta object literal for the '{@link mderl.impl.RLKAlgorithmImpl <em>RLK Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.RLKAlgorithmImpl
		 * @see mderl.impl.MderlPackageImpl#getRLKAlgorithm()
		 * @generated
		 */
		EClass RLK_ALGORITHM = eINSTANCE.getRLKAlgorithm();

		/**
		 * The meta object literal for the '{@link mderl.impl.RLKConfigImpl <em>RLK Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.RLKConfigImpl
		 * @see mderl.impl.MderlPackageImpl#getRLKConfig()
		 * @generated
		 */
		EClass RLK_CONFIG = eINSTANCE.getRLKConfig();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__ALGORITHM = eINSTANCE.getRLKConfig_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__VERSION = eINSTANCE.getRLKConfig_Version();

		/**
		 * The meta object literal for the '<em><b>Layer size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__LAYER_SIZE = eINSTANCE.getRLKConfig_Layer_size();

		/**
		 * The meta object literal for the '<em><b>Replay buffer size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__REPLAY_BUFFER_SIZE = eINSTANCE.getRLKConfig_Replay_buffer_size();

		/**
		 * The meta object literal for the '<em><b>Num epochs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__NUM_EPOCHS = eINSTANCE.getRLKConfig_Num_epochs();

		/**
		 * The meta object literal for the '<em><b>Num eval steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__NUM_EVAL_STEPS = eINSTANCE.getRLKConfig_Num_eval_steps();

		/**
		 * The meta object literal for the '<em><b>Num trains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__NUM_TRAINS = eINSTANCE.getRLKConfig_Num_trains();

		/**
		 * The meta object literal for the '<em><b>Num expl steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__NUM_EXPL_STEPS = eINSTANCE.getRLKConfig_Num_expl_steps();

		/**
		 * The meta object literal for the '<em><b>Min num steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__MIN_NUM_STEPS = eINSTANCE.getRLKConfig_Min_num_steps();

		/**
		 * The meta object literal for the '<em><b>Max path length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__MAX_PATH_LENGTH = eINSTANCE.getRLKConfig_Max_path_length();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__DISCOUNT = eINSTANCE.getRLKConfig_Discount();

		/**
		 * The meta object literal for the '<em><b>Soft target tau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__SOFT_TARGET_TAU = eINSTANCE.getRLKConfig_Soft_target_tau();

		/**
		 * The meta object literal for the '<em><b>Target update period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__TARGET_UPDATE_PERIOD = eINSTANCE.getRLKConfig_Target_update_period();

		/**
		 * The meta object literal for the '<em><b>Policy lr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__POLICY_LR = eINSTANCE.getRLKConfig_Policy_lr();

		/**
		 * The meta object literal for the '<em><b>Qf lr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__QF_LR = eINSTANCE.getRLKConfig_Qf_lr();

		/**
		 * The meta object literal for the '<em><b>Reward scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__REWARD_SCALE = eINSTANCE.getRLKConfig_Reward_scale();

		/**
		 * The meta object literal for the '<em><b>Auto entropy tuning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__AUTO_ENTROPY_TUNING = eINSTANCE.getRLKConfig_Auto_entropy_tuning();

		/**
		 * The meta object literal for the '<em><b>Batch size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLK_CONFIG__BATCH_SIZE = eINSTANCE.getRLKConfig_Batch_size();

		/**
		 * The meta object literal for the '{@link mderl.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.ConfigImpl
		 * @see mderl.impl.MderlPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '{@link mderl.impl.general_elementsImpl <em>general elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mderl.impl.general_elementsImpl
		 * @see mderl.impl.MderlPackageImpl#getgeneral_elements()
		 * @generated
		 */
		EClass GENERAL_ELEMENTS = eINSTANCE.getgeneral_elements();

	}

} //MderlPackage
