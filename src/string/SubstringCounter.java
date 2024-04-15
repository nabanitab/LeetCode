package string;

public class SubstringCounter {
    public static int countOccurrences(String s, String substring) {
        int count = 0;
        int index = s.indexOf(substring);
        while (index != -1) {
            count++;
            index = s.indexOf(substring, index + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "abababab";
        String substring = "aba";
        int occurrences = countOccurrences(input, substring);
        System.out.println("Occurrences of \"" + substring + "\" in \"" + input + "\": " + occurrences);
    }
}
