package main;

import lejos.hardware.Button;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class ReadSensor {
	DistanceSensorFilter sensor;
	
	public ReadSensor(Port port) {
		this.initSensor(port, 1);
	}
	
	public ReadSensor(Port port, int average) {
		this.initSensor(port, average);
	}
	
	private void initSensor(Port port, int average) {
		SensorModes modes = new EV3UltrasonicSensor(port);
		SampleProvider provider = modes.getMode("Distance");
		sensor = new DistanceSensorFilter(provider, average);
	}
	
	public void printDistance() {
		LCD.drawInt((int)(sensor.distance() * 100), 0, 4);
		Delay.msDelay(8);
		LCD.clear();
	}
	
	public boolean anyCollision(float distance) {
		return (sensor.distance() * 100) <= distance;
	}
	
	public static void main(String[] args) {
//		Port port = LocalEV3.get().getPort("S1");
//		SensorModes modes = new EV3UltrasonicSensor(port);
//		SampleProvider provider = modes.getMode("Distance");
//		float sample[] = new float[provider.sampleSize()];
//
//		while (true) {
//			provider.fetchSample(sample, 0);
//			LCD.drawInt((int)(sample[0] * 1000), 0, 4);
//			Delay.msDelay(8);
//			LCD.clear();
//			
//			if (Button.ESCAPE.isDown()) {
//				break;
//			}
//		}

//		Port port = LocalEV3.get().getPort("S4");
//		ReadSensor rS = new ReadSensor(port);
//		
//		while (true) {
//			rS.printDistance();
//			
//			if (Button.ESCAPE.isDown()) {
//				break;
//			}
//		}

		Port port = LocalEV3.get().getPort("S4");
		ReadSensor rS = new ReadSensor(port);
		MotorControl mC = new MotorControl(MotorPort.A, MotorPort.D);
		
		while (true) {
			if (rS.anyCollision(30)) {
//				mC.stop();
				mC.rotateRight(90);
			} else {				
				mC.moveForward();
			}
			
			if (Button.ESCAPE.isDown()) {
				break;
			}
			
			rS.printDistance();
		}
	}
}
