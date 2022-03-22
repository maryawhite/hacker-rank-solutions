package com.mchindwhite;

//you are given an integer n, you have to convert it to a string
//n is between -100 and 100 inclusive

import java.util.Scanner;

public class ConvertNToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        //how to convert an integer to a string
        //you can use valueOf
        String s = String.valueOf(n);

    }


}
