package multithred;

public class ThreadExample extends Thread{

    @Override
    public void run(){
        System.out.println("Thread running"+currentThread().getName());
    }

}
