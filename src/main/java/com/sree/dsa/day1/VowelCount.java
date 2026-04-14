package com.sree.dsa.day1;

import java.util.Scanner;

/*
Problem: Number of Vowel & Consonant in a string
Difficulty: Easy
Approach: split the string and compare the char to find its vowel or consonant;
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class VowelCount {
	
	public int[] vowelConsonantCounter(String inputString) {
		
		int vowel = 0, consonant = 0;
		char[] ch = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};		// Vowel characters;
		
		char tempChar;
		int strLen = inputString.length();
		
		for(int i=0; i<strLen; i++) {		// This loop is for traversing String;
			
			tempChar = inputString.charAt(i);
			
			if((tempChar > 96 && tempChar < 123) || (tempChar > 64 && tempChar < 91)) {		// to check whether it's an alphabet
				
				boolean isVowel = false;
				
				for(char x : ch) {
					if(tempChar == x){
						// it's a vowel
						vowel++;
						isVowel = true;
						break;
					}
				}
				
				if(isVowel == false) {
					// it's a consonant
					consonant++;
				}
			}
		}
		
		int[] vowelsCount = new int[2];
		vowelsCount[0] = vowel;
		vowelsCount[1] = consonant;
		return vowelsCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid input string : ");
		String inputString = sc.nextLine();		// For sequence of words;
		
		VowelCount obj = new VowelCount();
		int outputString[] = obj.vowelConsonantCounter(inputString);
		System.out.println("The number of vowels present in the given string is : " + outputString[0]);
		System.out.println("The number of consonants present in the given string is : " + outputString[1]);
		System.out.println("The number of special characters present in the given string is : " + (inputString.length()-(outputString[0]+outputString[1])));
		
		sc.close();
	}

}
