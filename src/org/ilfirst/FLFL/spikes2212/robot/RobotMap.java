package org.ilfirst.FLFL.spikes2212.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static class PWM {
		public static final int LEFT_FRONT = 2;
		public static final int LEFT_REAR = 3;
		public static final int RIGHT_FRONT = 0;
		public static final int RIGHT_REAR = 1;
		public static final int LOADER_LEFT = 8;
		public static final int LOADER_RIGHT = 9;
		public static final int ARM_LEFT = 7;
		public static final int ARM_RIGHT = 6;
		public static final int GRABBER_LEFT = 5;
		public static final int GRABBER_RIGHT = 4;
	}

	public static class CAN {
		public static final int SHOOTER_LEFT = 1;
		public static final int SHOOTER_RIGHT = 2;
	}

	public static class Joysticks {
		public static final int DRIVER_RIGHT = 0;
		public static final int DRIVER_LEFT = 1;
		public static final int NAVIGATOR = 2;
	}

	public static class DIO {
		public static final int BALLS_DETECTOR = 0;
		public static final int ARMS_LEFT_OPEN = 1;
		public static final int ARMS_RIGHT_OPEN = 2;
	}

}
