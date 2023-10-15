package com.jap.binarysearch;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @AfterEach
    void tearDown() {
        binarySearch = null;
    }

    @Test
    public void givenDistanceAndCityArrayReturnTheCityReturnCityName()
    {
        String cityNames[] = {"Lucerne", "Engelberg", "Basel", "Jungfraujoch", "Murren", "InterLaken", "Grindelwald", "Bern", "Zermatt", "Geneva"};
        int distances[] = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        assertEquals("Lucerne",binarySearch.search(distances,cityNames,52),"City Not Found");

    }
    @Test
    public void givenDistanceAndCityArrayReturnTheCityReturnCity()
    {
        String cityNames[] = {"Lucerne", "Engelberg", "Basel", "Jungfraujoch", "Murren", "InterLaken", "Grindelwald", "Bern", "Zermatt", "Geneva"};
        int distances[] = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        assertEquals("City Not Found",binarySearch.search(distances,cityNames,50),"City Not Found");

    }

}
