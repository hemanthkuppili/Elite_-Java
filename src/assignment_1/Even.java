package assignment_1;

public class Even {
	static boolean isEven(int n) {
		return n%2==0;
	}
	public static void main(String[] args) {
		if(isEven(8))
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
