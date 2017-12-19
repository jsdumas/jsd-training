package io.jsd.training.codingame.labyrinth;

public class Labyrinth {

	private final int alarmCount;
	private final String[][] grid;
	private boolean isAlarmActive;

	public Labyrinth(String[][] grid, int alarmCount) {
		this.grid = grid;
		this.alarmCount = alarmCount;
		this.isAlarmActive=false;
	}

	public int getAlarmCount() {
		return alarmCount;
	}
	
	public String[][] getGrid() {
		return grid;
	}

	public boolean isAlarmActive() {
		return isAlarmActive;
	}

	public String getCellType(Position position) {
		return grid[position.getX()][position.getY()];
	}

	public void alarmActivation() {
		isAlarmActive=true;
	}

}
