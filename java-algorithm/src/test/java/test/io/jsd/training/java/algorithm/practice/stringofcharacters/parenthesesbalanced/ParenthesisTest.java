package test.io.jsd.training.java.algorithm.practice.stringofcharacters.parenthesesbalanced;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.jsd.training.java.algorithm.practice.stringofcharacters.parenthesesbalanced.Parenthesis;

public class ParenthesisTest {
	
	private static final Parenthesis PARENTHESE = new Parenthesis();
	private static final String BALANCED = "[()(())(){}]";
	private static final String UNBALANCED = "[()((){}]";
	
	@Test
	public void shouldBeBalanced(){
		MatcherAssert.assertThat(PARENTHESE.isBalanced(BALANCED), Matchers.is(true));
	}
	
	@Test
	public void shouldBeUnbalanced(){
		MatcherAssert.assertThat(PARENTHESE.isBalanced(UNBALANCED), Matchers.is(false));
	}

}
