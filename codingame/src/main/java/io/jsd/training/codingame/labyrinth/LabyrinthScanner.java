package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import io.jsd.training.codingame.labyrinth.bean.Labyrinth;

public class LabyrinthScanner {

	private final LabyrinthMap labyrinthMap;
	private final Queue<Cell> queue;
	private final Set<Cell> visitedCells;
	private final Labyrinth labyrinth;

	public LabyrinthScanner(Labyrinth labyrinth, LabyrinthMap labyrinthMap, Cell currentPosition) {
		this.labyrinth = labyrinth;
		this.labyrinthMap = labyrinthMap;
		this.queue = new LinkedList<Cell>();
		this.queue.add(currentPosition);
		this.visitedCells = new HashSet<Cell>();
	}

	public void breadthFirstSearch() {
		while (!queue.isEmpty()) {
			Cell currentCell = queue.remove();
			labyrinthMap.scanCell(currentCell);
			visitedCells.add(currentCell);
			Set<Cell> neighbours = labyrinth.getNeighbours(currentCell);
			for (Cell neighbour : neighbours) {
				if (neighbour != null && !visitedCells.contains(neighbour)) {
					queue.add(labyrinth.getCell(neighbour));
				}
			}
		}
	}

}
