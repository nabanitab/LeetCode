package multiTheading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Executor service or thread pool is already created thread ready to do our job
public class ExecutorDemo {
    public static void main(String[] args) {
        // Create an array of print jobs
        PrintJobUsingThreadPool[] jobs = {
                new PrintJobUsingThreadPool("durga"),
                new PrintJobUsingThreadPool("Ravi"),
                new PrintJobUsingThreadPool("Pavan"),
                new PrintJobUsingThreadPool("Suresh"),
                new PrintJobUsingThreadPool("Anil")
        };

        // Create a fixed-size thread pool with 3 threads
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit each print job to the thread pool
        for (PrintJobUsingThreadPool job : jobs) {
            service.submit(job);
        }

        // Shutdown the thread pool
        service.shutdown();
    }
}