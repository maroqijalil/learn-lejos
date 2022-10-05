package main;

import lejos.robotics.SampleProvider;
import lejos.robotics.filter.MeanFilter;

public class DistanceSensorFilter extends MeanFilter {
	
	float sample[];
	
	public DistanceSensorFilter(SampleProvider source, int length) {
		super(source, length);
		sample = new float[sampleSize];
	}
	
	public float distance() {
		fetchSample(sample, 0);
		return sample[0];
	}
}
