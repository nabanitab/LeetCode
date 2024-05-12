package java8;


public class FunctionalInterfaceExample {

    interface MyFunctionalInterface {
        void execute();

        void display();
    }

    public static void main(String[] args) {
        MyFunctionalInterface obj = new MyFunctionalInterface() {
            @Override
            public void execute() {
                System.out.println("Execute..");
            }

            @Override
            public void display() {
                System.out.println("Display..");
            }
        };

        obj.execute();
        obj.display();
    }
}

