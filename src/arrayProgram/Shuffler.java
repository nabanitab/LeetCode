package arrayProgram;

import java.util.Arrays;
import java.util.Random;

public class Shuffler {

    private int[] original;
    private int[] shuffled;
    private Random rand;

    public Shuffler(int[] nums) {
        original = nums.clone();
        shuffled = nums.clone();
        rand = new Random();
    }

    public int[] reset() {
        return original.clone();
    }

    public int[] shuffle() {
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            swap(shuffled, i, j);
        }
        return shuffled;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Shuffler shuffler = new Shuffler(nums);

        // Example
        System.out.println(Arrays.toString(shuffler.shuffle())); // Shuffle result
        System.out.println(Arrays.toString(shuffler.reset()));   // Reset result
        System.out.println(Arrays.toString(shuffler.shuffle())); // Shuffle result
    }
}

