package com.mchindwhite;

public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(SleepIn.sleepIn(false, true)); //true
        System.out.println(SleepIn.sleepIn(true, true)); //true
        System.out.println(SleepIn.sleepIn(true, false)); //false
    }
}

//from Coding Bat
//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//Given: public boolean sleepIn(boolean weekday, boolean vacation){ write your code}

