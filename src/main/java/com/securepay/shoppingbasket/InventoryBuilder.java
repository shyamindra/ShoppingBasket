package com.securepay.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InventoryBuilder {

	/*
	 * Generates a Map of 20 Categories with each category having a List of 10 Items
	 */
	public Map<String, List<Item>> buildInventory() {
		List<String> categoryList = new ArrayList<String>();
		Map<String, List<Item>> inventoryMap = new HashMap<String, List<Item>>();
		for (int i = 0; i < 20; i++) {
			categoryList.add("Category" + (i + 1));
		}

		categoryList.stream().forEach(cat -> inventoryMap.put(cat, getRandomItems(cat)));
		return inventoryMap;
	}

	/*
	 * Generates a List of 10 items with Random prices, shipping cost and ratings
	 */
	public List<Item> getRandomItems(String category) {
		List<Item> items = new ArrayList<Item>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Item item = new Item("Item" + (i + 1) ,category);
			item.setDetails(random.nextInt(10) + 1, random.nextInt(4) + 2, random.nextInt(5) + 1);
			items.add(item);
		}
		return items;
	}
}
