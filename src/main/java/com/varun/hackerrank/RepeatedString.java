package com.varun.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int stringLength = s.length();
        long count = 0;
        long repeat = n / stringLength;
        long modulo = n % stringLength;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        count *= repeat;

        String subString = s.substring(0, (int) modulo);
        for (char c : subString.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }

    /*
    Sample Input:
    ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt
    685118368975

    Sample Output:
    41107102139


     */
}
