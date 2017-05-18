package com.varun.hackerrank;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class JumpingGame {

	
/*

4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0

 */
	
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		int testCases = userInput.nextInt();
		for (int testCase = 0; testCase < testCases; testCase++) {
			int arrLen = userInput.nextInt();
			int jump = userInput.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			int roadBlock = 0;
			int maxLen = 0;
			for (int i = 0; i < arrLen; i++) {
				int element = userInput.nextInt();
				arr.add(element);
			}

			boolean isWinnable = false;
			isWinnable = jumpOrWalkToWin(arr, jump, 0, 0);
			
			if (isWinnable) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		userInput.close();
	}

/*
 *  you can move from position x to x+1, x−1 or x+m in one move.
 *  The new position must contain 0. Also you can move to any position greater than n-1.
 *  You can't move backward from position 0.
 *  If you move to any position greater than n−1, you win the game.
 */
	private static boolean jumpOrWalkToWin(ArrayList<Integer> arr, int jump, int index, int previousIndex) {

		boolean isWinnable = false;
		
//		int element = arr.get(index);
		
		// Move to next position
		if (index < arr.size()) {
			if (
				index + 1 == arr.size()
				|| index + jump > arr.size()
			) {
				return true;
			}
			else if (
				index + 1 < arr.size()
				&& arr.get(index + 1) == 0
				&& index >= previousIndex
			) {
				return jumpOrWalkToWin(arr, jump, index+1, index);
			}
			else if (
				index + jump < arr.size()
				&& arr.get(index + jump) == 0
			) {
				return jumpOrWalkToWin(arr, jump, index+jump, index);
			}
			else if (
				index >= previousIndex
				&& index > 0
				&& arr.get(index - 1) == 0
			) {
				return jumpOrWalkToWin(arr, jump, index-1, index);
			}
		}
		else if (index >= arr.size()) {
			isWinnable = true;
		}
		else {
			isWinnable = false;
		}
		
		return isWinnable;
	}
}
