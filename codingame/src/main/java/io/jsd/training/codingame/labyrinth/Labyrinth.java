package io.jsd.training.codingame.labyrinth;

public class Labyrinth {

	private final String[][] grid;

	public Labyrinth(String[][] grid) {
		this.grid = grid;
	}
	
	public String[][] getGrid() {
		return grid;
	}

	public String getCellType(Cell position) {
		return grid[position.getX()][position.getY()];
	}

	public int getLength() {
		return grid.length;
	}

	public int getColLength() {
		return grid[0].length;
	}

	public CellType getCellType(int x, int y) {
		return CellType.getCellTypeByKey(grid[x][y]);
	}

}
