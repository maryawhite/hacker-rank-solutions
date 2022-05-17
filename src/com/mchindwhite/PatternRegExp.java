package com.mchindwhite;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternRegExp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            testCases--;
            //Answer from The Poor Coder, https://www.thepoorcoder.com/hackerrank-pattern-syntax-checker-solution/
        }
    }

}

//from Hacker Rank
//Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.
//
//In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
//
//Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

//Input Format:
//the first line of input contains an Integer N, denoting the number of test cases. The first N lines contain a string of an printable characters representing the pattern of a regex.
//Output Format:
//for each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print quotes.
// 3
// ([A-Z])(.+)
// [AZ[a-z](a-z)
// batcatpat(nat

//would result in
// Valid
// Invalid
// Invalid