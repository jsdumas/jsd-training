package io.jsd.training.codingame.dwaresandgiants;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private final int id;
	private List<Person> heirs;
	private List<Person> ancestors;

	private boolean visited;

	public Person(int id) {
		this.id = id;
		this.heirs = new ArrayList<>();
		this.ancestors = new ArrayList<>();
	}

	public void addHeir(Person person) {
		this.heirs.add(person);
	}
	
	public void addAncestor(Person person) {
		this.ancestors.add(person);
	}

	public int getId() {
		return id;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Person> getHeirs() {
		return heirs;
	}
	
	public List<Person> getAncestors() {
		return ancestors;
	}

}
