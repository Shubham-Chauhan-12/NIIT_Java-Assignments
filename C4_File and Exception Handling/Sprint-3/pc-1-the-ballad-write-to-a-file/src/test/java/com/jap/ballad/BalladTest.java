package com.jap.ballad;

import com.jap.ballad.Ballad;
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
        String balladText = "'Twas the night before Christmas, when all through the house\n" +
                "Not a creature was stirring, not even a mouse;\n" +
                "The stockings were hung by the chimney with care,\n" +
                "In hopes that St. Nicholas soon would be there;\n" +
                "\n" +
                "The children were nestled all snug in their beds,\n" +
                "While visions of sugar-plums danced in their heads;\n" +
                "And mamma in her 'kerchief, and I in my cap,\n" +
                "Had just settled down for a long winter's nap,\n" +
                "\n" +
                "When out on the lawn there arose such a clatter,\n" +
                "I sprang from the bed to see what was the matter.\n" +
                "Away to the window I flew like a flash,\n" +
                "Tore open the shutters and threw up the sash.\n";

        ballad.writePoemToAFile("src/main/resources/ballad.txt", balladText);
        FileInputStream fis = new FileInputStream("src/main/resources/ballad.txt");
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            balladData = balladData.concat("\n"+scanner.nextLine());
        }
    assertEquals("Data from file does not match",balladText.trim(),balladData.trim());
    }
    }
