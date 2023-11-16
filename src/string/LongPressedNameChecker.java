package string;

class LongPressedNameChecker {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }

        return i == name.length();
    }

    public static void main(String[] args) {
        LongPressedNameChecker nameChecker = new LongPressedNameChecker();

        // Test cases
        System.out.println(nameChecker.isLongPressedName("alex", "aaleex")); // Output: true
        System.out.println(nameChecker.isLongPressedName("saeed", "ssaaedd")); // Output: false
    }
}

