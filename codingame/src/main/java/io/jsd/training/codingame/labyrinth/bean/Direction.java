package io.jsd.training.codingame.labyrinth.bean;

public enum Direction {
	
	LEFT("LEFT"),
	UP("UP"),
	RIGHT("RIGHT"),
	DOWN("DOWN");
	
	
	private String code;

	private Direction(String code) {
		this.code=code;
	}
	
	public String getCode() {
		return code;
	}
}
