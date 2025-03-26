package me.jlokitha.algorithms.searching;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 23/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Binary search is a search algorithm that finds the position of a target value within a sorted array. Big O Notation: O(log n)
 */
public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) return recursiveBinarySearch(nums, target, mid + 1, right);
            else return recursiveBinarySearch(nums, target, left, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;

//        int result = binarySearch(nums, target);
        int result = recursiveBinarySearch(nums, target, 0, nums.length - 1);

        if (result == -1) System.out.println("Element not found");
        else System.out.println("Element found at index: " + result);
    }
}
