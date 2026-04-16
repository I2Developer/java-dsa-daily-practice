package com.sree.dsa.day4;

import java.util.Scanner;

/*
Problem: Search an element from an array
Difficulty: Easy
Approach: traverse the array and search the value
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class LinearSearch {
	
	public int searchElement(int[] array, int searchNumber) {
		for(int i=0; i<array.length; i++) {
			if(array[i] == searchNumber) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for length of an array : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the list of element in an array : ");
		int[] array = new int[num];
		for(int i=0; i<num; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("Enter a number to search : ");
		int searchNumber = sc.nextInt();
		
		LinearSearch obj = new LinearSearch();
		int elementIndex = obj.searchElement(array, searchNumber);
		
		if(elementIndex == -1) {
			System.out.println("There is no such element present in an array");
		}
		else {
			System.out.print("The element " + searchNumber + " is present in index : " + elementIndex);
		}
		
		sc.close();
	}

}
