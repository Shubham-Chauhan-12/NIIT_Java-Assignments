package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class StudentServiceTest {
    Student student;
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;
    Set<Student> studentSet;

    @Before
    public void setUp(){
        student = new Student("John",23,500);
        student1 = new Student("Bob",26,545);
        student2 = new Student("William",15,400);
        student3 = new Student("Kevin",29,489);
        student4 = new Student("Johnson",30,578);
        student5 = new Student("Catherine",25,490);
        studentSet = new HashSet<>();
        studentSet.add(student);
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
    }

    @After
    public void tearDown(){
        student = null;
        student1 = null;
        student2=null;
        student3=null;
        student4=null;
        student5=null;
    }

    @Test
    public void givenAllStringNameReturnNameInSortedOrder(){
        Set<String> sortedName= StudentService.getAllStudentNameInSorted(studentSet);
        String firstName = sortedName.iterator().next();
        assertEquals(sortedName.size() , 6);
        assertEquals(firstName,"Bob");
    }

    @Test
    public void givenTotalMarksReturnTheAverage(){
        Map<String,Integer> map =  StudentService.calculateAverage(studentSet);
        assertEquals(map.size(),6);
        assertNotNull(map);
    }

}