package arrayProgram;

public class GasStation {

    public static int canTravel(int[] gas, int[] cost) {
        int n = gas.length;

        for (int i = 0; i < n; i++) {
            int tank = 0;
            int start = i;
            boolean canTravel = true;

            for (int j = 0; j < n; j++) {
                int station = (start + j) % n;
                tank += gas[station] - cost[station];

                if (tank < 0) {
                    canTravel = false;
                    break;
                }
            }

            if (canTravel) {
                return start;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Example 1
        int[] gas1 = {1,2,3,4,5};
        int[] cost1 = {3,4,5,1,2};
        int result1 = canTravel(gas1, cost1);
        System.out.println(result1);  // Output: 3

        // Example 2
        int[] gas2 = {2,3,4};
        int[] cost2 = {3,4,3};
        int result2 = canTravel(gas2, cost2);
        System.out.println(result2);  // Output: -1
    }
}

