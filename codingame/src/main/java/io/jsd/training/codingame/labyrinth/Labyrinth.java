package io.jsd.training.codingame.labyrinth;

public class Labyrinth {

	private final int alarm;
	private final int columns;
	private final int rows;

	public Labyrinth(int rows, int columns, int alarm) {
		this.rows = rows;
		this.columns = columns;
		this.alarm = alarm;
	}

	public int getAlarm() {
		return alarm;
	}

	public int getColumns() {
		return columns;
	}

	public int getRows() {
		return rows;
	}

}
