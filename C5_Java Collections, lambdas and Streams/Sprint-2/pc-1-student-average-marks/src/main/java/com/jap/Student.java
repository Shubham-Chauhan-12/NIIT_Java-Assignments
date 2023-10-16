package com.jap;

public class Student {

    private String name;
    private int rollNo;
    private int totalMarks;

    //create getter and setter for all the above attributes

    //complete the parameterized constructor


    public Student(String name, int rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }


}
