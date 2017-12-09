package io.jsd.training.codingame.bender;

public class XBreaker {

	private final CaseArea area;
	private final boolean isXBreaker;

	public XBreaker(CaseArea area, boolean isXBreaker) {
		this.area = area;
		this.isXBreaker = isXBreaker;
	}

	private Case setXBreaker(Case nextCase) {
		if (nextCase.getCaseType().equals(CaseType.X_OBSTACLE) && isXBreaker) {
			area.getMap()[nextCase.getIdRow()][nextCase.getIdCol()] = CaseType.EMPTY.getChar();
			nextCase.setEmptyCaseType();
		}
		return nextCase;
	}

	public Case getSouth() {
		Case south = setXBreaker(this.area.getSouth());
		return south;
	}

	public Case getWest() {
		Case west = setXBreaker(this.area.getWest());
		return west;
	}

	public Case getNorth() {
		Case north = setXBreaker(this.area.getNorth());
		return north;
	}

	public Case getEast() {
		Case east = setXBreaker(this.area.getEast());
		return east;
	}

	public Case getCaseFromInitialDirection(Case caseFromInitialDirection) {
		return setXBreaker(caseFromInitialDirection);
	}

}
