package com.mchindwhite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeNumberProblem {

    public String checkForPrime(String input) throws IOException {

        BigInteger myNumber = new BigInteger(input);
        boolean result;
        result = myNumber.isProbablePrime(1);
        if(result) {
            return "prime";
        } else {
            return "not prime";
        }

    }

    public static void main(String[] args) throws IOException {
//        //code below provided
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String n = bufferedReader.readLine();
//
//        bufferedReader.close();
//        //
//
//        //they're passing in a String n
//        BigInteger myNumber = new BigInteger(n);
//        boolean result;
//        result = myNumber.isProbablePrime(1);
//        if(result) {
//            System.out.println("prime");
//        } else {
//            System.out.println("not prime");
//        }
        PrimeNumberProblem myprob = new PrimeNumberProblem();
        System.out.println(myprob.checkForPrime("13"));

    }



    }

    //A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself. For example, the first six prime numbers are 2,3,5,7,11 and 13.
//
//Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
// (Note: This is from BigInteger, NOT BigDecimal
//Input Format
//
//A single line containing an integer, n (the number to be checked).
//
//Constraints
//
// n contains at most 100 digits.
//Output Format
//
//If n is a prime number, print prime; otherwise, print not prime.
//
//Sample Input
//
//13
//Sample Output
//
//prime
//Explanation
//
//The only positive divisors of  are  and , so we print prime.
