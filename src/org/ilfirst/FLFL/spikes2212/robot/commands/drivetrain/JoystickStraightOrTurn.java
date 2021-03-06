package org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain;

import org.ilfirst.FLFL.spikes2212.robot.JoystickMap;
import org.ilfirst.FLFL.spikes2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickStraightOrTurn extends Command {

	public JoystickStraightOrTurn() {
		requires(Robot.drivetrain);
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
		double x = JoystickMap.driver.getX();
		double y = JoystickMap.driver.getY();
		if (Math.abs(x) > Math.abs(y)) {
			Robot.drivetrain.turn(x);
		} else if (Math.abs(y) > Math.abs(x)) {
			Robot.drivetrain.forward(y);
		} else {
			Robot.drivetrain.stop();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
