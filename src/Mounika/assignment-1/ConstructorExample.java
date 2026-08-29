package com.Mounika.assignment1;
import java.util.Scanner;

public class ConstructorExample {
	ConstructorExample(){
		System.out.println("Default constructor is called");
		
	}
	ConstructorExample(int x){
		System.out.println("Parameterized constructor is called");
		System.out.println("Value of x: " + x);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		ConstructorExample obj1=new ConstructorExample();
		ConstructorExample obj2=new ConstructorExample(n);
		sc.close();

	}

	
}
