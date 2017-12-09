package io.jsd.training.codingame.bender;

public class PathFromEmptyCase implements PathFinder {

	private final NextCase nextCase;

	public PathFromEmptyCase(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.nextCase = new NextCase(area, isInverted, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return nextCase.getCase();
	}

}
