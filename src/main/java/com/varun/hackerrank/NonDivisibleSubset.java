package com.varun.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

Sample Input

4 3
1 7 2 4

Sample Output

3
*/

public class NonDivisibleSubset {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		int arrayLen = userInput.nextInt();
		int divideBy = userInput.nextInt();
		userInput.nextLine();

		List<Integer> arr = new ArrayList<>();
		for (String s : userInput.nextLine().split(" ")) {
			arr.add(Integer.parseInt(s));
		}

		List<Integer> newArr = new ArrayList<>();
		for (int i = 0; i < arrayLen; i++) {
			for (int j = i + 1; j < arrayLen; j++) {
				if ((arr.get(i) + arr.get(j)) % divideBy != 0) {
					if (!newArr.contains(arr.get(i))) newArr.add(arr.get(i));
					if (!newArr.contains(arr.get(j))) newArr.add(arr.get(j));
				}
			}
		}
		System.out.println(newArr.size());
	}

}
