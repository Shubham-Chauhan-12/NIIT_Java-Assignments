package com.jap.calorietracker.commander;

import com.jap.calorietracker.CalorieTracker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalorieTrackerTest {
    CalorieTracker ct;
    @BeforeEach
    public void setUp()
    {
        ct = new CalorieTracker();
    }
    @AfterEach
    void tearDown()
    {
        ct = null;
    }

    @Test
    public void givenActivitiesReturnWeightLostInAMonth()
    {
        assertEquals(5.0,ct.weightLostInAMonth(300,200,500,100));
    }
    @Test
    public void givenNegativeValuesReturnWeightLostInAMonth()
    {
        assertEquals(0,ct.weightLostInAMonth(-100,-100,-100, 100));
    }


}
