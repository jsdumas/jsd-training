package io.jsd.training.designpattern.reference;

import java.io.Serializable;

public class MovieCharacter implements Movable, Serializable {

	private static final long serialVersionUID = 1L;
	private static final String MAKE_CHARACTER_MOVE_FORWARD = "Make character move forward";
	private static final String MAKE_CHARACTER_MOVE_BACK = "Make character move back";
	protected String name;
	private Integer lifeNumber;

	public MovieCharacter() {
	}

	public MovieCharacter(String nom, Integer nbVie) {
		super();
		this.name = nom;
		this.lifeNumber = nbVie;
	}

	@Override
	public String moveForward() {
		System.out.println(MAKE_CHARACTER_MOVE_FORWARD);
		return MAKE_CHARACTER_MOVE_FORWARD;
	}

	@Override
	public String moveBack() {
		System.out.println(MAKE_CHARACTER_MOVE_BACK);
		return MAKE_CHARACTER_MOVE_BACK;
	}

	public String getName() {
		return name;
	}

	public Integer getLifeNumber() {
		return lifeNumber;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
