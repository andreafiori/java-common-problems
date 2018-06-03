package mathematics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mathematics.ReverseNumber;

class ReverseNumberTest {

	@Test
	void testReverse() {
		assertEquals(ReverseNumber.reverse(21), 12);
	}
	
	@Test
	void testReverseWithThreeDigits() {
		assertEquals(ReverseNumber.reverse(124), 421);
	}
	
	@Test
	void testReverseToFail() {
		assertNotEquals(ReverseNumber.reverse(21), 21);
	}

}
