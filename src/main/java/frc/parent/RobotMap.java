package frc.parent;

/*
    RobotMap holds all the ports involved in the robot.
    This ranges from talon ports, all the way to the ports
    on the controllers. This also contains the polarity for the wheels
    and the various ports assoiated with sensors

    If you wish to create your own port, here is the syntax:
        public static final returnType name = value;
    Notes on creating ports:
        1. Ports must be integers or booleans
        2. they MUST be public static final;
        3. If the port is not plugged in, make int values -1, and boolean values false


*/
public interface RobotMap {

    // Wheel Talons
    public static final int FORWARD_LEFT = 0;
    public static final int FORWARD_RIGHT = 1;
    public static final int BACK_LEFT = 4;
    public static final int BACK_RIGHT = 2;

    // Wheel Talon Polarity
    public static final boolean FL_REVERSE = false;
    public static final boolean FR_REVERSE = true;
    public static final boolean BL_REVERSE = false;
    public static final boolean BR_REVERSE = true;
       

    // Joystick Axises
    public static final int L_JOYSTICK_HORIZONTAL = 0;
    public static final int L_JOYSTICK_VERTICAL = 1;
    public static final int LT = 2;
    public static final int RT = 3;
    public static final int R_JOYSTICK_HORIZONTAL = 4;
    public static final int R_JOYSTICK_VERTICAL = 5;

    // Controller Buttons
    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;
    public static final int LB_BUTTON = 5;
    public static final int RB_BUTTON = 6;
    public static final int SELECT_BUTTON = 7;
    public static final int START_BUTTON = 8;
    // These buttons are when you push down the left and right circle pad
    public static final int L_JOYSTICK_BUTTON = 9;
    public static final int R_JOYSTICK_BUTTON = 10;

    // Controller Zeroes
    public static final double LEFT_Y_ZERO = -0.0078125;
    public static final double RIGHT_Y_ZERO = -0.0078125;

    public static final int SHOOTER = 0;
    public static final int PCM_PORT = 5;

    public static final double SHOOT_LOW_FOOT = 0.035;
	public static final double SHOOT_MED_FOOT = 0.045;
	public static final double SHOOT_HIGH_FOOT = 0.125;
	
	public static final double SHOOT_LOW_GYM = 0.015;
	public static final double SHOOT_MED_GYM = 0.022;
	public static final double SHOOT_HI_GYM = 0.030;
}