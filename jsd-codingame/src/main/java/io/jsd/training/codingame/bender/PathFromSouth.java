package io.jsd.training.codingame.bender;

public class PathFromSouth implements PathFinder {

	private final XBreaker xBreaker;

	public PathFromSouth(CaseArea area, boolean isXBreaker) {
		this.xBreaker = new XBreaker(area, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return xBreaker.getSouth();
	}

}
