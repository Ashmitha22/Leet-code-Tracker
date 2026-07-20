// Last updated: 7/20/2026, 11:57:06 AM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4
5        for (int i = 0; i < m; i++)
6            dp[i][0] = 1;
7
8        for (int j = 0; j < n; j++)
9            dp[0][j] = 1;
10
11        for (int i = 1; i < m; i++) {
12            for (int j = 1; j < n; j++) {
13                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
14            }
15        }
16
17        return dp[m - 1][n - 1];
18    }
19}