package codes;

class Building{
	String bName;
	int square_f;
	int stories;
	
	public Building(String bName, int square_f, int stories) {
		this.square_f = square_f;
		this.stories = stories;
		this.bName = bName;
	}
	
	public void displayBuildingDetails() {
		System.out.println("Square Footage: " + square_f);
		System.out.println("Stories: " + stories);
	}
}

class House extends Building{
	int bed = 0;
	int bath = 0;
	
	public House(String bName, int square_f, int stories) {
		super(bName, square_f, stories);
		compute();
	}
	
	public void compute(){
		bed = stories*3;
		bath = bed;
	}
	
	@Override
	public void displayBuildingDetails() {
		System.out.println("Building: " + bName);
		super.displayBuildingDetails();
		System.out.println("Bedrooms: " + bed);
		System.out.println("Bathrooms: " + bath);
	}
}

class School extends Building{
	int classes = 0;
	String grade;
	
	public School(String bName, int square_f, int stories, String grade) {
		super(bName, square_f, stories);
		this.grade = grade;
		compute();
	}
	
	public void compute() {
		classes = stories*3;
	}
	
	@Override
	public void displayBuildingDetails() {
		System.out.println("Building: " + bName);
		super.displayBuildingDetails();
		System.out.println("Grade: " + grade);
		System.out.println("Classrooms: " + classes);
	}
}

public class L7Q3 {

	public static void main(String[] args) {
		
		House b1 = new House("Shell Towers", 1500, 14);
		School b2 = new School("SVHS", 4000, 4, "High School");

		b1.displayBuildingDetails();
		
		b2.displayBuildingDetails();
	}
}
