package arrayProgram;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }

        int totalPoisoned = 0;

        for (int i = 1; i < timeSeries.length; i++) {
            totalPoisoned += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }

        return totalPoisoned + duration;
    }

    public static void main(String[] args) {
        TeemoAttacking solution = new TeemoAttacking();

        // Example 1
        int[] timeSeries1 = {1, 4};
        int duration1 = 2;
        int result1 = solution.findPoisonedDuration(timeSeries1, duration1);
        System.out.println(result1);  // Output: 4

        // Example 2
        int[] timeSeries2 = {1, 2};
        int duration2 = 2;
        int result2 = solution.findPoisonedDuration(timeSeries2, duration2);
        System.out.println(result2);  // Output: 3
    }
}
