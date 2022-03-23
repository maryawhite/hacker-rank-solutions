package com.mchindwhite;
//The getCurrencyInstance() method of the NumberFormat class returns the instance of the NumberFormat class.
// The java.text.NumberFormat class is used for formatting numbers and currencies as per a specific Locale.
//NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//double points = 1.78
//n.format(points);

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatterProgram {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        String us = u.format(payment);
        NumberFormat i = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = i.format(payment);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = c.format(payment);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = f.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

}
