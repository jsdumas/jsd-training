package io.jsd.training.codingame.labyrinth;

public class Labyrinth {

	private final int alarmCount;
	private final String[][] grid;

	public Labyrinth(String[][] grid, int alarmCount) {
		this.grid = grid;
		this.alarmCount = alarmCount;
	}

	public int getAlarmCount() {
		return alarmCount;
	}
	
	public String[][] getGrid() {
		return grid;
	}

}
