package com.methods.constructors;
class Car{
	String brand;
	int price;
  Car(String brand,int price){
	this.brand= brand;
	this.price=price;
}
  public void display() {
	  System.out.println("Brand: "+brand);
	  System.out.println("Price: "+price);
  }
}

public class Constructoreg3 {

	public static void main(String[] args) {
		Car car = new Car("Bmw",100000);
		car.display();
		
		
	}

}
