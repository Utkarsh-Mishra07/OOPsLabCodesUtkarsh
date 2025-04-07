package codes;
class student{
	
	private String name;
	private int age;
	student(String name, int age){
		this.name = name;
		this.age = age;
	}
	void registerstudent() {
		if (age<18) {
			if(age>60) {
				throw new IllegalArgumentException("Access Denied!!!");
			}
		}
		else {
			System.out.println("Access Granted.");
		}
	}
}

public class L10Q3 {
	public static void main(String[] args) {
		student stu = new student("Utkarsh",18);
		stu.registerstudent();
	}
}
