package codes;

import java.util.Scanner;

class STUDENTT{
	private String sname;
	private int marks_array[] = new int[3];
	private int total;
	private float avg;


	public STUDENTT(String sname, int marks_array[] ) {
		this.sname = sname;
		this.marks_array = marks_array;
	}
	public STUDENTT() {
		this.total = 0;
		this.avg = 0;
	}
	
	public void dislay() {
		System.out.println(sname);
		for(int i = 0; i < marks_array.length; i++) {
			System.out.println(marks_array[i]);
		}
		System.out.println(total);
		System.out.println(avg);
	}
	
	public void compute() {
		int total1 = 0;
		for(int i = 0; i < marks_array.length; i++) {
			total1 += marks_array[i];
		}
		total = total1;
		avg = total1/marks_array.length;
	}

}

public class L4Q1 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter number of subjects");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int marks[] = new int[number];
		for(int i = 0; i < number; i++) {
			marks[i] = sc.nextInt();
		}
		
		STUDENTT STUDENTT = new STUDENTT("Athang", marks);
		STUDENTT.compute();
		STUDENTT.dislay();

	}

}
