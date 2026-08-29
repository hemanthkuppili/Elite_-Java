package assignment_1;
public class DoubleConstructors {
    DoubleConstructors() {
        System.out.println("Default constructor is called");
    }
    DoubleConstructors(int x) {
        System.out.println("Parameterized constructor is called");
        System.out.println("Value of x: " + x);
    }
    public static void main(String[] args) {
        DoubleConstructors obj1 = new DoubleConstructors();
        DoubleConstructors obj2 = new DoubleConstructors(10);
    }
}