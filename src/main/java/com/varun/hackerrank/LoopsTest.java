package com.varun.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LoopsTest {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		int lines = userInput.nextInt();
		int a = 0, b = 0, n = 0;
		int i = 0;

		while (i < lines) {
			try {
				if (userInput.hasNext()) {
					String[] userLine = userInput.nextLine().split(" ");

					// String userLine = userInput.nextLine();
					// System.out.println("userLine = " + userLine);

					a = Integer.parseInt(userLine[0]);
					b = Integer.parseInt(userLine[1]);
					n = Integer.parseInt(userLine[2]);
				}

				// Check if constraints are passed
				if (0 <= a && a <= 50 && 0 <= b && b <= 50 && 1 <= n && n <= 15) {
					i++;
				}
			} catch (NumberFormatException e) {

			}

			// a+20b,a+20b+21b,......,a+20b+21b+...+2n−1b
			// 0≤a,b≤50
			// 1≤n≤15

			ArrayList<Integer> output = new ArrayList<Integer>();
			for (int incr = 0; incr < n; incr++) {

				int sumTotal = a;

				for (int innerIncr = 0; innerIncr <= incr; innerIncr++) {
					sumTotal += (int) Math.pow(2, innerIncr) * b;
				}

				output.add(sumTotal);

				// while (innerIncr < n) {
				// 	innerVal.add((int) Math.pow(2, innerIncr) * b);
				// 	innerIncr++;
				// }
				//
				// output.add(a + (int) Math.pow(2, incr) * b);
			}

			if (!output.isEmpty()) {
				Iterator<Integer> itr = output.iterator();
				while (itr.hasNext()) {
					int element = itr.next();
					System.out.print(element + " ");
				}
				System.out.println();
			}
		}
	}

}
