// Link: https://leetcode.com/problems/unique-paths/description

class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 && n == 1)
            return 1;

        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        for(int r = 1; r < n; r++) {
            dp[r][0] = dp[r-1][0];
        }

        for(int c = 1; c < m; c++) {
            dp[0][c] = dp[0][c-1];
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        return dp[n-1][m-1];
    }
}