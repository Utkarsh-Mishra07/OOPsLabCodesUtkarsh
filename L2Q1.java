package codes;

import java.util.Scanner;

public class L2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total distance traveled (in km): ");
        int distance = sc.nextInt();
        int fare = 0;

        if (distance <= 5) {
            fare = distance * 10;
        } else if (distance <= 20) {
            fare = (5 * 10) + (distance - 5) * 8;
        } else if (distance <= 45) {
            fare = (5 * 10) + (15 * 8) + (distance - 20) * 5;
        } else {
            fare = (5 * 10) + (15 * 8) + (25 * 5) + (distance - 45) * 5;
        }

        System.out.println("Total Fare: ₹" + fare);
        sc.close();
    }
}

