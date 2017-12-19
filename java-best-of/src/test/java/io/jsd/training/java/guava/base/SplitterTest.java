package io.jsd.training.java.guava.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Iterator;

import org.junit.Test;

import com.google.common.base.Splitter;

public class SplitterTest {
	
	@Test
	public void splitByString() {
		String daltons = "Joe, Jack, William, Averell";
		Splitter splitterOnString = Splitter.on(", ");
		Iterable<String> split = splitterOnString.split(daltons);
		Iterator<String> iterator = split.iterator();
		assertThat(iterator.next(), equalTo("Joe"));
		assertThat(iterator.next(), equalTo("Jack"));
		assertThat(iterator.next(), equalTo("William"));
		assertThat(iterator.next(), equalTo("Averell"));
	}
	 
	@Test
	public void splitByPattern() {
		String daltons = "Joe, Jack, William, Averell";
		Splitter splitterOnString = Splitter.onPattern(",\\s+");
		Iterable<String> split = splitterOnString.split(daltons);
		Iterator<String> iterator = split.iterator();
		assertThat(iterator.next(), equalTo("Joe"));
		assertThat(iterator.next(), equalTo("Jack"));
		assertThat(iterator.next(), equalTo("William"));
		assertThat(iterator.next(), equalTo("Averell"));
	}
	 
	@Test
	public void splitAndRemoveEmptyResults() {
		String daltons = "Joe, , Jack, , William, , Averell";
		Splitter splitterOnString = Splitter.on(", ").trimResults().omitEmptyStrings();
		Iterable<String> split = splitterOnString.split(daltons);
		Iterator<String> iterator = split.iterator();
		assertThat(iterator.next(), equalTo("Joe"));
		assertThat(iterator.next(), equalTo("Jack"));
		assertThat(iterator.next(), equalTo("William"));
		assertThat(iterator.next(), equalTo("Averell"));
	}

}
