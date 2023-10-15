package com.jap.linearsearch;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {
    LinearSearch linearSearch;

    @BeforeEach
    void setUp() {
        linearSearch = new LinearSearch();
    }

    @AfterEach
    void tearDown() {
        linearSearch = null;
    }

    @Test
    public void givenArrayOfDistanceArrayOfNameOfTheCitiesAndDistanceToBeSearchedReturnNameOfCity() {
        assertEquals("Lucerne",linearSearch.findCity(new int[] {138,52,118,136,85,276,103,87,214,101},new String[]{"Bern","Lucerne","InterLaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"},52),"City not found");
    }
    @Test
    public void givenArrayOfDistanceArrayOfNameOfTheCitiesAndDistanceToBeSearchedNotInDistanceArrayReturnNotFound() {
        assertEquals("not found",linearSearch.findCity(new int[] {138,52,118,136,85,276,103,87,214,101},new String[]{"Bern","Lucerne","InterLaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"},51),"City not found");
    }
    @Test
    public void givenArrayOfDistanceArrayOfNameOfTheCitiesAndDistanceToBeSearchedReturnCitesGreaterThanTheDistanceGiven() {
        assertArrayEquals(new String[]{"Geneva"},linearSearch.findCityAtDistanceGreaterThan270(new int[] {138,52,118,136,85,276,103,87,214,101},new String[]{"Bern","Lucerne","InterLaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"},276),"City not found");
    }
    @Test
    public void givenArrayOfDistanceArrayOfNameOfTheCitiesAndDistanceToBeSearchedReturnNullIfCityNotGreaterThanGivenDistance() {
        assertArrayEquals(new String[]{},linearSearch.findCityAtDistanceGreaterThan270(new int[] {138,52,118,136,85,200,103,87,214,101},new String[]{"Bern","Lucerne","InterLaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"},270),"City not found");
    }

}
