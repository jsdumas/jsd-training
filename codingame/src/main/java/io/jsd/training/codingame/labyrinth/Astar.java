package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Astar {

	private final Cell originCell;
	private final Cell destinationCell;
	private final Set<CellType> cellsToAvoid;
//	private boolean doesExistsAPath;

	public Astar(Cell currentCell, Cell destination, Set<CellType> cellsToAvoid) {
		this.originCell = currentCell;
		this.destinationCell = destination;
		this.cellsToAvoid = cellsToAvoid;
//		this.doesExistsAPath = false;
	}

	public void getShortestPath() {
		Set<Cell> exploredCells = new HashSet<Cell>();
		PriorityQueue<Cell> unexploredCellsQueue = new PriorityQueue<Cell>();
		originCell.setgScore(0);
		unexploredCellsQueue.add(originCell);
		boolean found = false;
//		boolean doesExistsAPath = false;
		while (!unexploredCellsQueue.isEmpty() && !found) {
			Cell currentCell = unexploredCellsQueue.poll();
			exploredCells.add(currentCell);
			if (currentCell.equals(destinationCell)) {
				found = true;
			}
			Map<Direction, Cell> neighboursMap = currentCell.getNeighboursMap();
			for (Map.Entry<Direction, Cell> entry : neighboursMap.entrySet()) {
				Direction directionTo = entry.getKey();
				Cell neighbourCell = entry.getValue();
				if (neighbourCell == null || (cellsToAvoid.contains(neighbourCell.getCellType()) && neighbourCell!=destinationCell)) {
					continue;
				}
				double cost = 10;
				double tempGScore = currentCell.getgScore() + cost;
				double tempFScore = tempGScore + heuristic(neighbourCell, destinationCell);
				if (exploredCells.contains(neighbourCell) && (tempFScore >= neighbourCell.getfScore())) {
					continue;
				} else if (!unexploredCellsQueue.contains(neighbourCell) || (tempFScore < neighbourCell.getfScore())) {
//					doesExistsAPath = true;
					ShortestPath shortestPath = new ShortestPath(directionTo, currentCell);
					neighbourCell.setShortestPath(shortestPath);
					neighbourCell.setgScore(tempGScore);
					neighbourCell.setfScore(tempFScore);
					if (unexploredCellsQueue.contains(neighbourCell)) {
						unexploredCellsQueue.remove(neighbourCell);
					}
					unexploredCellsQueue.add(neighbourCell);
				}
			}
		}
	}

	public Stack<Direction> scanUnknownCell() {
		Stack<Direction> pathList = new Stack<Direction>();
		if (destinationCell.getShortestPath() == null) {
			return pathList;
		}
		for (Cell currentCell = destinationCell; currentCell != originCell; currentCell = currentCell
				.getParentFromShortestPath()) {
			if(currentCell==destinationCell)
				continue;
			pathList.add(currentCell.getFromShortestPath());
		}
		return pathList;
	}

	// Manhattan heuristic/distance !!!
	public double heuristic(Cell neighbourCell, Cell startCell) {
		return Math.abs(neighbourCell.getX() - startCell.getX()) + Math.abs(startCell.getY() - startCell.getY());
	}

}
