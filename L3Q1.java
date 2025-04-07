package codes;

import java.util.Scanner;

class STUDENTClass {
    String sname;
    int[] marks_array = new int[5];
    int total = 0;
    float avg;

    void assign() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        sname = sc.nextLine();
        System.out.println("Enter 5 subject marks:");
        for (int i = 0; i < 5; i++) {
            marks_array[i] = sc.nextInt();
        }
    }

    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = total / 5.0f;
    }

    void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("Marks: ");
        for (int mark : marks_array) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + avg);
    }
}

public class L3Q1 {
    public static void main(String[] args) {
        STUDENTClass s1 = new STUDENTClass();
        s1.assign();
        s1.compute();
        s1.display();
    }
}
