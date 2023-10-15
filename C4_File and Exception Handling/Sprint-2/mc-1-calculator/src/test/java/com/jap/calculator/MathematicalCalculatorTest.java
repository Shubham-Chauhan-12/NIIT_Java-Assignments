package com.jap.calculator;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class MathematicalCalculatorTest {
    MathematicalCalculator mc;

    @Before
   public void setUp()
    {
        mc = new MathematicalCalculator();
    }
    @After
    public void tearDown()
    {
        mc = null;
    }

    @Test
    public void givenTwoPositiveNumbersThenReturnResult()
    {
        int addResult = mc.add(15,17);
        int subResult = mc.subtract(37,7);
        int mulResult = mc.multiply(8,5);
        int divResult = mc.divide(30,6);
        assertEquals(32,addResult);
        assertEquals(30,subResult);
        assertEquals(40,mulResult);
        assertEquals(5,divResult);

    }

    @Test
    public void givenTwoNegativeNumbersThenReturnResult()
    {
        int addResult = mc.add(-15,17);
        int subResult = mc.subtract(37,-7);
        int mulResult = mc.multiply(8,-5);
        int divResult = mc.divide(30,-6);
        assertEquals(2,addResult);
        assertEquals(44,subResult);
        assertEquals(-40,mulResult);
        assertEquals(-5,divResult);
    }

    @Test
    public void givenZeroAsOneNumberThenReturnException()
    {
      assertEquals(0, mc.divide(30,0));
    }

}
