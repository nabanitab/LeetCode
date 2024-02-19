package multiTheading;

public class ThreadDemo2 {
    public static void main(String[] args) {


        ImplementingRunnableInterface implementingRunnableInterface = new ImplementingRunnableInterface();
        Thread t = new Thread(implementingRunnableInterface);
        //start() : for start the thread.
        t.start();
        for (int i =0; i<10; i++){
            System.out.println("main thread");
        }
    }
}
