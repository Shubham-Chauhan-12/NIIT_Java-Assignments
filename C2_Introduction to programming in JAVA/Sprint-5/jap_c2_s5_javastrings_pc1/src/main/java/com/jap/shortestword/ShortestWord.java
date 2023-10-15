package com.jap.shortestword;

/* "Write a Java program to get the strings as input from the user and push them to an array.
 Find the shortest word in the list of Strings and output the same on screen.*/
public class ShortestWord {
    public static void main(String[] args) {
        // Input number of words in array using scanner
        int numberOfWords = 0;

        // Input array of words to be compared using scanner
        String[] words = new String[]{};

        ShortestWord shortestWord = new ShortestWord();
        // Call the method and display shortest word in array of words
        System.out.println("Shortest word is " + shortestWord.findShortestWord(words));
    }

    // Function to find shortest word in array of words
    public String findShortestWord(String[] words) {
 		int temp=0, index=0,i=0;
		String st="", result="";

		if(words.length==0)
		{
			return "Cannot find shortest word as array is empty";
		}

		st=words[0];
		int smallest = st.length();

		for (i=0;i<words.length;i++)
		{
			st=words[i];
			temp = st.length();
			if(temp<smallest)
			{
				smallest=temp;
				index=i;
			}
		
		}
		result = words[index];
        return result;
    }
}