package interviews;

public class StringObjectCreationExp {
    public static void main(String[] args) {

//Only one object is created, which is the string literal "abc" stored in the string pool.
        String s1 = "abc";

        //This line creates a new string object with the value "abc" using the new keyword and assigns
        // its reference to the variable s2.
        //Two objects are created: one in the string pool ("abc") and one on the heap (created using new).
        String s2 = new String("abc");

        //This line concatenates the values of s1 and s2 and assigns the result to the variable s3.
        //Since concatenation involves creating a new string, another object is created on the heap.
        String s3 = s1 + s2;

       //This line concatenates the string literal "abc" with the value of s1 and assigns the result to the variable s4.
        //As with the previous concatenation, a new string object is created on the heap.
        String s4 = "abc" + s1;

        //This line compares the references of s1 and s2 for equality.
        //It evaluates to false because s1 refers to a string literal in the string pool,
        // while s2 refers to a string object created on the heap.

       // String s1 ==s2;

        //This line compares the contents of s1 and s2 for equality.
        //It evaluates to true because the equals() method compares the actual characters in
        // the strings, which are the same.
        s1.equals(s2);

        //This line compares the references of s3 and s4 for equality.
        //It depends on whether the JVM optimizes the concatenation. If it does, it could evaluate
        // to true because both variables could refer to the same object in the string pool. Otherwise, it evaluates to false.

       // s3 == s4;

        //This line compares the contents of s3 and s4 for equality.
        //It evaluates to true because the equals() method compares the actual characters in the strings, which are the same.
        //Overall, in this code snippet, a total of four objects are created on the heap due to concatenation (s3 and s4),
        // while two objects exist in the string pool ("abc"). The number of objects may vary depending
        // on JVM optimizations and string interning behavior.

       // s3.equals(s4);

        //In total, 4 new String objects are created: s2, s3, and the two intermediate concatenated
        // strings. The other strings (s1, s4, and the string literals "abc") already exist in memory and
        // are referenced accordingly.
    }
}
