package io.jsd.training.codingame.bender;

public class PathFinderFactory {

	public PathFinder getPathFinder(CaseArea area, CaseType caseType, boolean isInverted, boolean isXBreaker) {
		PathFinder caseState;
		switch (caseType) {
			case START:
				caseState = new PathFromStart(area, isInverted, isXBreaker);
				break;
			case EMPTY:
				caseState = new PathFromEmptyCase(area, isInverted, isXBreaker);
				break;
			case X_OBSTACLE:
				caseState = new PathFromXObstacle(area, isInverted, isXBreaker);
				break;
			case S_MODIFIER:
				caseState = new PathFromSouth(area, isXBreaker);
				break;
			case E_MODIFIER:
				caseState = new PathFromEast(area, isXBreaker);
				break;
			case N_MODIFIER:
				caseState = new PathFromNorth(area, isXBreaker);
				break;
			case W_MODIFIER:
				caseState = new PathFromWest(area, isXBreaker);
				break;
			case INVERSOR:
				caseState = new PathFromInversor(area, isInverted, isXBreaker);
				break;
			case BIER:
				caseState = new PathFromBier(area, isInverted, isXBreaker);
				break;
			case TELEPORTER:
				caseState = new PathFromTeleporter(area, isInverted, isXBreaker);
				break;
			default:
				caseState = null;
		}
		return caseState;
	}

}
