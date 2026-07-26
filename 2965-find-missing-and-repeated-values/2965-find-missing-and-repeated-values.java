class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int[] ans = new int[2];

        int n = grid.length;
        long N = (long) n * n;

        long expectedSum = N * (N + 1) / 2;
        long expectedSquareSum = N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
                actualSquareSum += (long) num * num;
            }
        }

        long diff = actualSum - expectedSum;                 // r - m
        long sum = (actualSquareSum - expectedSquareSum) / diff; // r + m

        ans[0] = (int) ((sum + diff) / 2); // repeated
        ans[1] = (int) (sum - ans[0]);     // missing

        return ans;
    }
}