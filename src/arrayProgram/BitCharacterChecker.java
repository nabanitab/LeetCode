package arrayProgram;

//1-bit and 2-bit Characters
//We have two special characters:
//
//The first character can be represented by one bit 0.
//The second character can be represented by two bits (10 or 11).
//Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.
//
//
//
//Example 1:
//
//Input: bits = [1,0,0]
//Output: true
//Explanation: The only way to decode it is two-bit character and one-bit character.
//So the last character is one-bit character.
public class BitCharacterChecker {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                // Skip the next character as it is a two-bit character
                i += 2;
            } else {
                // Move to the next character
                i++;
            }
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args) {
        BitCharacterChecker checker = new BitCharacterChecker();

        // Example 1
        int[] bits1 = {1, 0, 0};
        System.out.println(checker.isOneBitCharacter(bits1)); // Output: true

        // Example 2
        int[] bits2 = {1, 1, 1, 0};
        System.out.println(checker.isOneBitCharacter(bits2)); // Output: false
    }
}

