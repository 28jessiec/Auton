package frc.robot.commands.claw;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Claw;

/**
 * ==================================
 * Remember what needs to be extended
 * What needs to be in the constructor?
 * What methods do we need?
 * ==================================
 */
public class ToggleClaw extends InstantCommand/* extends? */ {
    
    private DoubleSolenoid doublesolenoid;

    /**
     * =====================================
     * Constructor - what do we need to add?
     * =====================================
     */
    // TODO: function here [delete this comment]
    private ToggleClaw()
    {
        addRequirements(Claw.getInstance());
    }

    /**
     * ================================
     * Toggle the state of the solenoid
     * What method?
     * ================================
     */
    // TODO: function here [delete this comment]
    public void initialize()
    {
        if (Claw.getInstance().getClaw().get() == doublesolenoid.Value.kForward)
        {
            Claw.getInstance().getClaw().set(DoubleSolenoid.Value.kReverse);    
        }
        
    }
    
}