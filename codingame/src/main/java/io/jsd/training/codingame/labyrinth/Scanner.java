package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.WALL;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Scanner {

	public List<Vertex> scanLabyrinth(Cell currentPosition, Labyrinth labyrinth) {
		Vertex root = new Vertex(currentPosition);
		for (int x = 0; x < labyrinth.getLength(); x++) {
			for (int y = 0; y < labyrinth.getColLength(); y++) {
				Vertex vertex = new Vertex(new Cell(x, y, labyrinth.getCellType(x, y)));
				if (x - 1 > 0) {
					Cell cell = new Cell((x - 1), y, labyrinth.getCellType((x - 1), y));
					vertex.addNeighbour(new Vertex(cell));
				}
				if (x + 1 < labyrinth.getLength()) {
					Cell cell = new Cell((x + 1), y, labyrinth.getCellType((x + 1), y));
					vertex.addNeighbour(new Vertex(cell));
				}
				if (y - 1 > 0) {
					Cell cell = new Cell(x , (y - 1), labyrinth.getCellType(x, (y-1)));
					vertex.addNeighbour(new Vertex(cell));
				}
				if (y + 1 < labyrinth.getColLength()) {
					Cell cell = new Cell(x , (y + 1), labyrinth.getCellType(x, (y+1)));
					vertex.addNeighbour(new Vertex(cell));
				}
			}
		}
		return breadthFirstSearch(root);
	}

	private List<Vertex> breadthFirstSearch(Vertex root) {
		List<Vertex> vertices = new LinkedList<Vertex>();
		// Fifo data structure
		Queue<Vertex> queue = new LinkedList<Vertex>();
		root.setVisited(true);
		queue.add(root);
		while (!queue.isEmpty()) {
			Vertex actualVertex = queue.remove();
			addvertex(vertices, actualVertex);
			for (Vertex neighbour : actualVertex.getNeighbourList()) {
				if (!neighbour.isVisited()) {
					neighbour.setVisited(true);
					queue.add(neighbour);
					addvertex(vertices, actualVertex);
				}
			}
		}
		return vertices;
	}

	private void addvertex(List<Vertex> vertices, Vertex vertex) {
		if (vertex.getCellType().equals(WALL)) {
			return;
		}
		vertices.add(vertex);
	}

}
