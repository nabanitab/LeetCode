package string;

public class ReconstructDigitsSolution {

    public String originalDigits(String s) {
        int[] count = new int[10];

        // Count occurrences of each character in the string
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'z':
                    count[0]++;
                    break;
                case 'w':
                    count[2]++;
                    break;
                case 'u':
                    count[4]++;
                    break;
                case 'x':
                    count[6]++;
                    break;
                case 'g':
                    count[8]++;
                    break;
                case 'o':
                    count[1]++;
                    break;
                case 'h':
                    count[3]++;
                    break;
                case 'f':
                    count[5]++;
                    break;
                case 's':
                    count[7]++;
                    break;
                case 'i':
                    count[9]++;
                    break;
            }
        }

        // Adjust the counts based on unique characters
        count[1] = count[1] - count[0] - count[2] - count[4];
        count[3] = count[3] - count[8];
        count[5] = count[5] - count[4];
        count[7] = count[7] - count[6];
        count[9] = count[9] - count[5] - count[6] - count[8];

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < count[i]; j++) {
                result.append(i);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ReconstructDigitsSolution solution = new ReconstructDigitsSolution();

        // Example 1
        String s1 = "owoztneoer";
        System.out.println(solution.originalDigits(s1)); // Output: "012"

        // Example 2
        String s2 = "fviefuro";
        System.out.println(solution.originalDigits(s2)); // Output: "45"
    }
}

