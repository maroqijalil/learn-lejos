package main;

import lejos.hardware.motor.Motor;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.utility.Delay;

@SuppressWarnings("deprecation")
public class General {
	DifferentialPilot pilot;

	public static void main(String[] args) {
//		Motor.A.forward();
//		Motor.D.forward();
//		Delay.msDelay(2000);
//		Motor.A.stop();
//		Motor.D.stop();
		new General();
	}
	
	public General() {
		pilot = new DifferentialPilot(5.6, 12, Motor.A, Motor.D);
		travelAndRotate();
		travelAndRotate();
	}
	
	public void travelAndRotate() {
		pilot.travel(12);
		pilot.rotate(90);
	}
}
