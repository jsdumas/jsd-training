package io.jsd.training.java.designpattern.hf.behavioural.decorator.starbuzz.beverage;

import io.jsd.training.java.designpattern.behavioural.decorator.starbuzz.beverage.Beverage;
import io.jsd.training.java.designpattern.behavioural.decorator.starbuzz.pattern.Mocha;
import io.jsd.training.java.designpattern.behavioural.decorator.starbuzz.pattern.Soy;
import io.jsd.training.java.designpattern.behavioural.decorator.starbuzz.pattern.Whip;

public class BeverageBuilder {

	private Beverage houseBlend;

	public BeverageBuilder(Beverage houseBlend) {
		this.houseBlend = houseBlend;
	}

	public BeverageBuilder withSoy() {
		houseBlend = new Soy(houseBlend);
		return this;
	}

	public BeverageBuilder withMocha() {
		houseBlend = new Mocha(houseBlend);
		return this;
	}

	public BeverageBuilder withWhip() {
		houseBlend = new Whip(houseBlend);
		return this;
	}

	public Beverage build() {
		return houseBlend;
	}

}
