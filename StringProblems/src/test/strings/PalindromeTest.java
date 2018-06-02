package strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
	
	@Test
	public void testNumberIsPalindromeAsTrue() {
		assertTrue( Palindrome.isPalindromeNumber(11) );
	}
	
	@Test
	public void testNumberIsPalindromeAsFalse() {
		assertFalse( Palindrome.isPalindromeNumber(21) );
	}
	
	@Test
	public void testStringIsPalindromeAsTrue() {
		assertTrue( Palindrome.isPalindromeString("deified") );
	}
	
	@Test
	public void testStringIsPalindromeAsFalse() {
		assertFalse( Palindrome.isPalindromeString("word") );
	}
}
