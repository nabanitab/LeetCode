package lld.liskovSubstitutionPrinciple;

//It Does not follow Liskov principle.As if I change BiCycle with motorCycle than i will get error,and it's funtionality will change
public interface Bike {

    void turnOnEngine();
    void accelarate();
}
