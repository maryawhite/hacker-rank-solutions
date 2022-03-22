package com.mchindwhite;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDayCalendarTest {

    @Test
    public void findDay() {
        assertEquals("MONDAY", FindDayCalendar.findDay(8,14, 2017));
        assertEquals("TUESDAY", FindDayCalendar.findDay(3,22, 2022));
    }
}