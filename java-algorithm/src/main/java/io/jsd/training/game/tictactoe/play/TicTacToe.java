package io.jsd.training.game.tictactoe.play;

import java.util.Random;

import io.jsd.training.game.tictactoe.elements.Board;
import io.jsd.training.game.tictactoe.elements.Point;
import io.jsd.training.game.tictactoe.elements.PointsAndScores;

public class TicTacToe {
	public static void main(String[] args) {
		Board b = new Board();
		Random rand = new Random();

		b.displayBoard();

		System.out.println("Who's gonna move first? (1)Computer (2)User: ");
		int choice = b.getScanner().nextInt();
		if (choice == 1) {
			Point p = new Point(rand.nextInt(3), rand.nextInt(3));
			b.placeAMove(p, 1);
			b.displayBoard();
		}

		while (!b.isGameOver()) {
			System.out.println("Your move: ");
			Point userMove = new Point(b.getScanner().nextInt(), b.getScanner().nextInt());

			b.placeAMove(userMove, 2); // 2 for O and O is the user
			b.displayBoard();
			if (b.isGameOver()) {
				break;
			}
			b.callMinimax(0, 1);
			for (PointsAndScores pas : b.getRootsChildrenScores()) {
				System.out.println("Point: " + pas.getPoint() + " Score: " + pas.getScore());
			}
			b.placeAMove(b.returnBestMove(), 1);
			b.displayBoard();
		}
		if (b.hasXWon()) {
			System.out.println("Unfortunately, you lost!");
		} else if (b.hasOWon()) {
			System.out.println("You win! This is not going to get printed.");
		} else {
			System.out.println("It's a draw!");
		}
	}
}
