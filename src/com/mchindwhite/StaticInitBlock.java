package com.mchindwhite;

import java.util.Scanner;

public class StaticInitBlock {

    //find the area of a rectangle B*H
    static Scanner scanner = new Scanner(System.in);
    static int breadth = scanner.nextInt();
    static int height = scanner.nextInt();

    static boolean flag = initializeInstanceVariable();

    protected static boolean initializeInstanceVariable() {
        boolean flag = false;
        if(breadth > 0 && height > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        if(flag) {
            int area = breadth * height;
            System.out.println(area);
        }
    }
}

//Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
//
//Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.
//
//If B <= 0 or H <= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
//
//Input Format
//
//There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.
//
//Constraints
// B >= -100 & <= 100
// H >= -100 & <= 100
//Output Format
//
//If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
//
//Sample input 1
//
//1
//3
//Sample output 1
//
//3
//Sample input 2
//
//-1
//2
//Sample output 2
//
//java.lang.Exception: Breadth and height must be positive
