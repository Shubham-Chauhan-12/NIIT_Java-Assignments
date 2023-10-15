package com.marks;
public class StudentsMarks {
    public int calculateMarks(int maths,int physics,int chemistry,int biology)
    {
        int totalMark;
        totalMark=maths+physics+chemistry+biology;
        return totalMark;
    }
    public int calculateMarks(int maths,int physics,int chemistry)
    {
        int totalMark;
        totalMark=maths+physics+chemistry;
        return totalMark;
    }
    public double calculateMarks(double businessStudies, double finance, double accounting)
    {
        double sum;
        sum = businessStudies+finance+accounting;
        return sum;
    }
}
