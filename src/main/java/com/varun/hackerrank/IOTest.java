package com.varun.hackerrank;

import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		Scanner userInput = null;
		try {
			userInput = new Scanner(System.in);
			int numberEntered = 0 ;
			Double doubleEntered = null;
			String stringEntered = null;
	
			String[] inputs = {"Int", "Double", "String"};
			for (String type : inputs) {
				
				// here not using userInput.nextInt() or nextDouble for a reason.
				// The reason for that is, nextInt or nextDouble or next*
				// doesn't consider \n and the last nextLine is missed.
				// So either fire a blank nextLine() or don't use nextInt or other similar methods.
				// More info on this page:
				//   stackoverflow.com/questions/13102045/skipping-nextline-after-using-next-nextint-or-other-nextfoo-methods
	
				try {
					String nextLine = userInput.nextLine();
	
					if (type.equals("Int")) {
						numberEntered = Integer.parseInt(nextLine);
					}
					else if (type.equals("Double")) {
						doubleEntered = Double.parseDouble(nextLine);
					}
					else if (type.equals("String")) {
						stringEntered = nextLine;
					}
					else {
						System.out.println("Incorrect input, expected " + type);
					}
				}
				catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
			System.out.println("String: " + stringEntered);
			System.out.println("Double: " + doubleEntered);
			System.out.println("Int: " + numberEntered);
		}
		finally {
			userInput.close();
		}
	}
}
