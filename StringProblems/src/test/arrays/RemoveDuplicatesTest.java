package arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

	@Test
	void test() {
		List<String> cityList = new ArrayList<>();
		cityList.add("Delhi");
		cityList.add("Mumbai");
		cityList.add("Bangalore");
		cityList.add("Chennai");
		cityList.add("Kolkata");
		cityList.add("Mumbai");

		cityList = RemoveDuplicates.removeFromListOfString(cityList);
		
		assertEquals(cityList.size(), 5);
	}

}
