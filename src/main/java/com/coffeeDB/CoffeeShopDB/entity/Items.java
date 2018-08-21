package com.coffeeDB.CoffeeShopDB.entity;

public class Items {
	private int itemID;
	private String name;
	private String description;
	private int quantity;
	private String price;
	
	public Items () {
		itemID = 0;
		name = "";
		description = "";
		quantity = 0;
		price = "";
	}

	public Items(int itemID, String name, String description, int quantity, String price) {
		super();
		this.itemID = itemID;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		
		
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [itemID=" + itemID + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
}
