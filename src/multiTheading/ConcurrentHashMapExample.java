package multiTheading;

import java.util.concurrent.ConcurrentHashMap;

//it is thread safe ,multiple thread can access,ConcurrentHashMap is divided into segments, each of which acts as an independent hash
// table. This allows concurrent access to different segments without blocking threads contending for access to other segments.
// ConcurrentHashMap uses fine-grained locking mechanisms to provide thread safety. Instead of locking the entire map,
// it locks only the segment(s) that are being modified, allowing concurrent reads to proceed without blocking
public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Create and start multiple threads
        for (int i = 1; i <= 5; i++) {
            String key = "Key" + i;
            Thread thread = new Thread(new WorkerThread(map, key));
            thread.start();
        }
    }
}

class WorkerThread implements Runnable {
    private ConcurrentHashMap<String, Integer> map;
    private String key;

    public WorkerThread(ConcurrentHashMap<String, Integer> map, String key) {
        this.map = map;
        this.key = key;
    }

    public void run() {
        // Write to the ConcurrentHashMap
        for (int i = 1; i <= 10; i++) {
            map.put(key, i);
            System.out.println("Thread " + Thread.currentThread().getName() + " put " + key + ": " + i);
            try {
                Thread.sleep(100); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Read from the ConcurrentHashMap
        int value = map.get(key);
        System.out.println("Thread " + Thread.currentThread().getName() + " read " + key + ": " + value);
    }
}

