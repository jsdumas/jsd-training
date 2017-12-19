package io.jsd.training.java.guava.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.google.common.base.Objects;

public class ObjectsTest {
	
	@Test
	public void equal() {
		Pojo pojo = new Pojo("foo", 42, null);
		assertThat(Objects.equal(null, null), is(true));
		assertThat(Objects.equal(pojo, null), is(false));
		assertThat(Objects.equal(null, pojo), is(false));
		assertThat(Objects.equal(pojo, pojo), is(true));
		assertThat(Objects.equal(pojo, new Object()), is(false));
	}
	 
	@Test
	public void toStringHelper() {
		assertThat(new Pojo("foo", 42, null).toString(), Matchers.equalTo("Pojo{aString=foo, anInt=42, anObject=null}"));
		assertThat(new Pojo("foo", 42, "bar").toString(), Matchers.equalTo("Pojo{aString=foo, anInt=42, anObject=bar}"));
	}

}
