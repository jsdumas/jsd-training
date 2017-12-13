package io.jsd.training.codingame.bender;

public enum Direction {

	SOUTH("SOUTH"), EAST("EAST"), NORTH("NORTH"), WEST("WEST"), LOOP("LOOP"), CURRENT("CURRENT");

	private String direction;

	public String getDirection() {
		return direction;
	}

	private Direction(String direction) {
		this.direction = direction;
	}

}
