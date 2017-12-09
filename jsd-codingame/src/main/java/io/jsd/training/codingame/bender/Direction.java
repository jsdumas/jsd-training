package io.jsd.training.codingame.bender;

public enum Direction {

	SOUTH("SOUTH"), EAST("EAST"), NORTH("NORTH"), WEST("WEST"), LOOP("LOOP"), CURRENT("CURRENT");

	private String direction;

	private Direction(String direction) {
		this.direction = direction;
	}

}
