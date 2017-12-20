package io.jsd.training.designpattern.reference;

public class Knight extends MovieCharacter {

	private static final long serialVersionUID = 1L;
	private static final String KNIGHT_MOVE_FORWARD = "Knight move forward";
	private static final String KNIGHT_MOVE = "Knight move";
	private static final String STEPS = " steps";

	public Knight() {
		this.name = "chevalier1";
	}

	@Override
	public String moveForward() {
		System.out.println("Chevalier avancer");
		return KNIGHT_MOVE_FORWARD;
	}

	public String avancer(int val) {
		System.out.println(KNIGHT_MOVE + val + STEPS);
		return KNIGHT_MOVE + val + STEPS;
	}
}
