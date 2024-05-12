package coreJava.oparetor;

//Expected output  //1. False, Neudesic, true, true
public class OperatorDemoInString {

    public static void main(String[] args) {
        String s1 = new String("neudesic");
        String s2 = new String("Neudesic");

        // 1. Print false since s1 and s2 are two different objects
        System.out.print(s1 == s2);
        System.out.print(", ");

        // 2. Print "Neudesic"
        System.out.print("Neudesic");
        System.out.print(", ");

        // 3. Print true since the contents of s1 and s2 are equal
        System.out.print(s1.equalsIgnoreCase(s2));
        System.out.print(", ");

        // 4. Print true since s1 and s2 are both pointing to the same String literal after interning
        System.out.print(s1.toLowerCase().intern() == s2.toLowerCase().intern());
    }
}





