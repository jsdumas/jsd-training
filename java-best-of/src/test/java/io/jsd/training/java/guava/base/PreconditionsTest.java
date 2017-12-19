package io.jsd.training.java.guava.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.google.common.base.Preconditions;

public class PreconditionsTest {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	private void methodWithNotNullParam(String param) {
		Preconditions.checkNotNull(param, "Parameter '%s' must not be null", "param");
	}
	 
	private void methodWithValidParam(String param) {
		Preconditions.checkArgument(param.trim().length() > 0, "Parameter '%s' must not be empty", "param");
	}
	 
	@Test
	public void testMethodWithNotNullParam() {
		try {
			methodWithNotNullParam(null);
			expectedException.expect(NullPointerException.class);
		} catch (NullPointerException npe) {
			assertThat("Parameter 'param' must not be null", equalTo(npe.getMessage()));
		}
	}
	 
	@Test
	public void testMethodWithValidParam() {
		try {
			methodWithValidParam("");
			expectedException.expect(IllegalArgumentException.class);
		} catch (IllegalArgumentException iae) {
			assertThat("Parameter 'param' must not be empty", equalTo(iae.getMessage()));
		}
	}

}
