package com.jap.sortwords;

/* Write a Java program to sort all of the words in the list in alphabetical order and display */
public class SortWords {
    public static void main(String[] args) {
        String[] words = {};

        SortWords sortWords = new SortWords();
        // Call method to sort words alphabetically

        String[] sortedWords = sortWords.sort(words);
		
        // Display the words after sorting alphabetically
		for(String i : sortedWords){
			System.out.println(i);
		}
    }

    // Function to sort words in an array in alphabetical order
    public String[] sort(String[] words) {
		for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if((words[i].toLowerCase()).compareTo(words[j].toLowerCase()) > 0)
                {
                    String temp=words[i];
					words[i] = words[j];
					words[j] = temp;
                }
            }
        }

        return words;
    }
}