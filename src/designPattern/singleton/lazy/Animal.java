package designPattern.singleton.lazy;

public class Animal {

    // private static instance of the class
    private static Animal animal;

    // private constructor to prevent instantiation
    private Animal() {
    }

    // public method to provide access to the single instance
    public static Animal getAnimal() {
        if (animal == null) {
            animal = new Animal();
        }
        return animal;
    }

    public static void main(String[] args) {
        // Obtain the single instance using the getAnimal() method
        Animal animal1 = Animal.getAnimal();
        Animal animal2 = Animal.getAnimal();

        // Verify that both references point to the same instance
        System.out.println(animal1 == animal2); // Should print true
    }
}