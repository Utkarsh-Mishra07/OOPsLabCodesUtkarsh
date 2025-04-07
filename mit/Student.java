package edu.manipal.mit;

public class Student {
	
	String name;
	int roll;
	
	Student(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	
	void display(){
		System.out.println("Student Name: " + name);
		System.out.println("Student Roll No: " + roll);
	}
}
