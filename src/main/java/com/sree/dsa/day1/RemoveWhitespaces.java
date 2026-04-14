package com.sree.dsa.day1;

import java.util.Scanner;

/*
Problem: Remove white spaces in a string
Difficulty: Easy
Approach: Traverse the string once and compare it with space char and remove it
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class RemoveWhitespaces {
	
	public String removeSpaces(String inputString) {
		
		StringBuilder str = new StringBuilder();
		
		for(int i=0; i<inputString.length(); i++) {
			if(inputString.charAt(i) == ' ') {
				continue;
			}
			else {
				str.append(inputString.charAt(i));
			}
		}
		
		return new String(str);
//		return new String(inputString.replace(" ", ""));		// Using Built-in methods, use only this line;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid input string : ");
		String inputString = sc.nextLine();		// For sequence of words;
		
		RemoveWhitespaces obj = new RemoveWhitespaces();
		String outputString = obj.removeSpaces(inputString);
		System.out.println("The modified string is : " + outputString);
		
		sc.close();
	}

}
