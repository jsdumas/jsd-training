package io.jsd.training.udemy.balazs.problems.recursiveproblems.towersofhanoi;

import java.util.List;
import java.util.Stack;

public class TowerOfHanoi {

	private final Rod rodFrom = new Rod(Position.FROM);
	private final Rod rodMiddle = new Rod(Position.MIDDLE);
	private final Rod rodTo = new Rod(Position.TO);

	public TowerOfHanoi(Stack<Plate> plates) {
		this.rodFrom.setPlates(plates);
	}

	// Exponential time complexity --> O(c^n)
	private void solveHanoiProblem(int plateNumber, Rod rodFrom, Rod middleRod, Rod rodTo) {
		if (plateNumber == 1) {
			System.out.println("Plate 1 from " + rodFrom.getPosition().getValue() + " to " + rodTo.getPosition().getValue());
			Plate plate = rodFrom.getPlates().pop();
			rodTo.getPlates().push(plate);
			return;
		}
		solveHanoiProblem(plateNumber - 1, rodFrom, rodTo, middleRod);
		Plate plate = rodFrom.getPlates().pop();
		rodTo.getPlates().push(plate);
		System.out.println("Plate " + plateNumber + " from " + rodFrom.getPosition().getValue() + " to " + rodTo.getPosition().getValue());
		solveHanoiProblem(plateNumber - 1, middleRod, rodFrom, rodTo);
	}

	public void solveHanoiProblem(int plateNumber) {
		solveHanoiProblem(plateNumber, rodFrom, rodMiddle, rodTo);
	}

	public List<Plate> getRodeTo() {
		return this.rodTo.getPlates();
	}
}
