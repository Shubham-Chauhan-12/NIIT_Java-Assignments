# Problem Statement - Sort Customers by Name

The customer data of a departmental store is being analyzed. Help sort the data by alphabetical order of customer names.​
The details of a customer like a customer ID, name, gender, city, and senior citizen status, will be captured in a class Customer.​

- Define the Customer class with customer ID, name, gender, city, is the customer a senior citizen or not.​
  - In the Customer class:​
    - Define a parameterized constructor.
    - Declare getter and setter methods for all the variables.
    - Generate a toString method as shown below.
    
    "Customer{" "customerId=" + customerId + ", customerName='" + customerName + '\'' +
    ", customerGender='" + customerGender + '\'' +
    ", isSeniorCitizen=" + isSeniorCitizen +
    ", city='" + city + '\'' + '}';
- The Customer class must implement the Comparable interface.
- The implementation for the compareTo method is given in the Customer class.
- The logic for comparing the customer objects based on the customer's name is given in the compareTo method.

                   