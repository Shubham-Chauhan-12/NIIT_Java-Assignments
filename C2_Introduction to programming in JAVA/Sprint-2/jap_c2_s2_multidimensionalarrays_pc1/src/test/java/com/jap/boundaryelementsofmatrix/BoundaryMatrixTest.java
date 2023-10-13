package com.jap.boundaryelementsofmatrix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoundaryMatrixTest {

    BoundaryMatrix boundaryMatrix;

    @BeforeEach
    void setUp() {
        boundaryMatrix = new BoundaryMatrix();
    }

    @AfterEach
    void tearDown() {
        boundaryMatrix = new BoundaryMatrix();
    }

    // Test printAndCalculateSumOfBoundaryElements method by passing positive values of array
    @Test
    public void givenAnArrayThenReturnSumOfBoundaryElements() {
        assertEquals(54, boundaryMatrix.printAndCalculateSumOfBoundaryElements(new int[][]{{1, 2, 3, 4}, {4, 5, 6, 7}, {3, 6, 7, 8}, {5, 8, 9, 0}}));
        assertEquals(24, boundaryMatrix.printAndCalculateSumOfBoundaryElements(new int[][]{{1, 2, 3}, {5, 6, 7}, {1, 2, 3}}));
        assertEquals(19, boundaryMatrix.printAndCalculateSumOfBoundaryElements(new int[][]{{1, 5}, {6, 7}}));
        assertEquals(0, boundaryMatrix.printAndCalculateSumOfBoundaryElements(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
    }

    // Test printAndCalculateSumOfBoundaryElements method by passing array with negative values
    @Test
    public void givenAnArrayWithNegativeValuesReturnSumOfBoundaryElements() {
        assertEquals(4, boundaryMatrix.printAndCalculateSumOfBoundaryElements(new int[][]{{-1, 2, -3, 4}, {-4, 5, -6, 7}, {-3, 6, -7, 8}, {-5, 8, -9, 0}}));
        assertEquals(-19, boundaryMatrix.printAndCalculateSumOfBoundaryElements(new int[][]{{-1, -5}, {-6, -7}}));
    }
}
