package codes;
import java.util.Scanner;

public class L1Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Bitwise addition using loop (no '+')
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        int sum = a;
        System.out.println("Sum using bitwise: " + sum);

        if ((sum & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}
