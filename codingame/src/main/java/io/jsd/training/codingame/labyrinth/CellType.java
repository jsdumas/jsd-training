package io.jsd.training.codingame.labyrinth;

public enum CellType {
	
	WALL("#"),
	EMPTY_SPACE("."),
	START_CELL("T"),
	COMMAND_ROOM("C"),
	UNKOWN_CELL("?");
	
	private String code;

	private CellType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
