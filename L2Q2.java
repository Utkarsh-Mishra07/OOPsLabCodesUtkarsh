package codes;

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 9-digit registration number: ");
        String regNo = sc.next();

        if (regNo.length() != 9) {
            System.out.println("Invalid registration number.");
        } else {
            String year = regNo.substring(0, 2);
            System.out.println("Year of joining: 20" + year);
        }

        sc.close();
    }
}
