package com.methods.constructors;
class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name = name;
		this.age= age;
	}
	public void print() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
public class Constructoreg2 {
	public static void main(String[] args) {
		Student s1 = new Student("Hemanth",22);
		s1.print();
;
		
	}

}
