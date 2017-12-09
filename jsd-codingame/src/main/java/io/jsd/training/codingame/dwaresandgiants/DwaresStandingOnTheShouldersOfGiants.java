package io.jsd.training.codingame.dwaresandgiants;

public class DwaresStandingOnTheShouldersOfGiants {

	private int longuestInfluencerChainSize;

	
	public int findTheLongestInfluenceInheritance(Person person){
		longuestInfluencerChainSize=0;
		findTheLongestInfluenceInheritance(person,1);
		return longuestInfluencerChainSize;
	}

	private void findTheLongestInfluenceInheritance(Person person, int currentInfluencerChainSize) {
		for( Person pers : person.getHeirs() ){
			if( !pers.isVisited() ){
				currentInfluencerChainSize+=1;
				pers.setVisited(true);
				if(pers.getHeirs().isEmpty()) {
					if(longuestInfluencerChainSize<currentInfluencerChainSize) {
						longuestInfluencerChainSize = currentInfluencerChainSize;
					}
					currentInfluencerChainSize=1;
					
				} 				}
				findTheLongestInfluenceInheritance(pers, currentInfluencerChainSize);
		}
	}


}
