package com.sree.dsa.day1;

import java.util.Scanner;

/*
Problem: Length of a string
Difficulty: Easy
Approach: Convert string to char array and iterate through elements and calculate the length;
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class StringLengthWithoutMethod {

	public int lengthOfString(String inputString) {
		char[] ch = inputString.toCharArray();		// string to char array
		
		int length = 0;
		for(char x : ch) {		// iterate through each value in a loop
			length++;
		}
		
		return length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid input string : ");
		String inputString = sc.nextLine();		// For sequence of words;
		
		StringLengthWithoutMethod obj = new StringLengthWithoutMethod();
		int stringLength = obj.lengthOfString(inputString);
		System.out.println("The length of string is : " + stringLength);
		
		sc.close();
	}

}
