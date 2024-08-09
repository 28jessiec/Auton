package frc.robot.commands.elevator;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.util.commands.IndefiniteCommand;
import frc.robot.subsystems.AngledElevator;


/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class ElevatorManual extends CommandBase/* TODO: extends what? */ {

    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    // TODO: function here [delete this comment]
    private ElevatorManual()
    {
        addRequirements(AngledElevator.getInstance());
    }
    
    public void execute() {
        /**
         * ================================================================================
         * if DRIVER presses the Up DPad Button, Move the elevator up by 500 steps
         * else if DRIVER presses the Down DPad Button, Move the elevator down by 500 steps
         * ================================================================================
         */
        // TODO: code here [delete this comment]
        if (OI.getInstance().getOperator().getUpDPadButtonState())
        {
            AngledElevator.getInstance().setPosition(AngledElevator.getInstance().getPosition() + 500);
        }
        else if (OI.getInstance().getOperator().getDownDPadButtonState())
        {
            AngledElevator.getInstance().setPosition(AngledElevator.getInstance().getPosition() - 500);
        }
        
        

        /**
         * ==========================================
         * Always move to Elevator's Desired position
         * ==========================================
         */
        // TODO: code here [delete this comment]
        AngledElevator.getInstance().moveToPosition(AngledElevator.getInstance().getPosition());
    }

    /**
     * =======================
     * set power to 0 when end
     * make sure to override
     * =======================
     */
    // TODO: function here [delete this comment]
    @Override
    public void end(boolean interrupted)
    {
        AngledElevator.getInstance().setElevatorPower(0);
    }
}
