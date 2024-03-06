package coreJava.encapsulatedComponent;

public class Account {

    private double balance;

    private String name;


    //only get method
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    //only constructor
    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }
}
