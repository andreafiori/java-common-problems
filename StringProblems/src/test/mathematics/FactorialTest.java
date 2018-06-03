package mathematics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void testFactorial() {
		assertEquals(Factorial.factorial(4), 24);
	}
	
	@Test
	void testFact() {
		assertEquals(Factorial.fact(3), 6);
	}

}
