package com.securepay.shoppingbasket;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BasketBuilder {

	/*
	 * Generates a list of items from all the values in the Category Map
	 * 
	 * @param inventoryMap with List of Items as values
	 */
	public List<Item> getAllItems(Map<String, List<Item>> inventoryMap) {
		Collection<List<Item>> inventory = inventoryMap.values();
		List<Item> inventoryItems = new ArrayList<Item>();
		inventory.stream().forEach(items -> inventoryItems.addAll(items));
		return inventoryItems;
	}

	/*
	 * Method to pick items such that the sum of ratings are optimized this method
	 * sorts all the items in the inventory by a rating/price ratio
	 * This enables selecting the items with the most value in terms of rating
	 * 
	 */
	public List<Item> pickBasketItems(Map<String, List<Item>> inventoryMap) {
		List<Item> bucketList = new ArrayList<Item>();
		int cost = 0;	

		List<Item> inventoryItems = this.getAllItems(inventoryMap);
		inventoryItems.sort(new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o2.getRating()*o1.getPrice() - o1.getRating()*o2.getPrice();
			}

		});
		for (Item item : inventoryItems) {
			if (cost == 50) {
				break;
			} else if (cost + item.getPrice() < 50) {
				bucketList.add(item);
				cost += item.getPrice();
			}
		}
		return bucketList;
	}

	public void printBasketItems(Map<String, List<Item>> inventoryMap) {
		int cost = 0;
		int sumRatings = 0;
		for (Item item : this.pickBasketItems(inventoryMap)) {
			cost += item.getPrice();
			sumRatings += item.getRating();
			System.out.println(item.getCategory() + ":" + item.getName());
		}
		System.out.println("Total cost:" + cost);
		System.out.println("Sum of ratings:" + sumRatings);
	}

}
