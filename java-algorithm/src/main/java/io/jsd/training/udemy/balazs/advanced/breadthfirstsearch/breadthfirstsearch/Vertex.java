package io.jsd.training.udemy.balazs.advanced.breadthfirstsearch.breadthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private int data;
	private boolean visited;
	private List<Vertex> childs;
	
	public Vertex(int data){
		this.data=data;
		this.childs = new ArrayList<>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getChilds() {
		return childs;
	}

	public void addChild(Vertex child) {
		this.childs.add(child);
	}
	
	@Override
	public String toString() {
		return ""+this.data;
	}
}
