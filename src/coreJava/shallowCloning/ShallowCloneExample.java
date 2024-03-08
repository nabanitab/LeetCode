package coreJava.shallowCloning;


//Shallow cloning creates a new object but copies only the object's fields. If the field is a reference to
// another object, the reference itself is copied, but the referenced object is not cloned.
public class ShallowCloneExample {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person original = new Person("John", address);

        try {
            Person cloned = (Person) original.clone();

            // Modify the cloned object's address
            cloned.getAddress().setCity("Los Angeles");

            // Both original and cloned objects will have the same address
            System.out.println("Original Address: " + original.getAddress().getCity()); // Los Angeles
            System.out.println("Cloned Address: " + cloned.getAddress().getCity()); // Los Angeles
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
