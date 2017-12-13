package io.jsd.training.codingame.bender;

public class PathFromEast implements PathFinder {

	private final XBreaker xBreaker;

	public PathFromEast(CaseArea area, boolean isXBreaker) {
		this.xBreaker = new XBreaker(area, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return xBreaker.getEast();
	}

}
