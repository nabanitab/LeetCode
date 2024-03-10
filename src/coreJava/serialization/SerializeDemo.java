package coreJava.serialization;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d1 = new Dog();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog d2 = (Dog) ois.readObject();
        System.out.println(d2.i+"  " +d2.j);
    }
}
