package com.varun.hackerrank;

import java.util.Scanner;

public class EOFTest {

	public static void main(String[] args) {
		Scanner userInput = null;
		try {
			userInput = new Scanner(System.in);
			
			int line = 1;
			while (userInput.hasNextLine()) {
				System.out.println(line + " " + userInput.nextLine());
				line++;
			}
		}
		finally {
			userInput.close();
		}
	}
}
