package assignment_1;

public class ClassName {
    ClassName() {
        System.out.println("Default constructor");
    }

    ClassName(int n) {
        System.out.println("Parameterized constructor");
        System.out.println(n);
    }
	public static void main(String[] args) {
		ClassName c1 = new ClassName();
        ClassName c2 = new ClassName(10);
	}

}
