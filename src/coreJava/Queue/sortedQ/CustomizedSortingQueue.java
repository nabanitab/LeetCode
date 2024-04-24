package coreJava.Queue.sortedQ;

import java.util.Comparator;
import java.util.PriorityQueue;

// Define a class for the elements to be stored in the queue

public class CustomizedSortingQueue {
    public static void main(String[] args) {
        // Define a custom comparator for sorting elements based on their value
        Comparator<Element> customComparator = new Comparator<Element>() {
            @Override
            public int compare(Element e1, Element e2) {
                // Custom sorting logic - Sorting based on value in descending order
                return Integer.compare(e2.getValue(), e1.getValue());
            }
        };

        // Create a priority queue with the custom comparator
        PriorityQueue<Element> queue = new PriorityQueue<>(customComparator);

        // Add elements to the queue
        queue.offer(new Element(5));
        queue.offer(new Element(3));
        queue.offer(new Element(8));
        queue.offer(new Element(1));
        queue.offer(new Element(10));

        // Poll elements from the queue (sorted based on custom sorting logic)
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
