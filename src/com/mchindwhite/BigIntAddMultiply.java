package com.mchindwhite;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntAddMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

//using the BigInteger class, read from standard input and print to standard output.
// Output 2 lines, the first line should be a + b, and the 2nd line a * b
//input 1234 & 20 should output 1254 & 24680
