package com.sree.dsa.day2;

import java.util.Scanner;

public class WordsInString {
	
	public int numberOfWordsInString(String inputString) {
		if(inputString.trim().isEmpty()) {
		    return 0;
		}
		return inputString.trim().split("\\s+").length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid input string : ");
		String inputString = sc.nextLine();			// For sequence of words;
		
		WordsInString obj = new WordsInString();
		int wordCount = obj.numberOfWordsInString(inputString);
		
		System.out.println("The Number of words in a given string is : " + wordCount);
		
		sc.close();
	}

}
