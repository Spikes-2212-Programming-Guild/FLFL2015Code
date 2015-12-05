package org.ilfirst.FLFL.spikes2212.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI /* GEVALD */ {
	public static JoystickButton charge = new JoystickButton(JoystickMap.navigatorStick, 4);
	public static JoystickButton straightOrTurn = new JoystickButton(JoystickMap.driverRight, 1);
	public static JoystickButton twoSides = new JoystickButton(JoystickMap.driverLeft, 1);
	public static JoystickButton closeAndGrab = new JoystickButton(JoystickMap.navigatorStick, 5);
	public static JoystickButton openArms = new JoystickButton(JoystickMap.navigatorStick, 6);
	public static JoystickButton shootWithVision = new JoystickButton(JoystickMap.navigatorStick, 2);
	public static JoystickButton grab = new JoystickButton(JoystickMap.navigatorStick, 9);
	public static JoystickButton shootHigh = new JoystickButton(JoystickMap.navigatorStick, 3);
	public static JoystickButton shootDynamic = new JoystickButton(JoystickMap.navigatorStick, 10);
	public static JoystickButton shootWithJoystick = new JoystickButton(JoystickMap.navigatorStick, 1);
	public static JoystickButton stopArms = new JoystickButton(JoystickMap.navigatorStick, 8);

	public OI() {
		charge.whileHeld(Commands.Charger.charge);
		// straightOrTurn.whileHeld(Commands.Drivetrain.joystickStraightOrTurn);
		twoSides.whileHeld(Commands.Drivetrain.doubleJoystickDriving);
		closeAndGrab.whenPressed(Commands.Arms.closeArms);
		openArms.whenPressed(Commands.Arms.openArms);
		grab.whenPressed(Commands.Grabber.grab);
		// shootWithVision.whileHeld(Commands.Gun.visionShooting);
		// shootHigh.whenPressed(Commands.Gun.shootHigh);
		shootDynamic.whenPressed(Commands.Gun.shootDynamic);
		// shootWithJoystick.whileHeld(Commands.Gun.focusedJoystickShoot);
		// stopArms.whenPressed(Commands.Arms.stopArms);
	}

}