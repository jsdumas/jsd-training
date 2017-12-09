package io.jsd.training.codingame.bender;

public class Walk {

	private final BenderMap benderMap;
	private final MapRules mapRules;

	public Walk(BenderMap benderMap) {
		this.benderMap = benderMap;
		this.mapRules = new MapRules();
	}

	public Case toNextCase(Case currentCase, Direction direction) {
		CaseArea area = new CaseArea(currentCase, benderMap.getMap(), benderMap.getTeletransporter(), direction);
		return mapRules.getNextCase(area);
	}

}
