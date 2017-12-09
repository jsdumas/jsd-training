package io.jsd.training.algorithms.game.tictactoe.elements;

public class PointsAndScores {
	int score;
	Point point;

	PointsAndScores(int score, Point point) {
		this.score = score;
		this.point = point;
	}

	public int getScore() {
		return score;
	}

	public Point getPoint() {
		return point;
	}

}
