package com.jap.customexception;

import com.jap.customexception.Account;
import com.jap.customexception.InsufficientFundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class AccountTests {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(5000);
    }

    @After
    public void tearDown() {
        account = null;
    }

    @Test
    public void givenValidWithdrawAmountThenReturnNewBalance() throws InsufficientFundException {
        int newBalance = account.withdraw(500);

        assertEquals(4500,newBalance);
    }

    @Test
    public void givenZeroWithdrawAmountThenReturnSameBalance() throws InsufficientFundException {
        int newBalance = account.withdraw(0);
        assertEquals(5000, newBalance);
    }


}



