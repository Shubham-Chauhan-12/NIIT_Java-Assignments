package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MovieServiceTest {
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Map<Movie,Integer> movieIntegerMap;
    MovieService movieService;

    @Before
    public void setUp(){
        movieService = new MovieService();
        movie1 = new Movie(101,"A Beautiful Mind","economic","11/1/2001");
        movie2 = new Movie(102,"Boiler Room","Crime","1/1/2000");
        movie3 = new Movie(103,"Buy and Cell","comedy","13/4/1988");
        movie4 = new Movie(104,"Corsair","Crime","11/11/1997");
        movie5 = new Movie(105,"Diamond Necklace","comedy","10/11/2021");
        movieIntegerMap = new HashMap<>();
        movieIntegerMap.put(movie1,2);
        movieIntegerMap.put(movie2,5);
        movieIntegerMap.put(movie3,4);
        movieIntegerMap.put(movie4,4);
        movieIntegerMap.put(movie5,3);

    }

    @After
    public void tearDown(){
        movieIntegerMap = null;
        movieService = null;
    }

    @Test
    public void givenMovieReturnMovieNameWithRating4(){
        Set<String> set =movieService.getMovieNameWithRating4(movieIntegerMap,4);
        assertEquals(set.size(),2);
        assertEquals(set.iterator().next(),"Buy and Cell");
    }

    @Test
    public void givenMovieReturnMovieWithHighestRating(){
        List<String> list = movieService.getMovieWithHighestRating(movieIntegerMap);
        assertEquals(list.size(),1);
        System.out.println("list " + list);
        assertNotNull(list);

    }

    @Test
    public void givenMovieReturnAllMoviesWithComedy(){

        Map<String,String> map= movieService.getAllMoviesWithComedy(movieIntegerMap);
        assertEquals(map.size(),2);
        assertNotNull(map);

    }
}