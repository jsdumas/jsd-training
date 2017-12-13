package io.jsd.training.java.algorithm.hb.problems.recursiveproblems.housebuilding;

import io.jsd.training.java.algorithm.hb.problems.recursiveproblems.Algorithm;

public class HouseBuilding implements Algorithm{

	//Head recursion uses operating system stack memory
	private void buildHeadRecursionLayers(int height){
		if( height == 0 ) return;
		buildHeadRecursionLayers(height-1);
		System.out.println(height);	
	}
	
	
	//Tail recursion runs like an iterative loop
	private void buildTailRecursionLayers(int height){
		if( height == 0 ) return;
		System.out.println(height);	
		buildTailRecursionLayers(height-1);
	}


	@Override
	public int runFast(int number) {
		buildTailRecursionLayers(number);
		return 0;
	}


	@Override
	public int runSlow(int number) {
		buildHeadRecursionLayers(number);
		return 0;
	}
	

}
