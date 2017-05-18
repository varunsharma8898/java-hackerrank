package com.varun.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {

		/**
		 * Sample Input
		 * 3 2 3
		 * 1 2 3
		 * 0
		 * 1
		 * 2
		 * 
		 * Sample Output
		 * 2
		 * 3
		 * 1
		 **/

		Scanner userInput = new Scanner(System.in);
		int arrayLength = userInput.nextInt();
		int rotations = userInput.nextInt();
		int testCases = userInput.nextInt();
		
		userInput.nextLine();
		
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < arrayLength; i++) {
			array.add(userInput.nextInt());
		}

		for (int i = 0; i < rotations; i++) {
			int last = array.get(arrayLength - 1);
			array.remove(arrayLength - 1);
			array.add(0, last);
		}
		
		for (int i = 0; i < testCases; i++) {
			int index = userInput.nextInt();
			System.out.println(array.get(index));
		}
		
	}

}
