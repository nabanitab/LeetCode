package multiTheading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMapThreadSafe {
    static Map<Integer, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Value" + i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Map size: " + map.size());
    }
}
