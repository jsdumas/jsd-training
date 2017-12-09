package io.jsd.training.codingame.thegift;

import java.util.Arrays;

public class TheGift {

	private int giftValue;
	private final int contributors;
	private final int[] contributorsBudget;

	public TheGift(int[] contributorsBudget, int giftValue) {
		this.contributors=contributorsBudget.length;
		this.contributorsBudget = contributorsBudget;
		this.giftValue = giftValue;
	}


	private String calculateParticipation() {
		String result="";
		Arrays.sort(contributorsBudget);
		for (int contributorId = 0; contributorId < contributors; contributorId++) {
			int sharing = giftValue /(contributors-contributorId);
			Integer pay = Math.min(contributorsBudget[contributorId], sharing);
			result+=pay.toString();
			if(contributorId!=contributors-1) {
				result+="\n";
			}
			giftValue-=pay;
		}
		return result;
	}

	public String shareBudget() {
		int totalBudget = 0;
		for (int idContributor = 0; idContributor < contributors ; idContributor++) {
			totalBudget+=contributorsBudget[idContributor];
		}
		if(totalBudget<giftValue)	
			return "IMPOSSIBLE";
		else
			return calculateParticipation();
	}

}
