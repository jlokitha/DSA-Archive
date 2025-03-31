package me.jlokitha.algorithms.sorting;

import java.util.Arrays;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 23/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Selection sort is a simple sorting algorithm that sorts an array by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning. Big O Notation: O(n^2)
 */

public class SelectionSort {
    // Method to perform Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is the first element
            int minIndex = i;

            // Check the rest of the array to find the true minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted subarray
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method to test the Selection Sort implementation
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}

