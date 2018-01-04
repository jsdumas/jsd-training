package io.jsd.training.codingame.labyrinth;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cell implements Comparable<Cell> {

	private final Integer id;
	private final int x;
	private final int y;
	private final CellType cellType;
	private final Map<Direction, Cell> neighboursMap;
	private boolean isScanned;
	private double howFarAwayThatCellIsFromTheStartingCell;
	private double lowestCostPath;
	private ShortestPath shortestPath;

	public Cell(int x, int y, CellType cellType) {
		this.id = Integer.parseInt(String.valueOf(x) + String.valueOf(y));
		this.x = x;
		this.y = y;
		this.cellType = cellType;
		this.isScanned = false;
		this.neighboursMap = new HashMap<Direction, Cell>();
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

	public Map<Direction, Cell> getNeighboursMap() {
		return neighboursMap;
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

	public void putNeighbour(Direction direction, Cell neighbour) {
		neighboursMap.put(direction, neighbour);
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

	@Override
	public int compareTo(Cell otherCell) {
		return Double.compare(this.lowestCostPath, otherCell.getfScore());
	}

	public Integer getId() {
		return id;
	}

	public void setShortestPath(Entry<Direction, Cell> entry) {
		// this.shortestPath = new ShortestPath(entry.getKey(), entry.getValue());

		if (entry.getKey().equals(Direction.DOWN))
			this.shortestPath = new ShortestPath(Direction.UP, entry.getValue());
		if (entry.getKey().equals(Direction.LEFT))
			this.shortestPath = new ShortestPath(Direction.RIGHT, entry.getValue());
		if (entry.getKey().equals(Direction.RIGHT))
			this.shortestPath = new ShortestPath(Direction.LEFT, entry.getValue());
		if (entry.getKey().equals(Direction.UP))
			this.shortestPath = new ShortestPath(Direction.DOWN, entry.getValue());
	}

	public Direction getFromShortestPath() {
		return this.shortestPath.getFrom();
	}

	public Cell getParentFromShortestPath() {
		return this.shortestPath.getParent();
	}

	public ShortestPath getShortestPath() {
		return this.shortestPath;
	}

}