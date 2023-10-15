package com.jap.palindrome;

/* Write a java program to find if any of the words in the list is a palindrome or not, print their count and the palindrome words.*/
public class Palindrome {
    public static void main(String[] args) {
        String[] words = {};
        Palindrome palindrome = new Palindrome();

        // Call method to find palindromes in array of words
        System.out.println("Total number of palindromes: " + palindrome.findPalindromeWords(words));
    }

    // Function to find palindromes in an array of words
    public int findPalindromeWords(String[] words) {
		String st="", newCh="";
		int count=0;
		char ch;

		for(int i=0;i<words.length;i++)
		{
			newCh="";
			st=words[i];
			for(int j=0;j<st.length();j++)
			{
				ch=st.charAt(j);
				newCh = ch+newCh;
			}
			if(newCh.equalsIgnoreCase(st)==true)
			{
				count++;
			}
			
		}
		if(count>0)
		{
			return count;
		}
        return 0;
    }
}