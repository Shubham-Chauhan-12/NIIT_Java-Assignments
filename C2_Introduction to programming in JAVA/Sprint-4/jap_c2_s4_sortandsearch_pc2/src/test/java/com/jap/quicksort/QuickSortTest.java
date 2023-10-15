package com.jap.quicksort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    QuickSort quickSort = new QuickSort();

    @BeforeEach
    void setUp() {
        quickSort = new QuickSort();
    }

    @AfterEach
    void tearDown() {
        quickSort = null;
    }

    // Test sort method by passing array with positive values as input
    @Test
    public void givenAnArrayThenReturnSortedValues() {
        assertArrayEquals(new int[]{52, 85, 87, 101, 103, 118, 136, 138, 214, 276}, quickSort.sort(new int[]{138,52,118,136,85,276,103,87,214,101}, 0, 9));
        assertArrayEquals(new int[]{0, 0, 0, 0, 10, 20, 30, 80, 90, 100}, quickSort.sort(new int[]{10, 0, 100, 20, 0, 90, 0, 30, 0, 80}, 0, 9));
        assertArrayEquals(new int[]{10, 10, 20, 20, 30, 30, 90, 90, 100, 100}, quickSort.sort(new int[]{10, 10, 100, 100, 20, 20, 90, 90, 30, 30}, 0, 9));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, quickSort.sort(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0, 9));
        assertArrayEquals(new int[]{}, quickSort.sort(new int[]{}, 0, 0));
    }

    // Test sort method by passing array with negative values as input
    @Test
    public void givenArrayWithNegativeValesThenReturnSortedValues() {
        assertArrayEquals(new int[]{-100, -64, -25, -12, -1, 0, 11, 22, 34, 90}, quickSort.sort(new int[]{11, -12, 22, -25, 34, -64, 90, -1, 0, -100}, 0, 9));
        assertArrayEquals(new int[]{-100, -90, -30, -20, -10, 10, 20, 30, 90, 100}, quickSort.sort(new int[]{10, -10, 100, -100, 20, -20, 90, -90, 30, -30}, 0, 9));
    }
}
