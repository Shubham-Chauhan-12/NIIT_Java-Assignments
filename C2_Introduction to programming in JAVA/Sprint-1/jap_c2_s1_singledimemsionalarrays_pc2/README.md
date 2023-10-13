## Practice Statement - Replacing Consecutive Pair of Integers with their Sum

**Write a program to initialize an array of integers. Create a new array by adding every two consecutive elements 
from the start.**

For example,

#### If the array length is even, then consecutive elements are added.

    int[] inputArray = {6, 1, 9, 4, 7, 11, 2, 2, 12, 12}
    First element = 6
    Second element = 1
    int [] outputArray = {7, 13, 18, 4, 24}

#### But, if the array length is odd, the consecutive elements till the second last element are added and then the last element is copied onto the outputArray.

    int[] inputArray = {6, 1, 9, 4, 7, 11, 2, 2, 12}
    int [] outputArray = {7, 13, 18, 4, 12} 