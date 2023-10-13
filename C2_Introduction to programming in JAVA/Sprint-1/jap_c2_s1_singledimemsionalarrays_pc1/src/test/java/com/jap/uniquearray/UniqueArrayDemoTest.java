package com.jap.uniquearray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class UniqueArrayDemoTest {

    UniqueArrayDemo uniqueArrayDemo = new UniqueArrayDemo();

    @BeforeEach
    void setUp() {
        uniqueArrayDemo = new UniqueArrayDemo();
    }

    @AfterEach
    void tearDown(){
        uniqueArrayDemo = null;
    }

    @Test
    public void givenIntegerArrayThenReturnTrue() {

assertTrue(uniqueArrayDemo.getUniqueArrayElement(new int[]{1,2,4,6,10,23,8}));
assertTrue(uniqueArrayDemo.getUniqueArrayElement(new int[]{2,4,11,30,12,10}));

    }

}