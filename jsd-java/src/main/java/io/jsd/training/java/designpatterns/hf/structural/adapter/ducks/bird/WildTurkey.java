package io.jsd.training.java.designpatterns.hf.structural.adapter.ducks.bird;

public class WildTurkey implements Turkey {

	private static final String GLOBBLE = "Gobble gobble";
	private static final String FLY = "I'm flying a short distance";

	@Override
	public String gobble() {
		System.out.println(GLOBBLE);
		return GLOBBLE;
	}

	@Override
	public String fly() {
		System.out.println(FLY);
		return FLY;
	}
}
