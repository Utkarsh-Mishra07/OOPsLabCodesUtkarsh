package codes;

import java.util.Scanner;

class Bank_Account{
	private String Dname;
	private double acc_number;
	private String acc_type;
	private int acc_balance;
	static int r_interest = 7;
	private int deposit;
	private int withdraw;
	
	public Bank_Account(String name, double number, String type, int balance, int deposit, int withdraw ) {
		this.Dname = name;
		this.acc_number = number;
		this.acc_type = type;
		this.acc_balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	
	public Bank_Account() {
		Dname = "Unknown";
		acc_number = 0;
		acc_type = "Unknown";
		acc_balance = 0;
	}
	
	public void display() {
		System.out.println("Account Holder:"+ Dname);
		System.out.println("Account No:"+ acc_number);
		System.out.println("Account Type:"+ acc_type);
	}
	
	static void displayr() {
		System.out.println("Rate of interest:"+ r_interest);
	}
	
	public void amount_in(){
		acc_balance += deposit; 
		System.out.println("Account Balance: " + acc_balance);
	}
	
	public void amount_out() {
		if(withdraw > acc_balance) {
			System.out.println("Withdrawl Higher than Balance");
		}else {
			acc_balance -= deposit;
			System.out.println("Account Balance after Withdrawl: " + acc_balance);
		}
	}
}
public class L4Q3 {

	public static void main(String[] args) {
		System.out.println("Enter Number of Holders");
		Scanner sc = new Scanner(System.in);
		int holders = sc.nextInt();
		for(int i = 0; i < holders; i++) {
			System.out.println("Enter Holder's details");
			String name = sc.next();
			double number = sc.nextInt();
			String type = sc.next();
			int balance = sc.nextInt();
			System.out.println("Enter 1 for deposit and 2 for withdrawl");
			int decision = sc.nextInt();
			int depo = 0;
			int with = 0;
			if(decision == 1) {
				depo = sc.nextInt();
			}
			else if(decision == 2) {
				with = sc.nextInt();
			}
			else {
				System.out.println("Enter a valid option");
			}
			
			Bank_Account customer = new Bank_Account(name, number, type, balance, depo, with);
			
			if(decision == 1) {
				customer.display();
				customer.amount_in();
			}else if(decision == 2) {
				customer.display();
				customer.amount_out();			
			}
		}
		Bank_Account.displayr();
	}

}
