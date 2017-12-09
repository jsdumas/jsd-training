package io.jsd.training.codingame.bender;

public class PathFromNorth implements PathFinder {

	private final XBreaker xBreaker;

	public PathFromNorth(CaseArea area, boolean isXBreaker) {
		this.xBreaker = new XBreaker(area, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return xBreaker.getNorth();
	}

}
