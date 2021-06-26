package com.Anurag;

import java.util.Scanner;

public class Car extends Vehicle {

//	Create a constructor for the class...
	public Car(int noOfWheels, String color, String brand) {
		super(noOfWheels, color, brand);

	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return "Car is in driving mode";
	}

	@Override
	public String park() {
		// TODO Auto-generated method stub
		return "Car is in park mode";
	}

}

/*
 * 1. To create two Java classes. Class 'Vehicle' and 'Car'. One of them will be
 * an abstract class and the other one will extend the abstract class. 2. The
 * abstract class will have two abstract functions - 'drive' and 'park'. And it
 * will have data members: noOfWheels, colour, brand. 3. The child class will
 * override the abstract functions and print the appropriate message as concrete
 * implementation.
 * 
 * from Akash Das to All Participants: 4. In the child class, assign values to
 * the inherited data members via a parameterized constructor. BONUS - In
 * addition to the parameterized constructor, find a way to create an object of
 * the implementing class without any parameters and to assign values via
 * functions. from Anurag Kumar to All Participants: data members color and
 * brand is for abstaract class?
 */