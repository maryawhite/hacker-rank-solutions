package com.mchindwhite;

//In programming, lexicographical order is popularly known as Dictionary order
// and is used to sort a string array, compare two strings, or sorting array elements. It becomes quite easy to sort elements lexically.

//a > A lowercase letters a through z are greater than uppercase A through Z, and lowercase z is greater than lowercase a
//given an integer k, and a string s, k is the length of a substring
//find the substrings of that length, order them lexicographically, then return the smallest and largest.

import java.util.Arrays;

//find all substrings of length k, then order them
//
public class LexicographOrder {

    public static void main(String[] args) {
        String str = "welcometojava";

        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String threestr = str.substring(i, j);

                if(threestr.length() == 3) {
                    String[] myArray = {threestr};
                    Arrays.sort(myArray);
                    System.out.println(Arrays.toString(myArray));
                }

            }
        }


    }

}
