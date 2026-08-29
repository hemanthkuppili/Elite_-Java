package com.methods.constructors;

public class Check {
	static void isEven(int n) {
		if(n%2==0) {
			System.out.println(n+" is Even");
		}else {
			System.out.println(n+" is Odd");
		}
	}

	public static void main(String[] args) {
		isEven(8);
	}

}
