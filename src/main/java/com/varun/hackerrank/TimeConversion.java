package com.varun.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat asdf = new SimpleDateFormat("HH:mm:ss");
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);

		try {
			dt = sdf.parse(userInput.nextLine());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(asdf.format(dt));
	}
}
