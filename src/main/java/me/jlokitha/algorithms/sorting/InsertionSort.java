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
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};

        insertionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
