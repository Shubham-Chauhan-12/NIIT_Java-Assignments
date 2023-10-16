CREATE DATABASE IF NOT EXISTS CarSales;
USE CarSales;
CREATE TABLE SalesPersons(SalesId INT PRIMARY KEY , FirstName VARCHAR(100),City VARCHAR(100), CommisionRate INT);
INSERT INTO SalesPersons VALUES ( 1001 ,'John','London',12);
INSERT INTO SalesPersons VALUES ( 1002 ,'Bob','San Jose',13);
INSERT INTO SalesPersons VALUES ( 1004 ,'Judith','London',11);
INSERT INTO SalesPersons VALUES ( 1007 ,'Robin','Barcelona',15);
INSERT INTO SalesPersons VALUES ( 1003 ,'Harry','New York',10);
INSERT INTO SalesPersons VALUES ( 1005 ,'James','London',26);
INSERT INTO SalesPersons VALUES ( 1008 ,'Charles','Florida',0);
SELECT * From SalesPersons;

-- Task-1 create Customer table
CREATE TABLE customer(customerId INT PRIMARY KEY,firstName VARCHAR(200), lastName VARCHAR(200) ,city VARCHAR(200),rating INT , salesId INT ,FOREIGN KEY(salesId) REFERENCES salesPersons(salesId) );

-- Task-2 create Order Table

CREATE TABLE orders (orderId INT , ammount INT  not  null , orderDate VARCHAR(200) ,customerId INT ,FOREIGN KEY(customerId) REFERENCES customer(customerId) );

-- Putting Values in Table Customer & Order
INSERT INTO customer  VALUES (2001,'hoffman', 'Anny','london' ,100,1001);
INSERT INTO customer  VALUES (2002,'Giovanni', 'Jenny','Rome' ,200,1003);
INSERT INTO customer  VALUES (2003,'Liu', 'William','San jose' ,100,1002);
INSERT INTO customer  VALUES (2004,'Harry', 'grass','berlin' ,300,1002);
INSERT INTO customer  VALUES (2005,'Clemens', 'john','london' ,200,1001);
INSERT INTO customer  VALUES (2006,'Fanny', 'john','San jose' ,200,1005);
INSERT INTO customer  VALUES (2007,'Jonathan', 'Bob','rome' ,300,1004);

INSERT INTO orders  VALUES (3001,123,'01-02-2020',2001);
INSERT INTO orders  VALUES (3003,187,'02-10-2020',2007);
INSERT INTO orders  VALUES (3002,100,'30-07-2000',2003);
INSERT INTO orders  VALUES (3005,201,'09-10-2011',2007);
INSERT INTO orders  VALUES (3009,145,'10-10-2012',2002);
INSERT INTO orders  VALUES (3007,167,'02-04-2021',2002);
INSERT INTO orders  VALUES (3008,189,'02-03-1999',2006);
INSERT INTO orders  VALUES (3010,100,'18-09-2000',2004);

-- Task-3 delete
DELETE FROM orders WHERE orderId = 3008;
-- Task-4 Delete
DELETE FROM salesPersons WHERE commisionRate = 0;
-- Task-5 Update
UPDATE orders SET ammount  = 200 WHERE ammount = 100;
-- Task-6 Update
UPDATE salesPersons SET  commisionRate = 28 WHERE  commisionRate = 26;
-- Task-7 Update
UPDATE customer SET  rating  = 150 WHERE rating = 100;
-- Task-8 Select
select * from salesPersons;
select * from customer;
select * from orders;