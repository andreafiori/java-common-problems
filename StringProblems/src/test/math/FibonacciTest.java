package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void testFibonacciNumberAsOne() {
		assertEquals(Fibonacci.fibonacciNumber(1), 1);
	}
	
	@Test
	void testFibonacciNumberAsNull() {
		assertEquals(Fibonacci.fibonacciNumber(0), 0);
	}
	
	@Test
	void testFibonacciNumberTwo() {
		assertEquals(Fibonacci.fibonacciNumber(2), 1);
	}
	
	@Test
	void testFibonacciNumberN() {
		assertEquals(Fibonacci.fibonacciNumber(5), 5);
	}
	
	@Test
	void testIsOnFibonacciSequenceAsFalse() {
		assertFalse( Fibonacci.isOnFibonacciSequence(4) );
	}
	
	@Test
	void testIsOnFibonacciSequenceAsTrue() {
		assertTrue( Fibonacci.isOnFibonacciSequence(5) );
	}
}
