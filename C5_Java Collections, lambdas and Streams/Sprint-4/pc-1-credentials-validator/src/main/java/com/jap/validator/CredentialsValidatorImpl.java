package com.jap.validator;

import java.util.Objects;
import java.util.Scanner;

public class CredentialsValidatorImpl {
    public String validateUser(String name, String password){
       // String response =" ";
        CredentialsValidator obj = (userId ,password1) ->{
            if(Objects.equals(userId, "admin") && Objects.equals(password1, "1234")){
                return "valid user";
            }
            else return "invalid user";
        };
        return obj.validateUser(name,password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the UserId");
        String name = scanner.next();
        System.out.println("Enter the password");
        String password = scanner.next();
        CredentialsValidatorImpl obj1 = new CredentialsValidatorImpl();
        System.out.println( obj1.validateUser(name,password));
    }


}
