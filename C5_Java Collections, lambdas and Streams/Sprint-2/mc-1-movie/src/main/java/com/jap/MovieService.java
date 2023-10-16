package com.jap;

import java.util.*;

public class MovieService {

    public Map<Movie,Integer> getMovieWithRating(){

        //create five movie object by calling Movie class parameterized constructor


        //create HashMap object and add all the Movie object inside it
        Movie movie1 =new Movie(101,"A Beautiful Mind","economic","11/1/2001");
        Movie movie2 =new Movie(102,"Boiler Room","Crime","1/1/2000");
        Movie movie3 =new Movie(103,"Buy and Cell","comedy","13/4/1988");
        Movie movie4 =new Movie(104,"Corsair","Crime","11/11/1997");
        Movie movie5 =new Movie(105,"Diamond Necklace","comedy","10/11/2021");

        //Key will be movie object and value will be rating ranging from 1 to 5
        HashMap<Movie,Integer> hashMap = new HashMap<>();
        hashMap.put(movie1,2);
        hashMap.put(movie2,5);
        hashMap.put(movie3,4);
        hashMap.put(movie4,3);
        hashMap.put(movie5,3);

        //return the HashMap object


        return hashMap;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie,Integer> map,int rating){
        //Create a TreeSet object

        TreeSet<String> treeSet = new TreeSet<>();

        //Use entrySet() method to iterate through the map object
        for (Map.Entry<Movie,Integer> entrySet : map.entrySet())
        {
            //retrieve all the movies name having rating as 4
            if (entrySet.getValue()== rating)
            {
                //Store the movie name in TreeSet object
                treeSet.add(entrySet.getKey().getMovieName());
            }
        }
        //return the TreeSet object
        return treeSet;
    }

    public List<String> getMovieWithHighestRating(Map<Movie,Integer> map){
        //Create a ArrayList object of type String
         List<String> list =new ArrayList<>();

        //get the first value from the map and store it in the variable max

        for (Map.Entry<Movie,Integer> entry: map.entrySet())
        {
            // Use entrySet().iterator().next() method to retrieve the first value of Map object
            if (entry.getValue()==5)
            {
                //get the name of the movie with the highest rating and add it in the List created
                list.add(entry.getKey().getMovieName());
            }
        }

        //return the List object
        return list;

    }
    public Map<String,String> getAllMoviesWithComedy(Map<Movie,Integer> map){
        //Create a Map object
        Map<String,String> map1 = new HashMap();
        //use entrySet to iterate through the Map object
        for (Map.Entry<Movie,Integer> entry:map.entrySet())
        {
            if (entry.getKey().getGenre().equalsIgnoreCase("Comedy"))
            {
                map1.put(entry.getKey().getMovieName(),entry.getKey().getReleaseDate());
            }
        }
        //get all the movies name and their released date for the movie of genre "comedy"

        //store movie name with release date in the above created Map object and return the Map object


        return map1;

    }

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map <Movie,Integer> map = movieService.getMovieWithRating();
        Set set = movieService.getMovieNameWithRating4(map,4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating((Map<Movie, Integer>) map);
        System.out.println("--------------");
        System.out.println("Highest Rating " +list);
    }
}
