package strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import strings.ReverseString;

class ReverseStringTest {

	@Test
	void testReverse() {
		assertEquals(ReverseString.reverse("piano"), "onaip");
	}

}
