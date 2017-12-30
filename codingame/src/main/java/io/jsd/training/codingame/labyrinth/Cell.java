package io.jsd.training.codingame.labyrinth;

import java.util.HashMap;
import java.util.Map;

public class Cell implements Comparable<Cell> {

	private final int x;
	private final int y;
	private final CellType cellType;
	private boolean isScanned;
	private Map<Direction, Cell> neighbours;
	private double howFarAwayThatCellIsFromTheStartingCell;
	private double lowestCostPath;
	private ParentCell parentCellForShortestPath;

	public Cell(int x, int y, CellType cellType) {
		this.x = x;
		this.y = y;
		this.cellType = cellType;
		this.isScanned = false;
		this.neighbours = new HashMap<Direction, Cell>();
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

	public Map<Direction, Cell> getNeighbours() {
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

	public void setgScore(double cost) {
		this.howFarAwayThatCellIsFromTheStartingCell = cost;
	}

	public double getgScore() {
		return howFarAwayThatCellIsFromTheStartingCell;
	}

	public double getfScore() {
		return lowestCostPath;
	}

	public void setfScore(double lowestCostPath) {
		this.lowestCostPath = lowestCostPath;
	}

	public ParentCell getParentCellForShortestPath() {
		return this.parentCellForShortestPath;
	}

	public void setParentCellForShortestPath(ParentCell parentCellForShortestPath) {
		this.parentCellForShortestPath = parentCellForShortestPath;
	}

	public Cell getParentCell() {
		return parentCellForShortestPath.getParentCell();
	}

	public Direction getFrom() {
		return parentCellForShortestPath.getFrom();
	}

	public void putNeighbour(Direction direction, Cell neighbour) {
		neighbours.put(direction, neighbour);
	}

	@Override
	public int compareTo(Cell otherCell) {
		return Double.compare(this.lowestCostPath, otherCell.getfScore());
	}

}