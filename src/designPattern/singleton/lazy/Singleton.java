package designPattern.singleton.lazy;

//In Lazy way there is a problem when two thread came ,and get null ,two thread will be created 2
// instance,so we should not use this one,instead we use syncronized
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1==singleton2);
    }
}

