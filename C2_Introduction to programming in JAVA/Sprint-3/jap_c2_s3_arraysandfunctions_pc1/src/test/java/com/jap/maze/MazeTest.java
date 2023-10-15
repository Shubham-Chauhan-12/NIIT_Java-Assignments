package com.jap.maze;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MazeTest {
    Maze maze;
    @BeforeEach
    void setUp()
    {
        maze = new Maze();
    }
    @AfterEach
    void tearDown()
    {
        maze = null;
    }
    @Test
    public void givenAnIntegerArrayReturnACharacterArrayMaze()
    {
        int inputMaze [][] =  {
                {1,3,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,1,0,1,0,1,0,0,0,0,0,1},
                {1,0,1,0,0,0,1,0,1,1,1,0,1},
                {1,0,0,0,1,1,1,0,0,0,0,0,1},
                {1,0,1,0,0,0,0,0,1,1,1,0,1},
                {1,0,1,0,1,1,1,0,1,0,0,0,1},
                {1,0,1,0,1,0,0,0,1,1,1,0,1},
                {1,0,1,0,1,1,1,0,1,0,1,0,1},
                {1,0,0,0,0,0,0,0,0,0,1,4,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1}};
      assertEquals(13,maze.buildMaze(inputMaze).length,"The input and output arrays are not equal");
    }

    @Test
    public void givenAValidCharacterMazeArrayReturnTrue()
    {
        char mazeChar [][] = {
                {'\u2021','S','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021'},
                {'\u2021',' ','\u2021',' ','\u2021',' ','\u2021',' ',' ',' ',' ',' ','\u2021'},
                {'\u2021',' ','\u2021',' ',' ',' ','\u2021',' ','\u2021','\u2021','\u2021',' ','\u2021'},
                {'\u2021',' ',' ',' ','\u2021','\u2021','\u2021',' ',' ',' ',' ',' ','\u2021'},
                {'\u2021',' ','\u2021',' ',' ',' ',' ',' ','\u2021','\u2021','\u2021',' ','\u2021'},
                {'\u2021',' ','\u2021',' ','\u2021','\u2021','\u2021',' ','\u2021',' ',' ',' ','\u2021'},
                {'\u2021',' ','\u2021',' ','\u2021',' ',' ',' ','\u2021','\u2021','\u2021',' ','\u2021'},
                {'\u2021',' ','\u2021',' ','\u2021','\u2021','\u2021',' ','\u2021',' ','\u2021',' ','\u2021'},
                {'\u2021',' ',' ',' ',' ',' ',' ',' ',' ',' ','\u2021','E','\u2021'},
                {'\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021','\u2021'}
        };

        assertTrue(maze.solve(mazeChar,0,1));
    }

}
