package io.jsd.training.guava.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import com.google.common.base.CaseFormat;

public class CaseFormatTest {

	@Test
	public void whenCaseFormatLowerCamelThen() {
		String stringToConvert = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, "studentName");
		assertThat(stringToConvert, equalTo("STUDENT_NAME"));
	}

	@Test
	public void whenCaseFormatUpperUnderscoreThen() {
		String stringToConvert = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "STUDENT_NAME");
		assertThat(stringToConvert, equalTo("studentName"));
	}

	@Test
	public void whenCaseFormatLowerHyphenThen() {
		String stringToConvert = CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, "student-name");
		assertThat(stringToConvert, equalTo("StudentName"));
	}

	@Test
	public void whenCaseFormatUpperCamelThen() {
		String stringToConvert = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, "StudentName");
		assertThat(stringToConvert, equalTo("student-name"));
	}

}
