package com.jap;

import java.sql.SQLOutput;
import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){


        HashSet<Student> set = new HashSet<>();
        //create six student object by calling Student class parameterized constructor
        Student student = new Student("John",23,500);
        Student student1 = new Student("Bob",26,545);
        Student student2 = new Student("William",15,400);
        Student student3 = new Student("Kevin",29,489);
        Student student4 = new Student("Johnson",30,578);
        Student student5 = new Student("Catherine",25,490);




        //create HashSet object and add all the students object inside it
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);

        //return the HashSet object


        return set;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object

        Set<String> treeSet = new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        Student temp;
        while (iterator.hasNext()){
            temp = iterator.next();

            //get all the name and add it inside the TreeSet object
            String name = temp.getName();
            treeSet.add(name);
        }





      //return the TreeSet object;
        return treeSet;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
            Map<String,Integer> stringIntegerMap = new HashMap<>();
        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //retrieve the Student object from the iterator
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            String studentName = temp.getName();
            Integer totalMarks = temp.getTotalMarks();

            //Use getter method to get TotalMarks of each student. calculate the average
            //add the and average marks in the HashMap object created in the
            stringIntegerMap.put(temp.getName(), temp.getTotalMarks() / studentSet.size());
        }



        //first line and return the map

           return stringIntegerMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));

        System.out.println(calculateAverage(studentName));
    }


}
