package codes;

import java.util.Scanner;

public class L1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();
        
        System.out.print("Enter hourly rate: ");
        double rate = sc.nextDouble();
        
        double salary;
        
        if (hours <= 40) {
            salary = hours * rate;
        } else {
            double overtime = hours - 40;
            salary = (40 * rate) + (overtime * rate * 1.5);
        }

        System.out.println("Total Salary: " + salary);
        sc.close();
    }
}
