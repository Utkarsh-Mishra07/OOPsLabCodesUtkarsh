package codes;
import java.util.*;

class STUDENT {
    private int number;
    private Subject subjects[];

    public STUDENT(int number) {
        this.number = number;
        subjects = new Subject[number];
        for (int i = 0; i < number; i++) {
            subjects[i] = new Subject(); 
            subjects[i].assign(); 
        }
    }

    class Subject {
        private String sub_name;
        private int marks;

        public Subject() {
            this.sub_name = "";
            this.marks = 0;
        }

        public void assign() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter subject name: ");
            sub_name = sc.next();
            System.out.println("Enter marks: ");
            marks = sc.nextInt();
        }

        public void display() {
            System.out.println("Subject: " + sub_name);
            System.out.println("Marks: " + marks);
        }
    }

    public void addSubject() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new subject name: ");
        String name = sc.next();
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        Subject newSubject = new Subject();
        newSubject.sub_name = name;
        newSubject.marks = marks;

        subjects = Arrays.copyOf(subjects, number + 1);
        subjects[number] = newSubject;
        number++;
    }

    public void displaySubjects() {
        for (int i = 0; i < number; i++) {
            subjects[i].display();
        }
    }
    
    public void computeAverage() {
        int total = 0;
        for (int i = 0; i < number; i++) {
            total += subjects[i].marks;
        }
        double average = (double) total / number;
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class L5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int num = sc.nextInt();
        STUDENT student = new STUDENT(num);
        student.displaySubjects();
        
        System.out.println("Do you want to add a subject? 1 for yes and 2 for no: ");
        int response = sc.nextInt();
        if(response == 1) {
        	System.out.println("How many: ");
        	int more = sc.nextInt();
        	for(int i = 0; i < more; i++) {
        		student.addSubject();
                student.displaySubjects();
        	}
        }else {
        	System.out.println("The Subjects are printed");
        }
        
        student.computeAverage();
    }
}
