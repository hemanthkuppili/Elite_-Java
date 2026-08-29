package assignment_1;
public class Car {
    String brand;
    double price;
    Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Car c = new Car("Toyota", 1500000);
        c.display();
    }
}