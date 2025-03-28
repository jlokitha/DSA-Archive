package me.jlokitha.data_structures;

import java.util.Stack;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 28/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Demonstration of Stack operations and built-in methods in Java
 */
public class StackDemo {
    public static void main(String[] args) {
        // Initialize a Stack (LIFO data structure)
        // Note: Consider using Deque<Integer> stack = new ArrayDeque<>() for better performance
        Stack<Integer> stack = new Stack<>();

        // --------------------- Pushing Elements ---------------------
        // Push elements onto the stack (O(1) time complexity)
        stack.push(10);  // Bottom [10]
        stack.push(20);  // [10, 20]
        stack.push(30);  // [10, 20, 30]
        stack.push(40);  // [10, 20, 30, 40]
        stack.push(50);  // Top [10, 20, 30, 40, 50]

        // --------------------- Stack Inspection ---------------------
        // Peek at top element without removing (O(1))
        System.out.println("Top element: " + stack.peek());  // 50

        // Check if stack is empty (O(1))
        System.out.println("Is empty? " + stack.empty());    // false

        // Get stack size (O(1))
        System.out.println("Stack size: " + stack.size());   // 5

        // --------------------- Popping Elements ---------------------
        // Remove and return top element (O(1))
        System.out.println("Popped: " + stack.pop());  // 50 removed → [10, 20, 30, 40]
        System.out.println("Popped: " + stack.pop());  // 40 removed → [10, 20, 30]

        // --------------------- Element Search ---------------------
        // Search for element position (1-based index from top, O(n))
        System.out.println("Position of 20: " + stack.search(20));  // 2 (20 is 2nd from top)
        System.out.println("Position of 99: " + stack.search(99));  // -1 (not found)

        // --------------------- Clearing Stack ---------------------
        // Remove all elements (O(n))
        stack.clear();
        System.out.println("Stack after clear: " + stack);  // []
    }
}