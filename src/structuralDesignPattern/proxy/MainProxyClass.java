package structuralDesignPattern.proxy;

public class MainProxyClass {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded from disk and displayed
        image.display();

        // Image will be displayed directly without loading from disk
        image.display();
    }
}

