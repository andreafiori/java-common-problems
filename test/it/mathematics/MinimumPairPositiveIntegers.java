package it.mathematics;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumPairPositiveIntegers {

	@Test
	public void testFindMinimumPositiveIntegers() {
		int input[] = { 11, 8 , 5 , 7 , 5 , 100 };

		assertEquals(MinimumPositiveIntegers.findProductPair(input), 25);
	}

}
