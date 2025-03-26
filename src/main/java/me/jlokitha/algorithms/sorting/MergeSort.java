package me.jlokitha.algorithms.sorting;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 25/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Merge sort is a sorting algorithm that uses the divide and conquer strategy to sort an array. Big O Notation: O(n log n)
 */
public class MergeSort {
    public static void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);

            merge(nums, low, mid, high);
        }
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = nums[low + i];
        for (int i = 0; i < n2; i++) right[i] = nums[mid + 1 + i];

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            nums[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 14, 3, 21, 1};

        mergeSort(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
