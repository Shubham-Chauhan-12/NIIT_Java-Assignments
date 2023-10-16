# Problem Statement - Credentials Validator

A bank provides mobile banking facility to all its customers. All customers who login with a username and password must be validated by the banking application.
Write a program that will aid the application in validating the users. Use the Java 8 features.

- Create a functional interface called CredentialsValidator that contains one abstract method.

**public String validator(String userId, String password);**

- Create a class called CredentialsValidatorImpl and implement the Functional interface method as an anonymous class inside a method, use lambdas to simplify the program.

**public String validateUser(String name, String password)**

- Execute the test cases provided in the test folder.
