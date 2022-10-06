package main;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.MovePilot;

public class PilotControl extends MotorControl {
	MovePilot pilot;
	
	public PilotControl(Port motorAPort, Port motorBPort) {
		super(motorAPort, motorBPort);
		Wheel wR = WheeledChassis.modelWheel(rightMotor, 5.6).offset(-5);
		Wheel wL = WheeledChassis.modelWheel(leftMotor, 5.6).offset(5);
		Chassis chasis = new WheeledChassis(new Wheel[] {wR, wL}, WheeledChassis.TYPE_DIFFERENTIAL);
		pilot = new MovePilot(chasis);
	}
	
	public void run() {
		pilot.setLinearSpeed(30);	// cm per second
		pilot.travel(50);			// cm
		pilot.rotate(-90);			// degree clockwise
		pilot.travel(-50,true);		//  move backward for 50 cm
		while(pilot.isMoving()) {			
			Thread.yield();
		}
		pilot.rotate(-90);
		pilot.rotateRight();;
		pilot.stop();
	}

	public static void main(String[] args) {
		PilotControl mP = new PilotControl(MotorPort.A, MotorPort.D);
		mP.run();
	}
}
