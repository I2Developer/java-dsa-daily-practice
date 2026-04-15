package com.sree.dsa.day2;

import java.util.Scanner;

/*
Problem: Non-repeating characters in a string
Difficulty: Easy
Approach: traverse through char array and check first non-repeating character
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class NonRepeatingCharacter {
	
	public char firstNonRepeatingCharacter(String inputString) {
		char[] ch = inputString.toCharArray();
		
		boolean isRepeat = false;
		
		int length = inputString.length();
		for(int i=0; i<length-1; i++) {
			for(int j=i+1; j<length; j++) {
				if(ch[i] == ch[j]) {
					isRepeat = true;
					break;
				}
			}
			if(isRepeat == false) {
				return ch[i];
			}
			isRepeat = false;
		}
		return ' ';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid input string : ");
		String inputString = sc.nextLine();			// For sequence of words;
		
		NonRepeatingCharacter obj = new NonRepeatingCharacter();
		char nonRepeatChar = obj.firstNonRepeatingCharacter(inputString);
		
		System.out.println("The Non-Repeating character from the given string is : " + nonRepeatChar);
		
		sc.close();
	}

}
