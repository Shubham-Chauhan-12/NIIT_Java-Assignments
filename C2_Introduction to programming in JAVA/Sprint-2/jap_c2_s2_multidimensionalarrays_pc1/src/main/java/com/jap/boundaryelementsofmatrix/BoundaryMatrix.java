package com.jap.boundaryelementsofmatrix;


public class BoundaryMatrix {
    public static void main(String[] args) {

    // Declare and initialize an integer array to find its boundary elements
    int integerArray[][] = null;

    BoundaryMatrix boundaryMatrix = new BoundaryMatrix();
    // Call the function to display the integer array
        boundaryMatrix.printArray(integerArray);
        System.out.println();

    // Display the sum of the boundary elements of the integer array
    long sumOfBoundaryElements = boundaryMatrix.printAndCalculateSumOfBoundaryElements(integerArray);
}

    // Function to print the input array
    public void printArray(int[][] array) {


		for (int i=0;i<array.length;i++)
		{
			for (int j=0;j<array[i].length;j++)
			{
				if(i==0 || i==array.length-1 || j==0 || j==array[i].length-1)
				{
					System.out.print(array[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
    }

    /*Function to print the boundary elements of the input array and calculate the sum of all the
     boundary elements
     */
    public long printAndCalculateSumOfBoundaryElements(int[][] array) {
        long sumOfBoundaryElements = 0;

		for (int i=0;i<array.length;i++)
		{
			for (int j=0;j<array[i].length;j++)
			{
				if(i==0 || i==array.length-1 || j==0 || j==array[i].length-1)
				{
					sumOfBoundaryElements = sumOfBoundaryElements+array[i][j];
				}
			}
		}

        return sumOfBoundaryElements;
    }


}