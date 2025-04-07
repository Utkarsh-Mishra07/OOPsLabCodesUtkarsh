package codes;
import java.util.*;

import java.util.Arrays;

public class L6Q1 {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter String");
        
        String str = sc.nextLine();
        int l = str.length();
        
        char[] ch = str.toCharArray();
        char[] reverse_ch = new char[l];
        
        for (int i = 0; i < l; i++) {
            reverse_ch[i] = ch[l - 1 - i]; 
        }
        
        char temp = ch[0];
        char[] alpha_ch = str.toLowerCase().toCharArray();
        char temp2 = alpha_ch[0];
        Arrays.sort(alpha_ch);
        boolean found = false;
        for(int i = 0; i < l && !found; i++) {
        	if(alpha_ch[i] == temp2) {
        		alpha_ch[i] = temp;
        		found = true;
        	}
        }
        
        String reverse_str = new String(reverse_ch);        
        
        int palindrome = str.compareToIgnoreCase(reverse_str);
        
        System.out.println("Enter 1 for Palindrome check, 2 for alphabetical order,"
        		+ " 3 for reversed string and any other number"
        		+ " for concatenation with reversed string");
        
        int response = sc.nextInt();
        
        if(response == 1) {
        	if (palindrome == 0) {
                System.out.println("String is a Palindrome");
            }else {
                System.out.println("String is not a Palindrome");
            }
        }else if(response == 2) {
        	System.out.print("The String in alphabetical order is: ");
            System.out.println(alpha_ch);
        }else if(response == 3) {
        	System.out.print("The Reversed String is: ");
            System.out.println(reverse_ch);
        }else {
        	System.out.print("Concatenated String is: ");
            System.out.print(str);
            System.out.println(new String(reverse_ch)); 
        }
    }
}
