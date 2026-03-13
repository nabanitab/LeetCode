package coreJava.inheritance;

public class Dog extends Animal {
    void  bark(){
        System.out.println("dog barks" +
                "");
    }
    void eat(){
        super.eat();
        System.out.println("Dog eats");
    }

    static void colour(){
        System.out.println("dog clour");
    }

    @Override
    void sound(){
        System.out.println("Dog barks like : ghew ghew");
    }
    static void main() {
        Dog d = new Dog();
        d.bark();
        d.eat();

        //Decision happen at the runtime, polimorphism
        Animal a = new Dog();
        a.sound();
    }
}
