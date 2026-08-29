package com.Mounika.assignment1;
//void method:void method does not return any value.
import java.util.Scanner;

class VoidMethod{

	static void printName(String name) {
		System.out.println("Name: " + name);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		printName(name);
		sc.close();
	}
}	

