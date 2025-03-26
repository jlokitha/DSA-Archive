package me.jlokitha.algorithms.searching;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 23/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Linear search is a simple search algorithm that searches for a element in a list in sequential order. Big O Notation: O(n)
 */
public class LinearSearch {
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;

        int result = linearSearch(nums, target);

        if (result == -1) System.out.println("Element not found");
        else System.out.println("Element found at index: " + result);
    }
}
