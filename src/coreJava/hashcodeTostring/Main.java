package coreJava.hashcodeTostring;

public class Main {
    public static void main(String[] args) {
        // Creating two Department objects
        Department department1 = new Department();
        department1.setId(1);
        department1.setName("Engineering");
        department1.setCompany("ABC Corp");

        Department department2 = new Department();
        department2.setId(1);
        department2.setName("Engineering");
        department2.setCompany("ABC Corp");

        // Printing department details using toString()
        System.out.println("Department 1: " + department1);
        System.out.println("Department 2: " + department2);

        // Checking equality using equals() method
        System.out.println("Are departments equal? " + department1.equals(department2));

        // Checking hash codes
        System.out.println("Hash code for department 1: " + department1.hashCode());
        System.out.println("Hash code for department 2: " + department2.hashCode());
    }
}
