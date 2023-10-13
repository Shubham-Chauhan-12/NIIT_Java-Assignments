package com.jap.maze;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void givenAnIntegerArrayReturnACharacterArrayMaze() {
        int inputMaze[][] = {
                {1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        //Test if the array is built properly
        assertEquals('S', maze.buildMaze(inputMaze)[0][1], "Entry Point S not marked");
        assertEquals('E', maze.buildMaze(inputMaze)[8][11], "Exit Point E not marked");
    }
}
