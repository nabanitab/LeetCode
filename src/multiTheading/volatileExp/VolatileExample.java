package multiTheading.volatileExp;


class SharedResource {
    volatile boolean flag = false; // ✅ volatile added

    public void writer() {
        System.out.println("Writer thread started...");
        flag = true;
        System.out.println("Writer thread updated flag = true");
    }

    public void reader() {
        System.out.println("Reader thread started...");
        while (!flag) {
            // busy waiting — but now visible due to volatile
        }
        System.out.println("Reader thread detected flag change!");
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Thread reader = new Thread(resource::reader);
        Thread writer = new Thread(resource::writer);

        reader.start();
        Thread.sleep(1000); // ensure reader starts first
        writer.start();
    }
}
