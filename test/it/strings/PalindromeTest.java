package it.strings;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import it.strings.Palindrome;

public class PalindromeTest {

	@Test
	public void testNumberIsPalindromeAsTrue() {
		assertTrue(Palindrome.isPalindromeNumber(11));
	}

	@Test
	public void testNumberIsPalindromeAsFalse() {
		assertFalse(Palindrome.isPalindromeNumber(21));
	}

	@Test
	public void testStringIsPalindromeAsTrue() {
		assertTrue(Palindrome.isPalindromeString("deified"));
	}

	@Test
	public void testStringIsPalindromeAsFalse() {
		assertFalse(Palindrome.isPalindromeString("word"));
	}
}
