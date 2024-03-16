package designPattern;

public class SingletonPractics {
    private static SingletonPractics instance;

    private SingletonPractics() {

    }

    public static SingletonPractics getInstance() {
        if (instance == null) {
            instance = new SingletonPractics();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonPractics singleton1 = new SingletonPractics();
        SingletonPractics singleton2 = new SingletonPractics();

        System.out.println(singleton1==singleton2);
    }
}

