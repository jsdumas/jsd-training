package io.jsd.training.codingame.bender;

import io.jsd.training.codingame.bender.PathFinderFactory;

public class MapRules {

	private final PathFinderFactory pathFinderFactory;
	private boolean isInverted;
	private boolean isXBreaker;

	public MapRules() {
		this.pathFinderFactory = new PathFinderFactory();
		this.isInverted = false;
		this.isXBreaker = false;
	}

	private PathFinder getPathFinder(CaseArea area) {
		CaseType currentCaseType = area.getCurrentCase().getCaseType();
		if (currentCaseType.equals(CaseType.INVERSOR)) {
			isInverted = !isInverted;
		}
		if (currentCaseType.equals(CaseType.BIER)) {
			isXBreaker = !isXBreaker;
		}
		return pathFinderFactory.getPathFinder(area, currentCaseType, isInverted, isXBreaker);
	}


	public boolean isInverted() {
		return isInverted;
	}

	public void setInverted(boolean isInverted) {
		this.isInverted = isInverted;
	}

	public Case getNextCase(CaseArea area) {
		PathFinder pathFinder = getPathFinder(area);
		Case nextCase = pathFinder.getNextCase();
		if(nextCase.getCaseType().equals(CaseType.X_OBSTACLE) && isXBreaker){
			area.getMap()[nextCase.getIdRow()][nextCase.getIdCol()] = CaseType.EMPTY.getChar();
			nextCase.setEmptyCaseType();
		}
		return nextCase;
	}

}
