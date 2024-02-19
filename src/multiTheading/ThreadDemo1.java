package multiTheading;

public class ThreadDemo1 {
    public static void main(String[] args) {
        ExtendingThreadClass threadClass = new ExtendingThreadClass();
        threadClass.start();
        for (int i = 0 ; i<10; i++){
            System.out.println("main thread");
        }
    }
}
