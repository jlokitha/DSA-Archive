package me.jlokitha.algorithms.sorting;

import java.util.Arrays;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 23/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. Big O Notation: O(n^2)
 */

public class InsertionSort {
    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Main method to test the Insertion Sort implementation
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
