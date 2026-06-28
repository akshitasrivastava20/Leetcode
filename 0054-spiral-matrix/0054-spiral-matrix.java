class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int p = 0;                     // top
        int q = matrix.length - 1;     // bottom
        int r = 0;                     // left
        int t = matrix[0].length - 1;  // right

        while (p <= q && r <= t) {

            // Top row
            for (int i = r; i <= t; i++) {
                ans.add(matrix[p][i]);
            }
            p++;

            // Right column
            for (int i = p; i <= q; i++) {
                ans.add(matrix[i][t]);
            }
            t--;

            // Bottom row
            if (p <= q) {
                for (int i = t; i >= r; i--) {
                    ans.add(matrix[q][i]);
                }
                q--;
            }

            // Left column
            if (r <= t) {
                for (int i = q; i >= p; i--) {
                    ans.add(matrix[i][r]);
                }
                r++;
            }
        }

        return ans;
    }
}