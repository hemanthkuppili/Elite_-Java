package com.Mounika.assignment1;
import java.util.Scanner;

public class Square {
	static int square(int n) {
		return n*n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int result=square(n);
		System.out.println(result);
		sc.close();

	}

}
