package me.jlokitha.data_structures;

import java.util.LinkedList;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 28/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Demonstration of LinkedList operations and built-in methods in Java
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // Initialize a LinkedList (doubly-linked list implementation)
        LinkedList<Integer> list = new LinkedList<>();

        // --------------------- Adding Elements ---------------------
        // Add elements to the end of the list (O(1) for addLast())
        list.add(1);        // Equivalent to addLast()
        list.add(2);        // [1, 2]
        list.addLast(3);    // Explicitly add to end [1, 2, 3]

        // Add element to the beginning (O(1))
        list.addFirst(0);   // [0, 1, 2, 3]

        // Insert at specific index (O(n) for index access + O(1) insertion)
        list.add(2, 100);   // [0, 1, 100, 2, 3]

        // --------------------- Accessing Elements ---------------------
        // Get first element (throws NoSuchElementException if empty)
        int first = list.getFirst();  // 0

        // Get last element (throws NoSuchElementException if empty)
        int last = list.getLast();    // 3

        // Get element by index (O(n) traversal)
        int element = list.get(2);    // 100

        // Peek at first element (returns null if empty)
        Integer peeked = list.peek();  // 0 (doesn't remove)

        // --------------------- Removing Elements ---------------------
        // Remove first element (throws NoSuchElementException if empty)
        int removedFirst = list.removeFirst();  // 0 removed → [1, 100, 2, 3]

        // Remove last element (throws NoSuchElementException if empty)
        int removedLast = list.removeLast();   // 3 removed → [1, 100, 2]

        // Remove by index (O(n))
        int removedByIndex = list.remove(1);   // 100 removed → [1, 2]

        // Poll first element (returns null if empty)
        Integer polled = list.poll();          // 1 removed → [2]

        // --------------------- Utility Methods ---------------------
        // Check if empty
        boolean isEmpty = list.isEmpty();     // false

        // Get size
        int size = list.size();               // 1

        // Check if contains element
        boolean contains = list.contains(2);  // true

        // Clear the list
        list.clear();                         // []
    }
}