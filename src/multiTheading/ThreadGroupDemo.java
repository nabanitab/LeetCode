package multiTheading;

public class ThreadGroupDemo {

    public static void main(String[] args) {
       ThreadGroup g1 = new ThreadGroup("FirstGroup");
        System.out.println(g1.getParent().getName());

        ThreadGroup g2 = new ThreadGroup("SecondGroup");
        System.out.println(g2.getParent().getName());

    }
}
