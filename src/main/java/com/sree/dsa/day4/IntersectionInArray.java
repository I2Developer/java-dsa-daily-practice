package com.sree.dsa.day4;

import java.util.Arrays;
import java.util.Scanner;

/*
Problem: Intersection in array elements
Difficulty: Easy
Approach: find the common elements in two array and return it.
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class IntersectionInArray {

	public int[] intersectionOfArrays(int[] array1,int[]  array2) {
		
		int k=0, len1 = array1.length, len2 = array2.length, len3 = (len1<len2)?len1:len2;
		int[] tempArray = new int[len3];
		for(int i=0; i<len1; i++) {		// Traversing through array 1
			for(int j=0; j<len2; j++) {		// Traversing through array 2
				if(array1[i] == array2[j]) {
					tempArray[k] = array1[i];		// temp array is for deciding its size
					k++;
					break;
				}
			}
		}
		int[] intersectionArray = new int[tempArray.length];		// Making new array with the found size
		for(int i=0; i<tempArray.length; i++) {
			intersectionArray[i] = tempArray[i];
		}
		return intersectionArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of elements in 1st array : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the list of element in an array : ");
		int[] array1 = new int[num1];
		for(int i=0; i<num1; i++) {
			array1[i] = sc.nextInt();
		}
		
		System.out.print("Enter a number of elements in 2nd array : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the list of element in an array : ");
		int[] array2 = new int[num2];
		for(int i=0; i<num2; i++) {
			array2[i] = sc.nextInt();
		}
		
		IntersectionInArray obj = new IntersectionInArray();
		int[] intersectionElements = obj.intersectionOfArrays(array1, array2);
		
		System.out.print("The intersection elements are : " + Arrays.toString(intersectionElements));
		
		sc.close();
	}

}
