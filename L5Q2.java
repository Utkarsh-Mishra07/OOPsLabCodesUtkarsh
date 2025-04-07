package codes;
import java.util.*;

class EMPLOYEE{
	private String eName;
	private int salary;
	private int number;
	private Department departments[];
	
	public EMPLOYEE(int number) {
		this.eName = "";
		this.salary = 0;
		this.number = number;
		departments = new Department[number];
		assign1();
		for(int i = 0; i < number; i++) {
			departments[i] = new Department();
			departments[i].assign2();
		}
	}
	
	public void assign1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		eName = sc.next();
		System.out.println("Enter Salary: ");
		salary = sc.nextInt();
	}
	
	public void display1() {
		System.out.println("Employee Name: " + eName);
		System.out.println("Salary: " + salary);
	}
	
	class Department{
		private String dname;
		private String loc;
		
		public Department() {
			this.dname = "";
			this.loc = "";
		}
		
		public void assign2() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Department Name");
			dname = sc.nextLine();
			System.out.println("Enter Location");
			loc = sc.next();
		}
		
		public void display2() {
			System.out.println("Department Name: " + dname);
			System.out.println("Location: " + loc);
		}
	}
	
	public void add_d(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter New Department Name: ");
		String newdname = sc.nextLine();
		System.out.println("Enter Location");
		String location = sc.next();
		
		Department new_d = new Department();
		new_d.dname = newdname;
		new_d.loc = location;
		
		departments = Arrays.copyOf(departments, number+1);
		departments[number] = new_d;
		number++;
	}
	
	public void displayd(){
		for(int i = 0; i < number; i++) {
			departments[i].display2();
		}
	}
}

public class L5Q2 {
    public static void main(String[] args) {
    	System.out.println("Enter the Number of Departments the Employee holds: ");
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	
    	EMPLOYEE employee = new EMPLOYEE(num);
    	employee.display1();
    	employee.displayd();
    	System.out.println("Do you want to add departments or not? 1 for yes, 2 for no: ");
    	int response = sc.nextInt();
    	if(response == 1) {
    		System.out.println("How Many: ");
    		int more = sc.nextInt();
    		employee.display1();
    		for(int i = 0; i < more; i++) {
    			employee.add_d();
    		}
    	}else {
    		System.out.println("The Departments are printed");
    	}
    	employee.displayd();
    }
}