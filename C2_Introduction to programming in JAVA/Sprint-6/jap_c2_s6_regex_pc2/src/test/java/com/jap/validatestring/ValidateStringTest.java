package com.jap.validatestring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateStringTest {
    ValidateString validateString;

    @BeforeEach
    void setUp() {
        validateString = new ValidateString();
    }

    @AfterEach
    void tearDown() {
        validateString = null;
    }

    @Test
    public void givenAStringThenReturnValidatedResult() {
        // Test scenario: Input string with 8 - 20 characters
        assertTrue(validateString.validatePassword("Programming"));
        // Test scenario: Input string contains alphanumeric characters
        assertTrue(validateString.validatePassword("Julia001"));
        // Test scenario: Input string with underscore
        assertTrue(validateString.validatePassword("Julia_2021"));
        // Test scenario: Input string with first character being alphabetic character
        assertTrue(validateString.validatePassword("Codesleep"));
        assertTrue(validateString.validatePassword("codesleep"));
        // Test scenario: Input string with less than 8 characters
        assertFalse(validateString.validatePassword("Julia"));
        assertFalse(validateString.validatePassword("Code"));
        // Test scenario: Input string with greater than 20 characters
        assertFalse(validateString.validatePassword("Benedict Cumberbatch"));
        // Test scenario: Input string with special characters other than underscore
        assertFalse(validateString.validatePassword("Julia@2021"));
        assertFalse(validateString.validatePassword("Jul_ia"));
        assertFalse(validateString.validatePassword("Julia?20_2A"));
        // Test scenario: Input string with first character being non alphabetic character
        assertFalse(validateString.validatePassword("1Julia_2021"));
        assertFalse(validateString.validatePassword("_julia_2021"));
        // Test scenario: Empty input string
        assertFalse(validateString.validatePassword(""));
        // Test scenario: Null input string
        assertFalse(validateString.validatePassword(null));
    }
}
