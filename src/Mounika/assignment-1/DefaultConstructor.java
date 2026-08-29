package com.Mounika.assignment1;

import java.util.Scanner;
public class DefaultConstructor{
	DefaultConstructor(){
		System.out.println("Student object created");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DefaultConstructor student=new DefaultConstructor();
		sc.close();

	}

}