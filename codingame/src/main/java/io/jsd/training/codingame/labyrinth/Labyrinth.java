package io.jsd.training.codingame.labyrinth;

public class Labyrinth {

	private final String[][] grid;

	public Labyrinth(String[][] grid) {
		this.grid = grid;
	}
	
	public String[][] getGrid() {
		return grid;
	}

	public String getCellType(Position position) {
		return grid[position.getX()][position.getY()];
	}

}
