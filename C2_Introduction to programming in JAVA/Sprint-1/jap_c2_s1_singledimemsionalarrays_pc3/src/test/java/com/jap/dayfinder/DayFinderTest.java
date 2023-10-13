package com.jap.dayfinder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayFinderTest {

    DayFinder dayFinder = new DayFinder();

    @BeforeEach
    void setUp() {
        dayFinder = new DayFinder();
    }

    @AfterEach
    void tearDown(){
        dayFinder = null;
    }

    @Test
    public void givenCurrentDayAndNumberOfDaysFromTodayReturnPredictedDayOfWeek()
    {
        assertEquals("Monday",dayFinder.predictDay(2,7));
    }
    @Test
    public void givenCurrentDayAndNumberOfDaysBeforeTodayReturnPredictedDayOfWeek()
    {
        assertEquals("Monday",dayFinder.predictDay(2,-7));
    }



}