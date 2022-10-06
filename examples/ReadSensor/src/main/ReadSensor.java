package main;

import lejos.hardware.Button;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class ReadSensor {
	DistanceSensorFilter sensor;
	
	public ReadSensor(Port port) {
		SensorModes modes = new EV3UltrasonicSensor(port);
		SampleProvider provider = modes.getMode("Distance");
		sensor = new DistanceSensorFilter(provider, 5);
	}
	
	public void printDistance() {
		LCD.drawInt((int)(sensor.distance() * 1000), 0, 4);
		Delay.msDelay(800);
		LCD.clear();
	}
	
	public static void main(String[] args) {
		Port port = LocalEV3.get().getPort("S1");
		SensorModes modes = new EV3UltrasonicSensor(port);
		SampleProvider provider = modes.getMode("Distance");
		float sample[] = new float[provider.sampleSize()];

		while (true) {
			provider.fetchSample(sample, 0);
			LCD.drawInt((int)(sample[0] * 1000), 0, 4);
			Delay.msDelay(8);
			LCD.clear();
			
			if (Button.ESCAPE.isDown()) {
				break;
			}
		}

//		Port port = LocalEV3.get().getPort("S1");
//		ReadSensor rS = new ReadSensor(port);
//		
//		while (true) {
//			rS.printDistance();
//			
//			if (Button.ESCAPE.isDown()) {
//				break;
//			}
//		}
	}
}
