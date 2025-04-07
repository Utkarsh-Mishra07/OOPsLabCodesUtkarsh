package codes;

class Employer{
	String eName;
	double salary;
	
	public Employer(String eName) {
		this.salary = 0;
		this.eName = eName;
	}
	
	void calculateSalary() {
		salary = 0;
	}
}

class FullTimeEMPLOYEE extends Employer{
	double bonus;
	double deductions;
	static final double hourlyRate = 1000;
	
	public FullTimeEMPLOYEE(String eName, double bonus, double deductions) {
		super(eName);
		this.bonus = bonus;
		this.deductions = deductions;
	}
	
	@Override
	public void calculateSalary() {
		super.calculateSalary();
		salary = 208*hourlyRate + bonus - deductions;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee: " + eName);
		System.out.println("Status: Full-time");
		System.out.println("Hours Worked: 208");
		System.out.println("Hourly Rate: " + hourlyRate);
		System.out.println("Salary: " + salary);
	}
}

class PartTimeEMPLOYEE extends Employer{
	int hoursWorked;
	static final double hourlyRate = 1000;
	
	public PartTimeEMPLOYEE(String eName, int hoursWorked) {
		super(eName);
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public void calculateSalary() {
		super.calculateSalary();
		salary = hoursWorked*hourlyRate;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee: " + eName);
		System.out.println("Status: Part-time");
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Hourly Rate: " + hourlyRate);
		System.out.println("Salary: " + salary);
	}
}

public class L7Q2 {

	public static void main(String[] args) {
		
		FullTimeEMPLOYEE e1 = new FullTimeEMPLOYEE("Athang", 10000, 2000);
		PartTimeEMPLOYEE e2 = new PartTimeEMPLOYEE("Kaustubh", 104);
		
		e1.calculateSalary();
		e1.displayEmployeeDetails();
		
		e2.calculateSalary();
		e2.displayEmployeeDetails();
	}
}
