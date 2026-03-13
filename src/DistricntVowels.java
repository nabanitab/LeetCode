import java.util.stream.Collectors;

public class DistricntVowels {
    static void main() {
        String s = "A quick brown fox";

       String res = s.toLowerCase().chars().mapToObj(c -> String.valueOf((char)c))
               .filter(c-> "aeiou".contains(c))
               .distinct().collect(Collectors.joining(","));

        System.out.println(res);

    }
}
