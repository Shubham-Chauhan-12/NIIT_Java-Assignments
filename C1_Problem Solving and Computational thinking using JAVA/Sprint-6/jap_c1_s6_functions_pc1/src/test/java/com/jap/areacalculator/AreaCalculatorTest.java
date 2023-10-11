package com.jap.areacalculator;

import com.jap.areacalculator.AreaCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaCalculatorTest {
    AreaCalculator areaCalculator;

    @BeforeEach
    void setUp() {
        areaCalculator = new AreaCalculator();
    }

    @AfterEach
    void tearDown() {
        areaCalculator = null;
    }

    // Test calculateAreaOfSquare method by passing positive values as input parameters
    @Test
    public void givenSideOfSquareThenCalculateArea() {
        assertEquals(25, areaCalculator.calculateAreaOfSquare(5));
        assertEquals(38.440000000000005, areaCalculator.calculateAreaOfSquare(6.2));
    }

    // Test calculateAreaOfSquare method by passing negative values as input parameters
    @Test
    public void givenSideOfSquareAsNegativeNumberThenCalculateArea() {
        assertEquals(25, areaCalculator.calculateAreaOfSquare(-5));
        assertEquals(38.440000000000005, areaCalculator.calculateAreaOfSquare(-6.2));
    }

    // Test calculateAreaOfSquare method by passing zero as input parameters
    @Test
    public void givenSideOfSquareAsZeroThenCalculateArea() {
        assertEquals(0, areaCalculator.calculateAreaOfSquare(0));
    }

    // Test calculateAreaOfCircle method by passing positive values as input parameters
    @Test
    public void givenRadiusOfCircleThenCalculateArea() {
        assertEquals(28.259999999999998, areaCalculator.calculateAreaOfCircle(3));
        assertEquals(271.57860000000005, areaCalculator.calculateAreaOfCircle(9.3));
    }

    // Test calculateAreaOfCircle method by passing negative values as input parameters
    @Test
    public void givenRadiusOfCircleAsNegativeNumberThenCalculateArea() {
        assertEquals(28.259999999999998, areaCalculator.calculateAreaOfCircle(-3));
        assertEquals(271.57860000000005, areaCalculator.calculateAreaOfCircle(-9.3));
    }

    // Test calculateAreaOfCircle method by passing zero as input parameters
    @Test
    public void givenRadiusOfCircleAsZeroThenCalculateArea() {
        assertEquals(0, areaCalculator.calculateAreaOfCircle(0));
    }

    // Test calculateAreaOfRectangle method by passing positive values as input parameters
    @Test
    public void givenLengthAndBreathThenCalculateArea() {
        assertEquals(12, areaCalculator.calculateAreaOfRectangle(3, 4));
        assertEquals(17.68, areaCalculator.calculateAreaOfRectangle(3.4, 5.2));
    }

    // Test calculateAreaOfRectangle method by passing negative values as input parameters
    @Test
    public void givenLengthOrBreadthAsNegativeNumberThenCalculateArea() {
        assertEquals(-12, areaCalculator.calculateAreaOfRectangle(3, -4));
        assertEquals(-12, areaCalculator.calculateAreaOfRectangle(-3, 4));
        assertEquals(12, areaCalculator.calculateAreaOfRectangle(-3, -4));
    }

    // Test calculateAreaOfRectangle method by passing zero as input parameters
    @Test
    public void givenLengthOrBreadthAsZeroThenCalculateArea() {
        assertEquals(0, areaCalculator.calculateAreaOfRectangle(0, 5.2));
        assertEquals(0, areaCalculator.calculateAreaOfRectangle(3.4, 0));
        assertEquals(0, areaCalculator.calculateAreaOfRectangle(0, 0));
    }
}
