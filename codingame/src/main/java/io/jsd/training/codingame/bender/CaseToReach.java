package io.jsd.training.codingame.bender;

import java.util.HashMap;
import java.util.Map;

public class CaseToReach {

	private final WalkableCase walkableCase;
	private final CaseArea area;
	private final Map<Direction, Case> cases;

	public CaseToReach(WalkableCase walkableCase, CaseArea area) {
		this.walkableCase = walkableCase;
		this.area = area;
		this.cases = setCaseToReach();
	}

	private Map<Direction, Case> setCaseToReach() {
		Map<Direction, Case> cases = new HashMap<>();
		cases.put(Direction.CURRENT, walkableCase.getWalkableCase(area.getCaseFromInitialDirection()));
		cases.put(Direction.SOUTH, walkableCase.getWalkableCase(area.getSouth()));
		cases.put(Direction.EAST, walkableCase.getWalkableCase(area.getEast()));
		cases.put(Direction.NORTH, walkableCase.getWalkableCase(area.getNorth()));
		cases.put(Direction.WEST, walkableCase.getWalkableCase(area.getWest()));
		return cases;
	}

	public Map<Direction, Case> getCasesToReach() {
		return cases;
	}

}
