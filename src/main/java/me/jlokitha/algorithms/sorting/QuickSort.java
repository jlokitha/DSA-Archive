package me.jlokitha.algorithms.sorting;

import java.util.Arrays;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 25/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Quick sort is a sorting algorithm that uses the divide and conquer strategy to sort an array. Big O Notation: O(n log n). But in the worst case, it can be O(n^2).
 */
public class QuickSort {
    // Partition function using Lomuto's scheme
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choose the last element as pivot
        int i = low - 1;        // pointer for the smaller element

        // Traverse through all elements and compare with pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;  // return the pivot index
    }

    // The main QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now in the correct place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
