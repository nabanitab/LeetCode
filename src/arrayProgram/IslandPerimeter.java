package arrayProgram;

public class IslandPerimeter {

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    // Count top perimeter
                    if (i == 0 || grid[i - 1][j] == 0) {
                        perimeter++;
                    }
                    // Count bottom perimeter
                    if (i == grid.length - 1 || grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                    // Count left perimeter
                    if (j == 0 || grid[i][j - 1] == 0) {
                        perimeter++;
                    }
                    // Count right perimeter
                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }

    public static void main(String[] args) {
        // Example 1
        int[][] grid1 = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int result1 = islandPerimeter(grid1);
        System.out.println(result1);  // Output: 16

        // Example 2
        int[][] grid2 = {{1}};
        int result2 = islandPerimeter(grid2);
        System.out.println(result2);  // Output: 4

        // Example 3
        int[][] grid3 = {{1,0}};
        int result3 = islandPerimeter(grid3);
        System.out.println(result3);  // Output: 4
    }
}

