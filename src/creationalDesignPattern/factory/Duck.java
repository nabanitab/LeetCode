package creationalDesignPattern.factory;

public class Duck implements Animal {
    @Override
    public void speak() {
        System.out.println("Quack");
    }
}