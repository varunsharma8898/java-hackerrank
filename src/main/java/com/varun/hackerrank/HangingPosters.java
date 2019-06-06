package com.varun.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class HangingPosters {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER_ARRAY wallPoints
     *  3. INTEGER_ARRAY lengths
     */

    public static int solve(int h, List<Integer> wallPoints, List<Integer> lengths) {
        // Write your code here
        double maxHeight = 0;
        for (int i = 0; i < wallPoints.size(); i++) {
            double test = lengths.get(i) * 0.25;
            double height = wallPoints.get(i) + test - lengths.get(i) * 0.5;
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        maxHeight = maxHeight > h ? maxHeight - h : 0;
        return (int) Math.ceil(maxHeight);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int h = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> wallPoints = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> lengths = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int answer = solve(h, wallPoints, lengths);

//        bufferedWriter.write(String.valueOf(answer));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
        System.out.println(answer);
    }

    /*
    *
    *
    * Sample Input:
3 5
15 11 17
5 1 2

    * Sample Output:
    *   12
    *
    * */
}
