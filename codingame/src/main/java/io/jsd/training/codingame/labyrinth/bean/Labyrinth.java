package io.jsd.training.codingame.labyrinth.bean;

import java.util.HashSet;
import java.util.Set;

import io.jsd.training.codingame.labyrinth.Cell;

public class Labyrinth {

	private final String[][] grid;

	public Labyrinth(String[][] grid) {
		this.grid = grid;
	}

	public String[][] getGrid() {
		return grid;
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

	public Cell getCell(Cell cell) {
		int x = cell.getX();
		int y = cell.getY();
		CellType cellType = getCellType(x, y);
		return new Cell(x, y, cellType);
	}

	public Set<Cell> getNeighbours(Cell currentCell) {
		int x = currentCell.getX();
		int y = currentCell.getY();
		Set<Cell> neighbours = new HashSet<Cell>();
		if (y - 1 >= 0) {
			Cell leftNeighbours = new Cell(x, y - 1, getCellType(x, y - 1));
			neighbours.add(leftNeighbours);
		}
		if (x - 1 >= 0) {
			Cell upperNeighbours = new Cell(x - 1, y, getCellType(x - 1, y));
			neighbours.add(upperNeighbours);
		}
		if (y + 1 < getColLength()) {
			Cell rightNeighbours = new Cell(x, y + 1, getCellType(x, y + 1));
			neighbours.add(rightNeighbours);
		}
		if (x + 1 < getLength()) {
			Cell bottomNeighbours = new Cell(x + 1, y, getCellType(x + 1, y));
			neighbours.add(bottomNeighbours);
		}
		return neighbours;
	}

}
