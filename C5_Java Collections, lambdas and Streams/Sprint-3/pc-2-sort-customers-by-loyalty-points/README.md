# Problem Statement - Sort Customers by Loyalty Points​

The customer data of a departmental store is being analyzed. Help sort data by customer loyalty points, in descending order.

The details of a customer, like a customer ID, name, gender, city, senior citizen status, and loyalty points, will be captured in a class Customer.​

- Define the Customer class with customer ID, name, gender, city, senior citizen status, and loyalty points.​
- In the Customer class:​

  - Define a parameterized constructor.​
  - Declare getter and setter methods for all the variables.​
  - Generate a toString method as shown below:

        ​Customer{customerId=4344, customerName='Rhonda', customerGender='Female', isSeniorCitizen=false, city='Austin', loyaltyPoints=120}​

- Create the LoyaltyPointComparator class that must implement the Comparator interface.​
- The implementation for the compare method is given in the LoyaltyPointComparator class.​
- The logic to compare the customer objects based on the customer’s loyalty points is given in the compare method.​
- Create the CustomerService class that sorts the customer objects by name.​

- Define a method as shown below:​

  **public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator)**

- The method will call the sort method of the collections class and sort the given list of customer objects in descending order of loyalty points.​
- Store all the sorted customer loyalty points in a list of integers.​
- Return the sorted list of loyalty points.​
- Execute all the test cases available in the test folder.​

​
