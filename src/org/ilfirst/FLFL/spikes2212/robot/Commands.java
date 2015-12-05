package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.commands.advanced.CloseAndGrab;
import org.ilfirst.FLFL.spikes2212.robot.commands.advanced.VisionShooting;
import org.ilfirst.FLFL.spikes2212.robot.commands.arms.CloseArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.arms.OpenArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.arms.StopArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.Charge;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.StopCharger;
import org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain.DoubleJoystickDriving;
import org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain.JoystickArcade;
import org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain.JoystickStraightOrTurn;
import org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain.StopDrivetrain;
import org.ilfirst.FLFL.spikes2212.robot.commands.grabber.Grab;
import org.ilfirst.FLFL.spikes2212.robot.commands.grabber.StopGrabber;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.FocusedShoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.JoystickFocusedShoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.JoystickShoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.Shoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;

public class Commands {

	private Commands() {
	}

	public static void init() {
		Drivetrain.init();
		Gun.init();
		Charger.init();
		Arms.init();
		Grabber.init();
	}

	public static class Drivetrain {
		public static JoystickArcade joystickArcade;
		public static JoystickStraightOrTurn joystickStraightOrTurn;
		public static DoubleJoystickDriving doubleJoystickDriving;
		public static StopDrivetrain stopDrivetrain;

		private Drivetrain() {
		}

		public static void init() {
			joystickStraightOrTurn = new JoystickStraightOrTurn();
			doubleJoystickDriving = new DoubleJoystickDriving();
			stopDrivetrain = new StopDrivetrain();
			joystickArcade = new JoystickArcade();
		}
	}

	public static class Gun {
		public static JoystickShoot joystickShoot;
		public static StopGun stopGun;
		public static VisionShooting visionShooting;
		public static Shoot shoot;
		public static JoystickFocusedShoot focusedJoystickShoot;
		public static FocusedShoot shootHigh;
		public static FocusedShoot shootDynamic;

		private Gun() {
		}

		public static void init() {
			shoot = new Shoot(Constants.MAX_LEFT_VOLTAGE, Constants.MAX_RIGHT_VOLTAGE);
			visionShooting = new VisionShooting();
			joystickShoot = new JoystickShoot();
			stopGun = new StopGun();
			shootHigh = new FocusedShoot(Constants.SHOOT_HIGH_VOLTAGE);
			shootDynamic = new FocusedShoot(Constants.SHOOT_DYNAMIC_VOLTAGE);
			focusedJoystickShoot = new JoystickFocusedShoot();
		}
	}

	public static class Charger {
		public static Charge charge;
		public static StopCharger stopCharger;

		private Charger() {
		}

		public static void init() {
			stopCharger = new StopCharger();
			charge = new Charge();
		}
	}

	public static class Arms {
		public static CloseArms closeArms;
		public static CloseAndGrab closeAndGrab;
		public static OpenArms openArms;
		public static StopArms stopArms;

		private Arms() {
		}

		public static void init() {
			closeArms = new CloseArms();
			openArms = new OpenArms();
			stopArms = new StopArms();
		}
	}

	public static class Grabber {
		public static Grab grab;
		public static StopGrabber stopGrabber;

		public static void init() {
			grab = new Grab();
			stopGrabber = new StopGrabber();
		}
	}

}
