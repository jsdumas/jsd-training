package io.jsd.training.codingame.bender;

public class PathFromBier implements PathFinder {

	private final NextCase nextCase;

	public PathFromBier(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.nextCase = new NextCase(area, isInverted, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return nextCase.getCase();
	}

}
