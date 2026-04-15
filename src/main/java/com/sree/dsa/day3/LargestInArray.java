package com.sree.dsa.day3;

import java.util.Scanner;
import com.sree.dsa.day2.WordsInString;

/*
Problem: Largest/Smallest in an array
Difficulty: Easy
Approach: Traverse through the array and find the largest one
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class LargestInArray {
	
	public int largestValue(int[] inputArray) {
		int largest = inputArray[0];
		int smallest = inputArray[0];
		
		for(int i=1; i<inputArray.length; i++) {
			if(inputArray[i] > largest) {
				largest = inputArray[i];
			}
//			if(inputArray[i] < smallest) {
//				smallest = inputArray[i];
//			}
		}
		
		return largest;			// for largest;
//		return smallest;		for smallest
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array : ");
		
		int n = sc.nextInt();
		System.out.print("Enter a valid input array with " + n + " elements : ");
		
		int[] inputArray = new int[n];
		
		for(int i=0; i<n; i++) {
			inputArray[i] = sc.nextInt();
		}
		
		LargestInArray obj = new LargestInArray();
		int largest = obj.largestValue(inputArray);
		
		System.out.println("The largest number from given array is : " + largest);
		
		sc.close();
	}

}
