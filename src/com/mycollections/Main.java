/**
 *  Java program to demonstrate operations on Queue.
 */

package com.mycollections;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a queue.
        Queue<Integer> queue = new ArrayDeque<>();

        // Adding elements to the queue.
        queue.offer(10);
        queue.offer(25);
        queue.offer(30);
        queue.offer(15);
        queue.offer(40);
        queue.offer(50);
        queue.offer(70);

        // Get the fron element.
        System.out.println(queue.peek()); // Output: 10

        // Remove element.
        System.out.println(queue.remove()); // Output: 10

        // Remove element.
        System.out.println(queue.remove()); // Output: 25

        // Size.
        System.out.println(queue.size()); // Output: 5

    }
}
