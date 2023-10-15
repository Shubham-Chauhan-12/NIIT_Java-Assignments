package com.jap.bubblesort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @AfterEach
    void tearDown() {
        bubbleSort = null;
    }

    @Test
    public void givenArrayOfDistancesAndNamesOfCitiesThenReturnTrue() {
        assertEquals(1,bubbleSort.sortedDistances(new int[]{138,52,118,136,85,276,103,87,214,101},new String[]{"Bern","Lucerne","InterLaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"}));

    }


    @Test
    public void givenArrayOfDistancesIsZeroOrNegativeValueReturnFalse() {
        assertEquals(0,bubbleSort.sortedDistances(new int[]{-138,52,118,136,85,276,103,87,214,101},new String[]{"Bern","Lucerne","InterLaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"}));
        assertEquals(0,bubbleSort.sortedDistances(new int[]{0,52,118,136,85,276,103,87,214,101},new String[]{"Bern","Lucerne","InterLaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"}));

    }
}
