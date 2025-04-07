package codes;

import java.util.*;

interface Series {
    void getNext();        // Generate the next term in the series
    void reset();          // Reset the series
    void setStart(int x);  // Set the starting value of the series
}

class byTwos implements Series {
    private int x;  // Instance variable for the series

    public void getNext() {
        x += 2;  // Increment the series by 2
        System.out.println("Next Term: " + x);
    }

    public void reset() {
        x = 0;  // Reset the series to 0
        System.out.println("The series is reset.");
    }

    public void setStart(int x) {
        this.x = x;  // Update the instance variable
        System.out.println("The series will start from: " + x);
    }
}

public class L8Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms in the series: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the starting value (x): ");
        int x = sc.nextInt();

        byTwos series = new byTwos();
        series.setStart(x);

        for (int i = 0; i < n; i++) {
            series.getNext(); // Generate the next term
        }

        series.reset(); // Reset the series
    }
}