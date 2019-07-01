package com.securepay.shoppingbasket;

import junit.framework.TestCase;

public class InventoryBuilderTest extends TestCase{

	public void testBuildInventory() {
		assertNotNull(new InventoryBuilder().buildInventory());
	}
	
	public void testInventoryCategoriesSize() {
		assertEquals(20, new InventoryBuilder().buildInventory().size());
	}
	
	public void testCategoryItems() {
		assertEquals(10, new InventoryBuilder().buildInventory().get("Category1").size());
	}
}
