package io.jsd.training.guava.collect;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.List;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class FunctionTest {
	
	 // Given words list
	private final List<String> words = Splitter.onPattern(" ").splitToList( "Lorem ipsum dolor sit amet consectetur adipisicing elit");
	
	@Test
	public void whenWordsListIsTranformedThenThreeFirstCharArePrintedInUpperCase() {
		//Go through a list of objects
		// Lists.transform returns a list that applies function to each
		// element of collection. The returned list is a transformed view
		// of input list.
		List<String> transformedWords = Lists.transform(
		        words,
		        //Anonymous class
		        new Function<String, String>() {
		            @Override
		            public String apply(String input) {
		                return input.toUpperCase().substring(0, 3);
		            }
		        }
		);
		System.out.println(transformedWords);
		assertThat(transformedWords, contains("LOR", "IPS", "DOL", "SIT", "AME", "CON", "ADI", "ELI"));
	}

}
