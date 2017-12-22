package io.jsd.training.guava.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.google.common.base.CharMatcher;

public class CharMatcherTest {

	@Test
	public void remove_all_lower_case_from_string() {
		String allButLowerCase = CharMatcher.JAVA_LOWER_CASE.negate().retainFrom("B-double E double R U-N beer run");
		assertThat(allButLowerCase, (equalTo("B- E  R U-N  ")));
	}

	@Test
	public void trim_leading_spaces_from_string() {
		String leftTrimmedString = CharMatcher.WHITESPACE.trimLeadingFrom("       Some String       ");
		assertThat("       Some String       ", (equalTo(leftTrimmedString)));
	}

	@Test
	public void trim_all_spaces_from_string() {
		String trimmedString = CharMatcher.WHITESPACE.trimFrom("       Some String       ");
		assertThat("Some String", equalTo(trimmedString));
	}

	@Test
	public void remove_all_asterisk_from_string() {
		String stringWithoutAstricks = CharMatcher.is('*')
				.removeFrom("(* This is a comment.  The compiler will ignore it. *)");
		assertThat("( This is a comment.  The compiler will ignore it. )", equalTo(stringWithoutAstricks));
	}

	@Test
	public void validate_all_charachters_in_string_is_digit_or_letter() {
		boolean randomPharse = CharMatcher.JAVA_LETTER_OR_DIGIT.matchesAllOf("wefwewef3r343fwdSVD()I#KMFI");
		assertThat(randomPharse, is(true));
	}

	@Test
	public void grade_within_passing_range() {
		boolean failedGrade = CharMatcher.inRange('A', 'C').apply('F');
		assertThat(failedGrade, is(true));
	}

	@Test
	public void obtain_digits_from_telephone_number() {
		String telephoneNumber = CharMatcher.inRange('0', '9').retainFrom("123-456-7890");
		assertThat("1234567890", equalTo(telephoneNumber));
		// worried about performance
		CharMatcher digits = CharMatcher.inRange('0', '9').precomputed();
		String teleNumber = digits.retainFrom("123-456-7890");
		assertThat("1234567890", equalTo(teleNumber));
	}

	@Test
	public void count_number_of_matching_chars() {
		int numberOfDigits = CharMatcher.DIGIT.countIn("123-LevelUpLunch");
		assertThat(3, is(numberOfDigits));
	}

	@Test
	public void collapse_whitespace_dash() {
		String address = "505 Williams Street";
		String addressWithDash = CharMatcher.WHITESPACE.collapseFrom(address, '-');
		assertThat("505-Williams-Street", equalTo(addressWithDash));
	}

}
