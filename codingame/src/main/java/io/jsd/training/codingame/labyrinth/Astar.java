package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Astar {

	public Stack<Direction> getShortestPath(Cell commandRoom, Cell startCell) {
		Set<Cell> exploredCells = new HashSet<Cell>();
		PriorityQueue<Cell> unexploredCellsQueue = new PriorityQueue<Cell>();
		commandRoom.setgScore(0);
		unexploredCellsQueue.add(commandRoom);
		boolean found = false;

		while (!unexploredCellsQueue.isEmpty() && !found) {
			Cell currentCell = unexploredCellsQueue.poll();
			exploredCells.add(currentCell);

			if (currentCell.getCellType().equals(startCell.getCellType())) {
				found = true;
			}

			Map<Direction, Cell> neighbours = currentCell.getNeighbours();
			for (Map.Entry<Direction, Cell> neighbour : neighbours.entrySet()) {
				double cost=0;
				if (neighbour.getValue().getCellType().equals(CellType.EMPTY_SPACE)
						|| neighbour.getValue().getCellType().equals(CellType.START_CELL)
						|| neighbour.getValue().getCellType().equals(CellType.COMMAND_ROOM)) {
					cost = 1;
				} else if (neighbour.getValue().getCellType().equals(CellType.UNKOWN_CELL)
						|| neighbour.getValue().getCellType().equals(CellType.WALL)) {
					cost = Double.MAX_VALUE;
				}

				double tempGScore = currentCell.getgScore() + cost;
				double tempFScore = tempGScore + heuristic(neighbour.getValue(), startCell);

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
		
		return printPath(startCell);
	}

	public Stack<Direction> printPath(Cell startCell) {
		Stack<Direction> pathList = new Stack<Direction>();
		for (Cell cell = startCell; cell != null; cell = cell.getParentCell()) {
			pathList.add(cell.getFrom());
		}
		return pathList;
	}

	// Manhattan heuristic/distance !!!
	public double heuristic(Cell neighbourCell, Cell startCell) {
		return Math.abs(neighbourCell.getX() - startCell.getX()) + Math.abs(startCell.getY() - startCell.getY());
	}

}
