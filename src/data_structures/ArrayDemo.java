package me.jlokitha.data_structures;

import java.util.Arrays;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 31/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Demonstrates various ways to create arrays in Java and
 *              utilizes built-in methods from the java.util.Arrays class
 *              for array manipulation.
 */
public class ArrayDemo {

    public static void main(String[] args) {
        // 1. Declaration Without Initialization
        int[] numbers; // Declares an array of integers without initializing it

        // 2. Declaration with Explicit Initialization
        int[] explicitNumbers = new int[5]; // Creates an array of 5 integers, all initialized to 0

        // 3. Declaration with Inline Initialization
        String[] fruits = {"Apple", "Banana", "Cherry"}; // Creates and initializes an array of strings

        // 4. Declaration with Initialization Using 'new'
        double[] temperatures = new double[]{36.5, 37.0, 37.5}; // Creates and initializes an array of doubles

        // 5. Multidimensional Arrays
        int[][] matrix = new int[3][3]; // Creates a 3x3 matrix (2D array) of integers

        // Utilizing java.util.Arrays methods

        // Filling an array with a specific value
        Arrays.fill(explicitNumbers, 7); // Fills the entire array with the value 7
        System.out.println("Array after fill: " + Arrays.toString(explicitNumbers));

        // Sorting an array
        int[] unsortedNumbers = {5, 3, 8, 1};
        Arrays.sort(unsortedNumbers); // Sorts the array in ascending order
        System.out.println("Sorted array: " + Arrays.toString(unsortedNumbers));

        // Copying an array
        int[] copiedNumbers = Arrays.copyOf(unsortedNumbers, unsortedNumbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedNumbers));

        // Checking array equality
        boolean areEqual = Arrays.equals(unsortedNumbers, copiedNumbers);
        System.out.println("Arrays are equal: " + areEqual);

        // Searching within an array (binary search)
        int index = Arrays.binarySearch(unsortedNumbers, 5);
        System.out.println("Index of element '5': " + index);
    }
}
