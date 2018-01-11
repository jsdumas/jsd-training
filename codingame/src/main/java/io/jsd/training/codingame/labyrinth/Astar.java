package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Astar {

	private final Cell originCell;
	private final Cell destinationCell;
	private final Set<CellType> cellsToAvoid;
	private final Set<Cell> exploredCells;
	private final PriorityQueue<Cell> unexploredCellsQueue;
	private boolean found;

	public Astar(Cell originCell, Cell destination, Set<CellType> cellsToAvoid) {
		this.originCell = originCell;
		this.originCell.setDistanceToDestination(0);
		this.destinationCell = destination;
		this.cellsToAvoid = cellsToAvoid;
		this.exploredCells = new HashSet<Cell>();
		this.unexploredCellsQueue = new PriorityQueue<Cell>();
		this.unexploredCellsQueue.add(this.originCell);
		this.found = false;
		setShortestPath();
	}

	private void setShortestPath() {
		while (!unexploredCellsQueue.isEmpty() && !found) {
			Cell currentCell = getCurrentCell();
			List<Edge> edges = currentCell.getNeighbours();
			for (Edge edge : edges) {
				Cell neighbourCell = edge.getNeighbourCell();
				if (cellsToAvoid.contains(neighbourCell.getCellType()) && neighbourCell != destinationCell) {
					continue;
				}
				Distance distance = new Distance(edge, currentCell, destinationCell);
				if (exploredCells.contains(neighbourCell) && distance.isLongerThanNeighbourDistance()) {
					continue;
				}
				if (!unexploredCellsQueue.contains(neighbourCell) || distance.isShorterThanNeighbourDistance() || neighbourCell == destinationCell) {
					Parent parent = new Parent(edge.getDirection(), currentCell);
					setPathInNeigbourCell(neighbourCell, parent, distance);
					updatePriotyInUnexploredCell(neighbourCell);
				}
			}
		}
	}

	private void setPathInNeigbourCell(Cell neighbourCell, Parent parent, Distance distance) {
		neighbourCell.setParent(parent);
		neighbourCell.setDistanceToDestination(distance.getDistanceToDestination());
		neighbourCell.setLowerCostPath(distance.getDistance());
	}

	private void updatePriotyInUnexploredCell(Cell neighbourCell) {
		if (unexploredCellsQueue.contains(neighbourCell)) {
			unexploredCellsQueue.remove(neighbourCell);
		}
		unexploredCellsQueue.add(neighbourCell);
	}

	private Cell getCurrentCell() {
		Cell currentCell = unexploredCellsQueue.poll();
		exploredCells.add(currentCell);
		if (currentCell.equals(destinationCell)) {
			found = true;
		}
		return currentCell;
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

}
