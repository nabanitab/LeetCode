package java16;


public class TestRecord {
    public static void main(String[] args) {
        Employee e = new Employee("Nabanita", 101, 95000.0);
        System.out.println(e.name());    // prints field value
        System.out.println(e);           // auto-generated toString()
    }
}