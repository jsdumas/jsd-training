package io.jsd.training.codingame.bender;

public class PathPriorityFactory {

	public PathPriority getPathPriority(CaseArea area, boolean isInverted, boolean isXBreaker) {
		if (isInverted) {
			return new InversedPriority(area, isXBreaker);
		}
		return new Priority(area, isXBreaker);
	}

}
