package com.coffeeDB.CoffeeShopDB.entity;

public class Users {
	private int userID;
	private String userName;
	
	public Users() {
		userID = 0;
		userName = "";
	}

	public Users(int userID, String userName) {
		super();
		this.userID = userID;
		this.userName = userName;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Users [userID=" + userID + ", userName=" + userName + "]";
	}

	
	
	
}
