package string;

public class LicenseKeyFormattingSolution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != '-') {
                result.insert(0, Character.toUpperCase(ch));
                count++;

                if (count % k == 0) {
                    result.insert(0, '-');
                }
            }
        }

        // Remove leading dash if present
        if (result.length() > 0 && result.charAt(0) == '-') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LicenseKeyFormattingSolution solution = new LicenseKeyFormattingSolution();

        String s1 = "5F3Z-2e-9-w";
        int k1 = 4;
        System.out.println("Output 1: " + solution.licenseKeyFormatting(s1, k1));

        String s2 = "2-5g-3-J";
        int k2 = 2;
        System.out.println("Output 2: " + solution.licenseKeyFormatting(s2, k2));
    }
}

