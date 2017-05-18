package com.varun.hackerrank;

import java.util.Scanner;

public class DiagonalDiff {

	public static void main(String[] args) {

		Integer[][] matrix = getUserInput();
		int sumLToR = 0;
		int sumRToL = 0;
		int j = matrix[0].length - 1;

		for (int i = 0; i < matrix[0].length; i++) {
			sumLToR += matrix[i][i];
			sumRToL += matrix[i][j];
			j--;
		}

		int diagDiff = Math.abs(sumRToL - sumLToR);
		System.out.println(sumLToR);
		System.out.println(sumRToL);
		System.out.println(diagDiff);
	}

	private static Integer[][] getUserInput() {
		Scanner userInput = null;		
		try {
			userInput = new Scanner(System.in);
			
			int n = Integer.parseInt(userInput.nextLine());
			
			Integer[][] matrix = new Integer[n][n];
			
			for (int i = 0; i < n; i++) {
				int j = 0;
				for (String element : userInput.nextLine().split(" ")) {
					matrix[i][j] = (Integer.parseInt(element));
					j++;
				}
			}
			return matrix;
		}
		finally {
			userInput.close();
		}
	}
}
