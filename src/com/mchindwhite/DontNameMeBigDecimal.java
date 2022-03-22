package com.mchindwhite;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.math.BigDecimal;

public class DontNameMeBigDecimal {

    //Given an array, s, of n real number strings, sort them in descending order — but wait, there's more!
    // Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1,
    // and 0.1 is printed as 0.1 If two numbers represent numerically equivalent values (e.g., .1 = 0.1),
    // then they must be listed in the same order as they were received as input).
    //
    //Input format
    //The first line consists of a single integer, n, denoting the number of integer strings.
    //Each line i of the n subsequent lines contains a real number denoting the value of s sub i.
    // n >= 1 and <= 200
    // each s sub i has at most 300 digits

    //so basically, sort the numbers in descending order, if 2 numbers are the same like .1 and 0.1 print them exactly like that in the order they appeared in
    //stdin --The standard input(stdin) can be represented by System.in in Java. The System.in is an instance of the InputStream class. It means that all its methods work on bytes, not Strings. To read any data from a keyboard, we can use either a Reader class or Scanner class.
    //Thanks for Heinrich24 on Github for the solution

    public static void main(String[] args) {

        // Input (input provided by HackerRank)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Start your code here
        // Sorting of values
        Arrays.sort(s, 0, n, new Comparator() {
            public int compare(Object a1, Object a2) {
                BigDecimal bigDec1 = new BigDecimal((String) a1);
                BigDecimal bigDec2 = new BigDecimal((String) a2);
                return bigDec2.compareTo(bigDec1);
            }
        });

        //**Type safety unchecked warning***
        //
        // (code below provided by HackerRank) Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

//Java Comparator compares two Java objects in a “compare(Object 01, Object 02)” format.
//
//Using configurable methods, Java Comparator can compare objects to return an integer based on a positive,
// equal or negative comparison. Since it is not limited to comparing numbers,
// this can allow Java Comparator to be set up to order lists alphabetically or numerically.
