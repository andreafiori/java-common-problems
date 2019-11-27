package test.problems.math;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import com.problems.math.FirstPrimeNumbers;

public class FirstPrimeNumbersTest {

	@Test
	public void testGetFirstPrimeNumbers() {
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		expected.add(5);

		assertEquals(
			FirstPrimeNumbers.findFirsts(4),
			expected
		);
	}

}
