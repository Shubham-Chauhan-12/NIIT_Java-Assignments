package com.jap.doubledigits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceDigitsOfNumberTest {

    ReplaceDigitsOfNumber replaceDigitsOfNumber;

    @BeforeEach
    void init() {
        replaceDigitsOfNumber = new ReplaceDigitsOfNumber();
    }

    // Test doubleDigits method by passing positive values as input
    @Test
    public void givenANumberFindItsDoubleDigits() {
        assertEquals(334488L, replaceDigitsOfNumber.doubleDigits(348L));
        assertEquals(220033004400L, replaceDigitsOfNumber.doubleDigits(203040L));
    }

    // Test doubleDigits method by passing 0 as input
    @Test
    public void givenANumberAsZeroFindItsDoubleDigits() {
        assertEquals(0, replaceDigitsOfNumber.doubleDigits(0));
    }

    // Test doubleDigits method by passing negative values as input
    @Test
    public void givenANegativeNumberFindItsDoubleDigits() {
        assertEquals(-778899L, replaceDigitsOfNumber.doubleDigits(-789L));
        assertEquals(-220033004400L, replaceDigitsOfNumber.doubleDigits(-203040L));
    }
}
