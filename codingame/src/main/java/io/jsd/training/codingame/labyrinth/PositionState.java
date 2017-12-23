package io.jsd.training.codingame.labyrinth;

public class PositionState {
	
	private Position position;
	
	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public int getX() {
		return position.getX();
	}

	public int getY() {
		return position.getY();
	}

	public CellType getCellType() {
		return position.getCellType();
	}

}
