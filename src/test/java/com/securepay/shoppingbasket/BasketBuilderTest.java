package com.securepay.shoppingbasket;

import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

public class BasketBuilderTest extends TestCase {

	public void testGetAllItems() {
		Map<String, List<Item>> inventoryMap = new InventoryBuilder().buildInventory();
		List<Item> invItems = new BasketBuilder().getAllItems(inventoryMap);
		assertNotNull(invItems);
		assertEquals(200, invItems.size());
	}
	
	public void testPickItems() {
		Map<String, List<Item>> inventoryMap = new InventoryBuilder().buildInventory();
		BasketBuilder basketBuilder = new BasketBuilder();
		assertNotNull(basketBuilder.pickBasketItems(inventoryMap));
	}
}
