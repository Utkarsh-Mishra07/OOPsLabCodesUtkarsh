package codes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class L2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter Date of Birth (dd-MM-yyyy): ");
        String dobInput = sc.nextLine();

        LocalDate dob = LocalDate.parse(dobInput, formatter);
        LocalDate retirementDate = dob.plusYears(60);

        System.out.println("Retirement Date: " + retirementDate.format(formatter));
        sc.close();
    }
}
