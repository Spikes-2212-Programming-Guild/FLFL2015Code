package org.ilfirst.FLFL.spikes2212.robot.commands.charger;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ChargeOneBall extends Command {

	public ChargeOneBall() {
		requires(Robot.charger);
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if (!isFinished()) {
			Robot.charger.charge();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return Robot.charger.isBallAtTop();
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.charger.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
