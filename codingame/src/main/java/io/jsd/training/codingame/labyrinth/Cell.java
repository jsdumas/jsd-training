package io.jsd.training.codingame.labyrinth;

public class Cell {

	private final int x;
	private final int y;
	private final CellType cellType;

	public Cell(int x, int y, CellType cellType) {
		this.x = x;
		this.y = y;
		this.cellType = cellType;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public CellType getCellType() {
		return cellType;
	}

}
