package com.sree.dsa.day4;

import java.util.Scanner;

/*
Problem: sum of digits
Difficulty: Easy
Approach: split the digits and add them
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class SumOfDigits {
	
	public int sumOfDigits(int input) {
		int temp = 0, sum = 0;
		
		input = Math.abs(input);
		while(input > 0) {
			temp = input%10;
			input /= 10;
			sum += temp;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		SumOfDigits obj = new SumOfDigits();
		int sumOfDigits = obj.sumOfDigits(num);
		
		System.out.print("The sum of digits from given number is : " + sumOfDigits);
		
		sc.close();
	}

}
