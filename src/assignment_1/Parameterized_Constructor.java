package assignment_1;
class StudentAge {
    String name;
    int age;
    StudentAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Parameterized_Constructor{
    public static void main(String[] args) {
        StudentAge s = new StudentAge("Abhi", 19);
        System.out.println("Name: "+s.name);
        System.out.println("Age: "+s.age);
    }
}