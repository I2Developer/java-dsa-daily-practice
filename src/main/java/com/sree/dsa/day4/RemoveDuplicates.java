package com.sree.dsa.day4;

import java.util.ArrayList;
import java.util.Scanner;

/*
Problem: Remove duplicates in an array
Difficulty: Easy
Approach: Traverse through the array and find the duplicate and don't add it in new list
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class RemoveDuplicates {
	
	public ArrayList<Integer> removeDuplicatesInArray(ArrayList<Integer> inputArray) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for(int x : inputArray) {
			if(!arrList.contains(x)) {
				arrList.add(x);
			}
		}
		
		return arrList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array : ");
		
		int n = sc.nextInt();
		System.out.print("Enter a valid input array with " + n + " elements : ");
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			arrList.add(sc.nextInt());
		}
		
		RemoveDuplicates obj = new RemoveDuplicates();
		ArrayList<Integer> duplicatesRemoved = obj.removeDuplicatesInArray(arrList);
		
		System.out.print(duplicatesRemoved);
		
		sc.close();
	}

}
