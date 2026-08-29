package assignment_1;
public class Even {
	   public  static void isEven(int n) {
	        if (n % 2 == 0) {
	            System.out.println(n + "is Even");
	        } else {
	            System.out.println(n + "is Odd");
	        }
	    }
	    public static void main(String[] args) {
	        isEven(8);
	    }
	}
