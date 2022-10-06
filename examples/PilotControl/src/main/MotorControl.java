package main;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class MotorControl {
	public RegulatedMotor rightMotor;
	public RegulatedMotor leftMotor;
	
	public MotorControl(Port motorAPort, Port motorBPort) {
		rightMotor = new EV3LargeRegulatedMotor(motorAPort);
		leftMotor = new EV3LargeRegulatedMotor(motorBPort);
	}
	
	public void stop() {
		rightMotor.stop();
		leftMotor.stop();
	}
	
	public void moveForwardUntil(int delay) {
		rightMotor.forward();
		leftMotor.forward();
		Delay.msDelay(delay);
	}
	
	public void moveForward() {
		rightMotor.forward();
		leftMotor.forward();
	}
	
	private void sync() {
		RegulatedMotor motors[] = {leftMotor};
		rightMotor.synchronizeWith(motors);
		rightMotor.startSynchronization();
	}
	
	private void stopSync() {
		rightMotor.endSynchronization();
	}
	
	public void rotateLeft(int angle) {
		for (int i = 0; i < angle; i++) {
			sync();
			rightMotor.rotate(10);
			leftMotor.rotate(-10);
			stopSync();
		}
	}
	
	public void rotateRight(int angle) {
		for (int i = 0; i < angle; i++) {
			sync();
			rightMotor.rotate(-10);
			leftMotor.rotate(10);
			stopSync();
		}
	}
}
