package com.jap.integerswap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jap.integerswap.SwapIntegers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SwapIntegersTest {

    SwapIntegers swapIntegers;

    @BeforeEach
    void init() {
        swapIntegers = new SwapIntegers();
    }

    // Test swapNumbers method by passing number with even number of digits
    @Test
    public void givenANumberWithEvenDigitsReturnSwappedValue() {
        assertEquals(657438L, swapIntegers.swapNumbers(564783L));
        assertEquals(2389547826L, swapIntegers.swapNumbers(3298458762L));
        assertEquals(210354L, swapIntegers.swapNumbers(123045L));
    }

    // Test swapNumbers method by passing number with odd number of digits
    @Test
    public void givenANumberWithOddDigitsReturnSwappedValue() {
        assertEquals(521637438L, swapIntegers.swapNumbers(512364783L));
        assertEquals(7657438L, swapIntegers.swapNumbers(7564783L));
        assertEquals(923895478L, swapIntegers.swapNumbers(932984587L));
    }

    // Test swapNumbers method by passing negative number as input
    @Test
    public void givenANegNumberReturnSwappedValue() {
        assertEquals(0, swapIntegers.swapNumbers(-564783L));
        assertEquals(0, swapIntegers.swapNumbers(-3298458762L));
    }

    // Test swapNumbers method by passing number as 0
    @Test
    public void givenANumberAs0ReturnSwappedValue() {
        assertEquals(0, swapIntegers.swapNumbers(0L));
    }
}
