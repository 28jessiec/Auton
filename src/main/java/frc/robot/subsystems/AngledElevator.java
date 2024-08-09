package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import frc.robot.util.Constants;

public class AngledElevator extends SubsystemBase/* TODO: extends what? */ {
    private static AngledElevator instance;
    private double desiredPosition;
    private TalonFX master;
    private TalonFX follower;
    private DigitalInput limitswitch;


    /**
     * =========================================================
     * Create two TalonFX motors and a DigitalInput limit switch.
     * Instantiate master and follower using ids set in RobotMap
     * Instantiate the limit switch using its id from RobotMap
     * Call initElevator
     * =========================================================
     * 
     */
    
    // TODO: function here [delete this comment]
    private AngledElevator()
    {
        master = new TalonFX(RobotMap.AngledElevator.MASTER_ID);
        follower = new TalonFX(RobotMap.AngledElevator.FOLLOWER_ID);
        limitswitch = new DigitalInput(RobotMap.AngledElevator.LIMIT_SWITCH_ID);
        initElevator();

    }

    /**
     * ===============================================
     * Make the follower motor follow the master motor
     * ===============================================
     */
    private void initElevator() {
        follower = master;

        /**
         * =========================================================
         * IGNORE EVERYTHING PAST THIS LINE TO THE END OF THE METHOD
         * =========================================================
         */
        master.config_kP(Constants.SLOT_INDEX, RobotMap.AngledElevator.kP);

        master.configForwardSoftLimitEnable(true);
        master.configReverseSoftLimitEnable(true);
        master.configForwardSoftLimitThreshold(RobotMap.AngledElevator.FORWARD_LIMIT);
        master.configReverseSoftLimitThreshold(RobotMap.AngledElevator.REVERSE_LIMIT);
        
        master.overrideSoftLimitsEnable(true);

        master.configMotionCruiseVelocity(RobotMap.AngledElevator.CRUISE_VELOCITY);
        master.configMotionAcceleration(RobotMap.AngledElevator.CRUISE_ACCELERATION);

        master.configClosedloopRamp(RobotMap.AngledElevator.RAMP_TIME);
    }

    /**
     * moves the Elevator to some desired position
     * @param   desiredPosition
     * @return  set the master motor using MotionMagic 
     */

    public void moveToPosition(double desiredPosition) {
        master.set(ControlMode.MotionMagic, desiredPosition, DemandType.ArbitraryFeedForward, RobotMap.AngledElevator.kG);
    }

    /**
     * ==================================================
     * Setter (Mutator) for the desired position variable
     * ==================================================
     * 
     * @param   position (double)
     * @return  set the desired position to some position
     */

    // TODO: function here [delete this comment]
    public void setPosition (double position)
    {
        desiredPosition = position;
    }

    /**
     * ===================================================
     * Getter (Accessor) for the desired position variable
     * ===================================================
     * @return  desired position (double)
     */

    // TODO: function here [delete this comment]
    public double getPosition()
    {
        return desiredPosition;
    }
    /**
     * ==============================================================================================================================
     * check whether the absolute value of the desired position minus the current position is less than the max error of the elevator
     * the max error is 
     * ==============================================================================================================================
     * 
     * @param   desiredposition 
     * @return  a boolean
     */

    // TODO: function here [delete this comment]
    public boolean isLessThanError(double desiredposition)
    {
        if (Math.abs(desiredposition - getPosition()) < RobotMap.AngledElevator.MAX_ERROR)
        {
            return true;
        }
        return false;
    }

    /**
     * ======================================================================
     * Getter (Accessor) for the current encoder position of the master motor
     * ======================================================================
     * @return  get the selected encoder position of the master motor
     */

    // TODO: function here [delete this comment]
    public double getEncoderPostion()
    {
        return master.getSelectedSensorPosition();
    }


    /** Small Functions Below
     * =========================================================================
     * 1. Set elevator power using percent output (hint: its a type of ControlMode)
     * 
     * 2. Set the sensor position of the two internal encoders to be 0
     * 
     * 3. Return a boolean of whether limit switch is on or off
     * =========================================================================
     */

    /**
     * if power is 0, disable the motor
     * @param   power
     * @return  power to the motors using PercentOutput (constant); extends / retracts motors
     */

    // TODO: function here [delete this comment]
    public void setElevatorPower(double power)
    {
        if (power == 0)
        {
            master.neutralOutput();
        }
        master.set(ControlMode.PercentOutput, power);
    }


    /**
     * @return  resetted encoders (set postion of the encoders to zero)
     */
    // TODO: function here [delete this comment]
    public void resetEncoders()
    {
        master.setSelectedSensorPosition(0);
    }

    /**
     * @return  whether elevator is at ground level (at the bottom)
     */

    // TODO: function here [delete this comment]
    public boolean isGroundLevel()
    {
        return limitswitch.get();
    }

    /**
     * @return  if the elevator is extended to the max
     */
    // TODO: function here [delete this comment]
    public boolean isElevatorMax()
    {
        return getPosition() > RobotMap.AngledElevator.POSITIONS[1];
    }


    /**
     * ==============
     * Singleton Code
     * ==============
     */

    // TODO: function here [delete this comment]
    public static AngledElevator getInstance()
    {
        if (instance == null)
        {
            instance = new AngledElevator();

        }
        return instance;
    }
}
