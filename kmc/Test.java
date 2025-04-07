package edu.manipal.kmc;
import java.util.*;

import edu.manipal.mit.Student;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String name = sc.next();
		
		System.out.println("Enter Student Roll No: ");
		int roll = sc.nextInt();
		
		Student s1 = new Student(name, roll);
		s1.display();

	}

}
