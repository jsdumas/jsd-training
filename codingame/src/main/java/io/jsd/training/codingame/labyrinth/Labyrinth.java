package io.jsd.training.codingame.labyrinth;

public class Labyrinth {

	private final int alarm;
	private final String[][] grid;

	public Labyrinth(String[][] grid, int alarm) {
		this.grid = grid;
		this.alarm = alarm;
	}

	public int getAlarm() {
		return alarm;
	}
	
	public String[][] getGrid() {
		return grid;
	}

}
