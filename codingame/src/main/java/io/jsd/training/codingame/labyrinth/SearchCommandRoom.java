package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import io.jsd.training.codingame.labyrinth.bean.CellType;
import io.jsd.training.codingame.labyrinth.bean.Direction;

public class SearchCommandRoom implements Mission {

	private final Set<CellType> cellsToAvoid;
	private final LabyrinthMap labyrinthMap;

	public SearchCommandRoom(LabyrinthMap labyrinthMap) {
		this.labyrinthMap = labyrinthMap;
		this.cellsToAvoid = new HashSet<CellType>();
		cellsToAvoid.add(CellType.COMMAND_ROOM);
		cellsToAvoid.add(CellType.UNKOWN_CELL);
		cellsToAvoid.add(CellType.WALL);
	}

	@Override
	public Stack<Direction> throwMission() {
		Queue<Cell> queue = new LinkedList<>();
		queue.add(kirk.getCurrentCell());
		Cell destination = null;
		while (!queue.isEmpty()) {
			Cell currentCell = queue.poll();
			Set<Edge> edges = currentCell.getNeighbours();
			for (Edge edge : edges) {
				Cell neighbour = edge.getNeighbourCell();
				queue.add(neighbour);
				if (neighbour.getCellType().equals(CellType.EMPTY_SPACE)) {
					destination = currentCell;
					Astar astar = new Astar(kirk.getCurrentCell(), destination, cellsToAvoid);
					ShortestPath shortestPath = astar.getShortestPath();
					if (!shortestPath.getPath().isEmpty())
						return shortestPath.getPath();
				}
			}
		}
		return null;
	}

}
