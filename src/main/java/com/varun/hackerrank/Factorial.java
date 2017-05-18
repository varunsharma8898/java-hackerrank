package com.varun.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main (String[] args) {
		Scanner userInput = null;
		try {
			userInput = new Scanner(System.in);
			int i = userInput.nextInt();
			
			BigInteger factorial = new BigInteger("1");
			BigInteger incr = new BigInteger("1");

			for (int j = 1; j <= i; j++) {
				factorial = factorial.multiply(incr);
				incr = incr.add(BigInteger.ONE);
			}
		
			System.out.println(factorial);
		}
		finally {
			userInput.close();
		}
	}
}
