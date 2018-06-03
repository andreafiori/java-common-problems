package mathematics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mathematics.ArmstrongNumber;

class ArmstrongNumberTest {

	@Test
	void testIsArmstrongNumberWithOneDigit() {
		assertFalse( ArmstrongNumber.isArmstrongNumber(1) );
	}

	@Test
	void testIsArmstrongNumberWithTwoDigits() {
		assertFalse( ArmstrongNumber.isArmstrongNumber(11) );
	}
	
	@Test
	void testIsArmstrongNumberAsTrue() {
		assertTrue( ArmstrongNumber.isArmstrongNumber(153) );
	}
	
	@Test
	void testIsArmstrongNumberAsTrue2() {
		assertTrue( ArmstrongNumber.isArmstrongNumber(371) );
	}
	
	@Test
	void testIsArmstrongNumberAsFalse() {
		assertFalse( ArmstrongNumber.isArmstrongNumber(154) );
	}

}
