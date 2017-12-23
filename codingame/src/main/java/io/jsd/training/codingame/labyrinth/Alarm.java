package io.jsd.training.codingame.labyrinth;

public class Alarm {
	
	private final int count;
	private boolean isCountStarted;
	
	public Alarm(int alarmCount) {
		this.count = alarmCount;
		this.isCountStarted=false;
	}
	
	public int getCount() {
		return count;
	}
	
	public boolean isCountStarted() {
		return isCountStarted;
	}
	
	public void sartCount() {
		isCountStarted=true;
	}

}
