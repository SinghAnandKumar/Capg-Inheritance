package com.simulationdemo;

public class Animal {
	private String type;
	private String location;
	
//	public Animal() {
//		// TODO Auto-generated constructor stub
//	}
	
	public Animal(String type, String location) {
		this.type = type;
		this.location = location;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void roam()
	{
		System.out.println("inside roam of animal");
	}
}
