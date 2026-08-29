package com.Mounika.assignment1;

import java.util.Scanner;

public class Car {
	String brand;
	double price;
	Car(String brand,double price){
		this.brand=brand;
		this.price=price;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a car brand: ");
		String brand=sc.nextLine();
		System.out.println("Enter car price: ");
		double price=sc.nextDouble();
		Car car=new Car(brand,price);
		System.out.println("Brand: " + car.brand);
		System.out.println("Price: " + car.price);
		sc.close();

	}

}
