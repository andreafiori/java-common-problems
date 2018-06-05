package it.mathematics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import it.mathematics.ReverseNumber;

public class ReverseNumberTest {

	@Test
	public void testReverse() {
		assertEquals(ReverseNumber.reverse(21), 12);
	}

	@Test
	public void testReverseWithThreeDigits() {
		assertEquals(ReverseNumber.reverse(124), 421);
	}

	@Test
	public void testReverseToFail() {
		assertNotEquals(ReverseNumber.reverse(21), 21);
	}

}
