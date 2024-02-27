package coreJava.methodOverring;

public class CarController {

    public static void main(String[] args) {
        Car regularCar = new Car();
        Tata tata = new Tata() {};

        regularCar.startEngine(); // Output: Engine started
        tata.startEngine();  // Output: tata car engine started with a roar!
    }
}
