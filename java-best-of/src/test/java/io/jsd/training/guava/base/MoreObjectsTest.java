package io.jsd.training.guava.base;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import com.google.common.base.MoreObjects;

public class MoreObjectsTest {

	class Car {

		private long id;
		private String name;
		private int price;

		public Car(long Id, String name, int price) {
			this.id = Id;
			this.name = name;
			this.price = price;
		}

		public long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return MoreObjects.toStringHelper(Car.class)//
					.add("id", id)//
					.add("name", name)//
					.add("price", price)//
					.toString();
		}
	}

	@Test
	public void whenMoreObjectstoStringHelperThenWeCanOveridedEasilyTostringMethod() {
		Car car = new Car(99L, "Opel", 10000);
		MatcherAssert.assertThat(car.toString(), Matchers.equalTo("Car{id=99, name=Opel, price=10000}"));
	}
}
