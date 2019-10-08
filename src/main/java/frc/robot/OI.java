package frc.robot;
//imports joystick from frc
import edu.wpi.first.wpilibj.Joystick;

public class OI{
    //declares and inits the Joystick object
    private static Joystick contOne = new Joystick(0);
    /**
     * 
     * @param buttonPort The port of the button from RobotMap
     * @return Returns status of argument button
     */
    public static boolean getButton(int buttonPort){
        return contOne.getRawButton(buttonPort);
    }
    /**
     * 
     * @param axisPort the port of the axis from the RobotMap
     * @return Returns the status of the arg button
     */
    public static double getAxis(int axisPort){
        return contOne.getRawAxis(axisPort);
    }

    /**
    Normalizes a value between two values
    @param value The value to be normalized
    @param minVal The lower boundry for the value
    @param maxVal The upper boundry for the value
     */
    public static double normalize(double value, double minVal, double maxVal){
        return (value>maxVal)?maxVal:(value<minVal)?minVal:value;
    }
}