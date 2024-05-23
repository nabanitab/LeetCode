package lld.InterfaceSagmentPrinciple;

public class WaiterClass implements WaiterInterface{
    @Override
    public void serveCustomer() {
        System.out.println("serving customer");
    }

    @Override
    public void takeOrder() {
        System.out.println("taking order");
    }
}
