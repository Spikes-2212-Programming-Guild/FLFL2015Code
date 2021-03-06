package org.ilfirst.FLFL.spikes2212.robot.commands.charger;

import org.ilfirst.FLFL.spikes2212.robot.Robot;
import org.ilfirst.FLFL.spikes2212.robot.commands.SingleActionCommand;

/**
 *
 */
public class StopCharger extends SingleActionCommand {

	public StopCharger() {
		requires(Robot.charger);
	}

	@Override
	public void doAction() {
		Robot.charger.stop();
	}
}