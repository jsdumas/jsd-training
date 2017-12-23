package io.jsd.training.codingame.labyrinth;

public class KirkSituation {
	
	private final JetpackState jetpackState;
	private final PositionState positionState;
	

	public KirkSituation() {
		this.jetpackState = new JetpackState();
		this.positionState = new PositionState();
	}

	public Position getPosition() {
		return positionState.getPosition();
	}

	public int getX() {
		return positionState.getX();
	}

	public int getY() {
		return positionState.getY();
	}
	
	public CellType getCellTypeOfCurrentPosition() {
		return positionState.getCellType();
	}

	public int getJetPackEnergy() {
		return jetpackState.getEnergy();
	}

	public void energyDecrease() {
		jetpackState.energyDecrease();
	}

	public void newPosition(Position position) {
		positionState.setPosition(position);
	}

	

}
