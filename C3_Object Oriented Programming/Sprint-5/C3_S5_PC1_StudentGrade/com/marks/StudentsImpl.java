package com.marks;

import java.util.Scanner;

public class StudentsImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentsMarks studentsMarks = new StudentsMarks();
        System.out.println("Enter the Stream");
        String stream = scanner.nextLine();

        if (stream.equalsIgnoreCase("Medical")) {
            System.out.println("Medical Stream Total marks " + studentsMarks.calculateMarks(40, 42, 39, 35));
        } else if (stream.equalsIgnoreCase("Non-Medical")) {
            System.out.println("Non medical Stream Total marks " + studentsMarks.calculateMarks(35, 41, 45));
        } else if (stream.equalsIgnoreCase("Business")) {
            System.out.println("Business Stream Total marks " + studentsMarks.calculateMarks(35.0, 38.0, 41.0));
        } else {
            System.out.println("Invalid Input Please try again!");
        }
    }
}
