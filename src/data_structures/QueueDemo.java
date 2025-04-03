package me.jlokitha.data_structures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * -----------------------------------------------------------------------------
 * Author    : Janindu Lokitha
 * Created   : 28/03/2025
 * Portfolio : https://jlokitha.me/
 * GitHub    : https://github.com/jlokitha
 * -----------------------------------------------------------------------------
 * Description: Demonstration of Queue operations and built-in methods in Java
 */
public class QueueDemo {
    public static void main(String[] args) {
        // Initialize a Queue using LinkedList implementation
        // (Queue is an interface - cannot be instantiated directly)
        Queue<Integer> queue = new LinkedList<>();

        // --------------------- Adding Elements ---------------------
        // Add elements to the queue (enqueue operations)
        queue.add(10);   // Adds to rear → [10] (throws exception if capacity restricted)
        queue.offer(20); // Adds to rear → [10, 20] (returns false if full)
        queue.offer(30); // → [10, 20, 30]

        // --------------------- Queue Inspection ---------------------
        // Peek at front element without removing
        System.out.println("Front element: " + queue.peek());  // 10

        // Get queue size
        System.out.println("Queue size: " + queue.size());     // 3

        // Check if empty
        System.out.println("Is empty? " + queue.isEmpty());    // false

        // --------------------- Removing Elements ---------------------
        // Remove and return front element (dequeue operations)
        System.out.println("Removed: " + queue.remove());  // 10 → [20, 30] (throws exception)
        System.out.println("Removed: " + queue.poll());    // 20 → [30] (returns null if empty)

        // --------------------- Special Operations ---------------------
        // Get front element (throws exception if empty)
        System.out.println("Element at front: " + queue.element());  // 30

        // Clear all elements
        queue.clear();
        System.out.println("Queue after clear: " + queue);  // []
    }
}