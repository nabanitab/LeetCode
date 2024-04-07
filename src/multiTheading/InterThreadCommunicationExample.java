package multiTheading;

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        Data data = new Data();

        // Creating threads
        Thread producerThread = new Thread(new Producer(data));
        Thread consumerThread = new Thread(new Consumer(data));

        // Starting threads
        producerThread.start();
        consumerThread.start();
    }
}

// Shared data class
class Data {
    private int value;
    private boolean produced = false;

    // Synchronized method to put value
    public synchronized void put(int value) {
        // Wait until the previous value is consumed
        while (produced) {
            try {
                wait(); // Release lock and wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        System.out.println("Produced: " + value);
        produced = true;
        notify(); // Notify waiting consumer thread
    }

    // Synchronized method to get value
    public synchronized int get() {
        // Wait until a value is produced
        while (!produced) {
            try {
                wait(); // Release lock and wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + value);
        produced = false;
        notify(); // Notify waiting producer thread
        return value;
    }
}

// Producer class
class Producer implements Runnable {
    private Data data;

    public Producer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            data.put(i);
            try {
                Thread.sleep(1000); // Simulating some task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            data.get();
            try {
                Thread.sleep(2000); // Simulating some task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

