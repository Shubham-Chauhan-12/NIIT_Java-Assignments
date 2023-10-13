package com.jap.replaceinteger;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayPairSumTest {

    ArrayPairSum arrayPairSum = new ArrayPairSum();

    @BeforeEach
    void setUp() {
        arrayPairSum = new ArrayPairSum();
    }

    @AfterEach
    void tearDown(){
        arrayPairSum = null;
    }


    @Test
    public void givenEvenIntegerArrayThenReturnIntegerArray() {


        assertArrayEquals(new int[]{3,10,33,9} ,arrayPairSum.sumOfArrayPair(new int[]{1,2,4,6,10,23,1,8}) );

        assertArrayEquals(new int[]{6,22,41,22}, arrayPairSum.sumOfArrayPair(new int[]{2,4,12,10,11,30,12,10}));
    }

    @Test
    public void givenOddIntegerArrayThenReturnIntegerArray() {


        assertArrayEquals(new int[]{3,10,33,9,10} ,arrayPairSum.sumOfArrayPair(new int[]{1,2,4,6,10,23,1,8,10}) );

        assertArrayEquals(new int[]{6,22,41,23,19}, arrayPairSum.sumOfArrayPair(new int[]{2,4,12,10,11,30,12,11,19}));
    }


}
