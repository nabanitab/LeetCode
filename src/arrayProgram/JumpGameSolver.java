package arrayProgram;

public class JumpGameSolver {

        public boolean canJump(int[] nums) {
            int maxReach = 0;

            for (int i = 0; i < nums.length; i++) {
                if (i > maxReach) {
                    // If the current index cannot be reached
                    return false;
                }

                maxReach = Math.max(maxReach, i + nums[i]);

                if (maxReach >= nums.length - 1) {
                    // If the last index can be reached
                    return true;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            JumpGameSolver solver = new JumpGameSolver();

            // Example Test Cases
            int[] test1 = {2, 3, 1, 1, 4};
            System.out.println("Can reach the last index: " + solver.canJump(test1));  // Output: true

            int[] test2 = {3, 2, 1, 0, 4};
            System.out.println("Can reach the last index: " + solver.canJump(test2));  // Output: false
        }
    }


