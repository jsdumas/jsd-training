package io.jsd.training.algorithms.practice.stringofcharacters.knuthmorrispratt;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public final class KmpStringMatcherTest {
	/* Test suite */

	@Test
	public void testEmpty() {
		test("", "");
		test("", "ab");
	}

	@Test
	public void testOneChar() {
		test("a", "a");
		test("a", "b");
	}

	@Test
	public void testRepeat() {
		test("aaa", "aaaaa");
		test("aaa", "abaaba");
		test("abab", "abacababc");
		test("abab", "babacaba");
	}

	@Test
	public void testPartialRepeat() {
		test("aaacaaaaac", "aaacacaacaaacaaaacaaaaac");
		test("ababcababdabababcababdaba", "ababcababdabababcababdaba");
	}

	@Test
	public void testRandomly() {
		for (int i = 0; i < 1000; i++) {
			String pattern = randomPattern();
			KmpStringMatcher mat = new KmpStringMatcher(pattern);
			mat.checkStructure();
			for (int j = 0; j < 100; j++)
				test(pattern, mat, randomText(pattern));
		}
	}

	/* Helper functions */

	private static String randomPattern() {
		StringBuilder sb = new StringBuilder();
		int steps = random.nextInt(10) + 1;
		for (int i = 0; i < steps; i++) {
			if (sb.length() == 0 || random.nextBoolean()) { // Add literal
				int len = random.nextInt(5) + 1;
				for (int j = 0; j < len; j++)
					sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
			} else { // Repeat prefix
				int len = random.nextInt(sb.length()) + 1;
				int reps = random.nextInt(3) + 1;
				if (sb.length() + len * reps > 1000)
					break;
				for (int j = 0; j < reps; j++)
					sb.append(sb.substring(0, len));
			}
		}
		return sb.toString();
	}

	private static String randomText(String pattern) {
		StringBuilder sb = new StringBuilder();
		int steps = random.nextInt(100);
		for (int i = 0; i < steps && sb.length() < 10000; i++) {
			if (random.nextDouble() < 0.7) { // Add prefix of pattern
				int len = random.nextInt(pattern.length()) + 1;
				sb.append(pattern.substring(0, len));
			} else { // Add literal
				int len = random.nextInt(30) + 1;
				for (int j = 0; j < len; j++)
					sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
			}
		}
		return sb.toString();
	}

	private static void test(String pattern, String text) {
		KmpStringMatcher mat = new KmpStringMatcher(pattern);
		mat.checkStructure();
		test(pattern, mat, text);
	}

	private static void test(String pattern, KmpStringMatcher mat, String text) {
		assertEquals(text.indexOf(pattern), mat.search(text));
	}

	private static Random random = new Random();
	private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
}
