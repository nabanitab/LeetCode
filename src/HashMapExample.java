import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/*
    public static int test() {
        try {
            System.out.println("Inside try block:2");
            return 1;
        } finally {
            System.out.println("Inside finally block before exit:3");
            System.exit(0);
            System.out.println("Inside finally block after exit:4");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling test(): 1");
        int result = test();
        System.out.println("Returned value: 5" + result);
    }
}
*/

/*
Explanation You Should Give:

1. HashMap uses hashing mechanism.
When we call put(key, value), HashMap:

Calculates hashCode() of key → decides the bucket.

Then uses equals() → checks if the key already exists in that bucket.

2. By default, Object’s hashCode and equals are reference-based.
So:

new Employee("101")  // object1
new Employee("101")  // object2


These two objects have same data but different references, so:

Default hashCode() → different bucket

Default equals() → returns false

Result → map.get(new Employee("101")) returns null

3. To make logical equality work, we must override both.

hashCode(): so same ID gives same hash → same bucket.

equals(): compare business keys (Employee ID), not references.

4. After overriding:
HashMap considers both objects equal and returns
 */
    class Employee {
        String id;

        Employee(String id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(id, employee.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }
    }



    public class HashMapExample {
         static void main(String[] args) {
            Map<Employee, String> map = new HashMap<>();
            map.put(new Employee("101"), "Alice");
            System.out.println(map.get(new Employee("101")));
        }
    }



//Employee table

//SELECT DISTICT salary FROM employee ORDER BY DESE LIMIT 1 OFFSET 1;