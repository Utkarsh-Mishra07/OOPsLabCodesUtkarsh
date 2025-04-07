package codes;
import java.util.*;

class STUDENTTTT {
    private int number;
    private Student students[];

    Scanner sc = new Scanner(System.in);

    public STUDENTTTT(int number) {
        this.number = number;
        students = new Student[number];
        for (int i = 0; i < number; i++) {
            students[i] = new Student(); 
            students[i].assign();
            students[i].extractInitials();
            students[i].removeWhiteSpace();
        }
    }

    class Student {
        private String stu_name;
        private int marks;
        private String initials;
        private String without_space;

        public Student() {
            this.stu_name = "";
            this.marks = 0;
        }

        public void assign() {
            System.out.println("Enter Student name: ");
            stu_name = sc.nextLine();
            System.out.println("Enter marks: ");
            marks = sc.nextInt();
            sc.nextLine();
        }
        
        public void extractInitials() {
            if (stu_name.isEmpty()) { 
                initials = "";
                return;
            }

            char[] stu_array = stu_name.toCharArray();
            stu_array[0] = Character.toUpperCase(stu_array[0]);

            int i;
            boolean found = false;
            for (i = 1; i < stu_name.length(); i++) {
                if (stu_array[i - 1] == ' ') {
                    stu_array[i] = Character.toUpperCase(stu_array[i]); 
                    found = true;
                    break;
                }
            }

            if (found) {
                initials = "" + stu_array[0] + stu_array[i]; 
            } else {
                initials = "" + stu_array[0]; 
            }
        }

        
        public void removeWhiteSpace() {
            without_space = stu_name.replace(" ", "");
        }

        public void display() {
            System.out.println("Student: " + stu_name);
            System.out.println("Marks: " + marks);
            System.out.println("The Initials are: " + initials);
            System.out.println("Student name without Space: " + without_space); 
        }
    }

    public void displayStudents() {
        for (int i = 0; i < number; i++) {
            students[i].display();
        }
    }
    
    public void student_search(String search) {
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].stu_name.contains(search)) {
                System.out.println(students[i].stu_name);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student found with the given name.");
        }
    }
    
    public void alpha_order() {
    	String[] names_array = new String[students.length];
    	int l = names_array.length;
    	for(int i = 0; i < l; i++) {
    		names_array[i] = students[i].stu_name;
    	}
    	Arrays.sort(names_array);
    	for(int i = 0; i < l; i++) {
    		System.out.println(names_array[i]);
    	}
    }
}

public class L6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int num = sc.nextInt();
        sc.nextLine();
        STUDENTTTT student = new STUDENTTTT(num);
        student.displayStudents();
        System.out.println("Enter the Name to be searched:");
        String search = sc.nextLine();
        search += " ";
        System.out.println("Students Containing the Name: ");
        student.student_search(search);
        System.out.println("The Students in Alphabetical Order is: ");
        student.alpha_order();
    }
}
