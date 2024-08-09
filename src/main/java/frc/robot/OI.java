package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.util.XboxGamepad;

public class OI {
    private static OI instance;

    /**
     * ====================================================================================================
     * Create two XboxGamepad instance variables
     * - one is the driver
     * - one is the operator
     * S
     * Instantiate both instance vars. with the id provided in RobotMap.java
     * when the Right DPad Button of the driver is true, toggle the claw (remember its a command you wrote)
     * ====================================================================================================
     */
    // TODO: function and variables here [delete this comment]

    private XboxGamepad driver;
    private XboxGamepad operator;

    /**
     * ==============================================
     * Getter (Accessor) for the driver instance var.
     * ==============================================
     * @return the driver instance
     */
    // TODO: function here [delete this comment]
    public XboxGamepad getDriver()
    {
        return driver;
    }

    /**
     * ================================================
     * Getter (Accessor) for the operator instance var.
     * ================================================
     * @return the operator instance
     */
    // TODO: function here [delete this comment]
     public XboxGamepad getOperator()
    {
        return operator;
    }

    /**
     * ==============
     * Singleton Code
     * ==============
     * 
     * @return instance of OI
     */
    // TODO: function here [delete this comment]
    public static OI getInstance()
    {
        if (instance == null)
        {
            instance = new OI();

        }
        return instance;
    }
}