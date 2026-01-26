class Solution {

    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int liveNeighbors = countLive(i, j, board);

                // live → dead
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = 2;
                }

                // dead → live
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 3;
                }
            }
        }

        // Final conversion
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] %= 2;
            }
        }
    }

    private int countLive(int i, int j, int[][] board) {

        int[][] dirs = {
            {-1,0}, {1,0}, {0,-1}, {0,1},
            {-1,-1}, {-1,1}, {1,-1}, {1,1}
        };

        int count = 0;

        for (int[] d : dirs) {
            int x = i + d[0];
            int y = j + d[1];

            if (x >= 0 && y >= 0 && x < board.length && y < board[0].length) {
                if (board[x][y] == 1 || board[x][y] == 2) {
                    count++;
                }
            }
        }
        return count;
    }
}
