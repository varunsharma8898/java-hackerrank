package com.varun.hackerrank;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Integer[][] userInput = getUserInput();

		// actual
		// expected

		// D M Y

		int fine = 0;

		// *** NOTES: Here int cast is used while comparing values.
		// The reason for that is Java ppl being super intelligent
		// cache the int values from -127 till 128.
		// And that is why the conditions simply fail if we dont cast
		// the int values before comparing them.
		// Another reason to hate Java, the piece of shit lang.

		// Check if actual year is greater than expected year
		if ((int) userInput[0][2] > (int) userInput[1][2]) {
			fine = 10000;
		}
		// if the year is same, check if actual month is greater than expected
		else if ((int) userInput[0][2] == (int) userInput[1][2]) {
			if (userInput[0][1] > userInput[1][1]) {
				fine = 500 * (userInput[0][1] - userInput[1][1]);
			} else if (userInput[0][1] == userInput[1][1]) {
				if (userInput[0][0] > userInput[1][0]) {
					fine = 15 * (userInput[0][0] - userInput[1][0]);
				}
			}
		}

		System.out.println(fine);
	}

	private static Integer[][] getUserInput() {
		Scanner userInput = null;
		try {
			userInput = new Scanner(System.in);
			Integer[][] something = new Integer[2][3];
			for (int i = 0; i < 2; i++) {

				// for (int j = 0; j < 3; j++) {
				// something[i][j] = userInput.nextInt();
				// }
				int j = 0;
				String[] str = userInput.nextLine().split(" ");
				for (String element : str) {
					something[i][j] = Integer.parseInt(element);
					j++;
				}
			}
			return something;
		} finally {
			userInput.close();
		}
	}
}
