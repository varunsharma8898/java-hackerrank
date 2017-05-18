package com.varun.hackerrank;

import java.util.Scanner;

public class NegativeSubArrays {

	public static void main(String[] args) {

		int[] arr = getUserInput();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum < 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static int[] getUserInput() {
		Scanner userInput = null;
		try {
			userInput = new Scanner(System.in);
			int number = userInput.nextInt();
			int[] arr = new int[number];

			for (int i = 0; i < number; i++) {
				arr[i] = userInput.nextInt();
			}
			return arr;
		} finally {
			userInput.close();
		}
	}
}
