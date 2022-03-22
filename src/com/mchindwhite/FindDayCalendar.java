package com.mchindwhite;

//you are given a date, you need to write the method getDay(), which returns the day of the date
//i.e. Aug 14, 2017 would return MONDAY
//given public static String findDay(int month, ind day, int year){}
//the input will be a single line containing the month day and year
//the output should be the day in all caps

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class FindDayCalendar {

    public static String findDay(int month, int day, int year) {
        String m = String.valueOf(month);
        String d = String.valueOf(day);
        String y = String.valueOf(year);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");  ///use a single M, not MM for month here, and use d, not dd for day
        LocalDate date = LocalDate.parse(m + "/" + d + "/" + y, formatter);
        DayOfWeek dow = date.getDayOfWeek();
        String output = dow.getDisplayName(TextStyle.FULL, Locale.US);
        return output.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 14, 2017));
        System.out.println(findDay(8, 5, 2015));
    }
}
