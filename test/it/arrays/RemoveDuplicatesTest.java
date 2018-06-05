package it.arrays;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import java.util.List;

import org.junit.Test;

import it.arrays.RemoveDuplicates;

public class RemoveDuplicatesTest {

	@Test
	public void test() {
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
