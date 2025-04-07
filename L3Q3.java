package codes;

import java.util.Arrays;
import java.util.Scanner;

class Mixer {
    private int no1;
    private int no2;
    private int arr1[];
    private int arr2[];

    public Mixer(int no1, int no2) {
        this.no1 = no1;
        this.no2 = no2;
        this.arr1 = new int[no1];
        this.arr2 = new int[no2];
    }

    public void accept(int arr1[], int arr2[]) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public int[] mix() {
        int mergedArr[] = new int[no1 + no2];
        int i = 0, j = 0, k = 0;

        while (i < no1) {
            mergedArr[k++] = arr1[i++];
        }

        while (j < no2) {
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
    }

    public void display(int mergedArr[]) {
        System.out.println("The merged array is: " + Arrays.toString(mergedArr));
    }
}

public class L3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrays:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int array1[] = new int[n1];
        int array2[] = new int[n2];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }
 
        Arrays.sort(array1);
        Arrays.sort(array2);

        Mixer mixing = new Mixer(n1, n2);
        mixing.accept(array1, array2);
  
        int mergedArr[] = mixing.mix();

        mixing.display(mergedArr);
        
        sc.close();
    }
}
