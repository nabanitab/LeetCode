package creationalDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionApiOnSingleton {
    private static ReflectionApiOnSingleton instance = new ReflectionApiOnSingleton();

    private ReflectionApiOnSingleton() {
        // Private constructor
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already created");
        }
    }

    public static ReflectionApiOnSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        ReflectionApiOnSingleton reflectionApiOnSingleton1 = ReflectionApiOnSingleton.getInstance();
        System.out.println("Instance 1: " + reflectionApiOnSingleton1.hashCode());

        try {
            // Using reflection to access the private constructor
            Constructor<ReflectionApiOnSingleton> constructor = ReflectionApiOnSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            ReflectionApiOnSingleton reflectionApiOnSingleton2 = constructor.newInstance();
            System.out.println("Instance 2: " + reflectionApiOnSingleton2.hashCode());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
