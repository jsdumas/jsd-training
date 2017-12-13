package io.jsd.training.codingame.bender;

import java.util.Map;

public class InversedPriority implements PathPriority {

	private final CaseArea area;
	private final XBreaker xBreaker;
	private final WalkableCase walkableCase;
	private final CaseToReach caseToReach;

	public InversedPriority(CaseArea area, boolean isXBreaker) {
		this.area = area;
		this.xBreaker = new XBreaker(area, isXBreaker);
		this.walkableCase = new WalkableCase(isXBreaker);
		this.caseToReach = new CaseToReach(walkableCase, area);
	}

	@Override
	public Case getNextCase() {
		Map<Direction, Case> cases = caseToReach.getCasesToReach();
		if (cases.get(Direction.CURRENT) != null) {
			return xBreaker.getCaseFromInitialDirection(cases.get(Direction.CURRENT));
		}
		if (cases.get(Direction.WEST) != null) {
			return xBreaker.getWest();
		}
		if (cases.get(Direction.NORTH) != null) {
			return xBreaker.getNorth();
		}
		if (cases.get(Direction.EAST) != null) {
			return xBreaker.getEast();
		}
		if (cases.get(Direction.SOUTH) != null) {
			return xBreaker.getSouth();
		}
		area.getCurrentCase().setDirection(Direction.LOOP);
		return area.getCurrentCase();
	}

}
