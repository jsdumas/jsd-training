package io.jsd.training.codingame.labyrinth;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private final Cell cell;
	private boolean visited;
	private List<Vertex> neighbourList;
	
	public Vertex(Cell cell){
		this.cell=cell;
		this.neighbourList = new ArrayList<>();
	}

	public Cell getCell() {
		return cell;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void addNeighbour(Vertex neighbour) {
		this.neighbourList.add(neighbour);
	}

	public CellType getCellType() {
		return cell.getCellType();
	}

	public int getCellX() {
		return cell.getX();
	}

	public int getCellY() {
		return cell.getY();
	}

}
