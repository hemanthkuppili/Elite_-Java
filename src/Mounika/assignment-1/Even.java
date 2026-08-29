package com.Mounika.assignment1;
import java.util.Scanner;

public class Even {
	static void isEven(int n) {
		if(n % 2 == 0) {
			System.out.println(n + " is Even");
		}
		else {
			System.out.println(n + " is odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		isEven(n);
		sc.close();

	}

}
