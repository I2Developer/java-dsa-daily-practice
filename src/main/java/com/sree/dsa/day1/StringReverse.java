package com.sree.dsa.day1;

import java.util.*;

/*
Problem: Reversing a string
Difficulty: Easy
Approach: Traverse the string once and place each character at position (n - 1 - i) into a char array, then convert it to a string.
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class StringReverse {
	public String reversingString(String inputString) {
		int strLen = inputString.length();
		char[] ch = new char[strLen];
		
		for(int i=0; i<strLen; i++) {
			ch[i] = inputString.charAt(strLen-1-i);
		}
		
		return new String(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid input string : ");
		String inputString = sc.nextLine();		// For sequence of words;
		
		StringReverse obj = new StringReverse();
		String outputString = obj.reversingString(inputString);
		System.out.println("The reversed string is : " + outputString);
		
		sc.close();
	}
}
