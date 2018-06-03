package mathematics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CheckSumFiveNumbersTest {

	@Test
	void testBruteForceWithNull() {
		int[] expected = { -2, -1, 0, 1, 2 };
		
		assertEquals(
			Arrays.toString(CheckSumFiveNumbers.bruteForce(0)),
			Arrays.toString(expected)
		);
	}

	@Test
	void testBruteForce() {
		int[] expected = { 1, 2, 3, 4, 5};
		
		assertEquals(
				Arrays.toString(CheckSumFiveNumbers.bruteForce(15)),
				Arrays.toString(expected)
				);
	}

	@Test
	void testBruteForceToReturnLessOnes() {
		int[] expected = { -1 };

		assertEquals(
			Arrays.toString(CheckSumFiveNumbers.bruteForce(18)),
			Arrays.toString(expected)
		);
	}

}
