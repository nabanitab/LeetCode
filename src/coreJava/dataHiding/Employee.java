package coreJava.dataHiding;

//data hiding: Outside person can't access our data .
//By declaring or data member or variable as private we can achieve data hiding.
public class Employee {

    private int empId;

    private double balance;

    private String empName;

    public double getBalance(){
        return balance();
    }

    private double balance() {
        return balance;
    }

}

