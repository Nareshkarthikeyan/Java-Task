package functional;

import java.util.Scanner;

public class StringMethods {
	
	// File: StringMethods.java
		
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter String: ");
	        String str = sc.nextLine();

	    
	        System.out.println("Uppercase: " + str.toUpperCase());

	    
	        System.out.println("Lowercase: " + str.toLowerCase());

	       
	        System.out.println("Length: " + str.length());

	       
	        String reverse = new StringBuilder(str).reverse().toString();
	        System.out.println("Reverse: " + reverse);

	       
	        String check = str.equalsIgnoreCase(reverse) ? "Yes" : "No";
	        System.out.println("Palindrome: " + check);

	        
	        int vowels = 0;
	        String lower = str.toLowerCase();
	        for (int i = 0; i < lower.length(); i++) {
	            char c = lower.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                vowels++;
	            }
	        }
	        System.out.println("Vowels: " + vowels);
	        
	        sc.close();
	    }
	}
	
	


