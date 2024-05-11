package coreJava.generics;

import java.util.ArrayList;
import java.util.List;

// A generic class using a type parameter T
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> integerBox = new Box<>(10);
        System.out.println("Integer value: " + integerBox.getContent());

        // Creating a Box for String
        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("String value: " + stringBox.getContent());

        // Creating a List of integers using generics
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        System.out.println("List of integers: " + integerList);
    }
}

