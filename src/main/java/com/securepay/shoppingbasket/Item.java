package com.securepay.shoppingbasket;

public class Item {

	private String name;
	private int price;
	private int shipping;
	private int rating;
	private String category;

	public Item(String name, String category) {
		this.setName(name);
		this.setCategory(category);
	}
	
	public void setDetails(int price, int shipping, int rating) {
		this.setPrice(price);
		this.setRating(rating);
		this.setShipping(shipping);
	}

	public int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}

	public int getShipping() {
		return shipping;
	}

	private void setShipping(int shipping) {
		this.shipping = shipping;
	}

	public int getRating() {
		return rating;
	}

	private void setRating(int rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	private void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [price=" + price + ", shipping=" + shipping + ", rating=" + rating + ", category=" + category
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
