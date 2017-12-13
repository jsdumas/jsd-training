package io.jsd.training.codingame.bender;

public class NextCase {

	private final CaseArea area;
	private final boolean isInverted;
	private final boolean isXBreaker;
	private final PathPriorityFactory pathPriorityFactory;

	public NextCase(CaseArea area, boolean isInverted, boolean isXBreaker) {
		this.area = area;
		this.isInverted = isInverted;
		this.isXBreaker = isXBreaker;
		this.pathPriorityFactory = new PathPriorityFactory();
	}

	public Case getCase() {
		PathPriority pathPriority = this.pathPriorityFactory.getPathPriority(area, isInverted, isXBreaker);
		return pathPriority.getNextCase();
	}

}
