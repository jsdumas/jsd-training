package test.io.jsd.training.java.algorithms.hb.problems.recursiveproblems;

import io.jsd.training.java.algorithms.hb.problems.recursiveproblems.Algorithm;

public class CalculTime {
	
	private final Algorithm algo;
	
	public CalculTime(Algorithm algo){
		this.algo=algo;
	}
	
	private Long calculTime(boolean isFast, int number) {
		Long startTime = System.nanoTime();
		if(isFast)
			algo.runFast(number);
		else
			algo.runSlow(number);
		Long endTime = System.nanoTime();
		return (endTime - startTime);
	}
	
	
	public Long calculFastTime(int number) {
		return calculTime(true, number);
	}
	
	public Long calculSlowTime(int number) {
		return calculTime(false, number);
	}
}
