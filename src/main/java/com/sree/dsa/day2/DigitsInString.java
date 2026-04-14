package com.sree.dsa.day2;

import java.util.Scanner;

/*
Problem: Check only digits in a string
Difficulty: Easy
Approach: Traverse through char array and verify its digit nature
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class DigitsInString {
	
	public boolean stringHasOnlyDigits(String inputString) {
		char[] ch = inputString.toCharArray();
		
		for(char x : ch) {
			if(x < '0' || x > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid input string : ");
		String inputString = sc.nextLine();			// For sequence of words;
		
		DigitsInString obj = new DigitsInString();
		boolean isDigit = obj.stringHasOnlyDigits(inputString);
		
		if(isDigit) {		// true - only digits
			System.out.println("The String contains only digits");
		}
		else {
			System.out.println("The String contains non-digits");
		}
		
		sc.close();
	}

}
