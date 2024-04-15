package string;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Susmita";
        String result = getReverseString(str);
        System.out.println(result);
    }

    private static String getReverseString(String str) {

        //StringBuilder is used instead of String for concatenating characters in reverse order because StringBuilder
        // provides better performance for such operations.
        //Using String for concatenation in a loop results in the creation of multiple intermediate String objects, as
        // String objects in Java are immutable. Each concatenation operation creates a new String object
        //to create mutable String
        StringBuilder sb = new StringBuilder();

        //i = input.length()-1 = last index of the string object
        for (int i = str.length() - 1; i >= 0; i--) {

            //append method add the charcheter index of i into the string builder object
            sb.append(str.charAt(i));
        }

        //append() did not return any String value that is why we need ToString()_
        return sb.toString();
    }
}

