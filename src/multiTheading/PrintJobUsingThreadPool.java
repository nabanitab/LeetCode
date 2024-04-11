package multiTheading;

public class PrintJobUsingThreadPool implements Runnable {

    String name;

    public PrintJobUsingThreadPool(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + "...Job started by thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.println(name + "...job completed by Thread: " +
                Thread.currentThread().getName());
    }

}
