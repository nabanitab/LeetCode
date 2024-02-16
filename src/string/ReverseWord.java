package string;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Susmita";
        String result = getReverseString(str);
        System.out.println(result);
    }

    private static String getReverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

