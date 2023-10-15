package com.jap.longestsubstring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LongestSubstringTest {
    LongestSubstring longestSubstring;

    @BeforeEach
    void setUp() {
        longestSubstring = new LongestSubstring();
    }

    @AfterEach
    void tearDown() {
        longestSubstring = null;
    }

    @Test
    public void givenStringBuilderWithLongestSubStringThenReturnResult() {
        assertEquals("run", longestSubstring.findLongestSubString(new StringBuilder("runnerrun")).toString());
    }

    @Test
    public void givenStringBuilderWithOutLongestSubStringThenReturnError() {
        assertEquals("Longest substring is not present in the given StringBuilder", longestSubstring.findLongestSubString(new StringBuilder("dancerdances")).toString());
    }

    @Test
    public void givenStringBuilderWithUppercaseLongestSubStringThenReturnResult() {
        assertEquals("JAVA", longestSubstring.findLongestSubString(new StringBuilder("JAVAJAVA")).toString());
    }

    @Test
    public void givenStringBuilderWithLengthOneLongestSubStringThenReturnResult() {
        assertEquals("J", longestSubstring.findLongestSubString(new StringBuilder("J")).toString());
    }

    @Test
    public void givenStringBuilderWithSpacesThenReturnResult() {
        assertEquals("Java Programming", longestSubstring.findLongestSubString(new StringBuilder("Java Programming Java Programming")).toString());
    }

    @Test
    public void givenInputBlankOrNullThenCheckResultToBeNotNull() {
        assertNotNull(longestSubstring.findLongestSubString(new StringBuilder("")).toString());
        assertEquals("Invalid string", longestSubstring.findLongestSubString(new StringBuilder("")).toString());
        assertEquals("Invalid string", longestSubstring.findLongestSubString(null).toString());
    }

    @Test
    public void givenInputWithSpecialCharactersThenCheckNotNull() {
        assertNotNull(longestSubstring.findLongestSubString(new StringBuilder("@#Java@#")).toString());
        assertEquals("@#", longestSubstring.findLongestSubString(new StringBuilder("@#Java@#")).toString());
    }
}
