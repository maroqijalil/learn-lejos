package main;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class MotorControl {
	RegulatedMotor motorA;
	RegulatedMotor motorB;
	
	public MotorControl(Port motorAPort, Port motorBPort) {
		this.motorA = new EV3LargeRegulatedMotor(motorAPort);
		this.motorB = new EV3LargeRegulatedMotor(motorBPort);
	}
	
	public void stop() {
		this.motorA.stop();
		this.motorB.stop();
	}
	
	public void moveForward(int delay) {
		this.motorA.forward();
		this.motorB.forward();
		Delay.msDelay(delay);
//		this.stop();
	}
	
	public void rotateRight(int angle) {
//		this.motorA.setSpeed(100);
//		this.motorB.setSpeed(100);
//		this.motorA.rotate(-angle);
//		this.motorB.rotate(angle);
//		this.motorA.setSpeed(740);
//		this.motorB.setSpeed(740);
		
//		for (int i = 0; i <= angle; i++) {
//			this.motorA.rotate(-2);
//			this.motorB.rotate(2);
//			Delay.msDelay(8);
//		}
		
//		RegulatedMotor[] motors = {this.motorB};
//		this.motorA.synchronizeWith(motors);
//		this.motorA.startSynchronization();
//		this.motorA.rotate(angle);
//		this.motorB.rotate(-angle);
//		this.motorA.endSynchronization();
		
		RegulatedMotor[] motors = {this.motorB};
		for (int i = 0; i <= angle; i++) {
			this.motorA.synchronizeWith(motors);
			this.motorA.startSynchronization();
			this.motorA.rotate(-10);
			this.motorB.rotate(10);
			this.motorA.endSynchronization();
		}
	}
	
	public static void main(String[] args) {
//		RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.A);
//		m.backward();
//		Delay.msDelay(2000);
//		m.stop();
		
		MotorControl mC = new MotorControl(MotorPort.A, MotorPort.D);
//		mC.moveForward(2000);
//		mC.rotateRight(90);
		
		while (true) {
			mC.moveForward(2000);
			mC.rotateRight(90);
			
			Delay.msDelay(1000);
			if (Button.ESCAPE.isDown()) {
				mC.stop();
				break;
			}
		}
	}
}
