package io.jsd.training.codingame.bender;

public class CaseArea {

	private final Case currentCase;
	private final char[][] map;
	private final Case south;
	private final Case east;
	private final Case north;
	private final Case west;
	private final Teleporter teletransporter;
	private final Direction direction;

	public CaseArea(Case currentCase, char[][] map, Teleporter teletransporter, Direction direction) {
		this.currentCase = currentCase;
		this.map = map;
		this.teletransporter = teletransporter;
		this.direction = direction;
		south = setCase(currentCase.getIdRow() + 1, currentCase.getIdCol(), Direction.SOUTH, currentCase);
		east = setCase(currentCase.getIdRow(), currentCase.getIdCol() + 1, Direction.EAST, currentCase);
		north = setCase(currentCase.getIdRow() - 1, currentCase.getIdCol(), Direction.NORTH, currentCase);
		west = setCase(currentCase.getIdRow(), currentCase.getIdCol() - 1, Direction.WEST, currentCase);
	}

	// public Case getSuicideCase() {
	// if (south.getCaseType().equals(CaseType.SUICIDE)) {
	// return south;
	// }
	// if (east.getCaseType().equals(CaseType.SUICIDE)) {
	// return east;
	// }
	// if (north.getCaseType().equals(CaseType.SUICIDE)) {
	// return north;
	// }
	// if (west.getCaseType().equals(CaseType.SUICIDE)) {
	// return west;
	// }
	// return null;
	// }

	private Case setCase(int idRow, int idCol, Direction comeFrom, Case currentCase) {
		if (idRow < 0 || idRow >= map.length || idCol < 0 || idCol >= map[0].length) {
			return null;
		}
		return new Case(idRow, idCol, CaseType.getCaseTypeForCharacter(map[idRow][idCol]), comeFrom, currentCase);
	}

	public Case getSouth() {
		return south;
	}

	public Case getEast() {
		return east;
	}

	public Case getNorth() {
		return north;
	}

	public Case getWest() {
		return west;
	}

	public Case getCurrentCase() {
		return currentCase;
	}

	public Teleporter getTeletransporter() {
		return teletransporter;
	}

	public char[][] getMap() {
		return map;
	}

	public Direction getDirection() {
		return direction;
	}

	public Case getCaseFromInitialDirection() {
		Case nextCase;
		switch (direction) {
			case SOUTH:
				nextCase = getSouth();
				break;
			case WEST:
				nextCase = getWest();
				break;
			case NORTH:
				nextCase = getNorth();
				break;
			case EAST:
				nextCase = getEast();
				break;
			default:
				nextCase = null;
				break;
		}
		return nextCase;
	}

}
