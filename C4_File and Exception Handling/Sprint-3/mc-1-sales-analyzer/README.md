# Problem Statement - Sales Analysis

Sales analysis is done at regular intervals by sales managers of large organizations. Studying and analyzing past sales records helps them determine which products their teams need to focus on by understanding the likes and dislikes of their customers more effectively.​
In this challenge, you'll need to build an analyzer to analyze the historical sales data of an e-commerce website, which is available as a CSV (Comma Separated Value) file.

The file contains the following information:

- date – It contains the date of the purchase.
- customer_id – It contains the customer_id of the customer who has purchased the product.
- product_category – It contains the category_id of the product being sold.
- payment_method - This can have only two values; credit for credit card payments and PayPal for payments made through PayPal. 
- value – It contains the sales amount in USD.
- time_on_site – This contains the amount of time a customer has spent on an e-commerce site.
- clicks_in_site – It contains the number of clicks a user has made while accessing a site. This value is captured to see how many products a customer has viewed before making a purchase decision.

## Tasks

### Task 1
- Create a class to hold the sales records of individual products called SalesData and declare attributes as specified in the CSV file. 
- Use appropriate data types for all the variables.
- Write it as a well-encapsulated class.
- Override the toString() method.

### Task 2

- Create an implementation class called SalesDataAnalyzer.
- Use the method **public SalesData[] readFile(String fileName)** to read the CSV file that contains data of the sales record 
- In the readFile method, 
  - Read the file line by line, using the FileReader and BufferedReader classes.
  - Declare a salesData[] array that will hold records of SalesData.
  - Declare and initialize the SalesData object.
  - Iterate through the array and add the values to it.
  - Parse the values as required and add them to the SalesData object.
- Display all the records.
- Handle all exceptional situations that might occur while reading the file and parsing the values.