package com.sree.dsa.day1;

import java.util.Scanner;

/*
Problem: Palindrome
Difficulty: Easy
Approach: Reverse a string and compare input string with reversed string.
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class Palindrome {
	
	public String palindrome(String inputString) {
		/*	Using built-in methods
		StringBuilder string = new StringBuilder(inputString);
		string.reverse();
		return new String(string);
		*/
		
		int strLength = inputString.length();
		char[] ch = new char[strLength];
		
		for(int i=0; i<strLength; i++) {
			ch[i] = inputString.charAt(strLength-1-i);
		}
		
		return new String(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid input string : ");
		String inputString = sc.nextLine();		// For sequence of words;
		
		Palindrome obj = new Palindrome();
		String outputString = obj.palindrome(inputString);
		System.out.println("The reversed output string is : " + outputString);
		
		if(inputString.equals(outputString)) {
			System.out.println("Hence, the provided string is a palindrome");
		}
		else {
			System.out.println("So, the provided string is not a palindrome");
		}
		
		sc.close();
	}

}
