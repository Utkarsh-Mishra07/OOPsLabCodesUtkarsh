package codes;

class studentz{
	private int totalMarks;
	private int numberOfSubjects;
	studentz(int totalMarks, int numberOfSubjects){
		this.totalMarks= totalMarks;  
		this.numberOfSubjects =numberOfSubjects ;
	}
	void calculateAverage() {
		try{
			int avg = (int)(totalMarks/numberOfSubjects);
			System.out.println("Average:"+avg);
	}catch(ArithmeticException ae) {
		System.out.println("number of Subjects cannot be Zero!!!");
	}
}}
public class L10Q2 {
	public static void main(String[] args) {
		studentz stuz = new studentz(100,10);
		stuz.calculateAverage();
		studentz stuz1 = new studentz(100,0);
		stuz1.calculateAverage();
	}
}
