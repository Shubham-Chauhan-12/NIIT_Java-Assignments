package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuizDemoTest {
    QuizDemo quizDemo ;

    @Before
    public void setUp(){
        quizDemo = new QuizDemo();
    }

    @After
    public void tearDown(){
        quizDemo = null;
    }

    @Test
    public void givenAStringArrayWithNumbersAsScoreReturnResult() {
        assertEquals("Candor",quizDemo.highestScore(new String[]{"DAV","RSK","Treamis","Candor"},new String[]{"45","56","78","88"}));
    }

    @Test
    public void givenAStringArrayWithStringAsScoreReturnResult() {
        assertEquals("java.lang.NumberFormatException: For input string: \"fifty-six\"",quizDemo.highestScore(new String[]{"DAV","RSK","Treamis","Candor"},new String[]{"45","fifty-six","78","88"}));
    }
}