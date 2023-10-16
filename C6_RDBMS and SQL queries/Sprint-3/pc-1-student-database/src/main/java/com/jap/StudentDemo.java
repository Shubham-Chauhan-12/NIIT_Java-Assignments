package com.jap;

import java.sql.*;

public class StudentDemo
{

    public void getAllStudentDetails(){

        try {
            //Load the Drivers
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/School";
            String user = "root";
            String password = "5120";

            // Get the connection from database
            Connection connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Connection Success");

                //Create statement object
                Statement statement = connection.createStatement();
                String database = "CREATE DATABASE IF NOT EXISTS School";
                statement.execute(database);

                String table = "CREATE TABLE IF NOT EXISTS Student(RollNo INT PRIMARY KEY ,StudentName VARCHAR(100) ,City VARCHAR(100) , Grade VARCHAR(100) , Totalmarks INT)";
                statement.execute(table);
                //execute the query

               /*String s = "DELETE FROM student WHERE  rollNo = 1";
                statement.executeUpdate(s);

                */
                

                String sql = "INSERT INTO Student VALUES (1,'Shubham','India','A',410),(2,'Aman','India','A',375),(3,'Satyanshu','India','B',389)," +
                        "(4,'Saurya','India','C',403),(5,'Ankit','India','B',355)";
                statement.executeUpdate(sql);

                //display the ResultSet Data
                System.out.println("-----------------------------------------------------------");
                ResultSet displayData = statement.executeQuery("SELECT * FROM Student");

                while(displayData.next()){
                    System.out.println(displayData.getInt(1)+"           "+ displayData.getString(2)+"          "+
                            displayData.getString(3)+"           "+displayData.getString(4)
                            +"            "+displayData.getInt(5));
                }

            }
            else {
                System.out.println("Connection-Failed....");
            }
        }

        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public static void main( String[] args ) {
        StudentDemo studentDemo = new StudentDemo();
        studentDemo.getAllStudentDetails();
    }
}
