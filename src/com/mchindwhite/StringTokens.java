package com.mchindwhite;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //write your code here //
//
//        s = s.trim();
//        if(s.length() == 0) {
//            System.out.println(0);
//        }
//        String[] splitstr = s.split("['!?,._@ ]+");
//
//        System.out.println(splitstr.length);
//        for(int i = 0; i < splitstr.length; i++) {
//            System.out.println(splitstr[i]);
//        }

        // CORRECT CODE BELOW Note that not using the else statement above changes how the code works//
                s = s.trim();
                if(s.length() == 0) {
                    System.out.println("0");
                } else {
                    String[] splitstr = s.split("['!?,._@ ]+");
                    System.out.println(splitstr.length);
                    for(int i = 0; i < splitstr.length; i++) {
                        System.out.println(splitstr[i]);
                    }
                }

        scanner.close();
    }
}

//from Hacker Rank
//Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
// We define a token to be one or more consecutive English alphabetic letters.
// Then, print the number of tokens, followed by each token on a new line
//i.e. He is a very very good boy, isn't he?
// 10
// He
// is
// a
// very
// very
// good
// boy
// isn
// t
// he
//Note: all punctuation is removed and the word is split at each space or apostrophe
//Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!
