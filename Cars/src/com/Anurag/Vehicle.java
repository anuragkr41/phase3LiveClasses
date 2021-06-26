package com.Anurag;

public abstract class Vehicle {
	
	
//	Declare the methods
	public abstract String drive();
	public abstract String park();
	
	//declare the fields
	private int noOfWheels;
	private String color;
	private String brand;
	
	
	
	
	//Bonus: Getter and Setters
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	//Create a constructor
	public Vehicle(int noOfWheels, String color, String brand) {
		super();
		this.noOfWheels = noOfWheels;
		this.color = color;
		this.brand = brand;
	}
	public Vehicle() {
		super();
	}
	
	
	
	

}
