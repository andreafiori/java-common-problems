package it.mathematics;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckOddEvenTest {

	@Test
	public void testCheckOddEvenIsTrue() {
		assertTrue( CheckOddEven.check(2) );
	}

	@Test
	public void testCheckOddEvenIsFalse() {
		assertFalse( CheckOddEven.check(3) );
	}

}
