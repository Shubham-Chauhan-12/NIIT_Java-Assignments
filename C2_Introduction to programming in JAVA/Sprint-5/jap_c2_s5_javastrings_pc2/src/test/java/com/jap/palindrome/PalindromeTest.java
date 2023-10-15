package com.jap.palindrome;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @AfterEach
    void tearDown() {
        palindrome = null;
    }

    // Test findPalindromeWords by passing array of words as input
    @Test
    public void givenArrayOfWordsFindPalindromes() {
        // Test scenario: Input array of words with palindromes
        assertEquals(2, palindrome.findPalindromeWords(new String[]{"civic", "root", "program", "level" }));
        // Test scenario: Input array of words with no palindromes
        assertEquals(0, palindrome.findPalindromeWords(new String[]{"root", "development", "programming" }));
        // Test scenario: Input array of words with empty strings
        assertEquals(3, palindrome.findPalindromeWords(new String[]{"civic", "", "" }));
        // Test scenario: Input empty array of words
        assertEquals(0, palindrome.findPalindromeWords(new String[]{}));
    }
}
