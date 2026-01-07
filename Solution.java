public class Solution {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        System.out.println("size value: "+size );

        int[] count = new int[size + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        for (int i = 1; i <= size; i++) {
            if (count[i] == 2) repeated = i;
            if (count[i] == 0) missing = i;
        }

        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {2, 2}};
        int[] ans = findMissingAndRepeatedValues(grid);

        System.out.println("Repeated: " + ans[0]);
        System.out.println("Missing: " + ans[1]);
    }
}
