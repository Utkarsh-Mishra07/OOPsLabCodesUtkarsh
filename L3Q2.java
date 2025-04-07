package codes;

import java.util.Scanner;

class EMPLOYEEClass {
    String Ename;
    int Eid;
    double Basic, DA, Gross_Sal, Net_Sal;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        Eid = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        Ename = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        Basic = sc.nextDouble();
    }

    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.30 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    void display() {
        System.out.println("Employee ID: " + Eid);
        System.out.println("Name: " + Ename);
        System.out.println("Basic: ₹" + Basic);
        System.out.println("DA: ₹" + DA);
        System.out.println("Gross Salary: ₹" + Gross_Sal);
        System.out.println("Net Salary: ₹" + Net_Sal);
    }
}

public class L3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        EMPLOYEEClass[] employees = new EMPLOYEEClass[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            employees[i] = new EMPLOYEEClass();
            employees[i].read();
            employees[i].compute_net_sal();
        }

        System.out.println("\n--- Employee Details ---");
        for (EMPLOYEEClass emp : employees) {
            emp.display();
        }
    }
}

