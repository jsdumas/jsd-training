package io.jsd.training.codingame.labyrinth;

import java.util.LinkedList;
import java.util.List;

public class Cell {

	private final int x;
	private final int y;
	private final CellType cellType;
	private boolean isScanned;
	private List<Cell> neighbours;

	public Cell(int x, int y, CellType cellType) {
		this.x = x;
		this.y = y;
		this.cellType = cellType;
		this.isScanned = false;
		this.neighbours = new LinkedList<Cell>();
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

	public void scanCell() {
		this.isScanned = true;
	}

	public boolean isScanned() {
		return isScanned;
	}

	private boolean hasLeftNeighbour() {
		return (x - 1) >= 0;
	}

	private boolean hasRightNeighbour(int length) {
		return (x + 1) < length;
	}

	private boolean hasUpperNeighbour() {
		return (y - 1) >= 0;
	}

	private boolean hasBottomNeighbour(int colLength) {
		return (y + 1) < colLength;
	}

	public void addNeighbours(LabyrinthMap labyrinthMap, Labyrinth labyrinth) {
		if (hasLeftNeighbour()) {
			Cell leftNeighbour = new Cell((x - 1), y, labyrinth.getCellType((x - 1), y));
			if (!labyrinthMap.contains(leftNeighbour)) {
				labyrinthMap.addCell(leftNeighbour);
				this.neighbours.add(leftNeighbour);
			}
		}
		if (hasRightNeighbour(labyrinth.getLength())) {
			Cell rightNeighbour = new Cell((x + 1), y, labyrinth.getCellType((x + 1), y));
			if (!labyrinthMap.contains(rightNeighbour)) {
				labyrinthMap.addCell(rightNeighbour);
				this.neighbours.add(rightNeighbour);
			}
		}
		if (hasUpperNeighbour()) {
			Cell upperNeighbour = new Cell(x, (y - 1), labyrinth.getCellType(x, (y - 1)));
			if (!labyrinthMap.contains(upperNeighbour)) {
				labyrinthMap.addCell(upperNeighbour);
				this.neighbours.add(upperNeighbour);
			}
		}
		if (hasBottomNeighbour(labyrinth.getColLength())) {
			Cell bottomNeighbour = new Cell(x, (y + 1), labyrinth.getCellType(x, (y + 1)));
			if (!labyrinthMap.contains(bottomNeighbour)) {
				labyrinthMap.addCell(bottomNeighbour);
				this.neighbours.add(bottomNeighbour);
			}
		}
	}

	public List<Cell> getNeighbours() {
		return neighbours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	
}
