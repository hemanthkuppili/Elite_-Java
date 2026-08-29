package com.Mounika.assignment1;
//Return Method:A return method gives a value back using return.
import java.util.Scanner;

public class ReturnType {
	static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		int result=add(a,b);
		System.out.println("Sum = " + result);
		sc.close();


	}

}
