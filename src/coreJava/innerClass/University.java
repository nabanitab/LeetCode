package coreJava.innerClass;

public class University {

     class Department {
        public void m1() {
            // Create an instance of Department within University
            University.Department i = University.this.new Department();
        }
    }

    public static void main(String[] args) {
        University university = new University();

        // Create an instance of Department using the instance of University
        University.Department i = university.new Department();

        // Call the m1 method on the instance of University
        i.m1();
    }
}
