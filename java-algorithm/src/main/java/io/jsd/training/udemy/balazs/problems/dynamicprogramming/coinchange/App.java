package io.jsd.training.udemy.balazs.problems.dynamicprogramming.coinchange;

public class App {

	public static void main(String[] args) {

		int[] coins = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int amount = 4000;

		CoinChange change = new CoinChange();

		// System.out.println( change.naiveCoinChange(amount, coins, 0) );
		change.dynamicProgrammingCoinChange(coins, amount);
	}
}
