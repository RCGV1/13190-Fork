package org.firstinspires.ftc.teamcode.teleOp.command.claw;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.teleOp.subsystem.ClawSubsystem;

public class Grab extends CommandBase {
    private final ClawSubsystem claw;

    public Grab(ClawSubsystem claw){
        this.claw = claw;

        addRequirements(claw);
    }

    @Override
    public void initialize() {
        claw.grab();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
