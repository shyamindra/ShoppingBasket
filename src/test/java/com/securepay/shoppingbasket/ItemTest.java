package com.securepay.shoppingbasket;

import junit.framework.TestCase;

public class ItemTest extends TestCase {

	public void testItemCreation() {
		Item item = new Item("It1", "CatA");
		assertNotNull(item);
	}
	
	public void checkItemDetails() {
		Item item = new Item("It1", "CatA");
		item.setDetails(10, 5, 2);
		assertEquals(10, item.getPrice());
		assertEquals(5, item.getShipping());
		assertEquals(2, item.getRating());
		assertEquals("CatA", item.getCategory());
	}
	
}
