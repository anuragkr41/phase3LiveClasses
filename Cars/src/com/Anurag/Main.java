package com.Anurag;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(4, "Cheery Red", "Mercedez"); //values using parameterised constructor
		Car car2 = new Car();
		
		car2.setNoOfWheels(4);
		car2.setBrand("BMW");
		car2.setColor("Royal White");
		
		System.out.println(car.getBrand());
		System.out.println(car.getColor());
		System.out.println(car.getNoOfWheels());
		System.out.println(car.drive());
		System.out.println(car.park());
		
		
		
		System.out.println("\nCar 2\n");
		
		System.out.println(car2.getBrand());
		System.out.println(car2.getColor());
		System.out.println(car2.getNoOfWheels());
		System.out.println(car2.drive());
		System.out.println(car2.park());
		

	}

}
