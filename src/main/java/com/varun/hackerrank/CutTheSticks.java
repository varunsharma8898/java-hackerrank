package com.varun.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*
Sample Input 0

6
5 4 4 2 2 8

Sample Output 0

6
4
2
1
*/
public class CutTheSticks {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		int arrayLen = userInput.nextInt();
		userInput.nextLine();
		List<Integer> array = new ArrayList<Integer>();
		for (String s : userInput.nextLine().split(" ")) {
			array.add(Integer.parseInt(s));
		}

		while (!array.isEmpty()) {
			int lowest = getLowestIntegerFromArray(array);
			cutTheSticks(array, lowest);
		}

	}

	private static void cutTheSticks(List<Integer> array, int lowest) {

		ListIterator it = array.listIterator();
		int i = 0;
		while (it.hasNext()) {
			int index = it.nextIndex();
			int item = (int) it.next();
			if (item > 0) {
				item = item - lowest;
				array.set(index, item);
				i++;
			}

			if (item == 0) {
				it.remove();
			}
		}

		System.out.println(i);

	}

	private static int getLowestIntegerFromArray(List<Integer> array) {

		Collections.sort(array);
		return array.get(0);
	}

}
