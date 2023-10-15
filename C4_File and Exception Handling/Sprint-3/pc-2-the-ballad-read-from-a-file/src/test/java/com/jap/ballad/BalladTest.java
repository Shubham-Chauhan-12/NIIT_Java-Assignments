package com.jap.ballad;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class BalladTest {
    Ballad ballad = null;
    @Before
    public void setUp(){
        ballad = new Ballad();
    }
    @After
    public void tearDown(){
        ballad = null;
    }

    @Test
    public void givenCorrectDataFromFileCheckData() throws FileNotFoundException {
        String balladData = "";
        String str = ballad.readPoemFromAFile("src/main/resources/ballad.txt");
        FileInputStream fis = new FileInputStream("src/main/resources/ballad.txt");
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            balladData = balladData.concat("\n"+scanner.nextLine());
        }
        assertEquals("Data from file does not match",str.trim(),balladData.trim());
    }
    }
