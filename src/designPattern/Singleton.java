package designPattern;

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
      Singleton singleton1 = new Singleton();
      Singleton singleton2 = new Singleton();

        System.out.println(singleton1==singleton2);
    }
}
