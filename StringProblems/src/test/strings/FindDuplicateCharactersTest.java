package strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class FindDuplicateCharactersTest {

	@Test
	void testFindDuplicates() {
		Map<Character, Integer> mappedWord = FindDuplicateCharacters.mapWord("Programming");
		Map<Character, Integer> duplicatesMap = FindDuplicateCharacters.findDuplicates(mappedWord);

		Map<Character, Integer> expected = new HashMap<Character, Integer>();
		expected.put('r', 2);
		expected.put('g', 2);
		expected.put('m', 2);

		assertEquals(duplicatesMap.toString(), expected.toString());
	}

	@Test
	void testMapWord() {
		Map<Character, Integer> mappedWord = FindDuplicateCharacters.mapWord("Java");

		Map<Character, Integer> expected = new HashMap<Character, Integer>();
		expected.put('a', 2);
		expected.put('v', 1);
		expected.put('J', 1);

		assertEquals(mappedWord.toString(), expected.toString());
	}

}
