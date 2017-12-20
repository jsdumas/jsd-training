package io.jsd.training.guava.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.common.base.Joiner;

public class JoinerTest {
	
	
	@Test
	public void joinStringOnComma() {
		Joiner joinerOnString = Joiner.on(", ");
		assertThat(joinerOnString.join("Hello", "World"), equalTo("Hello, World"));
	}
	
	@Test
	public void joinStringOnChar() {
		Joiner joinerOnChar = Joiner.on(' ');
		assertThat(joinerOnChar.join("Hello", "World"), equalTo("Hello World"));
	}
	 
	@Test
	public void joinIterable() {
		List<String> daltons = Arrays.asList("Joe", "Jack", "William", "Averell");
		Joiner joiner = Joiner.on(", ");
		assertThat(joiner.join(daltons), equalTo("Joe, Jack, William, Averell"));
	}
	 
	@Test
	public void joinOnCommaAndSkipNulls() {
		List<String> daltons = Arrays.asList("Joe", null, "Jack", null, "William", null, "Averell");
		Joiner joinerSkippingNulls = Joiner.on(", ").skipNulls();
		assertThat(joinerSkippingNulls.join(daltons), equalTo("Joe, Jack, William, Averell"));
	}
	
	@Test
	public void joinOnCommaAndReplaceNullByString() {
		List<String> daltons = Arrays.asList("Joe", null, "Jack", null, "William", null, "Averell");
		Joiner joinerReplacingNulls = Joiner.on(", ").useForNull("<null>");
		assertThat(joinerReplacingNulls.join(daltons), equalTo("Joe, <null>, Jack, <null>, William, <null>, Averell"));
	}
	 
	@Test
	public void joinMap() {
		Map<String, Integer> daltonsSize = new LinkedHashMap<String, Integer>();
		daltonsSize.put("Joe",      1);
		daltonsSize.put("Jack",     2);
		daltonsSize.put("William",  3);
		daltonsSize.put("Averell",  4);
		Joiner.MapJoiner mapJoiner = Joiner.on(", ").withKeyValueSeparator("=");
		assertThat(mapJoiner.join(daltonsSize), equalTo("Joe=1, Jack=2, William=3, Averell=4"));
	}

}
