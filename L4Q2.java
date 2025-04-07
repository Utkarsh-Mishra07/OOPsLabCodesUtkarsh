package codes;

import java.util.Scanner;

class EMPLOYEEE {
	private String Ename;
    private double Eid;
    private double Basic;
    private double DA;
    private double Gross_Sal;
    private double Net_Sal;
    private double IT;

    public EMPLOYEEE(String Ename, double Eid, double Basic) {
        this.Ename = Ename;
        this.Eid = Eid;
        this.Basic = Basic;
    }

    public EMPLOYEEE() {
        this.DA = 0;
        this.Gross_Sal = 0;
        this.Net_Sal = 0;
        this.IT = 0;
    }
    
    public void display() {
        System.out.println("Name: " + Ename);
        System.out.println("ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("Net Salary: " + Net_Sal);
    }
    
    public void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = DA + Basic;
        IT = 0.3 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }
}

public class L4Q2 {
    public static void main(String[] args) {
        System.out.println("Enter number of employees:");
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.println("Enter employee name, ID, and basic salary:");
            String name = sc.next();
            double id = sc.nextDouble();
            double basic = sc.nextDouble();
            
            EMPLOYEEE employee = new EMPLOYEEE(name, id, basic);
            employee.compute_net_sal();
            employee.display();
        }
        
        sc.close();
    }
}