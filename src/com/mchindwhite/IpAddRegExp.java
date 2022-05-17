package com.mchindwhite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddRegExp {
    public static void main(String[] args) {

        //this is a number from 0-255
        String digitRegEx = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

        String ipRegEx = digitRegEx + "\\." + digitRegEx + "\\." + digitRegEx + "\\." + digitRegEx;

        Pattern pattern = Pattern.compile(ipRegEx);
        Matcher matcher = pattern.matcher("127.0.0.1");
        System.out.println(matcher.matches());  //true
        Matcher matcher2 = pattern.matcher("127.35.44.12");
        System.out.println(matcher2.matches());   //true
        Matcher matcher3 = pattern.matcher("256.257.258.259");
        System.out.println(matcher3.matches());  //false

    }
}

//the IP Address should be in the format 127.0.0.1
//4 digits separated by a period. and each digit is between  0-255
