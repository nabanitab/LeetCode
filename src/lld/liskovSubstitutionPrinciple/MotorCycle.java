package lld.liskovSubstitutionPrinciple;

public class MotorCycle implements Bike{

    boolean isEngineOn;
    int speed;
    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelarate() {
        speed = speed+10;
    }
}
