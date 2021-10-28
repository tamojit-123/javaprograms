package com.niit.quicksort;

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
        quickSort.sort(integerArray,numberOfComparisons,numberOfDataMovement);

        // Call method to sort array using quick sort
        int[] sortedArray = null;

        // Display the sorted array
        System.out.println("The sorted distances are : ");
        for(int i=0;i<integerArray.length;i++){
             System.out.println(integerArray[i]);
         }
        // Display the numberOfComparisons and numberOfDataMovement
        System.out.println("The number of comparisions="+numberOfComparisons+"the number of Data movement="+numberOfDataMovement);
    }

    // Function recursively sorts elements before and after partition
    public int[] sort(int[] array, int start, int end) {
        if (start < end){
         
        // pi is partitioning index, arr[p]
        // is now at right place
        int pi = partition(array, start, end);
 
        // Separately sort elements before
        // partition and after partition
        sort(array, start, pi - 1);
        sort(array, pi + 1, end);
    }

        return array;
    }

    /* Function takes last element as pivot, places the pivot element at its correct position in sorted array,
    and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
    private int partition(int[] array, int start, int end) {
        // pivot
    int pivot = array[end];
     
    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (start - 1);
 
    for(int j = start; j <= end - 1; j++)
    {
         
        // If current element is smaller
        // than the pivot
        if (array[j] < pivot)
        {
             
            // Increment index of
            // smaller element
            i++;
            swap(array, i, j);
        }
    }
    swap(array, i + 1, end);
    return (i + 1);

        
    }

    // Function swaps elements within array
    private void swap(int[] array, int index1, int index2) {
      // write logic to swap the values
      int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
    }
}