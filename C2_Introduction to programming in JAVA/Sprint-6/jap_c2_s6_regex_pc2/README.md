## Problem Statement - Secure Password

**You have just opened a new bank account and you wish to access it’s Internet Banking facility. You need to create a secure password to access the account. There are some rules to be followed while creating the password.**

The rules are mentioned below:
- The password should contain 8 to 20 characters.
- If the password consists of less than 8 or greater than 20 characters, then it is not a strong password.
- The password must contain both alphanumeric characters and an underscore (_).
- The first character of the password must be a letter i.e., either a lowercase character [a-z] or an uppercase character [A-Z].

**Write a program to identify whether the input string entered by the user is a strong password or not.**

**Sample Input**

    str = "Julia_21"
    str = "Julia2021"

**Expected Output**

    Strong password
    Weak password, try again
