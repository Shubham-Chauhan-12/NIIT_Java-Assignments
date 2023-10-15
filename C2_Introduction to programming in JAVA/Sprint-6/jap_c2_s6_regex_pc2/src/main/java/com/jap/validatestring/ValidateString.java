package com.jap.validatestring;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateString {
    public static void main(String[] args) {
        String str = "Julia_21";

        ValidateString validateString = new ValidateString();
        // Call method to check if input string is valid or not
        if (!validateString.validatePassword(str)) {
            System.out.println("Invalid Password");
        } else {
            System.out.println("Valid Password!");
        }
    }

    // Function to validate username based on the specified rules
    public boolean validatePassword(String str) {
		if(str==null)
		{
			return false;
		}
		Pattern objPattern = Pattern.compile("[a-zA-Z]"+"[a-zA-Z0-9_]{7,20}");
		    // ("[_]+")
		Matcher matcher = objPattern.matcher(str);
		if(matcher.matches())
		{
			return true;
		}
        return false;
    }
}