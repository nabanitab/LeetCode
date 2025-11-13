package fome;

public class parent {


    public String name;

    public int age;

    public parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayParentInfo(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);

    }
}
