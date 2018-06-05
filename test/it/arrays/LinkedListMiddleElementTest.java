package it.arrays;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import it.arrays.LinkedList;

public class LinkedListMiddleElementTest {

	@Test
	public void testFindMiddleElement() {
		LinkedList linkedList = new LinkedList();
		LinkedList.Node head = linkedList.head();
		linkedList.add(new LinkedList.Node("1"));
		linkedList.add(new LinkedList.Node("2"));
		linkedList.add(new LinkedList.Node("3"));
		linkedList.add(new LinkedList.Node("4"));

		// Finding middle element of LinkedList in single pass
		LinkedList.Node current = head;
		int length = 0;
		LinkedList.Node middle = head;

		while (current.next() != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.next();
			}
			current = current.next();
		}

		if (length % 2 == 1) {
			middle = middle.next();
		}

		assertEquals(length, 4);
		assertTrue(middle.toString() == "2");
	}
}
