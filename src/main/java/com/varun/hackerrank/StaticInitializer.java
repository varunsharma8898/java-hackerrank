package com.varun.hackerrank;

import java.util.Scanner;

public class StaticInitializer {

	static boolean flag = false;
	static int B;
	static int H;

	static {
		Scanner userInput = new Scanner(System.in);
		B = userInput.nextInt();
		H = userInput.nextInt();
		userInput.close();

		try {
			if (B > 0 && H > 0) {
				flag = true;
			}
			else {
				throw new Exception("Breadth and height must be positive");
			}
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}
}
