package string;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Susmita";
        String result = getReverseString(str);
        System.out.println(result);
    }

    private static String getReverseString(String str) {

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

