package codes;

class studentclass{
	
	 String sName;
	 int marks;
	 int assignment;
	 int total_marks;
	 float average;
	
	public studentclass(String sName, int marks, int assignment) {
		this.sName = sName;
		this.marks = marks;
		this.assignment = assignment;
	}
	
	public void compute() {
		total_marks = marks + assignment;
		average = total_marks/2;
	}
}

class ScienceStudent extends studentclass{
	int practicalMarks;
	
	public ScienceStudent(String sName, int practical, int marks, int assignment) {
		super(sName, marks, assignment);
		this.practicalMarks = practical;
		compute();
	}
	
	@Override
	public void compute() {
		super.compute();
		total_marks = marks + assignment + practicalMarks;
		average = total_marks/3;
	}
	
	public void displayPracticalMarks() {
		System.out.println("The Practcial Marks: " + practicalMarks);
	}
	
	public void display() {
		System.out.println("Student: " + sName);
		System.out.println("Total Marks: " + total_marks);
		System.out.println("Average Marks: " + average);
	}
}

class ArtsStudent extends studentclass{
	String elective;
	
	public ArtsStudent(String sName, String elective_s, int marks, int assignment) {
		super(sName, marks, assignment);
		elective = elective_s;
		compute();
	}
	
	@Override
	public void compute() {
		super.compute();
		total_marks = marks + assignment;
		average = total_marks/2;
	}
	
	public void display() {
		System.out.println("Student: " + sName);
		System.out.println("Total Marks: " + total_marks);
		System.out.println("Average Marks: " + average);
		System.out.println("Elective Subject: " + elective);
	}
}

public class L7Q1 {

	public static void main(String[] args) {
		
		ScienceStudent s1 = new ScienceStudent("Athang", 10, 50, 10);
		ArtsStudent s2 = new ArtsStudent("Kaustubh", "English", 50, 10);
		
		studentclass studentRef;
	
		s1.display();
		s1.displayPracticalMarks();
	
		s2.display();
	}
}
