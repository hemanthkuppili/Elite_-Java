package com.Mounika.assignment1;

import java.util.Scanner;

public class ParameterizedConstructor {
	String name;
	int age;
	ParameterizedConstructor(String name,int age){
		this.name=name;
		this.age=age;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		ParameterizedConstructor student=new ParameterizedConstructor(name,age);
		System.out.println("Name: " + student.name);
		System.out.println("Age: " + student.age);
		sc.close();

	}

}
