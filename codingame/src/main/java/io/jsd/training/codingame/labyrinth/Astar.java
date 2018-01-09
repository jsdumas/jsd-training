package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Astar {

	private final Cell originCell;
	private final Cell destinationCell;
	private Set<CellType> cellsToAvoid;

	public Astar(Cell originCell, Cell destination, Set<CellType> cellsToAvoid) {
		this.originCell = originCell;
		this.destinationCell = destination;
		this.cellsToAvoid = cellsToAvoid;
		setShortestPath();
	}

	private void setShortestPath() {
		Set<Cell> exploredCells = new HashSet<Cell>();
		PriorityQueue<Cell> unexploredCellsQueue = new PriorityQueue<Cell>();
		originCell.setDistanceToDestination(0);
		unexploredCellsQueue.add(originCell);
		boolean found=false;
		while (!unexploredCellsQueue.isEmpty() && !found) {
			Cell currentCell = unexploredCellsQueue.poll();
			exploredCells.add(currentCell);
			if (currentCell.equals(destinationCell)) {
				found = true;
			}
			List<Edge> edges = currentCell.getNeighbours();
			for (Edge edge : edges) {
				Cell neighbourCell = edge.getNeighbourCell();
				if (cellsToAvoid.contains(neighbourCell.getCellType()) && neighbourCell != destinationCell) {
					continue;
				}
				double cost = edge.getCost();
				double tempGScore = currentCell.getDistanceToDestination() + cost;
				double tempFScore = tempGScore + heuristic(neighbourCell, destinationCell);
				if (exploredCells.contains(neighbourCell) && (tempFScore >= neighbourCell.getLowerCostPath())) {
					continue;
				}
				if (!unexploredCellsQueue.contains(neighbourCell) || (tempFScore < neighbourCell.getLowerCostPath())) {
					Parent parent = new Parent(edge.getDirection(), currentCell);
					neighbourCell.setParent(parent);
					neighbourCell.setDistanceToDestination(tempGScore);
					neighbourCell.setLowerCostPath(tempFScore);
					if (unexploredCellsQueue.contains(neighbourCell)) {
						unexploredCellsQueue.remove(neighbourCell);
					}
					unexploredCellsQueue.add(neighbourCell);
				}
			}
		}
	}

	public ShortestPath getShortestPath(boolean isPathToUnknownCell) {
		ShortestPath shortestPath = new ShortestPath();
		if (destinationCell.getParent() == null) {
			return shortestPath;
		}
		for (Cell currentCell = destinationCell; currentCell != originCell; currentCell = currentCell.getCellParent()) {
			if (currentCell == destinationCell && isPathToUnknownCell)
				continue;
			shortestPath.add(currentCell.getFromParent());
		}
		return shortestPath;
	}

	// Manhattan heuristic/distance !!!
	public double heuristic(Cell neighbourCell, Cell destination) {
		return Math.abs(neighbourCell.getX() - destination.getX()) + Math.abs(neighbourCell.getY() - destination.getY());
	}

}
