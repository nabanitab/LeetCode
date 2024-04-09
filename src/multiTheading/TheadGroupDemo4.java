package multiTheading;

//write a program to display all active threads name belongs to system group & it's child group
//belongs to system group & it's child group.
public class TheadGroupDemo4 {
    public static void main(String[] args) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        Thread[]t = new Thread[system.activeCount()];
        system.enumerate(t);
        for (Thread t1:t){
            System.out.println(t1.getName()+"..."+t1.isDaemon());
        }
    }
}
