package com.jap.validator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CredentialsValidatorTest
{
    CredentialsValidatorImpl credentialsValidator = null;
    @Before
    public void setUp(){
        credentialsValidator = new CredentialsValidatorImpl();
    }
    @After
    public void tearDown(){
        credentialsValidator = null;
    }

    @Test
    public void givenUserNameAndPasswordReturnValid()
    {
        assertEquals("valid user",credentialsValidator.validateUser("admin","1234"));
    }
    @Test
    public void givenWrongUserNameReturnInvalid()
    {
        assertEquals("invalid user",credentialsValidator.validateUser("user","1234"));
    }
    @Test
    public void givenWrongPasswordReturnInvalid()
    {
        assertEquals("invalid user",credentialsValidator.validateUser("admin","123"));
    }
}
