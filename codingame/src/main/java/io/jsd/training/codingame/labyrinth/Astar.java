package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Astar {

	private final Cell currentCell;
	private final Cell destination;
	private final Set<CellType> cellsToAvoid;

	public Astar(Cell currentCell, Cell destination, Set<CellType> cellsToAvoid) {
		this.currentCell = currentCell;
		this.destination = destination;
		this.cellsToAvoid = cellsToAvoid;
	}

	public Stack<Direction> getShortestPath() {
		Set<Cell> exploredCells = new HashSet<Cell>();
		PriorityQueue<Cell> unexploredCellsQueue = new PriorityQueue<Cell>();
		currentCell.setgScore(0);
		unexploredCellsQueue.add(currentCell);
		boolean found = false;

		while (!unexploredCellsQueue.isEmpty() && !found) {
			Cell currentCell = unexploredCellsQueue.poll();
			exploredCells.add(currentCell);

			if (currentCell.equals(destination)) {
				found = true;
			}

			Map<Direction, Cell> neighbours = currentCell.getNeighbours();
			for (Map.Entry<Direction, Cell> neighbour : neighbours.entrySet()) {
				if(neighbour.getValue()==null) {
					continue;
				}
				
				if (cellsToAvoid.contains(neighbour.getValue().getCellType())) {
//					cost = Double.MAX_VALUE;
					continue;
				} 

				double cost = 10;

				double tempGScore = currentCell.getgScore() + cost;
				double tempFScore = tempGScore + heuristic(neighbour.getValue(), destination);

				if (exploredCells.contains(neighbour.getValue()) && (tempFScore >= neighbour.getValue().getfScore())) {
					continue;
				} else if (!unexploredCellsQueue.contains(neighbour.getValue()) || (tempFScore < neighbour.getValue().getfScore())) {
					ParentCell parentCell = new ParentCell(neighbour.getKey(), currentCell);
					neighbour.getValue().setParentCellForShortestPath(parentCell);
					neighbour.getValue().setgScore(tempGScore);
					neighbour.getValue().setfScore(tempFScore);

					if (unexploredCellsQueue.contains(neighbour.getValue())) {
						unexploredCellsQueue.remove(neighbour.getValue());
					}

					unexploredCellsQueue.add(neighbour.getValue());
				}
			}
		}
		
		return printPath();
	}

	public Stack<Direction> printPath() {
		Stack<Direction> pathList = new Stack<Direction>();
		for (Cell dest = destination; dest.getCellType() != CellType.COMMAND_ROOM; dest = dest.getParentCell()) {
			pathList.add(dest.getFrom());
		}
		return pathList;
	}

	// Manhattan heuristic/distance !!!
	public double heuristic(Cell neighbourCell, Cell startCell) {
		return Math.abs(neighbourCell.getX() - startCell.getX()) + Math.abs(startCell.getY() - startCell.getY());
	}

}
