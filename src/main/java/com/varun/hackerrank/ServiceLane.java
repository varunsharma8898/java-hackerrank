package com.varun.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		
/*
 ***** INCOMPLETE *****

8 5
2 3 1 2 3 2 3 3
0 3
4 6
6 7
3 5
0 7

 
1
2
3
2
1
*/		
		
		Scanner userInput = null;
		try {
			userInput = new Scanner(System.in);
			
			int serviceLength = userInput.nextInt();
			int testCases = userInput.nextInt();
			userInput.nextLine();
			
			System.out.println("serviceLength = " + serviceLength);
			System.out.println("testCases = " + testCases);
			
			ArrayList<Integer> serviceLane = new ArrayList<Integer>();
			for (String element: userInput.nextLine().split(" ")) {
				serviceLane.add(Integer.parseInt(element));
			}
			Integer[] varun = {2, 3, 1, 2, 3, 2, 3, 3};
			
			for (int i = 0; i < testCases; i++) {
				int start = userInput.nextInt();
				int end = userInput.nextInt();
				
				for (int j = start; j <= end; j++) {
					
				}
				
				userInput.nextLine();
			}
		}
		finally {
			userInput.close();
		}

	}

}
