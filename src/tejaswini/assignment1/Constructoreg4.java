package com.methods.constructors;
class ClassName{
	int x;
	ClassName(){
		System.out.println("Welome to class");
		
	}
	public ClassName(int x) {
		this.x = x;
		
	}
	public void display() {
		System.out.println("Number:"+x);
	}
}
public class Constructoreg4 {

	public static void main(String[] args) {
		ClassName  className1 = new ClassName();
		ClassName  className2 = new ClassName(10);
		className2.display();

	}

}

