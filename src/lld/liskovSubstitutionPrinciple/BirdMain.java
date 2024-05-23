package lld.liskovSubstitutionPrinciple;

public class BirdMain {
    public static void makeBirdMove(Bird bird) {
        bird.move();
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        makeBirdMove(sparrow);  // Sparrow is flying

        Ostrich ostrich = new Ostrich();
        makeBirdMove(ostrich);  // Ostrich is walking
    }
}