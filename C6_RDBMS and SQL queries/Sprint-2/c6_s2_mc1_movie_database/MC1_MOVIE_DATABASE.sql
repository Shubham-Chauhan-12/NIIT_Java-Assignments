-- Task -1

CREATE DATABASE IF NOT EXISTS Movie_Database;
USE Movie_Database;
CREATE TABLE Movie( Title VARCHAR(100),Budget_In_Millions INT,Release_Date VARCHAR(100),Revenue_In_Millions INT,Rating_Average DECIMAL(10,2));
INSERT INTO  Movie VALUES('Avatar',237,'10-12-2009',278,7.2),('Titanic',200,'18-11-1997',185,7.5),('The Avengers',220,'25-04-2012',152,7.4),
('Jurassic World',150,'09-06-2015',151,6.5),('Furious 7',190,'01-04-2015',150,7.3),
('The Avengers:Age Of Ultron',280,'22-04-2015',141,7.3),
('Iron Man3',200,'18-04-2013',122,6.8),('Minions',74,'17-06-2015',11,6.4),
('CaptainAmerica:CivilWar',250,'27-04-2016',151,7.1),('Transformers:Dark Of The Moon',195,'28-06-2011',112,6.1);



-- Task-2

--  2.1
SELECT * FROM Movie;
--  2.2
SELECT * FROM Movie WHERE Title = 'Jurassic World' AND Rating_Average = 6.5;
--  2.3
SELECT * FROM Movie WHERE  Rating_Average >= 7;
--  2.4
SELECT * FROM Movie WHERE Title = 'The Avengers';
--  2.5
SELECT Title,Rating_Average FROM Movie WHERE Rating_Average BETWEEN 7 AND 8;
--  2.6
SELECT Title ,Budget_In_Millions FROM Movie WHERE  Budget_In_Millions >= 250 ;
--  2.7
SELECT Title,Rating_Average FROM Movie WHERE Revenue_In_Millions  BETWEEN 150 AND 200;
--  2.8
SELECT Title ,Release_Date FROM Movie WHERE  Title LIKE 'T%' ;
--  2.9
SELECT SUM(Revenue_In_Millions) FROM Movie;
--  2.10
SELECT Title FROM Movie WHERE Revenue_In_Millions = (SELECT MIN(Revenue_In_Millions) FROM Movie);



