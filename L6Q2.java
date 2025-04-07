package codes;
import java.util.*;

class EMPLOYEEEE {
    
    private int number;
    private Employees[] employees;
    private char[] ch;
    private char[] ch1;

    public EMPLOYEEEE(int number) {
        this.number = number;
        employees = new Employees[number];

        for (int i = 0; i < number; i++) {
            employees[i] = new Employees();
            employees[i].assign1();
            employees[i].formatEmployeeName();
            employees[i].generateEmail();
        }
    }

    class Employees {
    	
    	private String eName;
        private int salary;
        private String email;
        
        public Employees() {
        	this.eName = "";
            this.salary = 0;
            this.email = "";
        }

        public void assign1() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee Name: ");
            eName = sc.nextLine();
            System.out.print("Enter Salary: ");
            salary = sc.nextInt();
        }

        public void formatEmployeeName() {
            ch = eName.toCharArray();
            int l = ch.length;
            for(int i = 0; i < l; i++) {
            	ch[i] = Character.toLowerCase(ch[i]);
            }

            for (int i = 0; i < l; i++) {
                if (i == 0 || ch[i - 1] == ' ') {
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            }
            ch1 = Arrays.copyOf(ch, l);
            eName = new String(ch1);
        }

        public void generateEmail() {
            
            char[] tempCh = eName.toLowerCase().toCharArray();
            
            String emailPrefix = "" + tempCh[0];

            for (int i = 1; i < eName.length(); i++) {
                if (eName.charAt(i - 1) == ' ') { 
                    emailPrefix += tempCh[i]; 
                }
            }
            email = emailPrefix + "@gmail.com";
        }

        public void display2() {
            System.out.println("Employees Name: " + eName);
            System.out.println("Salary: " + salary);
            System.out.println("The email assigned is: " + email);
        }
    }

    public void displaye() {
        for (int i = 0; i < number; i++) {
            employees[i].display2();
        }
    }
}

public class L6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Employees : ");
        int num = sc.nextInt();

        EMPLOYEEEE employee = new EMPLOYEEEE(num);
        employee.displaye();
        sc.close();
    }
}
