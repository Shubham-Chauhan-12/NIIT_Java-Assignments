package com.jap.longestsubstring;

/* Given a string, find the longest substring that appears at both ends of a given StringBuilder*/
public class LongestSubstring {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("playersplay");

        LongestSubstring longestSubstring = new LongestSubstring();
        // Call method to find longest substring that appears at both ends of a string
        System.out.println(longestSubstring.findLongestSubString(str));
    }

    //Function to find the longest substring that appears at both ends of a string
    public StringBuilder findLongestSubString(StringBuilder str) {
		StringBuilder substring = new StringBuilder();
		int tempLen=0; 
		
		String tempStr="", result="";
		if(str==null)
		{
			result += "Invalid string";
			return substring.append(result);
		}

		int len = str.length();

		if(len==0)
		{
			result += "Invalid string";
		}
		else if(len==1)
		{
			result += str.charAt(0);
		}
		else
		{
			for (int i=0;i<len;i++)
			{
				tempStr += str.charAt(i);
				tempLen = tempStr.length();
				if(i<len/2 && tempStr.equals(str.substring(len-tempLen)))
				{
					result = tempStr;
				}
			}
			if(result=="")
			{
				result = "Longest substring is not present in the given StringBuilder";
			}
		}

		substring.append(result);
        return substring;
    }
}