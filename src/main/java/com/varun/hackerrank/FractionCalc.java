package com.varun.hackerrank;

import java.util.Scanner;

public class FractionCalc {

	public static void main(String[] args) {

		Integer[] intArray = getUserInput();
		
		calculateFractions(intArray);
	}

	private static void calculateFractions(Integer[] intArray) {
		double positive = 0;
		double negative = 0;
		double zeros = 0;
		double total = intArray.length;
		for (int num : intArray) {
			if (num > 0) {
				positive++;
			}
			else if (num == 0) {
				zeros++;
			}
			else if (num < 0) {
				negative++;
			}
		}
		
		if (total > 0) {
			System.out.printf("%.3f", positive / total);
			System.out.println();
			System.out.printf("%.3f", negative / total);
			System.out.println();
			System.out.printf("%.3f", zeros / total);
		}
	}

	private static Integer[] getUserInput() {
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
			
			return intArray;
		}
		finally {
			userInput.close();
		}
	}
}
