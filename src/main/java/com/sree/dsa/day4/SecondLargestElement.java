package com.sree.dsa.day4;

import java.util.*;

/*
Problem: second largest in an array
Difficulty: Easy
Approach: split the digits and add them
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class SecondLargestElement {
	public int secondLargest(int[] array) {
		int tempVar;
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					tempVar = array[i];
					array[i] = array[j];
					array[j] = tempVar;
				}
			}
		}
		return array[array.length-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for length of an array : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the list of element in an array : ");
		int[] array = new int[num];
		for(int i=0; i<num; i++) {
			array[i] = sc.nextInt();
		}
		
		SecondLargestElement obj = new SecondLargestElement();
		int secondLargest = obj.secondLargest(array);
		
		System.out.print("The second largest number in an array is : " + secondLargest);
		
		sc.close();
	}
}
