package com.varun.hackerrank;

import java.util.Scanner;

public class BigSumTest {

	public static void main(String[] args) {
		Scanner userInput = null;
		try {
			userInput = new Scanner(System.in);
			
			int number = userInput.nextInt();
			Integer[] intArray = new Integer[number];
			String[] userLine = null;
			userInput.nextLine();
			userLine = userInput.nextLine().split(" ");
			int i = 0;

			while (i < number) {
				intArray[i] = Integer.parseInt(userLine[i]);
				i++;
			}

			long sum = calculateSum(intArray);
			System.out.println(sum);
		}
		finally {
			userInput.close();
		}
	}

	private static long calculateSum(Integer[] intArray) {
		long sum = 0;
		
		int i = 0;
		try {
			while (i < intArray.length) {
				sum += intArray[i];
				i++;
			} 
		}
		catch (Exception e) {
			
		}
		return sum;
		
	}
}
