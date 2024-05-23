package lld.liskovSubstitutionPrinciple;

abstract class Bird {
    public abstract void move();
}

class FlyingBird extends Bird {
    @Override
    public void move() {
        fly();
    }

    public void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class NonFlyingBird extends Bird {
    @Override
    public void move() {
        walk();
    }

    public void walk() {
        System.out.println("Walking");
    }
}

class Ostrich extends NonFlyingBird {
    @Override
    public void walk() {
        System.out.println("Ostrich is walking");
    }
}



