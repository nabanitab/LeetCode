package coreJava.concurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMultithreadedExample {
    public static void main(String[] args) {
        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

        // Create and start multiple threads to update the map concurrently
        Thread thread1 = new Thread(new Updater(scores, "John", 10));
        Thread thread2 = new Thread(new Updater(scores, "Alice", 20));
        Thread thread3 = new Thread(new Updater(scores, "Bob", 15));

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final contents of the ConcurrentHashMap
        System.out.println("Scores:");
        scores.forEach((name, score) -> System.out.println(name + ": " + score));
    }

    // Runnable to update the ConcurrentHashMap
    static class Updater implements Runnable {
        private ConcurrentHashMap<String, Integer> scores;
        private String name;
        private int initialScore;

        public Updater(ConcurrentHashMap<String, Integer> scores, String name, int initialScore) {
            this.scores = scores;
            this.name = name;
            this.initialScore = initialScore;
        }

        @Override
        public void run() {
            // Simulate some computation
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Update the ConcurrentHashMap
            scores.put(name, initialScore);

            // Simulate further computation
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Update the score
            scores.compute(name, (key, value) -> value == null ? initialScore : value + 5);
        }
    }
}
