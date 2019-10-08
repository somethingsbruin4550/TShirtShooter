package frc.robot;
//imports robotmap from parent
//imports control mode & talon SRX from Phoenix
//imports timer from FRC
import frc.parent.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Timer;

//Chassis controls the base functions of the robot
//This includes the main wheel functions
public class Chassis{
    //Declares 4 wheel objects
    //Inititializes the 4 wheel objects
    private static WPI_TalonSRX frontLeft = new WPI_TalonSRX(RobotMap.FORWARD_LEFT);
    private static WPI_TalonSRX bottomLeft = new WPI_TalonSRX(RobotMap.BACK_LEFT);
    private static WPI_TalonSRX frontRight = new WPI_TalonSRX(RobotMap.FORWARD_RIGHT);
    private static WPI_TalonSRX bottomRight = new WPI_TalonSRX(RobotMap.BACK_RIGHT);

    /**
     * sets the polarity for the 4 wheel motors
     */
    public static void setReverse(){
        frontLeft.setInverted(RobotMap.FL_REVERSE);
        bottomLeft.setInverted(RobotMap.BL_REVERSE);
        frontRight.setInverted(RobotMap.FR_REVERSE);
        bottomRight.setInverted(RobotMap.BR_REVERSE);
    }

    /**
     * 
     * @param forward the forward joystick input
     * @param slide the strafe joystick input
     * @param rotation the rotation joystick input
     */
    public static void drive(double forward, double slide, double rotation){
        //calculates the inputs for the motors
        double lf = forward + slide + rotation;
        double rf = forward - slide - rotation;
        double lr = forward - slide + rotation;
        double rr = forward + slide - rotation;

        // System.out.println("Left forward Motor: " + lf);
        // Timer.delay(0.01);

        //sets calculated values for the motors
        frontLeft.set(OI.normalize(lf, -1, 1));
        frontRight.set(OI.normalize(rf, -1, 1));
        bottomLeft.set(OI.normalize(lr, -1, 1));
        bottomRight.set(OI.normalize(rr, -1, 1));
    }
}