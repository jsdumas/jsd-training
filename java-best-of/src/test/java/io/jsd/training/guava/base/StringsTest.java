package io.jsd.training.guava.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers;
import org.junit.Test;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

public class StringsTest {
	
	private static final String EMPTY_STRING = "";
	private static final String HELLO_WORLD = "Hello World";
	private static final String HA = "ha";
	private static final String HA_HA_HA = "hahaha";

	@Test
	public void nullString() {
		assertThat(Strings.emptyToNull(null), equalTo(null));
		assertThat(Strings.emptyToNull(EMPTY_STRING), equalTo(null));
		assertThat(Strings.emptyToNull(HELLO_WORLD), equalTo(HELLO_WORLD));
		
		assertThat(Strings.nullToEmpty(null), equalTo(EMPTY_STRING));
		assertThat(Strings.nullToEmpty(EMPTY_STRING), equalTo(EMPTY_STRING));
		assertThat(Strings.nullToEmpty(HELLO_WORLD), equalTo(HELLO_WORLD));
		
		assertThat(Strings.isNullOrEmpty(null), is(true));
		assertThat(Strings.isNullOrEmpty(EMPTY_STRING), is(true));
		assertThat(Strings.isNullOrEmpty(HELLO_WORLD), is(false));
	 
	}
	 
	@Test
	public void padding() {
		char padding = '.';
		assertThat(Strings.padStart(HELLO_WORLD, -1, padding), equalTo(HELLO_WORLD));
		assertThat(Strings.padStart(HELLO_WORLD, 0, padding), equalTo(HELLO_WORLD));
		assertThat(Strings.padStart(HELLO_WORLD, 15, padding), equalTo("...."+HELLO_WORLD));
		
		assertThat(Strings.padEnd(HELLO_WORLD, -1, padding), equalTo(HELLO_WORLD));
		assertThat(Strings.padEnd(HELLO_WORLD, 0, padding), equalTo(HELLO_WORLD));
		assertThat(Strings.padEnd(HELLO_WORLD, 15, padding), equalTo(HELLO_WORLD+"...."));
	}
	 
	@Test
	public void repeat() {
		assertThat(Strings.repeat(HA, 0), equalTo(EMPTY_STRING));
		assertThat(Strings.repeat(HA, 1), equalTo(HA));
		assertThat(Strings.repeat(HA, 3), equalTo(HA_HA_HA));
	}
	

}
