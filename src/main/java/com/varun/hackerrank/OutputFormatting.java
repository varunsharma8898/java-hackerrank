package com.varun.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<String[]> userStuff = new ArrayList<String[]>();

		try {
			int incr = 1;
			while (incr < 4) {
				if (userInput.hasNextLine()) {
					String[] lineStuff = userInput.nextLine().split(" ");
					if (
						lineStuff[0].length() > 10
						|| lineStuff[1].length() > 3
					) {
						System.out.println("Incorrect input, please enter again.");
					}
					else {
						incr++;
						userStuff.add(lineStuff);
					}
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		printUserStuff(userStuff);
	}

	private static void printUserStuff(ArrayList<String[]> userStuff) {
		
		String repeatLine = String.format("%032d", 0).replace("0", "=");
		System.out.println(repeatLine);
		for (String[] userLine : userStuff) {
			int userInt = Integer.parseInt(userLine[1]);

			// Formatting tips:
			// %d for int
			// %f for floats
			// %s for strings
			// -15 for padding string to the right, without minus = pad to left
			// %3d = 3 digit, %03d = pad with zero to left, %-3d = pad to right

			System.out.printf("%-15.10s%03d\n", userLine[0], userInt);
		}
		System.out.println(repeatLine);
		
	}

}
