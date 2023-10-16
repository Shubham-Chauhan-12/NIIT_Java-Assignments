package com.jap.prime;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PrimeCheckerImplTest
{
    PrimeCheckerImpl primeChecker = null;
    @Before
   public void setUp(){
        primeChecker = new PrimeCheckerImpl();
   }
   @After
   public void tearDown(){
       primeChecker = null;
   }
    @Test
    public void givenANumberShouldAnswerWithTrue()
    {
        assertTrue( primeChecker.primeNumberCheck(53));
        assertTrue( primeChecker.primeNumberCheck(17));
        assertTrue( primeChecker.primeNumberCheck(103));
        assertTrue( primeChecker.primeNumberCheck(3));
        assertTrue( primeChecker.primeNumberCheck(7));
    }
    @Test
    public void givenANumberShouldAnswerWithFalse()
    {
        assertFalse( primeChecker.primeNumberCheck(0));
        assertFalse( primeChecker.primeNumberCheck(1));
        assertFalse( primeChecker.primeNumberCheck(4));
        assertFalse( primeChecker.primeNumberCheck(112));
        assertFalse( primeChecker.primeNumberCheck(90));
    }
}
