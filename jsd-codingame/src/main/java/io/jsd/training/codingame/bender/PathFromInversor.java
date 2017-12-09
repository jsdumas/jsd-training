package io.jsd.training.codingame.bender;

public class PathFromInversor implements PathFinder {

	private final NextCase nextCase;

	public PathFromInversor(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.nextCase = new NextCase(area, isInverted, isXBreaker);
	}

	@Override
	public Case getNextCase() {
		return nextCase.getCase();
	}

}
