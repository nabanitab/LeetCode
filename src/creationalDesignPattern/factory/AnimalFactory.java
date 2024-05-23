package creationalDesignPattern.factory;



public class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            case "Duck":
                return new Duck();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}

