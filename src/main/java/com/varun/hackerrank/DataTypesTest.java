package com.varun.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class DataTypesTest {

	public static void main(String[] args) {

		Scanner userInput = null;
		try {
			userInput = new Scanner(System.in);
	
			int times = userInput.nextInt();
			ArrayList<String> userInputArray = new ArrayList<String>();
			for (int i = 0; i < times; i++) {
				if (userInput.hasNext()) {
					userInputArray.add(userInput.next());
				}
			}
	
			if (!userInputArray.isEmpty()) {
				for (String userInputElement : userInputArray) {
					try {
	
						BigInteger number = new BigInteger(userInputElement);
	
						BigInteger longMaxValue = new BigInteger(String.format("%d", Long.MAX_VALUE));
						BigInteger longMinValue = new BigInteger(String.format("%d", Long.MIN_VALUE));
						
						ArrayList<String> canBeFittedInto = new ArrayList<String>();
	
						if (
							number.longValue() < Byte.MAX_VALUE
							&& number.longValue() > Byte.MIN_VALUE
						) {
							canBeFittedInto.add("* byte");
						}
						if (
							number.longValue() < Short.MAX_VALUE
							&& number.longValue() > Short.MIN_VALUE
						) {
							canBeFittedInto.add("* short");
						}
						if (
							number.longValue() < Integer.MAX_VALUE
							&& number.longValue() > Integer.MIN_VALUE
						) {
							canBeFittedInto.add("* int");
						}
						
						if (
							(
								number.compareTo(longMinValue) == 1
								|| number.compareTo(longMinValue) == 0
							)
							&& (
								number.compareTo(longMaxValue) == -1
								|| number.compareTo(longMaxValue) == 0
							)
						) {
							canBeFittedInto.add("* long");
						}
	
						if (canBeFittedInto.isEmpty()) {
							System.out.println(number + " can't be fitted anywhere.");
						}
						else {
							System.out.println(number + " can be fitted in:");
							for (String outputStr: canBeFittedInto) {
								System.out.println(outputStr);
							}
						}
					}
					catch (Exception e) {
	//					System.out.println("can't be fitted anywhere.");
					}
				}
				
			}
		}
		finally {
			userInput.close();
		}
	}

}
