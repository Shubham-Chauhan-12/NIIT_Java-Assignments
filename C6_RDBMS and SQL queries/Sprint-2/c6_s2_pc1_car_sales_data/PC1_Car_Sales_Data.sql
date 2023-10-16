-- TASK-1

CREATE DATABASE IF NOT EXISTS Car_Sales_Data;
USE Car_Sales_Data;
CREATE TABLE Sales_Person(Sales_Id INT PRIMARY KEY, First_Name VARCHAR(200), City VARCHAR(200),Commision_Rate INT);
INSERT INTO Sales_Person VALUES (1001 ,'John','London',12),(1002 ,'Bob','San Jose',13), (1004 ,'Judith','London',11),(1007 ,'Robin','Barcelona',15),
 (1003 ,'Harry','New York',10),(1005 ,'James','London',26),(1008 ,'Charles','Florida',0);
SELECT * FROM Sales_Person;
SELECT First_Name , City FROM Sales_Person WHERE First_Name = 'Robin' or City = 'Barcelona';
SELECT City , Commision_Rate FROM Sales_Person WHERE  First_Name = 'John';
SELECT Sales_Id , First_Name, City , Commision_Rate FROM Sales_Person WHERE Commision_Rate >= 15 ;

-- TASK-2

SELECT Sales_Id , First_Name, City , Commision_Rate FROM Sales_Person WHERE Commision_Rate between 10 and 20;
SELECT  First_Name, City FROM Sales_Person WHERE Commision_Rate >= 25 ;
SELECT  First_Name, city FROM Sales_Person WHERE Commision_Rate = 0; 
SELECT Sales_Id , First_Name, City , Commision_Rate FROM Sales_Person WHERE First_Name like 'J%';
SELECT Sales_Id , First_Name, City , Commision_Rate FROM Sales_Person WHERE City = 'London' OR City = 'New York' OR City = 'San Jose';
DELETE FROM Sales_Person WHERE  Commision_Rate = 0;
SELECT avg(Commision_Rate) FROM Sales_Person;
SELECT  First_Name, Commision_Rate FROM Sales_Person WHERE Commision_Rate = 10 OR Commision_Rate = 11 OR Commision_Rate = 12 OR Commision_Rate = 13;
SELECT First_Name ,City FROM Sales_Person WHERE Commision_Rate = (SELECT MAX(Commision_Rate)FROM Sales_Person);