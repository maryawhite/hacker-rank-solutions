package com.mchindwhite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class UsernameRegEx {
    public static void main(String[] args) {

        String testName = "Samantha21";

        String myRegEx = "^[A-Za-z][a-zA-Z0-9\\w]{7,29}";
        Pattern pattern = Pattern.compile(myRegEx);
        Matcher matcher = pattern.matcher(testName);
        System.out.println(matcher.matches());  //true

        Matcher matcher2 = pattern.matcher("Julia");
        Matcher matcher3 = pattern.matcher("Samantha?10_24");
        System.out.println(matcher2.matches());  //false
        System.out.println(matcher3.matches());  //false  can't contain ?

        try{
            Pattern.compile(myRegEx);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }


    }

}

// write a regular expression to validate a username with the following conditions:
// username must be between 8 & 30 characters, it must start with an alphabetic character, either upper- or lowercase (A-Z or a-z)
// it can only contain alphanumeric and underscores

