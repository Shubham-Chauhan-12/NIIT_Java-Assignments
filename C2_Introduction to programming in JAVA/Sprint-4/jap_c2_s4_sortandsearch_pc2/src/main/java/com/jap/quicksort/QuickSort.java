package com.jap.quicksort;

/* Write a program that stores 10 numbers in an array and sorts them by using the quick sort algorithm.
In addition, the program should also calculate the number of comparisons and the number of data movements.
 */
public class QuickSort {
    // Calculates number of comparisons done while sorting an array using quick sort
    static int numberOfComparisons = 0;
    // Calculates number of swaps while sorting an array using quick sort
    static int numberOfDataMovement = 0;

    public static void main(String[] args) {
        // Declare the array with the distances
        int[] integerArray = {138,52,118,136,85,276,103,87,214,101};
        QuickSort quickSort = new QuickSort();

		//quickSort.sort(integerArray, 0, integerArray.length-1);

        // Call method to sort array using quick sort
        int[] sortedArray = null;
        // Display the sorted array
        System.out.println("The sorted distances are : ");

        // Display the numberOfComparisons and numberOfDataMovement
    }

    // Function recursively sorts elements before and after partition
    public int[] sort(int[] array, int start, int end) {
		if(start<end)
		{
			int pidx=partition(array, start, end);

			sort(array, start, pidx-1);
			sort(array, pidx+1, end);
		}

        return array;
    }

    /* Function takes last element as pivot, places the pivot element at its correct position in sorted array,
    and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
    private int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i=start-1;

		for(int j=start;j<end;j++)
		{
			if(array[j]<pivot)
			{
				i++;
				swap(array, i, j);
			}
		}
		i++;
		swap(array, i, end);
        return i;
    }

    // Function swaps elements within array
    private void swap(int[] array, int index1, int index2) {

		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
      // write logic to swap the values
    }
}