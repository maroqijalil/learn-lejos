package main;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

public class HelloWorld {
	public static void main(String[] args) {
		LCD.drawString("Hello World!", 0, 4);
		Delay.msDelay(2000);
	}
}
