package io.jsd.training.codingame.bender;

public class PathFromWest implements PathFinder {

	private final XBreaker xBreaker;

	public PathFromWest(CaseArea area, boolean isXBreaker) {
		this.xBreaker = new XBreaker(area, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return xBreaker.getWest();
	}

}
