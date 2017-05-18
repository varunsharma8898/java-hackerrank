package com.varun.hackerrank;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner userInput = null;
		try {
			userInput = new Scanner(System.in);
			int n = Integer.parseInt(userInput.nextLine());
			int minReqd = 0;
			for (int i = 0; i < n; i++) {
				String[] arr1 = new String[2];
				arr1 = userInput.nextLine().split(" ");
				
				minReqd = Integer.parseInt(arr1[1]);
				
				int totalBefore = 0;
				for (String element : userInput.nextLine().split(" ")) {
					int entry = Integer.parseInt(element);
					if (entry <= 0) {
						totalBefore++;
					}
				}
				if (totalBefore >= minReqd) {
					System.out.println("NO");
				}
				else {
					System.out.println("YES");
				}
			}
		}
		finally {
			userInput.close();
		}

	}

}
