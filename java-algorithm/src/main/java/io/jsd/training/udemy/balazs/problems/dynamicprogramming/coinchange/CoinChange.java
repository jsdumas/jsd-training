package io.jsd.training.udemy.balazs.problems.dynamicprogramming.coinchange;

public class CoinChange {

	// recursive coin change EXPONENTIAL RUNNING TIME O(2^N)
	public int naiveCoinChange(int amount, int[] coins, int index) {
		
		if( amount < 0 ) return 0;
		if( amount == 0 ) return 1;
		
		if( coins.length == index ) return 0;
		
		return naiveCoinChange(amount-coins[index], coins, index) + naiveCoinChange(amount, coins, index+1);
	}
	
	public void dynamicProgrammingCoinChange(int[] coins, int amount) {
		
		int[][] dpTable = new int[coins.length+1][amount+1];
		
		for(int i=0;i<=coins.length;i++)
			dpTable[i][0] = 1;
		
		for(int i=1;i<=amount;i++)
			dpTable[0][i] = 0;
		
		// O(v*M)
		for(int i=1;i<=coins.length;i++) {
			for(int j=1;j<=amount;j++) {
				
				if( coins[i-1] <= j ) {
					dpTable[i][j] = dpTable[i-1][j] + dpTable[i][j-coins[i-1]];
				} else {
					dpTable[i][j] = dpTable[i-1][j];
				}
			}
		}

		System.out.println("Solution: " + dpTable[coins.length][amount]);
	}
}
