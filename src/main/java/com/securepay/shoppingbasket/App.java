package com.securepay.shoppingbasket;

/*
 * Application Driver
 */
public class App {
	public static void main(String[] args) {
		BasketBuilder basketBuilder = new BasketBuilder();
		basketBuilder.printBasketItems(new InventoryBuilder().buildInventory());
	}
}
