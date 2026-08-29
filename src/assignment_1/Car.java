package assignment_1;

public class Car {
	String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
	public static void main(String[] args) {
		 Car c= new Car("Audi", 100000);
		System.out.println("Brand: " + c.brand);
        System.out.println("Price: " + c.price);

	}

}
