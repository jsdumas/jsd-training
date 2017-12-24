package io.jsd.training.codingame.labyrinth;

public class Kirk {

	private final KirkSituation kirkSituation;
	private final Mission searchAndGetCommandRoom;
	private final GoBackToStartCell goBackToStartCell;
	private Mission mission;

	public Kirk() {
		this.kirkSituation = new KirkSituation();
		this.searchAndGetCommandRoom = new SearchAndGetCommandRoom(this);
		this.goBackToStartCell = new GoBackToStartCell(this);
		this.mission = searchAndGetCommandRoom;
	}

	public Direction mouve(Direction direction) {
		kirkSituation.energyDecrease();
		return direction;
	}

	public Cell getPosition() {
		return kirkSituation.geCurrenttPosition();
	}

	public int getX() {
		return kirkSituation.getX();
	}

	public int getY() {
		return kirkSituation.getY();
	}

	public int getJetPackEnergy() {
		return kirkSituation.getJetPackEnergy();
	}

	public CellType getCellTypeOfCurrentPosition() {
		return kirkSituation.getCellTypeOfCurrentPosition();
	}

	public KirkSituation getKirksituation() {
		return kirkSituation;
	}
	
	public Mission getMission() {
		return mission;
	}

	public void firstMissionFinished() {
		this.mission = goBackToStartCell;
	}

	public LabyrinthMap scanLabyrinth(Labyrinth labyrinth) {
		return kirkSituation.scanLabyrinth(labyrinth);
	}

}
