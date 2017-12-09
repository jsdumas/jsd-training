package io.jsd.training.codingame.bender;

public class WalkableCase {

	private final boolean isXBreaker;

	public WalkableCase(boolean isXBreaker) {
		this.isXBreaker = isXBreaker;
	}

	public Case getWalkableCase(Case nextCase) {
		if (nextCase != null && nextCase.getCaseType().equals(CaseType.X_OBSTACLE)) {
			if (isXBreaker) {
				return nextCase;
			} else {
				return null;
			}
		}
		if (nextCase != null && !nextCase.getCaseType().equals(CaseType.CHARP_OBSTACLE)) {
			return nextCase;
		}
		return null;
	}

}
