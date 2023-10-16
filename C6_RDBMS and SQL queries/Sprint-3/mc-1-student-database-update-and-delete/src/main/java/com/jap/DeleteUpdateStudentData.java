package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData
{

    public Connection getConnection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/school";
            String user = "root";
            String password = "5120";
            connection = DriverManager.getConnection(url,user,password);

            if(connection!= null){
                System.out.println("Connection Established");
            }
            else{
                System.out.println("Connection Invalid");
            }
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return connection;

    }

    public void deleteStudentData() throws SQLException {
      // call getConnection() method
       Statement statement = getConnection().createStatement();

        //execute delete query
        String delRollNo = "DELETE FROM Student WHERE RollNo = 3";
        statement.executeUpdate(delRollNo);
    }

    public void updateStudentData() throws SQLException {
        // call getConnection() method
        Statement statement = getConnection().createStatement();
        //execute update query
        String update = "UPDATE Student SET Totalmarks = 458 WHERE StudentName = 'Shubham'";
        String update1 = "UPDATE Student SET RollNo = 6 WHERE StudentName = 'Ankit'";
        statement.executeUpdate(update);
        statement.executeUpdate(update1);


        ResultSet displayData = statement.executeQuery("SELECT * FROM Student");
        while(displayData.next()){
            System.out.println(displayData.getInt(1)+ "   " + displayData.getString(2) + "   " + displayData.getString(3) +
                    "   " + displayData.getString(4) + " " + displayData.getInt(5));
        }
    }

    public static void main(String[] args) throws SQLException {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.deleteStudentData();
        salesDataDemo.updateStudentData();
    }
}
